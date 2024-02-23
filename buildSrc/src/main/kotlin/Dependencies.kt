object Dependencies {


  const val activityKtx = "androidx.activity:activity-ktx:${Versions.activityKtxVersion}"

  const val leakCanary =
    "com.squareup.leakcanary:leakcanary-android:${Versions.leakCanaryVersion}"


  const val viewPager = "androidx.viewpager2:viewpager2:${Versions.viewPagerVersion}"

  const val roundImageView = "com.makeramen:roundedimageview:${Versions.roundImageViewVersion}"


  const val vita = "com.androidisland.arch:vita:${Versions.vitaVersion}"


  const val bitcoinJ = "org.bitcoinj:bitcoinj-core:${Versions.bitcoinJVersion}"


}

object Core {
  const val gradle = "com.android.tools.build:gradle:${Versions.gradleVersion}"

  const val kotlinGradle =
    "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinGradleVersion}"

  const val googlePlayService =
    "com.google.gms:google-services:${Versions.googlePlayServiceVersion}"

  const val hiltGradle =
    "com.google.dagger:hilt-android-gradle-plugin:${Versions.hiltGradleVersion}"

  const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtxVersion}"
  const val appCompatX = "androidx.appcompat:appcompat:${Versions.appCompatVersion}"

  const val materialDesign = "com.google.android.material:material:${Versions.materialVersion}"

  const val constraintLayout =
    "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"

  const val legacy = "androidx.legacy:legacy-support-v4:${Versions.legacyVersion}"

  const val appCompat = "com.android.support:appcompat-v7:28.0.0"

  const val activityKtx = "androidx.activity:activity-ktx:1.5.0"
  const val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragmentKtxVersion}"
  const val guava = "com.google.guava:guava:30.1-jre"
}

object Retrofit {
  const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
  const val gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofitVersion}"
  const val interceptor =
    "com.squareup.okhttp3:logging-interceptor:${Versions.interceptorVersion}"
  const val serialization =
    "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.serializationVersion}"
  const val retrofitSerialization = "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.8.0"
  const val jacksonConverter =
    "com.squareup.retrofit2:converter-jackson:${Versions.retrofitVersion}"
  const val scalarConverter =
    "com.squareup.retrofit2:converter-scalars:${Versions.retrofitVersion}"
}

object Hilt {
  const val hilt = "com.google.dagger:hilt-android:${Versions.hiltVersion}"
  const val hiltKapt = "com.google.dagger:hilt-compiler:${Versions.hiltVersion}"
}

object Testing {
  const val fragmentTest = "androidx.fragment:fragment-testing:${Versions.fragmentTestVersion}"

  const val coroutineTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:"

  const val archTest = "androidx.arch.core:core-testing:2.1.0"
  const val truthTest = "com.google.truth:truth:1.1.3"
  const val runnerTest = "androidx.test:runner:1.4.0"
  const val testRules = "androidx.test:rules:1.1.1"

  const val hiltTest = "com.google.dagger:hilt-android-testing:${Versions.hiltTestVersion}"
  const val hiltTestKapt = "com.google.dagger:hilt-android-compiler:${Versions.hiltTestVersion}"

  const val junit = "junit:junit:${Versions.junitVersion}"
  const val junitExt = "androidx.test.ext:junit:1.1.3"
  const val junitTest = "androidx.test.ext:junit:${Versions.junitTestVersion}"
  const val espresso = "androidx.test.espresso:espresso-core:${Versions.espressoVersion}"
  const val espressoCore = ""
  const val mockk = "io.mockk:mockk:1.10.0"
  const val mockkAndroid = "io.mockk:mockk-android:1.10.0"

  const val robolectric = "org.robolectric:robolectric:4.8.2"

  const val kakao = "com.agoda.kakao:kakao:2.0.0"
  const val kaspresso = "com.kaspersky.android-components:kaspresso:1.3.0"
  const val turbine = "app.cash.turbine:turbine:0.7.0"
  const val assertj = "org.assertj:assertj-core:3.22.0"

  const val mockWebServer = "com.squareup.okhttp3:mockwebserver:3.12.0"
}

