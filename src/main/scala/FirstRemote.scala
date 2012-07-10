import akka.actor._
import java.io.Serializable

object FirstRemote extends App {
  val system = ActorSystem("pullbox")
  val greeter = system.actorOf(Props[GreetingActor], name = "greeter")
}