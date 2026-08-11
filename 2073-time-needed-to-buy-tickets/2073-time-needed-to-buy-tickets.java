class Solution {
    class person{
        int index;
        int tickets;
        person(int index , int tickets){
            this.index = index;
            this.tickets = tickets;
        }
    }
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<person> q = new ArrayDeque<>();
        for(int i=0;i<tickets.length;i++){
            q.add(new person(i,tickets[i]));
        }
        int ans = 0;
        while(true){
            person p = q.remove();
            p.tickets--;
            ans++;
            if(p.index == k && p.tickets==0){
                return ans;
            }
                if(p.tickets>0){
                    q.add(p);
                }
        }
      //  return ans;
    }
}