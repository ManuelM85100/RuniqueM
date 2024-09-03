plugins {
    alias(libs.plugins.ruiniquem.android.library)
    alias(libs.plugins.ruiniquem.android.room)
}

android {
    namespace = "com.mmunoz.core.database"
}

dependencies {
    implementation(libs.org.mongodb.bson)
    implementation(libs.bundles.koin)

    implementation(projects.core.domain)
}