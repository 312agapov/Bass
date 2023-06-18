import java.util.Scanner;

public class Frogram {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        Vehicle ks1 = new Vehicle();
        System.out.println("Vvedite kol-vo cilindrov");
        ks1.setCylinders(in.nextInt());
        System.out.println(ks1.getCylinders());
        ks1.print();
        Car ks2 = new Car("ВАЗ","2107", true, 4, "Sedan", 4);
        ks2.print();
    }
}
