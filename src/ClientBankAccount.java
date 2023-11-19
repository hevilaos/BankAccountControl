public class ClientBankAccount {
    private String clientName;
    private String accountType;
    private double accountBalance;

    //Constructor will set the variables because the project does not require to receive
    //other data (except account balance)
    public ClientBankAccount(){
        clientName = "Hévila de Oliveira Santos";
        accountType = "Corrente";
        accountBalance = 2500;
    }

    //getters and setters
    public String getClientName(){
        return clientName;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void depositValue(double value){
        double currentBalance = this.getAccountBalance();
        double newBalance = currentBalance + value;
        this.setAccountBalance(newBalance);
    }
    public void transferValue(double value){
        double currentBalance = this.getAccountBalance();
        if(value<=currentBalance){
            double newBalance = currentBalance-value;
            this.setAccountBalance(newBalance);
        }else {
            System.out.println("Erro: Não é possível efetuar essa transferência.");
            System.out.println("O valor de transferência é maior que o saldo atual.");
        }
    }
}
