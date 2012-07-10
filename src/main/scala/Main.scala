import akka.actor._
import java.io.Serializable

case class Greeting(who: String) extends Serializable

class GreetingActor extends Actor with ActorLogging {
  def receive = {
    case Greeting(who) ⇒ log.info("Hello " + who)
  }
}
