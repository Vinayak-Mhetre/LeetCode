/*

            1678. Goal Parser Interpretation

You own a Goal Parser that can interpret a string command.
The command consists of an alphabet of "G", "()" and/or "(al)" in some order.
The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al".
The interpreted strings are then concatenated in the original order.
Given the string command, return the Goal Parser's interpretation of command.

Example 1:
Input: command = "G()(al)"
Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".

Example 2:
Input: command = "G()()()()(al)"
Output: "Gooooal"

Example 3:
Input: command = "(al)G(al)()()G"
Output: "alGalooG"
*/


package leetcode.example.string;

public class GoalParserInterpretation {

    public static void main(String[] args) {
        String s = "G()()()()(al)";
        GoalParserInterpretation goalParserInterpretation= new GoalParserInterpretation();
        String result= goalParserInterpretation.interpret(s);
        System.out.println("Ans : "+ result);
    }

    // Logic Method
    public String interpret(String command) {
        String ans="";
        for(int i =0; i<command.length();i++){
            if(command.charAt(i)=='G'){
                ans=ans+"G";
            }else if(command.charAt(i)=='('){
                if(command.charAt(i+1)==')'){
                    ans=ans+"o";
                }else{
                    ans=ans+"al";
                }
            }

        }
        return ans;
    }
}
