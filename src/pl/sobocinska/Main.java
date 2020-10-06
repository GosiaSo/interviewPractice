package pl.sobocinska;



public class Main {
    public static boolean isMonotonic(int[] A) {
        for(int i = 0; i < A.length-1; i++){
            if(A[i] >= A[i+1]){
                continue;
            }
            if(A[i] <= A[i+1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 2};
        System.out.println(isMonotonic(A));
    }
}
