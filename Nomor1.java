import java.util.Scanner;

public class Nomor1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jamlembur = 0;
        double honorlembur = 0 ;
        double totallembur = 0;
;
        jamlembur = scanner.nextInt();

        if (jamlembur > 0  && jamlembur <= 16) {

                honorlembur = jamlembur * 10000;
        }
        else if(jamlembur >  16){
            honorlembur =  jamlembur * 15000;

        }
        else {

        }

        totallembur += honorlembur;


        //System.out.println("Total jam lembur:  " + jamlembur);
        System.out.println("Total honor lembur:  " + totallembur);


        scanner.close();
    }
}
