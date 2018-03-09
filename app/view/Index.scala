package view

import scalatags.Text.all._

object Index extends {
  val view = html(head(tag("title")("hello!")), body("Welcome to Play!"))

  def apply() = view
}
