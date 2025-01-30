package conditionals;

import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the marks");
        int marks = sc.nextInt();


        if (marks >= 81) {
            System.out.println("very good");
        } else if (marks >= 61) {
            System.out.println("good");
        } else if (marks >= 41) {
            System.out.println("Average");
        } else {
            System.out.println("fail");
        }
    }
    }
