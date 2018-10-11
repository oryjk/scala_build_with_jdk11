package example;

import akka.actor.AbstractActor;
import akka.actor.ActorSystem;
import akka.cluster.Cluster;

public class Test extends AbstractActor {

    private Cluster cluster = Cluster.get(getContext().getSystem());

    public static void main(String[] args) {

        ActorSystem a = ActorSystem.apply();
        TestKitExtension.get(a);
        System.out.print("----test sucesss!!!!!!");
    }

    @Override
    public Receive createReceive() {
        return null;
    }
}
