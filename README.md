```
jenv shell 11-ea
sbt
> clean
> compile

[error] /private/tmp/override-in-jdk11/src/main/java/example/Test.java:9:1: reference to get is ambiguous
[error]   both method get(akka.actor.ActorSystem) in example.TestKitExtension and method get(akka.actor.ActorSystem) in example.TestKitExtension match
[error]     TestKitExtension.get(a);
```
