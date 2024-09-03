plugins {
    alias(libs.plugins.ruiniquem.android.library)
    alias(libs.plugins.ruiniquem.jvm.ktor)
}

android {
    namespace = "com.mmunoz.auth.data"
}

dependencies {
    implementation(libs.bundles.koin)
    implementation(projects.auth.domain)
    implementation(projects.core.domain)
    implementation(projects.core.data)
}