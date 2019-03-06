import java.math.BigInteger;

public class EulerZadanie {

    public static void main(String[] args) {

        EulerZadanie ez = new EulerZadanie();
//        System.out.println(ez.EulerEx6Algorythm(10));

//        For small numbers
        double sumOne = 0;
        double sumTwo = 0;
        for (int i = 0; i <=10 ; i++) {
            sumOne = sumOne + i;
        }
        for (int i = 0; i <=10 ; i++) {
            sumTwo = sumTwo + Math.pow(i,2);
        }
        System.out.println("Wynik, dla małych liczb:  " + (Math.pow(sumOne,2) - sumTwo));

        //For bigger number
        sumOne = 0;
        sumTwo = 0;
        for (int i = 0; i <=50 ; i++) {
            sumOne = sumOne + i;
        }
        for (int i = 0; i <=50 ; i++) {
            sumTwo = sumTwo + Math.pow(i,2);
        }
        System.out.println("Wynik, dla wiekszych liczb:  " + (Math.pow(sumOne,2) - sumTwo));

//        For bigest number
        sumOne = 0;
        sumTwo = 0;
        for (int i = 0; i <=100 ; i++) {
            sumOne = sumOne + i;
        }
        for (int i = 0; i <=100 ; i++) {
            sumTwo = sumTwo + Math.pow(i,2);
        }
        System.out.println("Wynik, dla najwiekszych liczb:  " + (Math.pow(sumOne,2) - sumTwo));
    }


    double EulerEx6Algorythm(int n){
        double res = 0;
        double sumOne = 0;
        double sumTwo = 0;
        for (int i = 0; i <= n; i++) {
            sumOne = sumOne + i;
            sumTwo = sumTwo + Math.pow(i,2);
            res = Math.pow(sumOne,2) - (sumTwo);
        }
        return res;
    }
}
