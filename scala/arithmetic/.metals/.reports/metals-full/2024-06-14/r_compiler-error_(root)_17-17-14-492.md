file:///C:/Users/vedsh/sysarch-project-one/src/main/scala/arithmetic/Divider.scala
### java.lang.NullPointerException: Cannot read the array length because "a" is null

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.12
Classpath:
<WORKSPACE>\.bloop\root\bloop-bsp-clients-classes\classes-Metals-yyPaUz4jR1SrmrkYRZiYaQ== [missing ], <HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.9.10\semanticdb-javac-0.9.10.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\chipsalliance\chisel_2.13\6.2.0\chisel_2.13-6.2.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\io\circe\circe-core_2.13\0.14.5\circe-core_2.13-0.14.5.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\io\circe\circe-generic_2.13\0.14.5\circe-generic_2.13-0.14.5.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\io\circe\circe-parser_2.13\0.14.5\circe-parser_2.13-0.14.5.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-reflect\2.13.12\scala-reflect-2.13.12.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\github\scopt\scopt_2.13\4.1.0\scopt_2.13-4.1.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\net\jcazevedo\moultingyaml_2.13\0.4.2\moultingyaml_2.13-0.4.2.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\json4s\json4s-native_2.13\4.0.6\json4s-native_2.13-4.0.6.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\apache\commons\commons-text\1.10.0\commons-text-1.10.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\io\github\alexarchambault\data-class_2.13\0.2.6\data-class_2.13-0.2.6.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\lihaoyi\os-lib_2.13\0.9.2\os-lib_2.13-0.9.2.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\modules\scala-parallel-collections_2.13\1.0.4\scala-parallel-collections_2.13-1.0.4.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\lihaoyi\upickle_2.13\3.1.0\upickle_2.13-3.1.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\chipsalliance\firtool-resolver_2.13\1.3.0\firtool-resolver_2.13-1.3.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\io\circe\circe-numbers_2.13\0.14.5\circe-numbers_2.13-0.14.5.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\typelevel\cats-core_2.13\2.9.0\cats-core_2.13-2.9.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\chuusai\shapeless_2.13\2.3.10\shapeless_2.13-2.3.10.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\io\circe\circe-jawn_2.13\0.14.5\circe-jawn_2.13-0.14.5.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\github\nscala-time\nscala-time_2.13\2.22.0\nscala-time_2.13-2.22.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\yaml\snakeyaml\1.26\snakeyaml-1.26.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\json4s\json4s-core_2.13\4.0.6\json4s-core_2.13-4.0.6.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\json4s\json4s-native-core_2.13\4.0.6\json4s-native-core_2.13-4.0.6.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\apache\commons\commons-lang3\3.12.0\commons-lang3-3.12.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\lihaoyi\geny_2.13\1.0.0\geny_2.13-1.0.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\lihaoyi\ujson_2.13\3.1.0\ujson_2.13-3.1.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\lihaoyi\upack_2.13\3.1.0\upack_2.13-3.1.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\lihaoyi\upickle-implicits_2.13\3.1.0\upickle-implicits_2.13-3.1.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\dev\dirs\directories\26\directories-26.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\outr\scribe_2.13\3.13.0\scribe_2.13-3.13.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\io\get-coursier\coursier_2.13\2.1.8\coursier_2.13-2.1.8.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\typelevel\cats-kernel_2.13\2.9.0\cats-kernel_2.13-2.9.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\typelevel\jawn-parser_2.13\1.4.0\jawn-parser_2.13-1.4.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\joda-time\joda-time\2.10.1\joda-time-2.10.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\joda\joda-convert\2.2.0\joda-convert-2.2.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\json4s\json4s-ast_2.13\4.0.6\json4s-ast_2.13-4.0.6.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\json4s\json4s-scalap_2.13\4.0.6\json4s-scalap_2.13-4.0.6.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\thoughtworks\paranamer\paranamer\2.8\paranamer-2.8.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\lihaoyi\upickle-core_2.13\3.1.0\upickle-core_2.13-3.1.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\outr\perfolation_2.13\1.2.9\perfolation_2.13-1.2.9.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\lihaoyi\sourcecode_2.13\0.3.1\sourcecode_2.13-0.3.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\modules\scala-collection-compat_2.13\2.11.0\scala-collection-compat_2.13-2.11.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\outr\moduload_2.13\1.1.7\moduload_2.13-1.1.7.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\github\plokhotnyuk\jsoniter-scala\jsoniter-scala-core_2.13\2.13.5.2\jsoniter-scala-core_2.13-2.13.5.2.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\io\get-coursier\coursier-core_2.13\2.1.8\coursier-core_2.13-2.1.8.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\io\get-coursier\coursier-cache_2.13\2.1.8\coursier-cache_2.13-2.1.8.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\io\get-coursier\coursier-proxy-setup\2.1.8\coursier-proxy-setup-2.1.8.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\io\github\alexarchambault\concurrent-reference-hash-map\1.1.0\concurrent-reference-hash-map-1.1.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\modules\scala-xml_2.13\2.2.0\scala-xml_2.13-2.2.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\io\get-coursier\coursier-util_2.13\2.1.8\coursier-util_2.13-2.1.8.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\io\get-coursier\jniutils\windows-jni-utils\0.3.3\windows-jni-utils-0.3.3.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\codehaus\plexus\plexus-archiver\4.9.0\plexus-archiver-4.9.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\codehaus\plexus\plexus-container-default\2.1.1\plexus-container-default-2.1.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\virtuslab\scala-cli\config_2.13\0.2.1\config_2.13-0.2.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\io\github\alexarchambault\windows-ansi\windows-ansi\0.0.5\windows-ansi-0.0.5.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\javax\inject\javax.inject\1\javax.inject-1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\codehaus\plexus\plexus-utils\4.0.0\plexus-utils-4.0.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\codehaus\plexus\plexus-io\3.4.1\plexus-io-3.4.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\commons-io\commons-io\2.15.0\commons-io-2.15.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\apache\commons\commons-compress\1.24.0\commons-compress-1.24.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\slf4j\slf4j-api\1.7.36\slf4j-api-1.7.36.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\iq80\snappy\snappy\0.4\snappy-0.4.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\tukaani\xz\1.9\xz-1.9.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\com\github\luben\zstd-jni\1.5.5-10\zstd-jni-1.5.5-10.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\codehaus\plexus\plexus-classworlds\2.6.0\plexus-classworlds-2.6.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\apache\xbean\xbean-reflect\3.7\xbean-reflect-3.7.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\fusesource\jansi\jansi\1.18\jansi-1.18.jar [exists ]
Options:
-release 11


