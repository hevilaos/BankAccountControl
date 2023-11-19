import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ClientBankAccount clientBankAccount = new ClientBankAccount();
        BankInterface bankInterface = new BankInterface();
        Scanner readUserAnswer = new Scanner(System.in);

        while (bankInterface.getUserWantsConsult()){
            bankInterface.showBankMenu(clientBankAccount.getAccountBalance(), clientBankAccount.getClientName(), clientBankAccount.getAccountType());
            int bankOption = readUserAnswer.nextInt();
            bankInterface.processingMenuOption(bankOption);
        }
    }
}