object Firebase {
  const val firebaseAuthKtx =
    "com.google.firebase:firebase-auth-ktx:${Versions.firebaseAuthKtxVersion}"
  const val firebaseAuthUi = "com.firebaseui:firebase-ui-auth:${Versions.firebaseAuthUiVersion}"
  const val firebaseMessaging =
    "com.google.firebase:firebase-messaging-ktx:${Versions.firebaseMessagingVersion}"
  const val firebaseDynamicLinks =
    "com.google.firebase:firebase-dynamic-links-ktx:${Versions.firebaseDynamicLinksVersion}"
  const val firebaseAnalytics =
    "com.google.firebase:firebase-analytics:${Versions.firebaseAnalyticsVersion}"
  const val firebaseCrashlytics =
    "com.google.firebase:firebase-crashlytics-ktx:${Versions.firebaseCrashlyticsVersion}"
}

object Lifecycle {
  const val viewModel =
    "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleKtxVersion}"
  const val liveData =
    "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleKtxVersion}"
  const val runtime =
    "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleKtxVersion}"
}

object Coroutine {
  const val coroutineCore =
    "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutineVersion}"
  const val coroutineAndroid =
    "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutineVersion}"
  const val coroutinePlayServices =
    "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:${Versions.coroutineVersion}"
}

object Logger {
  const val timber = "com.jakewharton.timber:timber:${Versions.timberVersion}"
  const val logger = "com.orhanobut:logger:${Versions.loggerVersion}"
  const val anrWatchDog = "com.github.anrwatchdog:anrwatchdog:1.4.0"
}

object Navigation {
  const val navigationFragment =
    "androidx.navigation:navigation-fragment-ktx:${Versions.navigationVersion}"
  const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigationVersion}"
}

object Web3J {
  const val web3jCore = "org.web3j:core:${Versions.web3jVersion}"
  const val web3jUtils = "org.web3j:utils:${Versions.web3jVersion}"
  const val web3jCrypto = "org.web3j:crypto:${Versions.web3jVersion}"
}

object Bitcoin {
  const val bitcoinJ = "org.bitcoinj:bitcoinj-core:${Versions.bitcoinJVersion}"
  const val bouncyCastly = "org.bouncycastle:bcpkix-jdk15on:1.67"
}

object DataStore {
  const val dataStorePreferences =
    "androidx.datastore:datastore-preferences:${Versions.dataStoreVersion}"
  const val dataStoreCore = "androidx.datastore:datastore-core:${Versions.dataStoreVersion}"
}

object Location {
  const val gmsLocation =
    "com.google.android.gms:play-services-location:${Versions.locationVersion}"
}

object Shared {
  const val vita = "com.androidisland.arch:vita:${Versions.vitaVersion}"
}

object ImageCaching {
  const val glide = "com.github.bumptech.glide:glide:${Versions.glideVersion}"
  const val coil = "io.coil-kt:coil:${Versions.coilVersion}"
}

object Animation {
  const val lottie = "com.airbnb.android:lottie:${Versions.lottieVersion}"
}

object View {
  const val aestheticDialogs = "com.github.gabriel-TheCode:AestheticDialogs:1.3.6"
  const val pinView = "io.github.chaosleung:pinview:1.4.4"
}

object ML {
  const val mlKit = "com.google.mlkit:barcode-scanning:17.0.2"
}

object TnkFactory {
  const val installReferrer = "com.android.installreferrer:installreferrer:2.2"
  const val rwd = "com.tnkfactory:rwd:8.02.14"
}

object Popcorn {
  const val offerWall = "com.igaworks.offerwall:AdPopcornOfferwall:8.2.2"
}

object Google {
  const val googleCore = "com.google.android.play:core:${Versions.googleCoreVersion}"
  const val googleKtx = "com.google.android.play:app-update-ktx:${Versions.googleCoreVersion}"
  const val googleCoreTesting = "com.google.android.play.core.appupdate.testing:${Versions.googleCoreVersion}"
  const val ads = "com.google.android.gms:play-services-ads:22.0.0"
}

object Meteor {
  const val mvi = "io.github.behzodhalil:meteor-mvi-android:0.0.5"
}

object Modules {
  const val coreUi = ":core-ui"
  const val coreData = ":core-data"
  const val coreTest = ":core-test"

  const val data = ":data"
  const val domain = ":domain"

  const val featureSplash = ":feature-splash-page"
  const val featureMission = ":feature-mission"
  const val featureSetting = ":feature-setting"
  const val featureLogin = ":feature-login"
  const val featurePartner = ":feature-partner"
}
