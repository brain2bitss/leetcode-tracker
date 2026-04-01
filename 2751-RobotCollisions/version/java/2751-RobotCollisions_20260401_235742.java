// Last updated: 4/1/2026, 11:57:42 PM
1import java.util.*;
2
3class Solution {
4    //CODED BY ADHI 
5    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
6        int n = positions.length;
7        
8        // EDGE CASE: All robots moving in same direction
9        boolean allSameDirection = true;
10        char firstDir = directions.charAt(0);
11        for (int i = 1; i < n; i++) {
12            if (directions.charAt(i) != firstDir) {
13                allSameDirection = false;
14                break;
15            }
16        }
17        
18        if (allSameDirection) {
19            List<Integer> result = new ArrayList<>();
20            for (int health : healths) {
21                result.add(health);
22            }
23            return result;
24        }
25        
26        // Create list of robots with their original indices
27        Integer[] indices = new Integer[n];
28        for (int i = 0; i < n; i++) {
29            indices[i] = i;
30        }
31        
32        // Sort robots by position
33        Arrays.sort(indices, (a, b) -> Integer.compare(positions[a], positions[b]));
34        
35        // Stack to store robots that are moving right
36        Stack<Integer> stack = new Stack<>();
37        int[] currentHealths = healths.clone();
38        
39        // Process robots in order of their positions
40        for (int idx : indices) {
41            if (directions.charAt(idx) == 'R') {
42                // Moving right, push to stack
43                stack.push(idx);
44            } else {
45                // Moving left, check for collisions with robots moving right
46                while (!stack.isEmpty()) {
47                    int rightIdx = stack.peek();
48                    
49                    if (currentHealths[rightIdx] > currentHealths[idx]) {
50                        // Right robot survives, left robot dies
51                        currentHealths[rightIdx]--;
52                        currentHealths[idx] = -1;
53                        break;
54                    } else if (currentHealths[rightIdx] < currentHealths[idx]) {
55                        // Left robot survives, right robot dies
56                        currentHealths[rightIdx] = -1;
57                        stack.pop();
58                        currentHealths[idx]--;
59                    } else {
60                        // Both die
61                        currentHealths[rightIdx] = -1;
62                        currentHealths[idx] = -1;
63                        stack.pop();
64                        break;
65                    }
66                }
67            }
68        }
69        
70        // Collect surviving robots in original order
71        List<Integer> result = new ArrayList<>();
72        for (int i = 0; i < n; i++) {
73            if (currentHealths[i] > 0) {
74                result.add(currentHealths[i]);
75            }
76        }
77        
78        return result;
79    }
80}