package pl.sobocinska;

public class Recursion {
    public static int Summation(int n){
        // base case:
        if(n <=0){
            return 0;
        //recursive case:
        } else {
            return n + Summation(n-1);
        }
    }

    public static int Factorial(int n){
        if(n <=1){
            return 1;
        } else{
            return n * Factorial(n-1);
        }
    }

    public static void main(String[] args) {

        System.out.println(Summation(3));
        System.out.println(Factorial(3));
    }
}
