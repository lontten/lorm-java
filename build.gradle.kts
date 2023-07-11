plugins {
    id("java")
}

group = "com.lontten.lorm"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // https://mvnrepository.com/artifact/com.mysql/mysql-connector-j
    implementation ("com.mysql:mysql-connector-j:8.0.33")


// https://mvnrepository.com/artifact/org.postgresql/postgresql
    implementation ("org.postgresql:postgresql:42.6.0")


}

tasks.test {
    useJUnitPlatform()
}