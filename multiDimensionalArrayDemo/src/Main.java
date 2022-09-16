public class Main {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];
        //Şehirleri farklı bölgelerden seçiyoruz.
        sehirler[0][0] = "Balıkesir";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Edirne";
        sehirler[1][0] = "İzmir";
        sehirler[1][1] = "Aydın";
        sehirler[1][2] = "Muğla";
        sehirler[2][0] = "Van";
        sehirler[2][1] = "Ağrı";
        sehirler[2][2] = "Urfa";
        int j;
        for (int i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.println(sehirler[i][j]);
            }
            // Her bölgeyi "----" ile ayırıyoruz.
            if (i < 2) {
                System.out.println("-----------");
            }
        }
    }
}