fun main() {
    print("Digite a sua primeira nota: ")
    val nota1 = readLine()!!.toDouble()

    print("Digite a sua segunda nota: ")
    val nota2 = readLine()!!.toDouble()

    print("Digite a a sua terceira nota: ")
    val nota3 = readLine()!!.toDouble()

    val mediaPonderada = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10

    println("A média do aluno é $mediaPonderada")

    if (mediaPonderada >= 7) {
        println("O aluno está aprovado")
    } else if (mediaPonderada >= 4) {
        println("O aluno está em final")
    } else {
        println("O aluno reprovou")
    }
}