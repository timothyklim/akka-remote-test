import akka.actor._
import java.io.Serializable

object RemoteLookup extends App {
  val system = ActorSystem("pullbox")
  val greeter = system.actorFor("pullbox@localhost:2552/user/greeter")
  greeter ! Greeting("Sonny Rollins")
}
