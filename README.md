# gradle-dsl-multi-module
Sample project for trying out multi-module project build with kotlin dsl

Current wrapper uses gradle 4.0.2
./gradlew clean build 

Once upgrating gradle to 4.2-rc-1
./gradlew clean build 
Show errors:

```
Configure project :module1
e: /Users/hl/Documents/dev/kotlin/gradle-dsl-multi-module/module1/build.gradle.kts:52:9: Unresolved reference: compile
e: /Users/hl/Documents/dev/kotlin/gradle-dsl-multi-module/module1/build.gradle.kts:53:9: Unresolved reference: compile
e: /Users/hl/Documents/dev/kotlin/gradle-dsl-multi-module/module1/build.gradle.kts:54:9: Unresolved reference: compile
e: /Users/hl/Documents/dev/kotlin/gradle-dsl-multi-module/module1/build.gradle.kts:55:9: Unresolved reference: compile
e: /Users/hl/Documents/dev/kotlin/gradle-dsl-multi-module/module1/build.gradle.kts:56:9: Unresolved reference: testCompile
```