action parameters:
uri: file:///C:/Users/vedsh/sysarch-project-one/src/main/scala/arithmetic/Divider.scala
text:
```scala
package arithmetic

import chisel3._
import chisel3.util._

class Divider(bitWidth: Int) extends Module {
    val io = IO(new Bundle {
        val start = Input(Bool())
        val done = Output(Bool())
        val dividend = Input(UInt(bitWidth.W))
        val divisor = Input(UInt(bitWidth.W))
        val quotient = Output(UInt(bitWidth.W))
        val remainder = Output(UInt(bitWidth.W))
    })

    val remainder = RegInit(0.U(bitWidth.W))       //current remainder
    val quotient = RegInit(VecInit(Seq.fill(bitWidth)(0.U(1.W))))   //= {dividend[i:0], quotient[N−1:i+1]}, where dividend is the input dividend and quotient is the final output quotient, and i is the current cycle
    val divisor = RegInit(0.U(bitWidth.W))         //divisor
    val count = RegInit(0.U(log2Ceil(bitWidth + 1).W))

  io.done := false.B

  when(io.start) {
    remainder := 0.U
    quotient := VecInit(Seq.fill(bitWidth)(0.U(bitWidth.W)))
    divisor := io.divisor
    count := (bitWidth - 1).U
  } .elsewhen(count =/= 0.U) {
    val ram = (remainder << 1) | io.dividend(count)

    when (ram >= divisor) {
      remainder := ram - divisor
      quotient(count) := 1.U
    } .otherwise {
      remainder := ram
      quotient(count) := 0.U
    }

    count := count - 1.U
    when(count === 0.U) {
      io.done := true.B
    }
  }

  io.quotient := quotient.asUInt
  io.remainder := remainder
}

  io.quotient := quotient.asUInt
  io.remainder := remainder
}



```



