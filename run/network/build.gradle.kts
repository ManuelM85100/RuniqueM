plugins {
    alias(libs.plugins.ruiniquem.android.library)
    alias(libs.plugins.ruiniquem.jvm.ktor)
}

android {
    namespace = "com.mmunoz.run.network"
}

dependencies {
    implementation(libs.bundles.koin)
    implementation(projects.core.domain)
    implementation(projects.core.data)
}