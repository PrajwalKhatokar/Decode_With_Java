package InfosysLeetcode;
import java.util.Stack;


//     ................................................................................
    //creating the object creation for the Stack ok na
    //i can create here only but only im giving reference here ok
    // because in the constructor i wil create in future design it wil be easily change
    //lets start ,here we give only the reference it will be empty ok

    // here we use two stack because if i need minstack i need to traverse i wil be 0(n)
    // so we use two Stack simple ok.cool

    // [ -2 ,0 ,3] let take this example ok

    public class MinStack {
        public static void main(String[] args) {

        }

    Stack<Integer> mainstack;  // it stores all the element ok
    Stack<Integer> minstack;  // it stores only minimum element ok

    public MinStack() {

        mainstack = new Stack<>();
        minstack =  new  Stack<>();

    }

    public void push(int val) {
        mainstack.push(val); //push all element ok
        // if minstack is empty at starting then push and also if current val <= minstack element
        //  then push that element only if minstack ele is <= minstack(ele edhare top element <= erbeku so we use peeK())

        if(minstack.isEmpty() || val <= minstack.peek()){
            minstack.push(val);//now if cond satify then push ok
        }
    }

    public void pop(){

        // now we have to pop ok
        int remove=mainstack.pop(); // inserted -2,0,-3 and now removed -3 ok

        if(remove==minstack.peek()){  //-3==-3 then remove -3 now minstack has -2 ok
            minstack.pop();
        }

    }

    public int top() {

        return mainstack.peek();    // mainstack top wat is there

    }

    public int getMin() {

        return minstack.peek();  //minstack top wat is there

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
