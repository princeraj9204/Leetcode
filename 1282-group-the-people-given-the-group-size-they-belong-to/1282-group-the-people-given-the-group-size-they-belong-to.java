class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {

        List<List<Integer>> list = new ArrayList<>();
        boolean[] visited = new boolean[groupSizes.length];

        for (int i = 0; i < groupSizes.length; i++) {

            if (visited[i]) {
                continue;
            }

            int size = groupSizes[i];

            List<Integer> group = new ArrayList<>();

            for (int j = i; j < groupSizes.length; j++) {

                if (!visited[j] && groupSizes[j] == size) {

                    group.add(j);
                    visited[j] = true;

                    if (group.size() == size) {
                        break;
                    }
                }
            }

            list.add(group);
        }

        return list;
    }
}