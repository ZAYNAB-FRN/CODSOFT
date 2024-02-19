import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        Scanner variable = new Scanner(System.in);
        int balance = 2000,deposit,withdraw;

        while(true){
            System.out.println("-1- for depositif");
            System.out.println("-2- for withdraw");
            System.out.println("-3- for balance");
            System.out.println("-4- for exit");
            System.out.println("choose from 1 to 4 :");

            int ch = variable.nextInt();

            switch (ch) {
                case 1:
                System.out.println("enter the amount :");
                deposit=variable.nextInt();
                balance = balance + deposit;
                System.out.println("your balance has been updated ,the new balance is :" +balance);
                 System.out.println();
                 break;

                case 2:
                System.out.println("enter the amount to withdraw :");
                withdraw = variable.nextInt();
                if(balance>=withdraw)
                {
                balance = balance - withdraw ;
                System.out.println("your balance has been updated ,the new balance is :" +balance);
                System.out.println();
                }
                else
                {
                    System.out.println("go work and get some money !!!! ");
                }
                break;

                case 3:
                System.out.println("your account balance is :" +balance);
                System.out.println();
                break;


                case 4: 
                System.exit(0);
                break;

            }
        }
    }
}
