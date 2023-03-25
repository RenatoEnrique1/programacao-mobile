fun main() {
    for (num in 0..10) {
        var fatorial = 1
        for (i in 1..num) {
            fatorial *= i
        }
        println("O fatorial de $num é $fatorial")
    }
}
