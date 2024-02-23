import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int n, r;


        System.out.print("İlk sayıyı giriniz : ");
        n = inp.nextInt();

        System.out.println("İkinci sayıyı giriniz : ");
        r = inp.nextInt();


        int sonuc;
        sonuc = faktoriyelHesapla(n) / (faktoriyelHesapla(n-r) * faktoriyelHesapla(r));
        System.out.println("Cevap :" + sonuc);



    }

    static int faktoriyelHesapla(int x){
        int fak = 1;
        for(int i = 1; i <= x; i++){
            fak *= i;

        }
        return fak;
    }
}