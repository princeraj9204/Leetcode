class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        Set<List<Integer>> uniqueTriplets = new HashSet<>();

        for (int i = 0; i < n; i++) {

            int target = -nums[i];
            Set<Integer> set = new HashSet<>();

            for (int j = i + 1; j < n; j++) {

                int third = target - nums[j];

                if (set.contains(third)) {

                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(third);

                    Collections.sort(triplet);

                    uniqueTriplets.add(triplet);
                }

                set.add(nums[j]);
            }
        }

        ans.addAll(uniqueTriplets);

        return ans;
    }
}