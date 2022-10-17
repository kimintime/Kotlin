import java.io.File

fun main(args : Array<String>) {
    var file = File("readme.txt")
    file.writeText("Hello World")
}

