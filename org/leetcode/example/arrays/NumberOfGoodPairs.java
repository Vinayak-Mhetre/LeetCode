/*
            1512. Number of Good Pairs

Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.

Example 1:
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

Example 2:
Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.

Example 3:
Input: nums = [1,2,3]
Output: 0
*/

package leetcode.example.arrays;

public class NumberOfGoodPairs {

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        NumberOfGoodPairs numberOfGoodPairs = new NumberOfGoodPairs();
        System.out.println("Ans (BruteForce) : "+ numberOfGoodPairs.numIdenticalPairs(arr));
        System.out.println("Ans (Optimal) : "+ numberOfGoodPairs.numIdenticalPairsOptimal(arr));
    }

    // Logic Method  [Brute Force --> O(n^2)]
    public int numIdenticalPairs(int[] nums) {
        int goodPairs=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    goodPairs++;
                }
            }
        }
        return goodPairs;
    }

    // Logic Method  [Optimal --> O(n)]
    public int numIdenticalPairsOptimal(int[] A) {
        int ans = 0;
        int[] cnt = new int[101];
        for (int a: A) {
            ans += cnt[a]++;
        }
        return ans;
    }

}
