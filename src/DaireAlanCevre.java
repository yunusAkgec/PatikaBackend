import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
        double yaricap , alan , cevre , aci , pi=3.14 , daireDilimi;
        Scanner input = new Scanner(System.in);

        System.out.println("Yarıçapı Giriniz : ");
        yaricap = input.nextDouble();
        System.out.println("Daire Diliminin Açı Ölçüsünü Giriniz : ");
        aci = input.nextDouble();

        cevre = 2 * pi * yaricap ;
        alan = pi * Math.pow(yaricap , 2 ) ;
        daireDilimi = ((pi * Math.pow(yaricap , 2 ) * aci)/360);
        System.out.println("Dairenin Çevresi : " + cevre);
        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Belirli Açının Gösterdiği Daire Dilimi :" + daireDilimi);

    }
}
