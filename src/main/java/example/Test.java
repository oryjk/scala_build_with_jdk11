package example;

import akka.actor.ActorSystem;
import akka.cluster.Cluster;

public class Test {

    public static void main(String[] args) {

        Cluster cluster = Cluster.get(ActorSystem.apply());
    }
}
