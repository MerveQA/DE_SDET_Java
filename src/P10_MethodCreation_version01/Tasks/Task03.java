package P10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        //task-> girilen Saati saniyeye mil'i km'ye kg'yi gr'a çeviren METHOD create ediniz.


        Scanner input = new Scanner(System.in);
        System.out.print("dönüştüreceğiniz birimi giriniz : ");
        String birim = input.nextLine().toLowerCase();//saat mil kg cinsi

        System.out.print("dönüştüreceginiz birimin mikatrını giriniz : ");
        double miktar = input.nextDouble();//saat mil km miktarı
      //  donustur(birim, miktar);

    }//main sonu






}
