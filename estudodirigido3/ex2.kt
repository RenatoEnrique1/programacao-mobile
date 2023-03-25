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