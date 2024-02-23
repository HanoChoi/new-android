import org.gradle.api.artifacts.dsl.DependencyHandler


fun DependencyHandler.coreKtx() {
    implementation(Core.coreKtx)
}

fun DependencyHandler.appCompat() {
    implementation(Core.appCompat)
}

fun DependencyHandler.materialDesign() {
    implementation(Core.materialDesign)
}

fun DependencyHandler.constraintLayout() {
    implementation(Core.constraintLayout)
}

fun DependencyHandler.legacy() {
    implementation(Core.legacy)
}


fun DependencyHandler.bitcoinJ() {
    implementation(Dependencies.bitcoinJ)
}

private fun DependencyHandler.implementation(depName: String) {
    add("implementation", depName)
}

private fun DependencyHandler.kapt(depName: String) {
    add("kapt", depName)
}

private fun DependencyHandler.androidTestImplementation(depName: String) {
    add("androidTestImplementation", depName)
}

private fun DependencyHandler.testImplementation(depName: String) {
    add("testImplementation", depName)
}

private fun DependencyHandler.classpath(depName: String) {
    add("classpath", depName)
}

private fun DependencyHandler.debugImplementation(depName: String) {
    add("debugImplementation", depName)
}

private fun DependencyHandler.kaptTest(depName: String) {
    add("kaptTest", depName)
}