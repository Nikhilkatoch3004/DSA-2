package basicPrograms;

public class PallindromeNumber2 {

    public static boolean isPalli(int n) {
        int m = n;
        if (m < 10 && n >= 0) return true;

        if (m < 0) return false;
        int newNum = 0;
        while (m > 0) {
            int var = m % 10;
            newNum = newNum * 10 + var;
            m = m / 10;
        }
        if (newNum == n) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Number is Pallindrome :" + PallindromeNumber2.isPalli(1211));
    }
}
