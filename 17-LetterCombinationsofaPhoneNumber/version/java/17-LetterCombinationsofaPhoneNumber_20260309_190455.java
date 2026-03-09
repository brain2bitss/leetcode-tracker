// Last updated: 3/9/2026, 7:04:55 PM
1class Solution {
2    public List<String> letterCombinations(String digits) {
3        List<String> result = new ArrayList<>();
4        
5        // Edge case: empty input
6        if (digits == null || digits.length() == 0) {
7            return result;
8        }
9        
10        // Check for invalid digits (like '1' or '0')
11        for (int i = 0; i < digits.length(); i++) {
12            char c = digits.charAt(i);
13            if (c == '1') {
14                return result; // Return empty list for invalid input
15            }
16        }
17
18        // Mapped alphabets with digits (index 0 = digit 2, index 1 = digit 3, etc.)
19        Character[][] mapping = {
20            {'a','b','c'},      // digit 2 (index 0)
21            {'d','e','f'},      // digit 3 (index 1)
22            {'g','h','i'},      // digit 4 (index 2)
23            {'j','k','l'},      // digit 5 (index 3)
24            {'m','n','o'},      // digit 6 (index 4)
25            {'p','q','r','s'},  // digit 7 (index 5)
26            {'t','u','v'},      // digit 8 (index 6)
27            {'w','x','y','z'}   // digit 9 (index 7)
28        };
29        
30        // Start backtracking
31        backtrack(result, new StringBuilder(), digits, mapping, 0);
32        
33        return result;
34    }
35    
36    private void backtrack(List<String> result, StringBuilder current, 
37                          String digits, Character[][] mapping, int index) {
38        // Base case: if we've processed all digits
39        if (index == digits.length()) {
40            result.add(current.toString());
41            return;
42        }
43        
44        // Get the current digit and its corresponding letters
45        int digit = digits.charAt(index) - '0';
46        Character[] letters = mapping[digit - 2]; // digit 2 maps to index 0, digit 3 to index 1, etc.
47        
48        // Try each letter for the current digit
49        for (int i = 0; i < letters.length; i++) {
50            // Choose
51            current.append(letters[i]);
52            
53            // Explore - move to next digit
54            backtrack(result, current, digits, mapping, index + 1);
55            
56            // Unchoose (backtrack)
57            current.deleteCharAt(current.length() - 1);
58        }
59    }
60}