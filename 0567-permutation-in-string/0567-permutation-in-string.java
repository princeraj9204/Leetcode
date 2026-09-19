class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        if(k > s2.length()){
            return false;
        }

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(int i=0;i<k;i++){
            char c = s1.charAt(i);
            char d = s2.charAt(i);
            map1.put(c,map1.getOrDefault(c,0)+1);
            map2.put(d,map2.getOrDefault(d,0)+1);
        }

        if(map1.equals(map2)){
            return true;
        }

        int si = 0;
        int ei = k;
        while(ei < s2.length()){
            char c = s2.charAt(ei);
            map2.put(c,map2.getOrDefault(c,0)+1);

            map2.put(s2.charAt(si) , map2.get(s2.charAt(si))-1);

            if(map2.get(s2.charAt(si)) == 0){
                map2.remove(s2.charAt(si));
            }

            if(map1.equals(map2)){
                return true;
            }
            ei++;
            si++;
        }
        return false;
    }
}