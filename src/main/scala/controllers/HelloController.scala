package controllers

//import play.api.i18n.Langs
import play.api.mvc.{AbstractController, ControllerComponents}

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

class UserController(cc: ControllerComponents) extends AbstractController(cc) {

  def hello = Action.async {
    Future {
      Ok("hi!")
    }
  }
}
