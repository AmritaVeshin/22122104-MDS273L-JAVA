# 22122104-MDS273L-JAVA
### Name: Amrita Veshin
### Register Number: 22122104
### Email: amrita.veshin@msds.christuniversity.in
### Class: 2MScDS-B
## Lab-01:

Write a Java Program that will collect your basic details that fall into different data types and displays them.
After the details have been displayed, with the help of conditional statements, check if the gender of the user is 'm' or 'f'. It should print "MALE" for 'm' and "FEMALE" for 'f'.
Assume that you can divide the states among India into four different regions (North, South, East, and West). If you are from the southern part of India; with the help of a switch statement, it should display The Student is from the southern states of India", along with the basic details.

## FLOWCHART:
![Lab01_Flowchart](https://github.com/AmritaVeshin/22122104-MDS273L-JAVA/assets/118504567/149bc926-b73d-400a-81fa-9720bce14c9e)


## CODE:
```
import java.util.Scanner;
import java.util.*;

public class Lab01{
    public static void main(String[] args) {
    /*
     Write a Java Program that will collect your basic details that fall into different data types
     and displays them. After the details have been displayed, with the help of conditional statements,
     check if the gender of the user is 'm' or 'f'. It should print "MALE" for 'm' and "FEMALE" for 'f'.
     Assume that you can divide the states among India into four different regions (North, South, East,
     and West). If you are from the southern part of India; with the help of a switch statement, it 
     should display The Student is from the southern states of India", along with the basic details.
     */
    int regno, age, region;
    String name, univclass, state;
    char gender;
    float UG_CGPA;
    Scanner sc=new Scanner(System.in);
    System.out.println("\n                WELCOME TO JAVA LAB-01 PROGRAM                ");
    System.out.println("__________________________________________________________________");
    System.out.println("\n                 Christ University Pune Lavasa               ");
    System.out.println("\n---------------------Student Details------------------------");
    System.out.println("\nInput Section-----------------------------------------------");
    System.out.println("\nEnter your details below: ");
    System.out.print("\nName: ");
    name=sc.nextLine();
    System.out.print("Register Number: ");
    regno=sc.nextInt();
    sc.nextLine();
    System.out.print("Class: ");
    univclass=sc.nextLine();
    System.out.print("Age: ");
    age=sc.nextInt();
    sc.nextLine();
    System.out.print("Gender (m/f): ");
    gender=sc.nextLine().charAt(0);
    System.out.print("State: ");
    state=sc.nextLine();
    System.out.print("UG CGPA: ");
    UG_CGPA=sc.nextFloat();
    System.out.println("\nOutput Section-----------------------------------------------");
    System.out.print("\nName: "+name);
    System.out.print("\nRegister Number: "+regno);
    System.out.print("\nClass: "+univclass);
    System.out.print("\nAge: "+age);
    if(gender=='m'){
        System.out.print("\nGender: MALE");
    }else if(gender=='f'){
        System.out.print("\nGender: FEMALE");
    }else{
        System.out.print("\nInvalid Entry");
    }
    
    System.out.print("\nState: "+state);
    
    if(state=="Jammu n Kashmir" | state=="Himachal Pradesh" | state=="Punjab" | state=="Uttarakhand" | state=="UP" | state=="Harayana" | state=="Delhi" | state=="Bihar" | state=="Jharkhand" | state=="Madhya Pradesh"){
        region=1;
    }else if(state=="Rajasthan" | state=="Gujarat"){
        region=2;
    }else if(state=="Arunachal Pradesh" | state=="Assam"| state=="Mizoram" | state=="Tripura" | state=="Meghalaya" | state=="Sikkim" | state=="West Bengal" | state=="Nagaland" | state=="Manipur"){
        region=3;
    }else{
        region=4;
    }
    
    switch (region) {
        case 1:
        System.out.print("\nRegion: North\nThe student is from the northern states of India.");
            break;
        case 2:
        System.out.print("\nRegion: West\nThe student is from the western states of India.");
            break;
        case 3:
        System.out.print("\nRegion: East\nThe student is from the eastern states of India.");
            break;
        case 4:
        System.out.print("\nRegion: South\nThe student is from the southern states of India.");
            break;
        default:
        System.out.print("\nInvalid State Entry");
            break;
    }
    
    System.out.print("\nUG CGPA: "+UG_CGPA+"\n");
    System.out.println("\n************THANKYOU FOR USING THE PROGRAM**************");
          
    }
}

```
## OUTPUT:
```
WELCOME TO JAVA LAB-01 PROGRAM                
__________________________________________________________________

                 Christ University Pune Lavasa               

---------------------Student Details------------------------

Input Section-----------------------------------------------

Enter your details below: 

Name: John Smith
Register Number: 1234
Class: First Year
Age: 18
Gender (m/f): m
State: Uttar Pradesh
UG CGPA: 8.5

Output Section-----------------------------------------------

Name: John Smith
Register Number: 1234
Class: First Year
Age: 18
Gender: MALE
State: Uttar Pradesh
Region: North
The student is from the northern states of India.
UG CGPA: 8.5

************THANKYOU FOR USING THE PROGRAM**************

```

