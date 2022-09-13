public class Main {
    public static void main(String[] args) {


        // Mükemmel sayı: Kendinden başka pozitif tam bölenlerinin toplamı kendine eşit olan sayı.

        int sayi=10;
        int kat=0;
        for (int i=1;i<sayi;i++){
            if (sayi%i==0){
                kat=kat+i;
            }
        }

        if (sayi==kat){
            System.out.println("Sayı mükemmel sayıdır.");
        }else {
            System.out.println("Sayı mukemmel sayı değildir.");
        }

    }
}