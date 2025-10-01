/*

           1108. Defanging an IP Address

Given a valid (IPv4) IP address, return a defanged version of that IP address.
A defanged IP address replaces every period "." with "[.]".


Example 1:
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

Example 2:
Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
*/


package leetcode.example.string;

public class DefangingAnIPAddress {

    public static void main(String[] args) {
        String s = "1.1.1.1";
        DefangingAnIPAddress scoreOfAString = new DefangingAnIPAddress();
        String ans= scoreOfAString.defangIPaddress(s);
        System.out.println("Ans : "+ ans);
    }

    // Logic Method
    public String defangIPaddress(String address) {

        return address.replaceAll("\\.", "[.]");
    }

}
