plugins {
    alias(libs.plugins.ruiniquem.android.library)
    alias(libs.plugins.ruiniquem.jvm.ktor)
}

android {
    namespace = "com.mmunoz.core.data"
}

dependencies {
    implementation(libs.timber)
    implementation(libs.bundles.koin)

    implementation(projects.core.domain)
    implementation(projects.core.database)
}