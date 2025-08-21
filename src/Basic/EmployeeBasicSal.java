package Basic;
// employee salaray program
// total sal = bsal + hra + da
//hra = (0.93F * bsal)
//da= ( 0.64F * bsal)
// bsal >= 120000


import java.util.Scanner;

class Employee{
    float calculate(int bsal){
        float tot=bsal+((0.93F*bsal)+(0.63F*bsal));
        return tot;
    }
}
class EmployeeBasicSal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bsal=sc.nextInt();
        if(bsal>=12000){
            Employee e=new Employee();
            System.out.println(e.calculate(bsal));

        }

    }
}
