class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0;
        int j = people.length-1;
        int boat = 0;
        while(i <= j){
            if(i == j){
                boat++;
                return boat;
            }
            if(people[i] + people[j] <= limit){
                boat++;
                i++;
                j--;
            }
            if(people[i] + people[j] > limit){
              if(people[i] > people[j]){
                boat++;
                i++;
              }else{
                boat++;
                j--;
              }
            }
        }
        return boat;
    }
}