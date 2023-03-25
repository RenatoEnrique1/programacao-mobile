fun main() {

    val contas = listOf(
        ContaBancaria("Renato Enrique", 1000.0, 1234, "001"),
        ContaBancaria("Gabriel Gebera", 2000.0, 5678, "002"),
        ContaBancaria("Chester Bennington", 500.0, 2468, "003"),
    )

    val contasPorSaldo = contas.sortedBy { it.saldo }

    println("Contas em ordem crescente do menor para o maior saldo:")
    contasPorSaldo.forEach { conta ->
        println("Cliente: ${conta.cliente}, Saldo: R$ ${conta.saldo}")
    }

    
    val contasPorNome = contas.sortedBy { it.cliente }

    println("\nContas em ordem alfabética pelo nome do cliente:")
    contasPorNome.forEach { conta ->
        println("Cliente: ${conta.cliente}, Saldo: R$ ${conta.saldo}")
    }
}
