package demo

import java.util.*
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class OmikujiProperty{
    private val random = Random()

    operator fun getValue(thisRef: Application, property: KProperty<*>): String {
        return when(random.nextInt(4)) {
            0 -> "大吉"
            1 -> "中吉"
            2 -> "小吉"
            else -> "凶"
        }
    }
}

class Application {
    val omikuji: String by OmikujiProperty()

}
fun main(args: Array<String>) {
    val app = Application()
    print(app.omikuji)
}