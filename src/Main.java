import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ClientBankAccount clientBankAccount = new ClientBankAccount();
        BankInterface bankInterface = new BankInterface();

        while (bankInterface.getUserWantsConsult()){
            bankInterface.showBankMenu(clientBankAccount);
            bankInterface.processingMenuOption(clientBankAccount);
        }
    }
}