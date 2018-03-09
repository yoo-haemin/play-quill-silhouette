package models

import com.mohiva.play.silhouette.api.{Identity, LoginInfo}
import com.mohiva.play.silhouette.api.util.PasswordInfo
import silhouette.Roles.{Role, UserRole}
import java.util.UUID

case class User (
  role: Role = UserRole,
  id: UUID = UUID.randomUUID(),
  loginInfo: Option[LoginInfo] = None,
  name: Option[String] = None,
  email: Option[String] = None,
  passwordInfo: Option[PasswordInfo] = None
) extends Identity

case class LoginData (
  email: String,
  password: String,
  rememberMe: Boolean = false
)

case class SignUpData(
  firstName: String,
  lastName: String,
  email: String,
  password: String
)
