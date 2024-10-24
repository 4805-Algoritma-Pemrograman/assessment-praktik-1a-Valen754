import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int trip = 0;
        int lamatrip = 0;
        double omzet = 0;
        String driver;

        for(int i = 0;  i <= 3; i++) {
            System.out.println("Masukkan  nama driver:");
            driver  = input.nextLine();
            System.out.println("lama trip (km):");
            lamatrip = input.nextInt();
            switch (driver) {
                case Beliau:
                        if (lamatrip > 0){
                            omzet = lamatrip * 13000;
                        }

                    break;
                case Mereka:
                        if (lamatrip > 0){
                            omzet = lamatrip * 13000;
                        }

                    break;
                case Kita:
                        if (lamatrip > 0){
                            omzet = lamatrip * 13000;
                        }

                    break;
                default:
                    System.out.println("Nama yang anda masukkan tidak valid");
                    break;
            }

        }
        omzet = Integer.MIN_VALUE;
        trip += lamatrip;
        System.out.println("Total trip yang dilakukan driver = " + trip);
        System.out.println("Omzet tertinggi diperoleh oleh " + omzet);
    }
}


/*Pseudocode
 * deklarasi:
 * var trip,lamatrip;integer
 * var omzet;double
 * var driver;string
 * var  i;integer

 * 
 * algoritma:
 * for(i =  0; i <= 3; i++) {
 *      switch
 * }
 * 
 */
