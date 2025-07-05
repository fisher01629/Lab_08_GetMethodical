public class CtoFTableDisplay {
    public static void main(String[] args) {
        System.out.printf("%-15s%-15s", "Celsius", "Fahrenheit");
        for(int i=-100;i<=100; i++){
            System.out.println();
            System.out.printf("%5d", i);
            System.out.printf("%18.2f\n", CtoF(i));
        }


    }
    public static double CtoF(double celsius){
        double fVal = celsius * 9.0/5 + 32;
        return fVal;
    }
}
