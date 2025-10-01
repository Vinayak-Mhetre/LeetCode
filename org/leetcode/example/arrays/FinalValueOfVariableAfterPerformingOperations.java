/*

            2011. Final Value of Variable After Performing Operations

There is a programming language with only four operations and one variable X:
++X and X++ increments the value of the variable X by 1.
--X and X-- decrements the value of the variable X by 1.
Initially, the value of X is 0.

Given an array of strings operations containing a list of operations, return the final value of X
after performing all the operations.



Example 1:

Input: operations = ["--X","X++","X++"]
Output: 1
Explanation: The operations are performed as follows:
Initially, X = 0.
--X: X is decremented by 1, X =  0 - 1 = -1.
X++: X is incremented by 1, X = -1 + 1 =  0.
X++: X is incremented by 1, X =  0 + 1 =  1.

Example 2:

Input: operations = ["++X","++X","X++"]
Output: 3
Explanation: The operations are performed as follows:
Initially, X = 0.
++X: X is incremented by 1, X = 0 + 1 = 1.
++X: X is incremented by 1, X = 1 + 1 = 2.
X++: X is incremented by 1, X = 2 + 1 = 3.

*/



package leetcode.example.arrays;


public class FinalValueOfVariableAfterPerformingOperations {

    public static void main(String[] args) {

        String[] words = {"--X","X--","++X","X++","X++"};
        FinalValueOfVariableAfterPerformingOperations findWordsContainingCharacter = new FinalValueOfVariableAfterPerformingOperations();
        System.out.println("Answer : " + findWordsContainingCharacter.finalValueAfterOperations(words));
    }

    // Logic Method
    public int finalValueAfterOperations(String[] operations) {
        int count =0;
        for(String s : operations){
            if(s.equals("--X") || s.equals("X--")){
                count--;
            }else{
                count++;
            }
        }
        return count;
    }

}
