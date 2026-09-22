class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int k = p.length();
        if(k > s.length()){
            return list;
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        
        for(int i=0;i<k;i++){
            char c = p.charAt(i);
            map2.put(c , map2.getOrDefault(c , 0)+1);
        }
        for(int i=0;i<k;i++){
            char c = s.charAt(i);
            map1.put(c , map1.getOrDefault(c , 0)+1);
        }
        if(map1.equals(map2)){
            list.add(0);
        }
        for(int i=k;i<s.length();i++){
           char remove = s.charAt(i-k);

           map1.put(remove , map1.get(remove) -1);

           if(map1.get(remove) == 0){
                map1.remove(remove);
           }

           char add = s.charAt(i);
           map1.put(add , map1.getOrDefault(add , 0)+1);

           if(map1.equals(map2)){
            list.add(i-k+1);
           }
        }
        return list;
    }
}