package JavaOdev3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int kenar1,kenar2,kenar3,cevre;
        double alan;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen sirasi ile kenar1,kenar2 ve kenar 3 uzunluklarini giriniz");

        kenar1 = scanner.nextInt();
        kenar2 = scanner.nextInt();
        kenar3 = scanner.nextInt();

        cevre = (kenar1 + kenar2 + kenar3)/2;
        alan = cevre *(cevre-kenar1)*(cevre-kenar2)*(cevre-kenar3);

        System.out.println("Ucgeninizin alani : " + Math.sqrt(alan));

    }
}
