package Leetcode;

public class DynamicProgrammingFibonacci {
    public static void main (String [] args){
        int x = 5;
        System.out.println(Fibonacci(x));
    }
    
    public static int Fibonacci(int n){
        // Decalre ann array to store the fibonacci numbers
        int [] fibArray = new int [n+2];

        // 0th and 1st number of the series are 0 and 1
        fibArray[0] = 0;
        fibArray[1] = 1;

        for(int i = 2;i<=n;i++){
            // Add the previous 2 numbers in the series and store it
            fibArray[i] = fibArray[i-1] + fibArray[i-2];
        }

        return fibArray[n];
    } 
    
}
