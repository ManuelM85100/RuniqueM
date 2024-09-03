plugins {
    alias(libs.plugins.ruiniquem.jvm.library)
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)

    implementation(projects.core.domain)
}