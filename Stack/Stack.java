package com.Stacks;

public class Stack {

    private StackNode stack;

    public Stack(){
        this.stack = null;
    }

    public void push(int ele){

        StackNode st = new StackNode();
        st.data = ele;
        st.next = this.stack;
        this.stack = st;

    }

    // Remove the last element
    public void pop(){
        this.stack = this.stack.next;
    }

    // View the top element
    public void peek(){
        System.out.println(this.stack.data);
    }

    public void contains(Integer ele){
        StackNode temp_ptr = this.stack;

        while (temp_ptr != null){

            if (temp_ptr.data == ele){
                System.out.println("True");
                return;
            }
            temp_ptr = temp_ptr.next;
        }
        System.out.println("False");
    }

    public int size(){
        StackNode temp_ptr = this.stack;
        int cnt = 0;
        while (temp_ptr != null){
            cnt++;
            temp_ptr = temp_ptr.next;
        }
        System.out.println(cnt);
        return cnt;
    }

    // Using two pointer approach
    public void center(){
        StackNode slow = this.stack;
        StackNode fast = this.stack;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    public void sortStack()
    {
        StackNode cur = this.stack;

        int size = size();
        int arr[]=new int[size];
        int k=0;

        while(cur!=null){
            arr[k++]=(int)cur.data;
            cur=cur.next;
        }
        for(int i=0;i<size-1;i++) {
            for(int j=0;j<size-i-1;j++) {
                if(arr[i]<arr[j]) {
                    int tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        cur=this.stack;
        k=0;
        while(cur!=null) {
            cur.data=arr[k++];
            cur=cur.next;
        }
    }

    public void reverseStack()
    {
        StackNode prev = null, cur = null, tmp = null;
        cur = this.stack;
        while(cur.next != null)
        {
            tmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmp;
        }
        cur.next = prev;
        this.stack = cur;
    }

    public void iterate(){

        StackNode temp_ptr = this.stack;
        while (temp_ptr != null){
            System.out.println(temp_ptr.data);
            temp_ptr = temp_ptr.next;
        }
    }


    public void printStack(){
        StackNode temp_ptr = this.stack;

        while (temp_ptr != null) {
            System.out.print(temp_ptr.data + "->");
            temp_ptr = temp_ptr.next;
        }
    }
}
