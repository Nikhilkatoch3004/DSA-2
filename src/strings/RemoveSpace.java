package strings;

import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        String nstr = " ";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;
            }
            nstr = nstr + str.charAt(i);
        }

        System.out.println("String after Removing Spaces is : " + nstr);
    }
}
