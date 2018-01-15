fun global(a: Int, b: Float) {}

fun withDefault(c: Int = 1, d: String = "aaa") {}

fun String.withReceiver(a: Int, b: Float) {}


fun call() {
    global(b = 2.2F, a = 2)
    withDefault(d = "bbb")
    "abc".withReceiver(1, 1.2F)
    Math.atan2(1.3, 3.4)
    unresolvedMethod("param1", "param2")
    java.lang.String.format("%i %i %i", 1, 2, 3)
}