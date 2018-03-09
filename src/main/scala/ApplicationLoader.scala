import _root_.controllers.AssetsComponents
//import com.softwaremill.macwire._
import play.api.ApplicationLoader.Context
import play.api._
import play.api.i18n._

import play.api.routing.Router
import play.api.routing.sird._


/**
  * Application loader that wires up the application dependencies using Macwire
  */
class AppLoader extends ApplicationLoader {
  def load(context: Context): Application = new AppComponents(context).application
}

class AppComponents(context: Context) extends BuiltInComponentsFromContext(context)
    //with MyModule
    with AssetsComponents
    with I18nComponents
    with play.filters.HttpFiltersComponents {

  // set up logger
  LoggerConfigurator(context.environment.classLoader).foreach {
    _.configure(context.environment, context.initialConfiguration, Map.empty)
  }

  lazy val router: Router = {
    import play.api.mvc.Results._

    Router.from {
      case GET(p"/") => Action { Ok("") }
    }
  }
}

