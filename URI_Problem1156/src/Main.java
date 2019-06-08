public class Main {
    public static void main(String[] args) {
        double S = 0;
        for(double i = 1, j = 1;i<=39; i+= 2, j *= 2){
            S =( S + (i/j));
        }
        System.out.printf("%.2f%n",S);
    }
}
