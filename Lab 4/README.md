# 22122104-MDS273L-JAVA
### Name: Amrita Veshin
### Register Number: 22122104
### Email: amrita.veshin@msds.christuniversity.in
### Class: 2MScDS-B
## Lab-04:
Write a JAVA Menu driven program that does the following:
You can ONLY have the below variables as global variables
* Account Number
* Account Holder Name
* Account Balance
You MUST have the below as functions
* To initialize the customer
* To deposit money
* To withdraw money
* To print the transactions
* To print account summary
Your menu will have the following operations once the customer is created
* To deposit money
* To withdraw money
* To print the transactions
* To print account summary

### FLOWCHART: 

### CODE: 
```
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

```

### OUTPUT:
```
***********************************************************
                    WELCOME TO CITIZEN BANK
***********************************************************
Press 1 for if you are a new customer or press 2 if you are an existing customer.
1

***********************************************************
                 CUSTOMER DETAILS INPUT WINDOW
***********************************************************
Welcome New Customer! Please enter your corresponding details below:
Customer Name: Amrita Veshin
Customer Account Number: 123456
Customer Account Balance: 12000

****************************************************************
* Congratulations! Your account has been created successfully! *
****************************************************************

***********************************************************
                       OPERATIONS WINDOW
***********************************************************

Which operation do you wish to perform from the following:
1. Deposit Money
2. Withdraw Money
3. Print Transactions
4. Print Account Summary
Enter your choice: 1

***********************************************************
                       DEPOSIT WINDOW
***********************************************************
Enter the amount you wish to deposit:
2000

*****************************************************************
*  The amount has been credited successfully into your account! *
*****************************************************************

Do you wish to perform another operation? (1/0) : 1

t***********************************************************
                       OPERATIONS WINDOW
***********************************************************

Which operation do you wish to perform from the following:
1. Deposit Money
2. Withdraw Money
3. Print Transactions
4. Print Account Summary
Enter your choice: 2

***********************************************************
                     WITHDRAWAL WINDOW
***********************************************************
Enter the amount you wish to withdraw:
500

*****************************************************************
* The amount has been withdrawn successfully from your account! *
*****************************************************************

Do you wish to perform another operation? (1/0) : 1

***********************************************************
                       OPERATIONS WINDOW
***********************************************************

Which operation do you wish to perform from the following:
1. Deposit Money
2. Withdraw Money
3. Print Transactions
4. Print Account Summary
Enter your choice: 3

**************************************************************
                       TRANSACTIONS WINDOW
**************************************************************
Transaction ID  |Credit Amount  |Debit Amount   |Net Balance
**************************************************************
1               |2000           |       -       |14000
2               |       -       |500            |13500
**************************************************************

Do you wish to perform another operation? (1/0) : 1

***********************************************************
                       OPERATIONS WINDOW
***********************************************************

Which operation do you wish to perform from the following:
1. Deposit Money
2. Withdraw Money
3. Print Transactions
4. Print Account Summary
Enter your choice: 4

***********************************************************
                       ACCOUNT SUMMARY
***********************************************************
Customer Name: Amrita Veshin
Customer Account Number: 123456
Current Account Balance: 13500
***********************************************************

Do you wish to perform another operation? (1/0) : 0
```
