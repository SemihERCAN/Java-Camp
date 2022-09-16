public class Main {
    public static void main(String[] args) {

        double[] myList = {1.5, 25.3, 8.6, 5.9};
        double total = 0;
        double enBuyuk = myList[0];

        for (double number : myList) {
            if (enBuyuk < number) {
                enBuyuk = number;
            }
            System.out.println(number);
            total = total + number;
        }
        System.out.println("Toplam :" + total);
        System.out.println("En Büyük Sayı :" + enBuyuk);

    }
}