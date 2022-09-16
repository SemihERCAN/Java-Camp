public class Main {
    public static void main(String[] args) {
        int number = 1;
        int total = 0;

        if (number < 0) {
            System.out.println("Geçersiz Sayı!");
            return;
        }
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }
        if (total == number) {
            System.out.println(number + " mükemmel sayıdır.");
        } else {
            System.out.println(number + " mükemmel sayı değildir.");
        }

    }
}