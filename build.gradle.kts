plugins {
    java
    `maven-publish`
}

group = "jp.oist.abcvlib.core.learning"
version = "0.0.2"

sourceSets {
    main {
        java.srcDirs("src/java")
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.flatbuffers:flatbuffers-java:1.12.0")
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
	    artifactId = "fbclasses"
        }
    }
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/oist/smartphone-robot-flatbuffers")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
