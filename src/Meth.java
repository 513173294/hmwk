import java.util.Scanner;

public class Meth {
    String method() {

        Scanner sc = new Scanner(System.in);
        System.out.println("podaj współrzędną X : ");
        int x = sc.nextInt();
        System.out.println("podaj współrzędną Y : ");

        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            return "punkt znajduje się w II ćwiartce";


        } else if (x < 0 && y > 0) {
            return "punkt znajduje się w I ćwiartce";
        } else if (x > 0 && y < 0) {
            System.out.println(" punkt znajduje się w III ćwiartce ");
        } else if (x < 0 && y < 0) {
            System.out.println("punkt znajduje się w IV ćwiartce");
        }
return "gratulacja";
    }
}
//        }

//        System.out.println("podaj współrzędną Y : ");
//
//        int y = sc.nextInt();
//
//        if (y > 0) {
////            System.out.println(" górna część ");
//
//        } else {
////            System.out.println(" dolna część ");
//        }
//        return "oto wynik";
//
//    }
//
//}
