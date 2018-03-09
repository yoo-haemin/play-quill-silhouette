package services

import Database._
import models._

class UserService(val db: DbContext) {
  import db._

  val users = quote(querySchema[User]("Users"))
}
