class Solution {

    static class Edge {
        int node;
        int weight;

        Edge(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    public int minCostConnectPoints(int[][] points) {

        int n = points.length;

        List<Edge>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        // Build graph
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int weight =
                    Math.abs(points[i][0] - points[j][0]) +
                    Math.abs(points[i][1] - points[j][1]);

                graph[i].add(new Edge(j, weight));
                graph[j].add(new Edge(i, weight));
            }
        }

        boolean[] visited = new boolean[n];

        PriorityQueue<Edge> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a.weight, b.weight)
        );

        pq.offer(new Edge(0, 0));

        int total = 0;
        int edgesUsed = 0;

        while (!pq.isEmpty() && edgesUsed < n) {

            Edge curr = pq.poll();

            int node = curr.node;

            if (visited[node]) {
                continue;
            }

            visited[node] = true;
            total += curr.weight;
            edgesUsed++;

            for (Edge nei : graph[node]) {

                if (!visited[nei.node]) {
                    pq.offer(nei);
                }
            }
        }

        return total;
    }
}