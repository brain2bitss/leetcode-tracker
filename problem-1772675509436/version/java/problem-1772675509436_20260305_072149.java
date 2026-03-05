// Last updated: 3/5/2026, 7:21:49 AM
1import java.util.*;
2
3class Solution {
4    public int countPaths(int n, int[][] roads) {
5        final int MOD = 1_000_000_007;
6
7        // Step 1: Build adjacency list
8        List<List<int[]>> graph = new ArrayList<>();
9        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
10        for (int[] road : roads) {
11            int u = road[0], v = road[1], time = road[2];
12            graph.get(u).add(new int[]{v, time});
13            graph.get(v).add(new int[]{u, time});
14        }
15
16        // Step 2: Dijkstra’s algorithm
17        long[] dist = new long[n];
18        Arrays.fill(dist, Long.MAX_VALUE);
19        dist[0] = 0;
20
21        int[] ways = new int[n];
22        ways[0] = 1;
23
24        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[1]));
25        pq.offer(new long[]{0, 0}); // {node, distance}
26
27        while (!pq.isEmpty()) {
28            long[] curr = pq.poll();
29            int u = (int) curr[0];
30            long d = curr[1];
31
32            if (d > dist[u]) continue;
33
34            for (int[] edge : graph.get(u)) {
35                int v = edge[0];
36                long newDist = d + edge[1];
37
38                if (newDist < dist[v]) {
39                    dist[v] = newDist;
40                    ways[v] = ways[u];
41                    pq.offer(new long[]{v, newDist});
42                } else if (newDist == dist[v]) {
43                    ways[v] = (int) ((ways[v] + (long) ways[u]) % MOD);
44                }
45            }
46        }
47
48        return ways[n - 1];
49    }
50}