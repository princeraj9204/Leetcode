class Solution {
    public boolean threeFibonacciSum(int n) {
        if(isfibb(n,0,1,1)){
            return true;
        }
        return false;
    }
    public static boolean isfibb(int n, int a, int b , int c){
        if(a+b+c == n){
            return true;
        }
        if(a+b+c > n){
            return false;
        }
        int temp = c;
        c = c+b;
        a = b;
        b = temp;
        return isfibb(n , a ,b , c);
    }
}