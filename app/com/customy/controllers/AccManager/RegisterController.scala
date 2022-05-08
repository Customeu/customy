package com.customy.controllers.AccManager

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import play.api.i18n.I18nSupport
import play.api.data.validation.Constraints._

import com.customy.models.user.{Users, User}
import com.customy.models.Hash

@Singleton
class RegisterController @Inject()(val cc: ControllerComponents) extends AbstractController(cc) with I18nSupport {
    val registerForm = Form(mapping( //Add validation
        "name" -> nonEmptyText(1, 15),
        "password" -> nonEmptyText(8),
        "email" -> nonEmptyText
        )(User.apply)(User.unapply)
    )
    def registerGet = Action { implicit request: Request[AnyContent] =>
        Ok(com.customy.views.html.user.register(registerForm))
    }
    def registerSubmit = Action { implicit request =>
        registerForm.bindFromRequest().fold(
            formWithErrors => {
                BadRequest(com.customy.views.html.user.register(formWithErrors))
            },
            register => {
                Users.addUser(User(register.name,
                              Hash.sha256Hash(register.password),
                              register.email))
                Redirect(com.customy.controllers.routes.HomeController.index)
            }
        )
    }
}
