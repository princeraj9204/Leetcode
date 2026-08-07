class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=100;i++){
            int a = i;
            int mul = 1;
            while(a != 0){
                mul *= a%10;
                a /= 10;
            }
            if(mul % t == 0){
                return i;
            }
        }
        return 0;
    }
}