public class Main {
    public static void main(String[] args) {

        String mesaj2;
        String mesaj = "Bugün hava çok güzel";
        System.out.println(mesaj);

        System.out.println("eleman sayısı: " + mesaj.length());//mesaj değişkeninin uzunluğunu verir.
        System.out.println("5. eleman = " + mesaj.charAt(4));//mesaj değişkeninin 5. elemanını getirir.
        System.out.println(mesaj2 = mesaj.concat(". Yaşasın!"));//İki string ifadeyi birleştirir.
        System.out.println(mesaj2);
        //değişkenin hangi karakter ile başladığını sorgular ve boolean değer döndürür.
        System.out.println(mesaj.startsWith("B"));
        //değişkenin hangi karakter ile bittiğini sorgular ve boolean değer döndürür.
        System.out.println(mesaj.endsWith("l"));
        //getChars operasyonu ile değişken içindeki veya bir metindeki istediğimiz karakter öbeğini
        // bir diziye (karakterler) atamayabiliriz.
        char[] karakterler = new char[7];
        mesaj.getChars(0, 5, karakterler, 0);
                    //(başlangıç,  bitiş ,    dizi    ,  kaçıncı karaktere ata)
        System.out.println(karakterler);//öbeği atadığımız diziyi yazdırıyoruz.
        /*Belirli karakterin/karakterlerin mesaj içerisindeki BAŞTAN başlayıp baştan kaçıncı
         karakter/karakterler olduğunu bulmamızı sağlar:*/
        System.out.println(mesaj.indexOf("av"));
        /*Belirli karakterin/karakterlerin mesaj içerisindeki SONDAN başlayıp baştan kaçıncı
         karakter/karakterler olduğunu bulmamızı sağlar:*/
        System.out.println(mesaj.lastIndexOf("g"));
        //istediğimiz karakterleri değiştirmek için replace kullanırız:
        String yenimesaj =mesaj.replace(' ', '-');
        System.out.println(yenimesaj);
        //metnin içerisinden parça almak için substring metodunu kullanırız.
        System.out.println(mesaj.substring(2, 7));
        //split metodu metni belirli bir karakter kullanarak ayırmaya yarar.
        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }
        //metnin tüm karakterlerini küçük harf ile yazmak:
        System.out.println(mesaj.toLowerCase());
        //metnin tüm karakterlerini BÜYÜK harf ile yazmak:
        System.out.println(mesaj.toUpperCase());
        //Metnin başındaki ve sonundaki boşlukları temizler:
        System.out.println(mesaj.trim());
    }
}