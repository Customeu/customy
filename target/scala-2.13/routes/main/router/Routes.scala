// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  HomeController_0: com.customy.controllers.HomeController,
  // @LINE:2
  Assets_1: controllers.Assets,
  // @LINE:4
  RegisterController_2: com.customy.controllers.AccManager.RegisterController,
  // @LINE:7
  LoginController_3: com.customy.controllers.AccManager.LoginController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    HomeController_0: com.customy.controllers.HomeController,
    // @LINE:2
    Assets_1: controllers.Assets,
    // @LINE:4
    RegisterController_2: com.customy.controllers.AccManager.RegisterController,
    // @LINE:7
    LoginController_3: com.customy.controllers.AccManager.LoginController
  ) = this(errorHandler, HomeController_0, Assets_1, RegisterController_2, LoginController_3, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, RegisterController_2, LoginController_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """com.customy.controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """com.customy.controllers.AccManager.RegisterController.registerGet"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """com.customy.controllers.AccManager.RegisterController.registerSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """com.customy.controllers.AccManager.LoginController.loginGet"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """com.customy.controllers.AccManager.LoginController.loginSubmit"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val com_customy_controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val com_customy_controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.customy.controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:2
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:4
  private[this] lazy val com_customy_controllers_AccManager_RegisterController_registerGet2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val com_customy_controllers_AccManager_RegisterController_registerGet2_invoker = createInvoker(
    RegisterController_2.registerGet,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.customy.controllers.AccManager.RegisterController",
      "registerGet",
      Nil,
      "GET",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val com_customy_controllers_AccManager_RegisterController_registerSubmit3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val com_customy_controllers_AccManager_RegisterController_registerSubmit3_invoker = createInvoker(
    RegisterController_2.registerSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.customy.controllers.AccManager.RegisterController",
      "registerSubmit",
      Nil,
      "POST",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val com_customy_controllers_AccManager_LoginController_loginGet4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val com_customy_controllers_AccManager_LoginController_loginGet4_invoker = createInvoker(
    LoginController_3.loginGet,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.customy.controllers.AccManager.LoginController",
      "loginGet",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val com_customy_controllers_AccManager_LoginController_loginSubmit5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val com_customy_controllers_AccManager_LoginController_loginSubmit5_invoker = createInvoker(
    LoginController_3.loginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.customy.controllers.AccManager.LoginController",
      "loginSubmit",
      Nil,
      "POST",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case com_customy_controllers_HomeController_index0_route(params@_) =>
      call { 
        com_customy_controllers_HomeController_index0_invoker.call(HomeController_0.index())
      }
  
    // @LINE:2
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:4
    case com_customy_controllers_AccManager_RegisterController_registerGet2_route(params@_) =>
      call { 
        com_customy_controllers_AccManager_RegisterController_registerGet2_invoker.call(RegisterController_2.registerGet)
      }
  
    // @LINE:5
    case com_customy_controllers_AccManager_RegisterController_registerSubmit3_route(params@_) =>
      call { 
        com_customy_controllers_AccManager_RegisterController_registerSubmit3_invoker.call(RegisterController_2.registerSubmit)
      }
  
    // @LINE:7
    case com_customy_controllers_AccManager_LoginController_loginGet4_route(params@_) =>
      call { 
        com_customy_controllers_AccManager_LoginController_loginGet4_invoker.call(LoginController_3.loginGet)
      }
  
    // @LINE:8
    case com_customy_controllers_AccManager_LoginController_loginSubmit5_route(params@_) =>
      call { 
        com_customy_controllers_AccManager_LoginController_loginSubmit5_invoker.call(LoginController_3.loginSubmit)
      }
  }
}
