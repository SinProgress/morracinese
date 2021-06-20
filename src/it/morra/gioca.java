package it.morra;
import java.util.Scanner;
import it.morra.MorraCinese;


public class gioca {
    public static void main(String[] args) {
        Scanner inputUtente = new Scanner(System.in);
        MorraCinese giocatore1= new MorraCinese();
        MorraCinese giocatore2=new MorraCinese();
        boolean choice=true;
        do {
            giocatore1.setMossa(random3());
            giocatore2.setMossa(random3());
            System.out.println("Il giocatore uno ha " + giocatore1.getMossa());
            int c = giocatore1.confronta(giocatore2);
            if (c == 0)
                System.out.println("PAREGGIA ");
            else if (c == 1)
                System.out.println("VINCE ");
            else System.out.println("PERDE ");
            System.out.println("contro giocatore due che ha " + giocatore2.getMossa());
            System.out.println("--------FINE PARTITA--------");
            System.out.println("Vuoi giocare ancora? (si per continuare)");
            choice= inputUtente.nextLine().equals("si");
        } while(choice);
    }

    public static int random3(){
        return (int) (Math.random() * 3);
    }

}
