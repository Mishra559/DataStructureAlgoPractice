import java.util.Scanner;

public class Toggling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            char c  = s.charAt(i);
            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            }
            else{
                sb.append(Character.toLowerCase(c));
            }
        }
        System.out.println(sb.toString());
    }
}
