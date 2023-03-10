import java.util.*;

public class Lab04 {
    static String acname;
    static int acno, acbal;
    public static void main(String[] args) {
        int[] oldbal=new int[100];
        int[] newbal=new int[100];
        int ch, ch2, ch3;
        Scanner sc=new Scanner(System.in);
        System.out.println("\n***********************************************************");
        System.out.println("                    WELCOME TO CITIZEN BANK                ");
        System.out.println("***********************************************************");
        System.out.println("Press 1 for if you are a new customer or press 2 if you are an existing customer.");
        ch=sc.nextInt();
        if(ch==1){
            custdetails();         
            ch=2;
        }
        if(ch==2){
            do{
                System.out.println("\n***********************************************************");
                System.out.println("                       OPERATIONS WINDOW                   ");
                System.out.println("***********************************************************");
                System.out.println("\nWhich operation do you wish to perform from the following: ");
                System.out.println("1. Deposit Money \n2. Withdraw Money \n3. Print Transactions \n4. Print Account Summary");
                System.out.print("Enter your choice: ");
                ch2=sc.nextInt();
                switch(ch2){
                    case 1: 
                        deposit(oldbal,newbal);
                        break;
                    case 2: 
                        withdrawal(oldbal,newbal);
                        break;
                    case 3:
                        printtrans(oldbal,newbal);
                        break;
                    case 4:
                        printacsumm(newbal);
                        break;
                    default:
                        System.out.println("Invalid Input! Please Try Again.");
                }
                System.out.print("\nDo you wish to perform another operation? (1/0) : ");
                ch3=sc.nextInt();
            }while(ch3!=0);
            
        }
        
    }

    static void custdetails() {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n***********************************************************");
        System.out.println("                 CUSTOMER DETAILS INPUT WINDOW             ");
        System.out.println("***********************************************************");
        System.out.println("Welcome New Customer! Please enter your corresponding details below:");
        System.out.print("Customer Name: ");
        acname=sc.nextLine();
        System.out.print("Customer Account Number: ");
        acno=sc.nextInt();
        System.out.print("Customer Account Balance: ");
        acbal=sc.nextInt();
        System.out.println("\n****************************************************************");
        System.out.println("* Congratulations! Your account has been created successfully! *");
        System.out.println("****************************************************************");
    }

    static void deposit(int[] oldbal,int[] newbal){
        int dep;
        Scanner sc=new Scanner(System.in);
        System.out.println("\n***********************************************************");
        System.out.println("                       DEPOSIT WINDOW                      ");
        System.out.println("***********************************************************");
        System.out.println("Enter the amount you wish to deposit: ");
        dep=sc.nextInt();
        for(int i=0; i<100; i++){
           if(oldbal[i]==0){
                oldbal[i]=acbal;
                break;
           }else{
                continue;
           }
        }
        acbal=acbal+dep;
        for(int i=0; i<100; i++){
            if(newbal[i]==0){
                 newbal[i]=acbal;
                 break;
            }else{
                 continue;
            }
         }
        
         System.out.println("\n*****************************************************************");
         System.out.println("*  The amount has been credited successfully into your account! *");
         System.out.println("*****************************************************************");


    }

    static void withdrawal(int[] oldbal,int[] newbal){
        int withamt;
        Scanner sc=new Scanner(System.in);
        System.out.println("\n***********************************************************");
        System.out.println("                     WITHDRAWAL WINDOW                     ");
        System.out.println("***********************************************************");
        System.out.println("Enter the amount you wish to withdraw: ");
        withamt=sc.nextInt();
        for(int i=0; i<100; i++){
           if(oldbal[i]==0){
                oldbal[i]=acbal;
                break;
           }else{
                continue;
           }
        }
        acbal=acbal-withamt;
        for(int i=0; i<100; i++){
            if(newbal[i]==0){
                 newbal[i]=acbal;
                 break;
            }else{
                 continue;
            }
         }
        
         System.out.println("\n*****************************************************************");
         System.out.println("* The amount has been withdrawn successfully from your account! *");
         System.out.println("*****************************************************************");

    }

    static void printtrans(int[] oldbal,int[] newbal){
        System.out.println("\n**************************************************************");
        System.out.println("                       TRANSACTIONS WINDOW                    ");
        System.out.println("**************************************************************");
        System.out.println("Transaction ID \t|Credit Amount \t|Debit Amount \t|Net Balance");
        System.out.println("**************************************************************");
        for(int i=0; i<100; i++){
            if(oldbal[i]==0){
                break;
            }else{
                if(newbal[i]-oldbal[i]>0){
                    System.out.println((i+1)+"\t\t|"+(newbal[i]-oldbal[i])+"\t\t|\t-\t|"+newbal[i]);
                }else {
                    System.out.println((i+1)+"\t\t|\t-\t|"+(oldbal[i]-newbal[i])+"\t\t|"+newbal[i]);
                }
            }
        }
        System.out.println("**************************************************************");
    }

    static void printacsumm(int[] newbal){
        System.out.println("\n***********************************************************");
        System.out.println("                       ACCOUNT SUMMARY                     ");
        System.out.println("***********************************************************");
        System.out.println("Customer Name: "+acname);
        System.out.println("Customer Account Number: "+acno);
        System.out.println("Current Account Balance: "+acbal); 
        System.out.println("***********************************************************");       
    }
}
