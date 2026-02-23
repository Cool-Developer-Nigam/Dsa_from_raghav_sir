package Stack.video3;

import java.util.ArrayList;
import java.util.Stack;

public class Next_Greater_element {
        public ArrayList<Integer> nextLargerElement(int[] arr) {
            int n = arr.length;
            int[] nge = new int[n];

            // The last element will always have -1 as its next larger element
            nge[n-1] = -1;

            Stack<Integer> st = new Stack<>();
            st.push(arr[n-1]);

            // Traverse the array from right to left
            for(int i = n-2; i >= 0; i--){
                // Pop elements from the stack that are smaller than or equal to the current element
                while(st.size() > 0 && arr[i] >= st.peek()) {
                    st.pop();
                }

                // If stack is empty, no larger element exists to the right
                if(st.size() == 0) {
                    nge[i] = -1;
                } else {
                    nge[i] = st.peek();
                }

                // Push the current element onto the stack for the next iterations
                st.push(arr[i]);
            }

            // Convert the array to ArrayList as required by the return type
            ArrayList<Integer> ans = new ArrayList<>();
            for(int i = 0; i < n; i++){
                ans.add(nge[i]);
            }

            return ans;
        }
    }


