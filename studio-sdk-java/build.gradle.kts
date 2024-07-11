plugins {
    id("studio-sdk.kotlin")
    id("studio-sdk.publish")
}

dependencies {
    api(project(":studio-sdk-java-client-okhttp"))
}
