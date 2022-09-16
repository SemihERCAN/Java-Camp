public class Main {
    public static void main(String[] args) {

        int number = 59;
        boolean isPrime = false;
        int i;

        if (number == 1) {
            System.out.println(number + " asal sayı değildir.");
            return;
        }
        if (number < 1) {
            System.out.println("Geçersiz sayı girdiniz.");
            return;
        }

        for (i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = true;
                break;
            }
        }
        if (isPrime == true) {
            System.out.println(number + " sayısı asal sayı değildir.");
        } else {
            System.out.println(number + " sayısı asal sayıdır.");
        }


    }
}