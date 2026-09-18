repositories {
    google()
    mavenCentral()
}

configurations.create("test")

dependencies {
    add("test", "com.android.tools.build:gradle:9.4.0")
}

tasks.register("resolveAgp") {
    doLast {
        configurations.getByName("test").resolve()
        println("AGP resolved successfully")
    }
}