public class isAnagram {
  public static boolean checkAnagram(String s, String t) {
    int[] s1 = new int[26];
    int[] t1 = new int[26];
    for (int i = 0; i < 26; i++) {
      s1[i] = 0;
    }
    for (int i = 0; i < 26; i++) {
      t1[i] = 0;
    }
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      int idx = c - 'a';
      s1[idx]++;
    }
    for (int i = 0; i < t.length(); i++) {
      char c = t.charAt(i);
      int idx = c - 'a';
      t1[idx]++;
    }
    for (int i = 0; i < 26; i++) {
      if (s1[i] != t1[i]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String str = "anagram";
    String str1 = "nagaram";
    System.out.println(checkAnagram(str, str1));
  }
}
