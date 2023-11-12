public class BankInterface {

    public void showBankMenu(double saldo, String cliente, String tipoConta)
    {
        String menu = """
                ********************************
                Dados iniciais do cliente
                
                Nome: %s
                Tipo de conta: %s
                Saldo inicial: R$ %.2f
                
                ********************************
                
                Operações
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                """.formatted(cliente, tipoConta, saldo);
        System.out.println(menu);
    }
}
