import java.util.Scanner;

public class Meth {
    String method() {

        Scanner sc = new Scanner(System.in);
        System.out.println("podaj współrzędną X : ");
        int x = sc.nextInt();
        System.out.println("podaj współrzędną Y : ");

        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            return "punkt (" + x + ", " + y + ") znajduje się w II ćwiartce";
        } else if (x < 0 && y > 0) {
            return "punkt (" + x + ", " + y + ") znajduje się w I ćwiartce";
        } else if (x > 0 && y < 0) {
            System.out.println(" punkt (" + x + ", " + y + ") znajduje się w III ćwiartce ");
        } else if (x < 0 && y < 0) {
            System.out.println("punkt (" + x + ", " + y + ")znajduje się w IV ćwiartce");
        } else if (x == 0 && y == 0) {
            System.out.println("jestes na srodku");
        } else if (x == 0 && y < 0) {
            System.out.println("jestes na osi Y ponizej osi X");
        } else if (x == 0 && y > 0) {
            System.out.println("jestes na osi Y powyżej osi X");
        }else if (x > 0 && y == 0) {
            System.out.println("jestes na osi X na prawo od osi Y");
        }else if (x < 0 && y == 0) {
            System.out.println("jestes na osi X na lewo od osi Y");
        }

        return "gratulacja";
    }
}
