// Last updated: 2/2/2026, 2:34:27 PM
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
         // Step 1: Build adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        // Step 2: Build indegree array
        int[] indegree = new int[numCourses];
        for (int[] pre : prerequisites) {
            int u = pre[1], v = pre[0]; // edge u -> v
            adj.get(u).add(v);
            indegree[v]++;
        }

        // Step 3: Queue with nodes having indegree 0
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        // Step 4: Process queue
        int count = 0;
        int[] order = new int[numCourses];
        while (!q.isEmpty()) {
            int node = q.poll();
            order[count++] = node;

            for (int neighbor : adj.get(node)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    q.add(neighbor);
                }
            }
        }

        // Step 5: If all courses processed → no cycle
       if(count == numCourses){
        return order;
       }else{
        return new int[0];
       }
    }
}