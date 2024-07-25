import java.util.Scanner;


public class atmSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int balance = 500; //let initial balance
        int operaion;

        

        do {
            System.out.println("Menu: ");
            System.out.println("1. Check balance ");
            System.out.println("2. Withdraw money ");
            System.out.println("3. Deposit money ");
            System.out.println("4. Exit.");

           
            System.out.print("Enter your choice: ");
            operaion = sc.nextInt();

            
            

            switch (operaion) {
                case 1:
                    System.out.println("Your balnce is "+balance);
                    break;
                case 2:
                System.out.print("Enter amount to withdraw: ");
                int withdraw = sc.nextInt();

                if(withdraw>balance){
                    System.out.println("insuffcient balance ");
                }else{
                    balance = balance-withdraw;
                    System.out.println("Rs-" +withdraw + "  sucessfully withdrwan! Available  balance is Rs-"+ balance);
                }
                break;

                case 3:
                System.out.print("Enter amount to deposit: ");
                int deposit = sc.nextInt();
                System.out.println("Rs-"+deposit + " deposited successfully ");
                System.out.println("Available Blance is " + (balance+deposit));
                break;

                case 4:
                System.out.println("Thank you choosing our atm system ");
                System.out.println("Devloped by Prakash \nExisting.....");
                break;
            
                default:
                System.out.println("Invalid  choice ");
                break;
            }


        } while (operaion!=4);
        
        sc.close();
    }
}