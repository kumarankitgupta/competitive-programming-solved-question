public class ReverseStack {
     int[] stack = new int[100];
     int top = -1 ;
    void push(int data){
        top++;
        stack[top] = data ;
    }
    void pop(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return;
        }
        top--;
    }
    void show(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return;
        }
        for (int i = top; i > -1 ; i--) {
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
    void reverse(){
        int[] rev = new int[top+1];
        for (int i = 0; i < rev.length; i++) {
            rev[i] = stack[i];
        }
        for (int i = rev.length-1; i >=0 ; i--) {
            stack[top-i] = rev[i];
        }
    }
    public static void main(String[] args) {
        ReverseStack st = new ReverseStack();
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        st.push(16);
        st.push(17);
        st.show();
        st.reverse();
        st.show();
        st.pop();
        st.show();
        
    }
}