#### Error stacktrace:

```
java.base/java.util.Arrays.sort(Arrays.java:1234)
	scala.tools.nsc.classpath.JFileDirectoryLookup.listChildren(DirectoryClassPath.scala:118)
	scala.tools.nsc.classpath.JFileDirectoryLookup.listChildren$(DirectoryClassPath.scala:102)
	scala.tools.nsc.classpath.DirectoryClassPath.listChildren(DirectoryClassPath.scala:293)
	scala.tools.nsc.classpath.DirectoryClassPath.listChildren(DirectoryClassPath.scala:293)
	scala.tools.nsc.classpath.DirectoryLookup.list(DirectoryClassPath.scala:83)
	scala.tools.nsc.classpath.DirectoryLookup.list$(DirectoryClassPath.scala:78)
	scala.tools.nsc.classpath.DirectoryClassPath.list(DirectoryClassPath.scala:293)
	scala.tools.nsc.classpath.AggregateClassPath.$anonfun$list$3(AggregateClassPath.scala:106)
	scala.collection.immutable.Vector.foreach(Vector.scala:2124)
	scala.tools.nsc.classpath.AggregateClassPath.list(AggregateClassPath.scala:102)
	scala.tools.nsc.util.ClassPath.list(ClassPath.scala:34)
	scala.tools.nsc.util.ClassPath.list$(ClassPath.scala:34)
	scala.tools.nsc.classpath.AggregateClassPath.list(AggregateClassPath.scala:31)
	scala.tools.nsc.symtab.SymbolLoaders$PackageLoader.doComplete(SymbolLoaders.scala:297)
	scala.tools.nsc.symtab.SymbolLoaders$SymbolLoader.$anonfun$complete$2(SymbolLoaders.scala:249)
	scala.tools.nsc.symtab.SymbolLoaders$SymbolLoader.complete(SymbolLoaders.scala:247)
	scala.reflect.internal.Symbols$Symbol.completeInfo(Symbols.scala:1565)
	scala.reflect.internal.Symbols$Symbol.info(Symbols.scala:1537)
	scala.reflect.internal.Mirrors$RootsBase.init(Mirrors.scala:258)
	scala.tools.nsc.Global.rootMirror$lzycompute(Global.scala:75)
	scala.tools.nsc.Global.rootMirror(Global.scala:73)
	scala.tools.nsc.Global.rootMirror(Global.scala:45)
	scala.reflect.internal.Definitions$DefinitionsClass.ObjectClass$lzycompute(Definitions.scala:295)
	scala.reflect.internal.Definitions$DefinitionsClass.ObjectClass(Definitions.scala:295)
	scala.reflect.internal.Definitions$DefinitionsClass.init(Definitions.scala:1657)
	scala.tools.nsc.Global$Run.<init>(Global.scala:1249)
	scala.tools.nsc.interactive.Global$TyperRun.<init>(Global.scala:1352)
	scala.tools.nsc.interactive.Global.newTyperRun(Global.scala:1375)
	scala.tools.nsc.interactive.Global.<init>(Global.scala:294)
	scala.meta.internal.pc.MetalsGlobal.<init>(MetalsGlobal.scala:40)
	scala.meta.internal.pc.ScalaPresentationCompiler.newCompiler(ScalaPresentationCompiler.scala:453)
```
#### Short summary: 

java.lang.NullPointerException: Cannot read the array length because "a" is null