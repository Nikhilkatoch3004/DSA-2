package strings;

import java.util.Scanner;

public class Vovels_Consonents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int vovel = 0;
        int conso = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vovel++;
            } else if (str.charAt(i) == ' ') {
                continue;
            } else {
                conso++;
            }
        }

        System.out.println("Total Vovels are : " + vovel + " , Total Consonents are : " + conso);
    }
}
