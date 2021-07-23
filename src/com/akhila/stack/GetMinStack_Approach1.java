package com.akhila.stack;

import java.util.Stack;

/**
 * This program returns minimum value in stack using
 * Stack of Value/ Minimum Pairs
 */
public class GetMinStack_Approach1 {
    Stack<int[]> stack = new Stack();

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(new int[]{val, val});
            return;
        }
        int currentMin = stack.peek()[1];
        stack.push(new int[]{val, Math.min(val, currentMin)});
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek()[0];
    }

    public int getMin() {
        return stack.peek()[1];
    }
}
