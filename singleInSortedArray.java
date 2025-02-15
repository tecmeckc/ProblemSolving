public class singleInSortedArray {
  public static int single(int[] nums) {
    int n = nums.length;
    int low = 0, high = n - 1;
    if (n == 1)
      return nums[0];
    while (low <= high) {
      int mid = high - (high - low) / 2;
      if (mid == 0 && nums[0] != nums[1])
        return nums[mid];
      if (mid == n - 1 && nums[n - 1] != nums[n - 2])
        return nums[mid];
      if (nums[mid - 1] != nums[mid] && nums[mid] != nums[mid + 1])
        return nums[mid];
      // if mid is even
      if (mid % 2 == 0) {
        if (nums[mid - 1] == nums[mid])
          high = mid - 1;
        else
          low = mid + 1;
      } else {
        if (nums[mid - 1] == nums[mid])
          low = mid + 1;
        else
          high = mid - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] A = { 3, 3, 7, 7, 10, 11, 11 };
    System.out.println(single(A));
  }
}
