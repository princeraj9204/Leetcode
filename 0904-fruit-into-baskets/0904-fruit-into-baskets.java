class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int si=0,ei=0,max=0;
        while(ei < fruits.length){

            map.put(fruits[ei], map.getOrDefault(fruits[ei] , 0)+1);

            while(map.size() > 2){

                map.put(fruits[si] , map.get(fruits[si]) - 1);

                if(map.get(fruits[si]) == 0){
                    map.remove(fruits[si]);
                }
                si++;

            }
            max = Math.max(max , ei-si+1);
            ei++;
        }
        return max;
    }
}