import akka.actor._
import java.io.Serializable

object RemoteLookup extends App {
  val system = ActorSystem("MySystem")
  val greeter = system.actorFor("MySystem@machine2:2552/user/greeter")
  greeter ! Greeting("Sonny Rollins")
}
