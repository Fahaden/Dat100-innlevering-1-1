package no.hvl.dat100;

public class O2 {
	public static void main(String[] args) {
		double bruttoInntekt = 19;
		double trinnSkatt;
		
		if (bruttoInntekt >= 1350001) {
			trinnSkatt = bruttoInntekt * 0.176;
			System.out.println("Du må betale " + trinnSkatt + " i trinnskatt");
			
		} else if (bruttoInntekt >= 208051 && bruttoInntekt <= 292850) {
			trinnSkatt = (bruttoInntekt) * 0.17;
			System.out.println("Du må betale " + trinnSkatt + " i trinnskatt");
			
		} else if (bruttoInntekt >= 292851 && bruttoInntekt <= 670000) {
			trinnSkatt = (bruttoInntekt) * 0.4;
			System.out.println("Du må betale " + trinnSkatt + " i trinnskatt");
			
		} else if (bruttoInntekt >= 670001 && bruttoInntekt <= 937900) {
			trinnSkatt = (bruttoInntekt) * 0.136;
			System.out.println("Du må betale " + trinnSkatt + " i trinnskatt");
			
		} else if (bruttoInntekt >= 937901 && bruttoInntekt <= 1350000) {
			trinnSkatt = (bruttoInntekt) * 0.166;
			System.out.println("Du må betale " + trinnSkatt + " i trinnskatt");
		} else {
			System.out.println ("Du trenger ikke å betale noe i trinnskatt =)");
		}
	}

}
