fun main() {
    print("Digite um número inteiro: ")
    val num = readLine()!!.toInt()

    var fatorial = 1
    for (i in 1..num) {
        fatorial *= i
    }

    println("O fatorial de $num é $fatorial")
}
