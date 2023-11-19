public class BankInterface {

    private boolean userWantsConsult = true;

    public boolean getUserWantsConsult(){
        return userWantsConsult;
    }

    public void setUserWantsConsult(boolean userWantsConsult){
        this.userWantsConsult = userWantsConsult;
    }

    public void showBankMenu(ClientBankAccount clientBankAccount)
    {
        String menu = """
                ********************************
                Dados iniciais do cliente
                
                Nome: %s
                Tipo de conta: %s
                Saldo inicial: R$ %.2f
                
                ********************************
                
                Operações
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair
                
                Digite a opção desejada:
                """.formatted(clientBankAccount.getClientName(), clientBankAccount.getAccountType(), clientBankAccount.getAccountBalance());
        System.out.println(menu);
    }

    public void processingMenuOption(int menuOption, ClientBankAccount clientBankAccount){
        switch (menuOption){
            case 1:
                double saldo = clientBankAccount.getAccountBalance();
                System.out.println("Saldo atual: R$ %.2f".formatted(saldo));
                System.out.println();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4 :
                this.setUserWantsConsult(false);
                System.out.println("Encerrando consulta.");
                break;
            default:
                System.out.println("Erro: a opção escolhida é inválida.");
        }
    }


}
