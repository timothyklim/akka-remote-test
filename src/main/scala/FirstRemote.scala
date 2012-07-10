import akka.actor._
import java.io.Serializable

object FirstRemote extends App {
  val system = ActorSystem("MySystem")
  val greeter = system.actorOf(Props[GreetingActor], name = "greeter")
}