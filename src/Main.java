public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1\n");

        for (int a = 1904; a <= 2096; a = a + 4) {
            System.out.println(a + " is a leap year");
        }

        System.out.println("\nTask 2\n");

        for (int b = 7; b <= 98; b = b + 7) {
            System.out.println(b);
        }

        System.out.println("\nTask 3\n");

        for (int c = 1; c <= 512; c = c * 2) {
            System.out.println(c);
        }
    }
}