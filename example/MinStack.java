package example;

import java.util.Stack;

/*Ссылка на задачу https://leetcode.com/problems/min-stack/ */

public class MinStack {
        Stack<int[]> st;
    
        public MinStack() {
            st = new Stack<>();
        }
        
        public void push(int val) {
            if (st.isEmpty()) {
                st.push(new int[] {val, val});
            } else {
                int min = val < st.peek()[1] ? val : st.peek()[1];
                st.push(new int[]{val, min});
            }
        }
        
        public int[] pop() { //для литкода нужно изменить на void
            return st.pop();
        }
    
        public int top() {
            return st.peek()[0];
        }
        
        public int getMin() {
            return st.peek()[1];
        }
    }
