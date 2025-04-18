# Accelerator Log

## Options
```json
{
  "msgBrokerName" : "foo-broker",
  "applicationRole" : "processor",
  "resultChannel" : "foo-result",
  "resultChannelGroup" : "foo-result-group",
  "includeBuildToolWrapper" : true,
  "sourceChannel" : "foo-source",
  "groupId" : "com.example",
  "artifactId" : "foo-proc",
  "packageName" : "com.example.stream",
  "objectModelClassName" : "Foo",
  "projectName" : "foo-proc",
  "sourceChannelGroup" : "foo-source-group"
}
```
## Log
```
┏ engine (Chain)
┃  Info Running Chain(Exclude, GeneratorValidationTransform, UniquePath)
┃ ┏ engine.transformations[0] (Exclude)
┃ ┃  Info Will exclude [accelerator.yaml, accelerator.axl]
┃ ┃ Debug accelerator.axl matched [accelerator.yaml, accelerator.axl] -> excluded
┃ ┃ Debug LICENSE didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug pom.xml didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug accelerator.yaml matched [accelerator.yaml, accelerator.axl] -> excluded
┃ ┃ Debug README.md didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug .gitignore didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug manifest.yml didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug doc/images/messageFlow.png didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/test/java/com/example/stream/StreamingApplicationTests.java didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/resources/application.yaml didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/java/com/example/stream/StreamingApplication.java didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/java/com/example/stream/model/Foo.java didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/java/com/example/stream/functions/FooSource.java didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┃ Debug src/main/java/com/example/stream/functions/FooSink.java didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┗ Debug src/main/java/com/example/stream/functions/FooProcessor.java didn't match [accelerator.yaml, accelerator.axl] -> included
┃ ┏ ┏ engine.transformations[1].validated (Chain)
┃ ┃ ┃  Info Running Chain(ApplyTo, ApplyTo, IfElse, IfElse, IfElse, Let)
┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[0].apply (Chain)
┃ ┃ ┃ ┃  Info Running Chain(ReplaceSnippet, ReplaceSnippet)
┃ ┃ ┃ ┃ ╺  Info Will replace [<groupId>com.example</groupId>-><groupId>com.example...(truncated)]
┃ ┃ ┃ ┗ ╺  Info Will replace [spring-streaming-app->foo-proc]
┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[1].apply (Chain)
┃ ┃ ┃ ┃  Info Running Chain(ReplaceSnippet, YTT)
┃ ┃ ┃ ┃ ╺  Info Will replace [Foo->Foo]
┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[1].apply.transformations[1] (YTT)
┃ ┃ ┃ ┃ ┃ Debug Wrote values file with json content:   {"msgBrokerName":"foo-broker","resultChannel":"foo-result","applicationRole":"processor","artifactVersion":"0.0.1-beta","resultChannelGroup":"foo-result-group","sourceChannel":"foo-source","groupId":"com.example","includeBuildToolWrapper":true,"artifactId":"foo-proc","packageName":"com.example.stream","objectModelClassName":"Foo","projectName":"foo-proc","sourceChannelGroup":"foo-source-group"}
┃ ┃ ┃ ┗ ┗  Info Shelling out to YTT with args: [ytt, -f, /var/folders/sv/7g686rs906v38snwbz438xsr0000gq/T/ytt-input7141403137190813045, --data-values-file, /var/folders/sv/7g686rs906v38snwbz438xsr0000gq/T/accelerator-options1245910601727564447.json, --output-files, /var/folders/sv/7g686rs906v38snwbz438xsr0000gq/T/ytt-output5703795316504712447]
┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[2] (IfElse)
┃ ┃ ┃ ┗ null ()
┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[3] (IfElse)
┃ ┃ ┃ ┃ engine.transformations[1].validated.transformations[3].then (Exclude)
┃ ┃ ┃ ┃  Info Will exclude [**/FooSource.java, **/FooSink.java]
┃ ┃ ┃ ┃ Debug LICENSE didn't match [**/FooSource.java, **/FooSink.java] -> included
┃ ┃ ┃ ┃ Debug README.md didn't match [**/FooSource.java, **/FooSink.java] -> included
┃ ┃ ┃ ┃ Debug .gitignore didn't match [**/FooSource.java, **/FooSink.java] -> included
┃ ┃ ┃ ┃ Debug manifest.yml didn't match [**/FooSource.java, **/FooSink.java] -> included
┃ ┃ ┃ ┃ Debug doc/images/messageFlow.png didn't match [**/FooSource.java, **/FooSink.java] -> included
┃ ┃ ┃ ┃ Debug src/test/java/com/example/stream/StreamingApplicationTests.java didn't match [**/FooSource.java, **/FooSink.java] -> included
┃ ┃ ┃ ┃ Debug src/main/java/com/example/stream/StreamingApplication.java didn't match [**/FooSource.java, **/FooSink.java] -> included
┃ ┃ ┃ ┃ Debug src/main/java/com/example/stream/model/Foo.java didn't match [**/FooSource.java, **/FooSink.java] -> included
┃ ┃ ┃ ┃ Debug src/main/java/com/example/stream/functions/FooSource.java matched [**/FooSource.java, **/FooSink.java] -> excluded
┃ ┃ ┃ ┃ Debug src/main/java/com/example/stream/functions/FooSink.java matched [**/FooSource.java, **/FooSink.java] -> excluded
┃ ┃ ┃ ┃ Debug src/main/java/com/example/stream/functions/FooProcessor.java didn't match [**/FooSource.java, **/FooSink.java] -> included
┃ ┃ ┃ ┃ Debug pom.xml didn't match [**/FooSource.java, **/FooSink.java] -> included
┃ ┃ ┃ ┗ Debug src/main/resources/application.yaml didn't match [**/FooSource.java, **/FooSink.java] -> included
┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[4] (IfElse)
┃ ┃ ┃ ┗ null ()
┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5] (Let)
┃ ┃ ┃ ┃ Debug Adding symbol modelObject with value 'foo'
┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in (Chain)
┃ ┃ ┃ ┃ ┃  Info Running Chain(ApplyTo, ApplyTo, Let)
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[0].apply (Chain)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(ReplaceSnippet, RewritePath)
┃ ┃ ┃ ┃ ┃ ┃ ╺  Info Will replace [Foo->Foo]
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[0].apply.transformations[1] (RewritePath)
┃ ┃ ┃ ┃ ┃ ┗ ┗ Debug Path 'src/main/java/com/example/stream/model/Foo.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)model(?<untouchedpath>.*)' with groups {sourceset=main, currentpackage=com/example/stream/, untouchedpath=/Foo.java, g0=src/main/java/com/example/stream/model/Foo.java, g1=main, g2=com/example/stream/, g3=/Foo.java} and was rewritten to 'src/main/java/com/example/stream//model/Foo.java'
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[1].apply (Chain)
┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(ReplaceSnippet, ReplaceSnippet, RewritePath)
┃ ┃ ┃ ┃ ┃ ┃ ╺  Info Will replace [Foo->Foo]
┃ ┃ ┃ ┃ ┃ ┃ ╺  Info Will replace [foo->foo]
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[1].apply.transformations[2] (RewritePath)
┃ ┃ ┃ ┃ ┃ ┗ ┗ Debug Path 'src/main/java/com/example/stream/functions/FooProcessor.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)functions/Foo(?<untouchedpath>.*)' with groups {sourceset=main, currentpackage=com/example/stream/, untouchedpath=Processor.java, g0=src/main/java/com/example/stream/functions/FooProcessor.java, g1=main, g2=com/example/stream/, g3=Processor.java} and was rewritten to 'src/main/java/com/example/stream//functions/FooProcessor.java'
┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[2] (Let)
┃ ┃ ┃ ┃ ┃ ┃ Debug Adding symbol packageDirectory with value 'com/example/stream'
┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[2].in (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(ApplyTo, ApplyTo, Merge, UniquePath, Provenance)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[2].in.transformations[0].apply (Chain)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Chain(ReplaceSnippet, RewritePath)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ╺  Info Will replace [com.example.stream->com.example.stream]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[2].in.transformations[0].apply.transformations[1] (RewritePath)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/test/java/com/example/stream/StreamingApplicationTests.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)stream(?<untouchedpath>.*)' with groups {sourceset=test, currentpackage=com/example/, untouchedpath=/StreamingApplicationTests.java, g0=src/test/java/com/example/stream/StreamingApplicationTests.java, g1=test, g2=com/example/, g3=/StreamingApplicationTests.java} and was rewritten to 'src/test/java/com/example/stream//StreamingApplicationTests.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/com/example/stream/StreamingApplication.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)stream(?<untouchedpath>.*)' with groups {sourceset=main, currentpackage=com/example/, untouchedpath=/StreamingApplication.java, g0=src/main/java/com/example/stream/StreamingApplication.java, g1=main, g2=com/example/, g3=/StreamingApplication.java} and was rewritten to 'src/main/java/com/example/stream//StreamingApplication.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug Path 'src/main/java/com/example/stream//model/Foo.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)stream(?<untouchedpath>.*)' with groups {sourceset=main, currentpackage=com/example/, untouchedpath=//model/Foo.java, g0=src/main/java/com/example/stream//model/Foo.java, g1=main, g2=com/example/, g3=//model/Foo.java} and was rewritten to 'src/main/java/com/example/stream///model/Foo.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗ Debug Path 'src/main/java/com/example/stream//functions/FooProcessor.java' matched 'src/(?<sourceset>.*)/java/(?<currentpackage>.*/)stream(?<untouchedpath>.*)' with groups {sourceset=main, currentpackage=com/example/, untouchedpath=//functions/FooProcessor.java, g0=src/main/java/com/example/stream//functions/FooProcessor.java, g1=main, g2=com/example/, g3=//functions/FooProcessor.java} and was rewritten to 'src/main/java/com/example/stream///functions/FooProcessor.java'
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[2].in.transformations[1].apply (ReplaceText)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗  Info Will replace [spring-streaming-app->foo-proc, foo-broker->foo-broker]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[2].in.transformations[2] (Merge)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Running Merge(Include, InvokeFragment)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[2].in.transformations[2].sources[0] (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [**]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug doc/images/messageFlow.png matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yaml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/stream//StreamingApplicationTests.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/stream//StreamingApplication.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/stream///model/Foo.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/stream///functions/FooProcessor.java matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ Debug manifest.yml matched [**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[2].in.transformations[2].sources[1] (InvokeFragment)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┏ engine.transformations[1].validated.transformations[5].in.transformations[2].in.transformations[2].sources[1].validated (IfElse)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ engine.transformations[1].validated.transformations[5].in.transformations[2].in.transformations[2].sources[1].validated.then (Include)
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃  Info Will include [mvnw, mvnw.cmd, .mvn/**]
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug LICENSE didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .gitignore didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug doc/images/messageFlow.png didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug pom.xml didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/resources/application.yaml didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/test/java/com/example/stream//StreamingApplicationTests.java didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/stream//StreamingApplication.java didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/stream///model/Foo.java didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug src/main/java/com/example/stream///functions/FooProcessor.java didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug manifest.yml didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug mvnw.cmd matched [mvnw, mvnw.cmd, .mvn/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug README.md didn't match [mvnw, mvnw.cmd, .mvn/**] -> excluded
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ Debug .mvn/wrapper/maven-wrapper.properties matched [mvnw, mvnw.cmd, .mvn/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ ┗ ┗ Debug mvnw matched [mvnw, mvnw.cmd, .mvn/**] -> included
┃ ┃ ┃ ┃ ┃ ┃ ┃ ╺ engine.transformations[1].validated.transformations[5].in.transformations[2].in.transformations[3] (UniquePath)
┃ ┗ ┗ ┗ ┗ ┗ ┗ ╺ engine.transformations[1].validated.transformations[5].in.transformations[2].in.transformations[4] (Provenance)
┗ ╺ engine.transformations[2] (UniquePath)
```
