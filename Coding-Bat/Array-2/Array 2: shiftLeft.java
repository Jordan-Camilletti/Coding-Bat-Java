/*Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. */

public int[] shiftLeft(int[] nums) {
  if(nums.length==0) return(nums);
  int[] newArr=new int[nums.length];
  for(int x=1;x<nums.length;x++){
    newArr[x-1]=nums[x];
  }
  newArr[nums.length-1]=nums[0];
  return(newArr);
}
