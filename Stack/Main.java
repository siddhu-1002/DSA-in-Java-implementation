package com.Stacks;

public class Main {
    public static void main(String args[]){
        Stack st = new Stack();

        for(int i = 10; i >= 0; i--)
            st.push(i);


        // Removing the element from the stack
        st.pop();
        st.pop();
        st.pop();

        // Get the top element
        st.peek();

        // Check if element is present in the stack
        st.contains(4);

        // Check the size of the stack
        st.size();

        // Check the center element of the stack
        st.center();

        // Sort the stack
        st.sortStack();

        // Reverse the stack
        st.reverseStack();

        // Iterate over the stack
        st.iterate();

        // Printing the stack
        st.printStack();

    }
}
