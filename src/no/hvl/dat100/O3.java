package no.hvl.dat100;

public class O3 {
	public static void main(String[] args) {
		
        int n = 5;
        int fakultet = 1;
        for (int i = 1; i <= n; i++) {
            fakultet *= i;
        }
        System.out.println("Fakultet av " + n + " er: " + fakultet);
    }

}
