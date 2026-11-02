class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        part(s,list,ans);
        return ans;
    }
    public static void part(String ques, List<String> list,List<List<String>> ans){
        if(ques.length() == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int cut=1;cut<=ques.length();cut++){
            String s = ques.substring(0,cut);
            if(ispallin(s)){
                list.add(s);
                part(ques.substring(cut) , list,ans);
                list.remove(list.size()-1);
            }
        }
    }
    public static boolean ispallin(String str){
        if(str.length() == 1){
            return true;
        }
        int i=0;
        int j=str.length()-1;
        while(i <= j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}