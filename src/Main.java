public class Main {
    public static void main(String[] args) {

        ClientBankAccount clientBankAccount = new ClientBankAccount();
        double saldo = clientBankAccount.getAccountBalance();
        String clienteNome = clientBankAccount.getClientName();
        String clienteConta = clientBankAccount.getAccountType();

        BankInterface bankInterface = new BankInterface();

        bankInterface.showBankMenu(saldo, clienteNome, clienteConta);
    }
}