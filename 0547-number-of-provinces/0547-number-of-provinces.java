class Solution {
    public int findCircleNum(int[][] isConnected) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        boolean[] visited  = new boolean[isConnected.length+1];
        int count = 0;
        for (int i=1; i<=isConnected.length; i++){
            map.put(i, new ArrayList<>());
        }

        for(int j=0; j<isConnected.length; j++){
            for (int k=0; k<isConnected.length; k++){
                if (isConnected[j][k] == 1 && j!=k){
                    map.get(j+1).add(k+1);
                }
            }
        }
        for (int i=1; i<=isConnected.length; i++){
            if (!visited[i]){
                dfs(i, visited, map);
                count++;
            }
        }
        return count;
    }
    public static void dfs(int node, boolean[] visited, HashMap<Integer, List<Integer>> map){
        visited[node] = true;
        for(int nei: map.get(node)){
            if (!visited[nei]){
                dfs(nei, visited, map);
            }
        }
    }
}