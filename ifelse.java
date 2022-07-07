import java.util.*;
public class ifelse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = sc.nextInt();

        if(marks < 50){
            System.out.print("FAIL");
        }
        else if(marks >= 50 && marks < 60){
            System.out.print("Your Grade is D");
        }
        else if(marks >= 60 && marks < 70){
            System.out.print("Your Grade is C");
        }
        else if(marks >= 70 && marks < 80){
            System.out.print("Your Grade is B");
        }
        else if(marks >= 80 && marks < 90){
            System.out.print("Your Grade is A");
        }
        else if(marks >= 90 && marks <= 100){
            System.out.print("Your Grade is A+");
        }
        else{
            System.out.print("Invalid");
        }
    }
}