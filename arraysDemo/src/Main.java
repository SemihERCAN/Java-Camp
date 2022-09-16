public class Main {
    public static void main(String[] args) {
        String[] ogrenciler = new String[3];
        ogrenciler[0]="Hakkı";
        ogrenciler[1]="Rıfkı";
        ogrenciler[2]="Semih";

        for(int i=0;i< ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("---------------");
        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

    }
}