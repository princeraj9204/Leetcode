class Solution {
    public static boolean pallindrome(String t){
        int i = 0;
        int j = t.length()-1;
        while(i<=j){
            if(t.charAt(i) !=  t.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
       List<List<String>> ans = new ArrayList<>();
       List<String> list = new ArrayList<>();
       Partition(s,list,ans);
       return ans;
    }
      public static void Partition(String ques,List<String> list,List<List<String>> ans){
        if(ques.length()==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int cut=1;cut <= ques.length();cut++){
            String s = ques.substring(0,cut);
            if(pallindrome(s)){
                list.add(s);
            Partition(ques.substring(cut) , list , ans);
            list.remove(list.size()-1);
            }
        }
    }
}