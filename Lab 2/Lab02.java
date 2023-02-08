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
