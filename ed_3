# Exercício 1

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










## Exercício 2 -

fun main() {
    // Criando duas contas bancárias
    val conta1 = ContaBancaria("Renato Enrique", 1000.0, 1234, "001")
    val conta2 = ContaBancaria("Chester Bennington", 2000.0, 5678, "002")

    // Imprimindo extrato das contas
    conta1.imprimirExtrato()
    conta2.imprimirExtrato()

    // Realizando algumas operações com a conta1
    conta1.depositar(500.0)
    conta1.retirar(200.0)
    conta1.transferir(300.0, conta2)

    // Imprimindo extrato das contas novamente
    conta1.imprimirExtrato()
    conta2.imprimirExtrato()
}










#Exercício 3 -

 
 fun main() {
    // Criando a lista de contas bancárias
    val contas = listOf(
        ContaBancaria("Maria da Silva", 1000.0, 1234, "001"),
        ContaBancaria("João Souza", 2000.0, 5678, "002"),
        ContaBancaria("Pedro Oliveira", 500.0, 2468, "003"),
        ContaBancaria("Ana Santos", 1500.0, 1357, "004"),
        ContaBancaria("Fernanda Costa", 3000.0, 7890, "005")
    )

    // Ordenando a lista de contas pelo saldo, do menor para o maior
    val contasPorSaldo = contas.sortedBy { it.saldo }

    // Imprimindo a lista de contas ordenadas pelo saldo
    println("Contas em ordem crescente do menor para o maior saldo:")
    contasPorSaldo.forEach { conta ->
        println("Cliente: ${conta.cliente}, Saldo: R$ ${conta.saldo}")
    }

    // Ordenando a lista de contas pelo nome do cliente, em ordem alfabética
    val contasPorNome = contas.sortedBy { it.cliente }

    // Imprimindo a lista de contas ordenadas pelo nome do cliente
    println("\nContas em ordem alfabética pelo nome do cliente:")
    contasPorNome.forEach { conta ->
        println("Cliente: ${conta.cliente}, Saldo: R$ ${conta.saldo}")
    }
}

 

 
 
 
 
 
# Exercício 4 -
  
 class ContaPoupanca(
    cliente: String,
    saldo: Double,
    numero: Int,
    agencia: String ) : ContaBancaria(cliente, saldo, numero, agencia) {

    fun aplicarJuros() {
        val jurosDiarios = 0.3 / 100 // 0,3%
        val juros = saldo * jurosDiarios
        depositar(juros)
    }
}

 
 
 
 
 

Exercício 5 - 
  

interface Boleto {
    fun imprimirBoleto()
}

class ContaBancaria(
    cliente: String,
    saldo: Double,
    numero: Int,
    agencia: String
) : Boleto {
    // implementação dos métodos e atributos da classe

    override fun imprimirBoleto() {
        println("Imprimindo boleto para a conta $numero")
        println("Cliente: $cliente")
        println("Valor: $saldo")
        println("Agência: $agencia")
    }
}

