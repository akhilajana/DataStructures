package com.akhila.stack;

import java.util.ArrayList;
import java.util.List;

public class MyStack implements IMyStack {
    private final List<Integer> data;

    public MyStack() {
        this.data = new ArrayList<>();
    }

    /**
     * Insert an element into the stack
     * @param n
     */
    public void push(int n) {
        data.add(n);
    }

    /**
     * Remove last element from the stack
     * @return
     */
    public boolean pop () {
        if(isEmpty()){
            return false;
        }
        data.remove(data.size()-1);
        return true;
    }

    /**
     * Checks if the stack is empty or not
     * @return
     */
    public boolean isEmpty() {
        return data.isEmpty();
    }

    /**
     * Returns last element inserted into stack
     * @return
     */
    public Integer top() {
       return data.get(data.size()-1);
    }
}
