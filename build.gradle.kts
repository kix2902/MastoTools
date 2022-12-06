import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension

plugins {
    kotlin("js")
    id("org.jetbrains.compose")
}

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

kotlin {
    js(IR) {
        browser {
            runTask {
                dependsOn(":developmentExecutableCompileSync")
            }
        }
        binaries.executable()
    }
}

dependencies {
    implementation(compose.web.core)
    implementation(compose.runtime)
}

// a temporary workaround for a bug in jsRun invocation - see https://youtrack.jetbrains.com/issue/KT-48273
afterEvaluate {
    rootProject.extensions.configure<NodeJsRootExtension> {
        versions.webpackDevServer.version = "4.0.0"
        versions.webpackCli.version = "4.10.0"
    }
}
