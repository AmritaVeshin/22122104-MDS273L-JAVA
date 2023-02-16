# 22122104-MDS273L-JAVA
### Name: Amrita Veshin
### Register Number: 22122104
### Email: amrita.veshin@msds.christuniversity.in
### Class: 2MScDS-B
## Lab-03:

Create a java program that performs the following operation:
The program should collect an integer array from the user

After the array is entered, you need to create a menu of items
1. Find the Mean Value
2. Find the Median Value
3. Find the Mode Value
From the user-given array.

The program should have a minimum of 3 functions apart from the main function; each of the functions implements the Mean, Median, and Mode computation by accepting the array user has entered as a parameter and returning the value as a result. From the main method, you will display the result.

### FLOWCHART: 
![22122104_Lab03_Flowchart](https://user-images.githubusercontent.com/118504567/219256771-ce8a41b0-ef3b-41b8-a4d2-c265ca6a14aa.jpg)


### CODE SCRIPT:
```
import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        System.out.println("\n**********************************************************");
        System.out.println("                MEAN MEDIAN MODE CALCULATOR                 ");
        System.out.println("**********************************************************");
        /*
        This program collects an integer array from the user and returns the mean, median or mode 
        of the array, as per the user's choice of operation. In this program, 3 user-defined functions
        have been used for the implementation of the computation of mean, median and mode. For displaying
        the results, switch case has been used within the main function. 
        
        Do give the program a try !
        
        Happy coding !
         */
        
        System.out.println("\n**********************INPUT WINDOW**********************");
        int n, ch, ch2;
        //Taking inputs for array size n and the array elements
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        //Printing the array 
        System.out.println("\nArray saved successfully as follows: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        
        do{
        //Displaying the operations menu to the user and taking the choice      
        System.out.println("\n\n*********************OPERATIONS MENU*********************");
        System.out.println("1. Mean \n2. Median \n3. Mode ");
        System.out.print("\nEnter your choice of operation: ");
        ch=sc.nextInt();
        //Displaying output using switch case and user-defined functions
        System.out.println("\n**********************OUTPUT WINDOW**********************");
        switch(ch){
            case 1:
                System.out.println("The mean of the given array is: "+mean(arr, n));
                break;
            case 2:
                System.out.println("The median of the given array is: "+median(arr, n));
                break;
            case 3:
                System.out.println("The mode of the given array is: "+mode(arr, n));
                break;
            default:
                System.out.println("Invalid choice! Please refer the menu. ");
        }
        System.out.print("\nDo you wish to perform another operation on the array (1/0)?: ");
        ch2=sc.nextInt();
        }while(ch2!=0);
        
        System.out.println("\n*************THANKYOU FOR USING THE PROGRAM*************");
        
    }

    //function for mean
    static float mean(int [] arr, int n){
        int sum=0;
        for(int i=0; i<n; i++){
            sum=sum+arr[i];
        }
        return sum/n;

    }
    //function for median
    static float median(int [] arr, int n){
        int temp;
        float median;
        //sorting the array using bubble sort
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        if(n%2==0){
            median=(arr[n/2]+arr[(1+n)/2])/2; //value of median if the size of the array is even
        }else{
            median=arr[(1+n)/2]; //value of median if the size of the array is odd
        }           
        return median;
    }
        
    //function for mode
    static int mode(int [] arr, int n){
        int max=0;
        int arrmode=0;
        for(int i=0; i<n; i++){
            int count=0;
            for(int j=0; j<n; j++){
                if(arr[i]==arr[j]){
                    count+=1;   //counting the no. of times each element occurs in array
                }
            }
            if(max<count){
                max=count;      
                arrmode=arr[i];    //getting the element which has the maximum frequency in the array
            }
        }
        return arrmode;
    }
    
}
```

### OUTPUT:
```
**********************************************************
                MEAN MEDIAN MODE CALCULATOR
**********************************************************

**********************INPUT WINDOW**********************
Enter the size of the array: 10
Enter the elements of the array: 
1
1
1
2
2
3
5
6
7
7

Array saved successfully as follows:
1 1 1 2 2 3 5 6 7 7

*********************OPERATIONS MENU*********************
1. Mean
2. Median
3. Mode

Enter your choice of operation: 1

**********************OUTPUT WINDOW**********************
The mean of the given array is: 3.0

Do you wish to perform another operation on the array (1/0)?: 1


*********************OPERATIONS MENU*********************
1. Mean
2. Median
3. Mode

Enter your choice of operation: 2

**********************OUTPUT WINDOW**********************
The median of the given array is: 3.0

Do you wish to perform another operation on the array (1/0)?: 1


*********************OPERATIONS MENU*********************
1. Mean
2. Median
3. Mode

Enter your choice of operation: 3

**********************OUTPUT WINDOW**********************
The mode of the given array is: 1

Do you wish to perform another operation on the array (1/0)?: 0

*************THANKYOU FOR USING THE PROGRAM*************
```
