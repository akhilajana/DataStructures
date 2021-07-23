package com.akhila;

import com.akhila.stack.IMyStack;
import com.akhila.stack.MyStack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        testStackImplementation();
        testInBuiltStack();
    }

    private static void testInBuiltStack() {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        if(s.empty()) {
            System.out.println("Stack is empty");
            return;
        }
        s.pop();

        System.out.println("Top most element is : "+s.peek());
        System.out.println("The size of stack is : "+s.size());
    }

    private static void testStackImplementation() {
        IMyStack s = new MyStack();
        s.push(1);
        s.push(2);
        s.push(3);
        for (int i = 0; i<4;i++) {
            if(!s.isEmpty()) {
                System.out.println("Stack is not empty "+s.top());
            }
            System.out.println("Pop topmost element "+s.pop());
        }

    }
}
