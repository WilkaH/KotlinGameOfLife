// Module script for production
import kotlin.modules.*
fun project() {
    module("KotlinGameOfLife") {
        sources += "C:/Users/Wilka/IdeaProjects/KotlinGameOfLife/src/GameOfLife.kt"
        // Classpath
        classpath += "C:/Program Files (x86)/Java/jdk1.7.0_09/jre/lib/charsets.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.7.0_09/jre/lib/deploy.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.7.0_09/jre/lib/javaws.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.7.0_09/jre/lib/jce.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.7.0_09/jre/lib/jfr.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.7.0_09/jre/lib/jfxrt.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.7.0_09/jre/lib/jsse.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.7.0_09/jre/lib/management-agent.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.7.0_09/jre/lib/plugin.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.7.0_09/jre/lib/resources.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.7.0_09/jre/lib/rt.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.7.0_09/jre/lib/ext/access-bridge-32.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.7.0_09/jre/lib/ext/dnsns.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.7.0_09/jre/lib/ext/jaccess.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.7.0_09/jre/lib/ext/localedata.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.7.0_09/jre/lib/ext/sunec.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.7.0_09/jre/lib/ext/sunjce_provider.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.7.0_09/jre/lib/ext/sunmscapi.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.7.0_09/jre/lib/ext/sunpkcs11.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.7.0_09/jre/lib/ext/zipfs.jar"
        // Output directory, commented out
        //         classpath += "C:/Users/Wilka/IdeaProjects/KotlinGameOfLife/out/production/KotlinGameOfLife"
        classpath += "C:/Users/Wilka/IdeaProjects/KotlinGameOfLife/lib/kotlin-runtime.jar"
        // Java Source Roots
        classpath += "C:/Users/Wilka/IdeaProjects/KotlinGameOfLife/src"
        // External annotations
        annotationsPath += "C:/Program Files (x86)/JetBrains/IntelliJ IDEA Community Edition 12.0.1/lib/jdkAnnotations.jar"
        annotationsPath += "C:/Users/Wilka/.IdeaIC12/config/plugins/Kotlin/kotlinc/lib/kotlin-jdk-annotations.jar"
    }
}
