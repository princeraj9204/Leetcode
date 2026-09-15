class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        String arr[] = Arrays.copyOf(strs , strs.length);
        
        List<List<String>> lis = new ArrayList<>();

        boolean[] visited = new boolean[strs.length];

        for(int i=0;i<strs.length;i++){
            char ch[] = strs[i].toCharArray();
            Arrays.sort(ch);
            strs[i] = new String(ch);
        }

        for(int i=0;i<strs.length;i++){
            
            List<String> list = new ArrayList<>();

            if(visited[i]){
                continue;
            }

            list.add(arr[i]);
            for(int j=i+1;j<strs.length;j++){
                if(!visited[j] && strs[i] .equals(strs[j])){
                    list.add(arr[j]);
                    visited[j] = true;
                }
            }
            lis.add(list);
        }
        return lis;
    }
}