class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length()==1){
            return true;
        }
        // if(word.length()==2){
        //     if(word.charAt(0)>=97 && word.charAt(1)<=122 && word.charAt(1) >= 65 && word.charAt(1)  <=90){
        //         return false;
        //     }else{
        //         return true;
        //     }

        // }
        char ch = word.charAt(0);
        int a =0, b=0;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i) >= 65 && word.charAt(i) <= 90){
                a++;
            }
             if(word.charAt(i) >= 97 && word.charAt(i) <= 122){
                b++;
            }
        }
         if(ch>=65 && ch<=90 && a >0 && b==0){
                return true;
            }
            if(ch>=65 && ch<=90 && a==0 && b>0){
                return true;
            }
            if(ch>=97 && ch<=122 && a==0 && b>0){
                return true;
            }
        return false;
    }
}