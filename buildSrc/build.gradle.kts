plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
    google()
}

dependencies {
    //  This is runtime error reason!! Need comment-out.
    implementation("com.android.tools.build:gradle:7.0.0")
}