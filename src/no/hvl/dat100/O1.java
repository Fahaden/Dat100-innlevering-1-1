package no.hvl.dat100;

public class O1 {
	public static void main(String[] args) {
        
        int[] poengsummer = {23, 43, 69, 85, 100, -10, 76, 101, 57, 82};

        for (int karakterPoeng : poengsummer) {
            while (karakterPoeng < 0 || karakterPoeng > 100) {
                System.out.println("Ugyldig poengsum (" + karakterPoeng + ") Poengsum må være mellom 0 og 100");
  
                karakterPoeng = 69;  
                System.out.println("Ny gyldig poengsum satt til " + karakterPoeng + ".");
            }
            
            if (karakterPoeng <= 100 && karakterPoeng >= 90) {
                System.out.println("Karakteren er: A");
            } else if (karakterPoeng < 90 && karakterPoeng >= 80 ) {
                System.out.println("Karakteren er: B");
            } else if (karakterPoeng < 80 && karakterPoeng >= 60) {
                System.out.println("Karakteren er: C");
            } else if (karakterPoeng < 60 && karakterPoeng >= 50) {
                System.out.println("Karakteren er: D");
            } else if (karakterPoeng < 50 && karakterPoeng >= 40) {
                System.out.println("Karakteren er: E");
            } else if (karakterPoeng < 40 && karakterPoeng >= 0) {
                System.out.println("Karakteren er: F");
            }
        }
    }
}
