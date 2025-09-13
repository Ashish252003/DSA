import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int currentAsteroid : asteroids) {
            if (currentAsteroid > 0) {
                st.push(currentAsteroid);
            } else {
                while (!st.empty() && st.peek() > 0 && st.peek() < Math.abs(currentAsteroid)) {
                    st.pop();
                }

                if (st.empty() || st.peek() < 0) {
                    st.push(currentAsteroid);
                } else if (st.peek() == Math.abs(currentAsteroid)) {
                    st.pop();
                }
            }
        }

        int[] result = new int[st.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = st.pop();
        }

        return result;
    }
}