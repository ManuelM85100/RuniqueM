plugins {
    alias(libs.plugins.ruiniquem.android.library)
}

android {
    namespace = "com.mmunoz.run.location"
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.bundles.koin)

    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.google.android.gms.play.services.location)

    implementation(projects.core.domain)
    implementation(projects.run.domain)
}