package aplication;

import util.Banking;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Banking account1 = new Banking();

        System.out.println("Enter account number : ");
        account1.setAccount(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter account holder : ");
        account1.setName(sc.nextLine());


        System.out.println("Is there na initial deposit(y/n)?");
        String response = sc.nextLine();

        if (response.equalsIgnoreCase("y")) {

            System.out.println("Enter initial deposit value : ");
            account1.setValue(sc.nextDouble());

            System.out.println(account1.Updated());

            System.out.println("Enter a deposit value: ");
            double value = sc.nextDouble();
            account1.DepositValue(value);

            System.out.println(account1.Updated());

            System.out.println("Enter a withdraw value: ");
            double value2 = sc.nextDouble();
            account1.WithdrawValue(value2);

            System.out.println(account1.Updated());

        } else if (response.equalsIgnoreCase("n")) {

            System.out.println(account1.Updated());

            System.out.println("Enter a deposit value: ");
            double value = sc.nextDouble();
            account1.DepositValue(value);

            System.out.println(account1.Updated());

            System.out.println("Enter a withdraw value: ");
            double value2 = sc.nextDouble();
            account1.WithdrawValue(value2);

            System.out.println(account1.Updated());
        }
        sc.close();
    }
}
