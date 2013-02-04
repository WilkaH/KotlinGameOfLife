// Module script for production
import kotlin.modules.*
fun project() {
    module("KotlinGameOfLife") {
        sources += "D:/My Documents/IntelliJ IDEA/KotlinGameOfLife/src/GameOfLife.kt"
        // Classpath
        classpath += "C:/Program Files (x86)/Java/jdk1.6.0_24/jre/lib/charsets.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.6.0_24/jre/lib/deploy.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.6.0_24/jre/lib/javaws.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.6.0_24/jre/lib/jce.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.6.0_24/jre/lib/jsse.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.6.0_24/jre/lib/management-agent.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.6.0_24/jre/lib/plugin.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.6.0_24/jre/lib/resources.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.6.0_24/jre/lib/rt.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.6.0_24/jre/lib/ext/dnsns.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.6.0_24/jre/lib/ext/localedata.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.6.0_24/jre/lib/ext/sunjce_provider.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.6.0_24/jre/lib/ext/sunmscapi.jar"
        classpath += "C:/Program Files (x86)/Java/jdk1.6.0_24/jre/lib/ext/sunpkcs11.jar"
        // Output directory, commented out
        //         classpath += "D:/My Documents/IntelliJ IDEA/KotlinGameOfLife/out/production/KotlinGameOfLife"
        classpath += "D:/My Documents/IntelliJ IDEA/KotlinGameOfLife/lib/kotlin-runtime.jar"
        // Java Source Roots
        classpath += "D:/My Documents/IntelliJ IDEA/KotlinGameOfLife/src"
        // External annotations
        annotationsPath += "C:/Users/Wilka.Hudson/.IdeaIC12/config/plugins/Kotlin/kotlinc/lib/kotlin-jdk-annotations.jar"
        annotationsPath += "C:/Program Files (x86)/JetBrains/IntelliJ IDEA Community Edition 12.0.3/lib/jdkAnnotations.jar"
    }
}
