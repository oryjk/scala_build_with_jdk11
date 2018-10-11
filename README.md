<b>environment</b>:<p>
java version "11" 2018-09-25<p>
gradle 4.10.2<p>
akka-cluster_2.12 2.5.17<p>
scala 2.12.7<p>
download it and execute

```
sbt compile

OR

gradle clean build
```
problem will reproduce

```
/Users/carlwang/Downloads/override-in-jdk11/src/main/java/example/Test.java:10: error: reference to get is ambiguous
        Cluster cluster = Cluster.get(ActorSystem.apply());
                                 ^
  both method get(ActorSystem) in Cluster and method get(ActorSystem) in Cluster match

```
