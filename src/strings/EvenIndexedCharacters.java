package strings;

import java.util.Scanner;

public class EvenIndexedCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0)
                System.out.print(str.charAt(i) + "--");
        }
    }
}
