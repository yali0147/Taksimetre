import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Taksimetre");

        double gidilenkm, minucret, tutar, basucreti, kmucreti;
        Scanner girdi = new Scanner(System.in);

        System.out.print("Km Giriniz : ");
        gidilenkm = girdi.nextDouble();
        minucret = 20;
        basucreti= 10;
        kmucreti= 2.20 ;
        tutar=basucreti+(gidilenkm*kmucreti);
        tutar = Math.max(tutar, minucret);

        System.out.print("Toplam Tutar : "+tutar);
    }
}