
import akka.util.ByteString
import play.api.http.Writeable
import scalatags.Text

package object view {
  implicit val scalatagsWritable = new Writeable[Text.TypedTag[String]] (
    contentType = Some("text/html"),
    transform = tag => ByteString(tag.render)
  )
}
