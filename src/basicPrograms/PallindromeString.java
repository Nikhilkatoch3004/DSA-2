package basicPrograms;

public class PallindromeString {

    public static boolean isPalli(String str) {
        int n = str.length();
        str = str.toLowerCase();
        int j = n - 1;
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) == str.charAt(j)) {
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("THe String is Pallindrome : " + PallindromeString.isPalli("nikhil"));
    }
}
