// import java.util.HashSet;
// import java.util.Set;
class Solution {
    public int longestConsecutive(int[] nums) {
        int longestLength=0;
        Set<Integer> s=new HashSet<>();

        for (int num : nums) {
             s.add(num);
        }
         for (int num : s) {
            if(!s.contains(num-1)){
           
            int currentLength=1;
            int nextElement=num+1;
            while(s.contains(nextElement)){
                    currentLength++;
                    nextElement++;
            }
            longestLength=Math.max(longestLength,currentLength);
        }
        }
        return longestLength;
    }

}