// importing all the features in program like Scanner
import java.util.*;
class Student{
    private String name;
    private int marks;
    private String grades;
    Scanner scan = new Scanner(System.in);

    // method or function which returns the grade of student
    public String printResult(){
        System.out.println("Enter your name: ");
        name = scan.nextLine();
        System.out.println("Enter the total marks you have obtained in JAVA: ");
        marks = scan.nextInt();

        // printing the grades obtained on the basis of marks

        if(marks >= 90 && marks < 100){
            grades = "A+";
            System.out.println("\nPerfect!! Your hard work have payed off.👏");
        }
        else if (marks >= 80 && marks < 90){
            grades ="A";
            System.out.println("Nice, A little hardwork and will be perfect.🎉");
        }
        else if(marks >= 70 && marks < 80){
            grades = "B+";
            System.out.println("Good job, but need more hardwork. Stay dedicated and you will be perfect.");
        }
        else if(marks >= 60 && marks < 70){
            grades ="B";
            System.out.println("Good but need more hard work.");
        }
        else if(marks >= 50 && marks < 60){
            grades = "C+";
            System.out.println("You have satisfactory marks.");
        }
        else if(marks >= 40 && marks < 50){
            grades ="C";
            System.out.println("You are passed but need more hardwork🥹.");
        }
        else if(marks < 40 && marks >= 0){
            System.out.println("Sorry you are failed. You need to study hard.");
        }
        else{
            System.out.println("Please enter valid marks you have obtained.");
        }

        return "Name: " + name + "\nTotal Marks Obtained: "+ marks +"\nGrade: "+ grades;
    }
} 
public class Inheritance {
    public static void main(String[] args) {
        Student inr = new Student();
        System.out.println(inr.printResult());
    }  
}
