/*
 Final Value of Variable After Performing Operations
There is a programming language with only four operations and one variable X:
++X and X++ increments the value of the variable X by 1.
--X and X-- decrements the value of the variable X by 1.
Initially, the value of X is 0.
Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.
 
Example 1:

Input: operations = ["--X","X++","X++"]
Output: 1
Explanation: The operations are performed as follows:
Initially, X = 0.
--X: X is decremented by 1, X =  0 - 1 = -1.
X++: X is incremented by 1, X = -1 + 1 =  0.
X++: X is incremented by 1, X =  0 + 1 =  1.
 */

public class Problem06 {
    public static int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String op : operations) {
            if (op.equals("++X") || op.equals("X++")) {
                X++;
            } else if (op.equals("--X") || op.equals("X--")) {
                X--;
            }
        }
        return X;

    }

    public static void main(String[] args) {
        String[] operations = { "--X", "X++", "X++" };
        int result = finalValueAfterOperations(operations);
        System.out.println(result);

    }

}
