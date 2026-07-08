class Solution {
    public static void combisum(int arr[] ,int i ,List<Integer> comb , List<List<Integer>> ans , int target ){
        if(target == 0){
            ans.add(new ArrayList<>(comb));
            return ;
        }
         if(i == arr.length ||  target<0){
            return  ;
        }
        comb.add(arr[i]);
        //include -> single
        combisum(arr , i , comb , ans , target-arr[i]);
        //include -> multiple
      //  combisum(arr , i , comb ,ans , target-arr[i]);
        //backtrack to remove add element
        comb.remove(comb.size()-1);
        // exclude element
         combisum(arr,i+1,comb , ans , target);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> ans = new ArrayList<>();
       List<Integer> comb = new ArrayList<>();
     combisum(candidates , 0 , comb , ans , target);
     return ans;
    }
}