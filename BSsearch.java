public class BSsearch {
  static boolean check(int speed, int dist, int time) {
    return (speed * time >= dist);
  }

  static int reachCollege(int dist, int high, int time) {
    int low = 0;
    int ans = -1;
    while (low <= high) {
      int mid = high - (high - low) / 2;
      if (check(mid, dist, time)) {
        ans = mid;
        high = mid - 1;

      } else {
        low = mid + 1;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int distance = 100;
    int maxSpeed = 200;
    int time = 2;
    System.out.println(reachCollege(distance, maxSpeed, time));

  }
}
