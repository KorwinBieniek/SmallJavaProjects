import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(checkBorderValue(x));
    }

    private static String checkBorderValue(int num) {
        if (num > -15 && num <= 12) return "True";
        else if (num > 14 && num < 17) return "True";
        else if (num >= 19) return "True";
        else return "False";
    }
}