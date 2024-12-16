import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Ukoly haf = new Ukoly();

        for (boolean negr = true; negr;) {
            System.out.println("Jaký chceš úkol");
            int x = sc.nextInt();


            switch (x) {
                case 1 ->
                        haf.vypis1();
                case 2 ->
                        haf.vypis2();
                case 3 ->
                        haf.vypis3();
                case 4 ->
                        haf.vypis4();
                case 5 ->
                        haf.vypis5();
                case 6 ->
                        haf.vypis6();
                case 7 ->
                        haf.vypis7();
            }
            System.out.println("Chcete pokračovat ( end = konec )");
            String s = sc.next();
            if (s.equals("end")){
                negr = false;
            }
        }


    }
}