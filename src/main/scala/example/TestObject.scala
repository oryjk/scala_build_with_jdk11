package example

import akka.actor._
import akka.testkit._

object TestKitExtension extends ExtensionId[TestKitSettings] {
  override def get(system: ActorSystem): TestKitSettings = {
    println("load testkist........")
    super.get(system)
  }
  def createExtension(system: ExtendedActorSystem): TestKitSettings = new TestKitSettings(system.settings.config)
}
