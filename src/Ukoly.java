import java.util.Scanner;

public class Ukoly {
    static Scanner sc = new Scanner(System.in);

    public void vypis1() {
        for (int i = 1; i <= 30; i++) {
            System.out.println(i + ". Ahoj světe.");
        }
    }

    public void vypis2() {
        System.out.println("Zadej slovo");
        String a = sc.next();
        System.out.println(a);
    }

    public void vypis3(){
        System.out.println("Zadej čísílko");
        int e = sc.nextInt();
        switch (e){
            case 1 ->
                System.out.println("jedna");
            case 2 ->
                System.out.println("dva");
            case 3 ->
                System.out.println("tři");
            case 4 ->
                System.out.println("čtyři");
            case 5 ->
                System.out.println("pět");
            case 6 ->
                System.out.println("šest");
            case 7 ->
                System.out.println("sedm");
            case 8 ->
                System.out.println("eight");
            case 9 ->
                System.out.println("nine");
            case 10 ->
                System.out.println("ten");
            case 11 ->
                System.out.println("eleven");
            case 12 ->
                System.out.println("twelve");
            default ->
                System.out.println("USS Negr");
        }
    }

    public void vypis4(){
        for (int q = 1;q<=20;q++){
            System.out.println(5*q);
        }
    }

    public void vypis5(){
        System.out.println("Zadej prvočíslo");
        int b = sc.nextInt();
        double ob = Math.sqrt(b);

        boolean prvocislo = true;
        for (int w = 2;b>w;w++){
            if (b==2){
                prvocislo=true;
            }
            else if (b%w==0){
                prvocislo=false;
            }
        }
        if (prvocislo==true){
            System.out.println("Je to prvočíslo");
        }
        else {
            System.out.println("Není prvočíslo");
        }

    }

    public void vypis6(){
        System.out.println("Číslo1:");
        int g = sc.nextInt();
        System.out.println("Číslo2:");
        int h = sc.nextInt();
        System.out.println("Číslo3:");
        int j = sc.nextInt();
        double min=0;
        double max=0;

        if (g<h&&g<j){
            min = g;
        }
        if (h<g&&h<j){
            min = h;
        }
        if (j<h&&j<g){
            min = j;
        }

        if (g>h&&g>j){
            max = g;
        }
        if (h>g&&h>j){
            max = h;
        }
        if (j>h&&j>g){
            max = j;
        }

        System.out.println("<"+min+";"+max+">");

        double d = max/min;
        int deb = (int) d;
        double debr = (double) deb;
        double z = d-debr;
        System.out.println(z);
    }

    public void vypis7(){
        System.out.println("Zadej jméno:");
        String u = sc.next();
        System.out.println("Zadej příjmení:");
        String y = sc.next();

        System.out.println("Tvé jméno je "+u+" "+y);
    }
}
