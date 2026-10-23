import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inTastiera = new Scanner(System.in);
        System.out.println("INSERISCI il numero di battiti di ali: ");
        int battiti = inTastiera.nextInt();
        Cacciatore sangiorgio = new Cacciatore("Giorgio");
        Thread drago1 = new Thread(new Drago(battiti, "Argo"));
        drago1.start();

        sangiorgio.lanciaDardi(drago1);

        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("sleep error nel main" + e);
            }
            System.out.println("main sta osservando il drago...i = " + i);
        }
    }
}
