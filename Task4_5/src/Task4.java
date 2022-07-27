
public class Task4 {
    public static void main(String[]args) {
        double solution = calcSum();
        System.out.println(solution);

    }

    static double calcSum(){
        double sum = 0;
        for (double i=1; i <= 2.1; i+=0.1) {
            System.out.println(i);
            sum += Math.sin(i);
        }
        return sum;
    }
}