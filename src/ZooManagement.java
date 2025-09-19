
import java.util.Scanner;

public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";

    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();


        // Instruction 3
        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");



        // Instruction 1
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        String inputName = scanner.nextLine();

        System.out.print("Entrez le nombre de cages : ");
        int inputCages = scanner.nextInt();

        // Instruction 2
        if (inputCages > 0 && !inputName.trim().isEmpty()) {
            zoo.zooName = inputName;
            zoo.nbrCages = inputCages;
        } else {
            System.out.println("⚠️ Valeurs invalides, les données par défaut sont conservées.");
        }


        // Instruction 3
        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");
        scanner.close();
    }
}


