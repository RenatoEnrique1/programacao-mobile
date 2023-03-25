
fun main() {
    print("Insira o primeiro número: ")
    val numero1 = readLine()!!.toInt()

    print("Insira o segundo número: ")
    val numero2 = readLine()!!.toInt()

    print("Insira o terceiro número: ")
    val numero3 = readLine()!!.toInt()

    val lista = listOf(numero1, numero2, numero3).sorted()

    println("Os números em ordem crescente são: $lista")
}