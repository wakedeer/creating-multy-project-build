allprojects {
    repositories {
        jcenter()
    }
}

subprojects {
    apply(plugin = "java")
    dependencies {
        constraints {
            "implementation"("org.apache.commons:commons-lang3:3.7")
        }
    }
}
