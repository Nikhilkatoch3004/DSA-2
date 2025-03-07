package strings;

import java.util.Arrays;
import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        int count = 0;
        String[] nstr = str.split(" ");
        for (int i = 0; i < nstr.length; i++) {
            if (!nstr[i].isEmpty()) {
                count++;
            }
        }
        System.out.println("Number of words in String are : " + count);
        System.out.println(Arrays.toString(nstr));
    }
}
