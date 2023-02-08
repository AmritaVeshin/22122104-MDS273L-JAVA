# 22122104-MDS273L-JAVA
### Name: Amrita Veshin
### Register Number: 22122104
### Email: amrita.veshin@msds.christuniversity.in
### Class: 2MScDS-B
## Lab-02: 
You are supposed to create a menu-driven program that has the following menu options:
1. Enter a name
2. Search for a name
3. Remove a name
4. Show all names

### Note:
The menu-driven program has to be made with the help of a do-while loop and switch-case statements.

### Constraints:
1. The names collected must be stored in an array with a max length of 1024.
2. The names in the array should be UNIQUE; no duplicate entries are expected!
3. Provide necessary validations that the user enters only valid names that are not going to be repeated.
4. Removing a name should not create empty space inside the array!
5. Format your results properly!!

## CODE SCRIPT:
import java.util.Scanner;

public class Lab02{
    public static void main(String[] args) {
        int ch, ch2;
        int choice,i=0;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n****************WELCOME TO LAB02 PROGRAM**************\n");
        System.out.println("\n                   Name Search Window             \n");
        System.out.println("Following are your choices: ");
        System.out.println("1. Enter a name");
        System.out.println("2. Search for a name");
        System.out.println("3. Remove a name");
        System.out.println("4. Show all names");
        String[] array=new String[1024];
        do{
            System.out.print("\nEnter your choice of operation: ");
            choice=Integer.parseInt(sc.next());
            switch (choice) {
                case 1:
                System.out.println("\n****************Name Entry Window****************");
                do{
                        System.out.println("Enter a name: ");
                        name=sc.next();
                        for(int j=0; j<array.length; j++){
                            if(name.equals(array[j])){
                                System.out.println("Name already stored. Try again.");
                                break;
                            }
                            if(array[j]==null){
                                array[j]=name;
                                break;
                            }
                        }
                        
                        System.out.println("Do you wish to enter another name? (1/0): ");
                        ch2=Integer.parseInt(sc.next());
                    }while(ch2!=0);
                break;
                
                case 2:
                System.out.println("\n****************Name Search Window****************");
                do{
                    System.out.println("Enter a name for searching: ");
                    int found = 0;
                    String name2;
                    name2=sc.next();
                    for(int j=0; j<array.length; j++){
                        if(name2.equals(array[j])){
                            System.out.println("Name "+name2+" found in the list!");
                            found = 1;
                            break;
                        }
                    }
                    if(found == 0){
                        System.out.println("Name "+name2+" not found in the list!");
                        break;
                    }
                    
                    System.out.print("Do you wish to search another name? (1/0): ");
                    ch2=Integer.parseInt(sc.next());
                }while(ch2!=0);
                break;
            
                case 3:
                System.out.println("\n****************Name Removal Window****************");
                    do{
                        int k=0;
                        System.out.println("Enter a name for removing: ");
                        name=sc.next();
                        for(int j=0; j<array.length; j++){
                            if(array[j]==null){
                                break;
                            }
                            if(array[j].equals(name)){
                                k=1;
                                System.out.println(name+" successfully removed from the list!");
                            }
                            array[j]=array[j+k];
                        }

                        System.out.print("Do you wish to remove another name? (1/0): ");
                        ch2=Integer.parseInt(sc.next());
                    }while(ch2!=0);
                    break;
                
                case 4:
                System.out.println("\n****************Name List Window****************");
                System.out.println("Following are all the names in the list: ");
                for(i=0; i<array.length; i++){
                    if(array[i]!=null){
                        System.out.print(array[i]+" ");
                    }                  
                }
                System.out.println();
                break;                                                    

                default:
                System.out.println("Invalid Input! Try Again.");
                break;
            }

            System.out.println("Do you wish to run another operation from the menu? (1/0): ");
            ch=Integer.parseInt(sc.next());
        }while(ch!=0);          
        sc.close();
    }
    
}

### Validations Performed: 
1. If the user enters a name which is already stored, the program prompts the user to try again.
2. If the user searches for a name which is not there in the list, the program delivers message informing about the same.
3. Once a name has been removed from the list, the program delivers message informing about the same.
4. At every stage, the user is asked if they wish to perform the corresponding operations again or not. 

### OUTPUT:

****************WELCOME TO LAB02 PROGRAM**************


                Name Search Window
Following are your choices:
1. Enter a name
2. Search for a name
3. Remove a name
4. Show all names

Enter your choice of operation: 1 
****************Name Entry Window****************             
Enter a name: 
Amrita
Do you wish to enter another name? (1/0): 
1
Enter a name: 
Atharva
Do you wish to enter another name? (1/0): 
1
Enter a name: 
Rahil
Do you wish to enter another name? (1/0): 
1
Enter a name: 
Keegan
Do you wish to enter another name? (1/0): 
0
Do you wish to run another operation from the menu? (1/0): 
1

Enter your choice of operation: 2
****************Name Search Window****************             
Enter a name for searching: 
Keegan
Name Keegan found in the list!
Do you wish to search another name? (1/0): 0
Do you wish to run another operation from the menu? (1/0): 
1

Enter your choice of operation: 3
****************Name Removal Window****************             
Enter a name for removing: 
Keegan
Keegan successfully removed from the list!
Do you wish to remove another name? (1/0): 0
Do you wish to run another operation from the menu? (1/0): 
1

Enter your choice of operation: 4
****************Name List Window****************             
Following are all the names in the list: 
Amrita Atharva Rahil
Do you wish to run another operation from the menu? (1/0):
0
