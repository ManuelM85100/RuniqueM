plugins {
    alias(libs.plugins.ruiniquem.android.feature.ui)
}

android {
    namespace = "com.mmunoz.auth.presentation"
}

dependencies {
    implementation(libs.bundles.koin)
    implementation(projects.core.domain)
    implementation(projects.auth.domain)
}