package com.customy.models.user

import play.api.Play
import play.api.data.Form
import play.api.data.Forms._


case class User(name: String, password: String)

object Users {
  def addUser(user: User): Unit = {
    println(s"The user: $user has been added.")
  }
}
