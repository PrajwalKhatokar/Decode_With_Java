package InfosysLeetcode;


// dont think of the error direcly i pasted the code of the leetcode so main ila so error dont worry

import java.util.Stack;

public class ValidParenthesis {

       public static void main(String[] args) {

       }


    //...................................................................
           public boolean isValid(String s) {
            // lets create a Stack object to store ok
            Stack<Character> stack=new Stack<>();

            //lets traverse once,and lets take that into another variabale

            for(char ch:s.toCharArray()){
                //for the opening brackets now
                if(ch=='(' || ch=='{'|| ch=='['){
                    //push madu inside the stack
                    stack.push(ch);
                }
                //now for closing brackets if closing one banthu then it 1st check for the whether it
                //is empty or not
                else{
                    if(stack.isEmpty()){
                        return false;
                    }

                    //for matching pop the open bracket and check

                    char top = stack.pop();
                    //condtion for mismatch now
                    // ch has current element ie coming after ( which means next erodh )
                    //top ? stack nali we pop (  therfore top has now (
                    // true and false = false indirectly i know my brackets match
                    //if i get true then mismatch anta
                    if((ch==')' && top != '(') ||
                            (ch=='}' && top != '{') ||
                            (ch==']' && top != '[') )

                        return false;  //mismatch adre it return false and munde ogala it wil stop ok na...
                    // match hagiruthe but silent eruthe ok na,it wil go the last one
                    // ie last nali stack should be empty


                }
            }

            return stack.isEmpty();
        }
    }

