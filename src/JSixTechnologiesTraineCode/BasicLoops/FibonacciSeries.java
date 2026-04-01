package JSixTechnologiesTraineCode.BasicLoops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        //fibonaci series

//        0 1 1 2 3 5 8
        int a=0;
        int b=1;

        if(n>=1){  // ie when n=0 print 0 if n=2 both the if wil work not one rememeber
            // then 0 and 1 wil be printed
            System.out.print(a+" ");
        }

        if(n>=2){
            System.out.print(b+" ");
        }
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");

            a = b;
            b = c;
        }
    }
}

//Enter a Number
//8
//        0 1 1 2 3 5 8 13


/**

Why if(n >= 1) ?

"If user asks at least 1 number, print first number (0)"

Why if(n >= 2) ?

"If user asks at least 2 numbers, print second number (1)"
✅ Example:
n = 1 → condition false ❌ → don’t print 1
n = 2 → condition true ✅ → print 1


🔥 Now combine both (IMPORTANT)
▶️ Case 1: n = 1
n >= 1 → ✅ → print 0
n >= 2 → ❌ → don’t print 1
👉 Output: 0

▶️ Case 2: n = 2
n >= 1 → ✅ → print 0
n >= 2 → ✅ → print 1
👉 Output:1

▶️ Case 2: n = 2
n >= 1 → ✅ → print 0
n >= 2 → ✅ → print 1
👉 Output 0 1


▶️ Case 3: n = 5
n >= 1 → print 0
n >= 2 → print 1
loop runs from 3 to 5
Loop:
i=3 → 1
i=4 → 2
i=5 → 3
👉 Output:

0 1 1 2 3

🔹 Why NOT use only loop?
Because:
First two numbers (0 and 1) are fixed
Loop starts from 3rd number onwards



**/