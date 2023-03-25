class ContaBancaria(
    var cliente: String,
    var saldo: Double,
    val numero: Int,
    val agencia: String
) {
    fun depositar(valor: Double) {
        saldo += valor
        println("Depósito de R$$valor realizado com sucesso. Novo saldo: R$$saldo")
    }

    fun retirar(valor: Double) {
        if (valor > saldo) {
            println("Saldo insuficiente. Operação não realizada.")
        } else {
            saldo -= valor
            println("Retirada de R$$valor realizada com sucesso. Novo saldo: R$$saldo")
        }
    }

    fun transferir(valor: Double, contaDestino: ContaBancaria) {
        if (valor > saldo) {
            println("Saldo insuficiente. Operação não realizada.")
        } else {
            saldo -= valor
            contaDestino.saldo += valor
            println("Transferência de R$$valor realizada com sucesso para a conta ${contaDestino.numero}. Novo saldo: R$$saldo")
        }
    }

    fun imprimirExtrato() {
        println("Extrato da conta $numero")
        println("Cliente: $cliente")
        println("Agência: $agencia")
        println("Saldo atual: R$$saldo")
    }
}