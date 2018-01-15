fun global(a: Int, b: Float) {}

fun withDefault(c: Int = 1, d: Float = 3F) {}

fun String.withReceiver(a: Int, b: Float) {}


fun call() {
    global(b = 2.2F, a = 2)
    withDefault(d = 4F)
    "abc".withReceiver(1, 1.2F)
}