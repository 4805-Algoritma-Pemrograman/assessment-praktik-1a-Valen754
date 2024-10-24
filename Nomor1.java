import java.util.Scanner;

public class Nomor1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jamlembur = 0;
        double honorlembur = 0 ;
        double totallembur = 0;

        jamlembur = scanner.nextInt();

        if (jamlembur > 0  && jamlembur <= 16) {

                honorlembur = jamlembur * 10000;
        }
        else if(jamlembur >=  17){
            honorlembur =  jamlembur * 10000 +  (jamlembur - 16) * 5000 ;


        }
        else {

        }

        totallembur += honorlembur;


        // System.out.println("Total jam lembur:  " + jamlembur);
        System.out.println( totallembur);


        scanner.close();
    }
}


/*Pseudocode
 * deklarasi:
 * var jamlembur;integer
 * var honorlembur,totallembur;double
 * 
 * algoritma:
 * if(jamlembur > 0 && <= 16)Then
 *       honorlembur = jamlembur * 10000;
 * 
 *  else if(jamlembur > 16)Then
 *       honorlembur = jamlembur  * 10000 + (jamlembur - 16) * 5000 ;
 * END if
 * 
 * totallembur += honorlembur
 * 
 * print(totallembur)


 */
