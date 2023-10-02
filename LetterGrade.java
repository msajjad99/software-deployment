//Author:Mustafa
import java.util.Scanner;

public class LetterGrade{
    public static void main(String[] args){
        String letterGrade;
        System.out.println("Author: Mustafa");
        System.out.println("Please enter your test grade : ");
        Scanner scan = new Scanner(System.in);
        int grade = scan.nextInt();

        if (grade >= 97){
            letterGrade = "A+";
        } else if (grade >=92){
            letterGrade = "A";
        } else if (grade>=90){
            letterGrade = "A-";
        } else if (grade>=87){
            letterGrade = "B+";
        } else if (grade>=82){
            letterGrade = "B";
        } else if (grade>=80){
            letterGrade = "B-";
        } else if (grade>=77){
            letterGrade = "C+";
        } else if (grade>=72){
            letterGrade = "C";
        } else if (grade>=70){
            letterGrade = "C-";
        } else if (grade>=67){
            letterGrade = "D+";
        } else if (grade>=62){
            letterGrade = "D";
        } else if (grade>=60){
            letterGrade = "D-";
        } else letterGrade = "F";

        System.out.println("Your Grade is : " + letterGrade);

    }
}