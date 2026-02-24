int removeElement(int* nums, int numsSize, int val) {
    int index;
    for(int i=0;i<numsSize;i++){
        if(nums[i]!=val){
            nums[index]=nums[i];
            index++;
        }

    }
    return index;
}