package com.akhila.stack;

import java.util.Stack;

/**
 * Improved Two Stacks
 */
public class GetMinStack_Approach3 {
    Stack<Integer> stack;
    Stack<int[]> minStack;

    /** initialize your data structure here. */
    public GetMinStack_Approach3() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {

        // We always put the number onto the main stack.
        stack.push(val);
        // If the min stack is empty, or this number is smaller than
        // the top of the min stack, put it on with a count of 1.
        if(minStack.isEmpty() || val <= minStack.peek()[0]) {
            minStack.push(new int[]{val,1});
        }
        // Else if this number is equal to what's currently at the top
        // of the min stack, then increment the count at the top by 1.
        else if(val == minStack.peek()[0])
        {
            minStack.peek()[1]++;
        }
    }

    public void pop() {
        // If the top of min stack is the same as the top of stack
        // then we need to decrement the count at the top by 1.
        if(stack.peek().equals(minStack.peek()[0])) {
            minStack.pop()[1]--;
        }
        // If the count at the top of min stack is now 0, then remove
        // that value as we're done with it.
        if(minStack.peek()[1] == 0){
            minStack.pop();
        }
        // And like before, pop the top of the main stack.
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek()[0];
    }
}
