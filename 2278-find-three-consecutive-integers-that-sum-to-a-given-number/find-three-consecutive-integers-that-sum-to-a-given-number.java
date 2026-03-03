class Solution {
    public long[] sumOfThree(long num) {
        long middle;
       if(num%3!=0){
        return new long[0];
       }
       middle=num/3;
       return new long[]{middle-1,middle,middle+1};
    }
}