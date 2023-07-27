import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r, merkezAci;
        double pi=3.14, cevre, alan, dilimAlan;

        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçap değerini giriniz: ");
        r= input.nextInt();

        System.out.print("Merkez açısını giriniz: ");
        merkezAci=input.nextInt();


        cevre=2*pi*r;
        alan=pi*r*r;

        dilimAlan=(pi*(r*r)*merkezAci)/360;

        System.out.println("Dairenin çevresi "+cevre);
        System.out.println("Dairenin alanı: "+alan);
        System.out.println("Dilim dairenin alanı: "+dilimAlan);











        }
    }
