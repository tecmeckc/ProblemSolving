public class removeDuplicates {
  public int removeDuplicatesOfArray(int[] nums) {
    // We have to return the number of unique elements
    int i = 0;
    int j = i + 1;
    if (nums.length == 0)
      return 0;
    if (nums.length == 1)
      return 1;
    while (j < nums.length && i < nums.length) {
      // if the adjacent elements are equal we will move j to the right and then
      // compare with element at ith index
      if (nums[i] == nums[j]) {
        j++;
      }
      // if they are not equal shift the i to the right and then replace the non
      // duplicate element on ith position
      else {
        i++;
        nums[i] = nums[j];
      }
    }
    // since the number of elements in an array is 1 more than the upperbound of the
    // array ,here i is the index and we are returning the number of elements that
    // are unique
    return i + 1;
  }

  public static void main(String[] args) {

  }

}
