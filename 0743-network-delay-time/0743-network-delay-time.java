class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        HashMap<Integer, List<List<Integer>>> map = new HashMap<>();
        for (int i=1; i<=n; i++){
            map.put(i, new ArrayList<>());
        }

        for (int[] edge: times){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            map.get(u).add(new ArrayList<>(Arrays.asList(v,w)));
        }

         
        int[] distance = new int[n+1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[k] = 0;
       PriorityQueue<List<Integer>> q =
            new PriorityQueue<>(
                (a, b) -> Integer.compare(a.get(1), b.get(1))
            );
        q.offer(new ArrayList<>(Arrays.asList(k,0)));

        while (!q.isEmpty()){
            List<Integer> curr = q.poll();
            int node = curr.get(0);
            int weight = curr.get(1);
            if (weight>distance[node]){
                continue;
            }
            for (List<Integer> nei: map.get(node)){
                int newweight = weight+nei.get(1);
                if (newweight<distance[nei.get(0)]){
                    distance[nei.get(0)] = newweight;
                    q.offer(new ArrayList<>(Arrays.asList(nei.get(0), distance[nei.get(0)])));
                }
            }
        } 
        int ans = 0;
        for (int i=1; i<=n; i++){
            if (distance[i] == Integer.MAX_VALUE){
                    return -1;
            }
            ans = Math.max(ans, distance[i]);
        }
        return ans;
    }
}