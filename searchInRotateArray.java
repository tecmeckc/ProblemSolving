public class searchInRotateArray {
  public static int findOut(int[] arr, int target) {
    int low = 0, high = arr.length - 1;
    while (low <= high) {
      int mid = high - (high - low) / 2;
      if (arr[mid] == target)
        return mid;
      // finding the sorted array(On which side the sorted array will be)
      // checking if the left side is sorted
      if (arr[low] <= arr[mid]) {
        if (arr[low] <= target && target <= arr[mid]) {
          high = mid - 1;
        } else {
          low = mid + 1;
        }
      }
      // if the right side is sorted,compare the target with element of mid and high
      // index
      else {
        if (arr[mid] <= target && target <= arr[high]) {
          low = mid + 1;
        } else {
          high = mid - 1;
        }
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
    System.out.println(findOut(nums, 0));
  }
}