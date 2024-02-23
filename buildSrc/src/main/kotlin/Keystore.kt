data class Keystore(
    val path: String,
    val storePassword: String,
    val keyAlias: String,
    val keyPassword: String
)

object SigningConfigs {
    fun initialize(type: KeystoreType): Keystore {
        return when (type) {
            KeystoreType.DEBUG -> {
                Keystore(
                    path = "debug-dangolchain.keystore",
                    storePassword = "123456",
                    keyAlias = "debug-dangolchain",
                    keyPassword = "123456"
                )
            }
            KeystoreType.RELEASE -> TODO()
        }
    }
}
