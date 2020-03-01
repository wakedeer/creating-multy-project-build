plugins {
    application
}

dependencies {
    implementation(project(":greeting-library"))
}

application {
    mainClassName = "greeter.Greeter"
}