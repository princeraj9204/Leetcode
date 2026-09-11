class Solution {
    public String minWindow(String s, String t) {
        int fres[] = new int[256];
        int fret[] = new int[256];
        for(int i=0;i<t.length();i++){
            fret[t.charAt(i)]++;
        }
        int si=0,ei=0,count=0,size=Integer.MAX_VALUE,start_index=-1;
        while(ei < s.length()){
            // window grow
            char curr = s.charAt(ei);
            fres[curr]++;
            if(fres[curr] <= fret[curr]){
                count++;
            }

            //Window Shrink 
            while(count == t.length() && fres[s.charAt(si)] > fret[s.charAt(si)]){
                fres[s.charAt(si)]--;
                si++;
            }

            //Ans Update
            if(count == t.length() && size > ei-si+1){
                size = ei-si+1;
                start_index = si;
            }
            ei++;
        }
        return start_index==-1?"":s.substring(start_index , start_index+size);
    }
}