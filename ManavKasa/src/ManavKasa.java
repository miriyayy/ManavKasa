import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double armutFiyatiKg = 2.14;
        double elmaFiyatiKg = 3.67;
        double domatesFiyatiKg = 1.11;
        double muzFiyatiKg = 0.95;
        double patlıcanFiyatiKg = 5.0;

        System.out.println("Armut kaç kilo?:");
        double armutKg= scanner.nextDouble();

        System.out.println("Elma kaç kilo?:");
        double elmaKg= scanner.nextDouble();

        System.out.println("Domates kaç kilo?:");
         double domatesKg= scanner.nextDouble();

        System.out.println("Muz kaç kilo?:");
        double muzKg= scanner.nextDouble();

        System.out.println("Patlıcan kaç kilo:?");
        double patlıcanKg= scanner.nextDouble();

        double toplamTutar= (armutFiyatiKg*armutKg)+ (elmaFiyatiKg*elmaKg)+(domatesFiyatiKg*domatesKg)+
                (muzFiyatiKg*muzKg)+(patlıcanFiyatiKg*patlıcanKg);

       System.out.println("Toplam TUtar:"+ toplamTutar +"TL");

    }
}