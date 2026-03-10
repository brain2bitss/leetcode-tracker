// Last updated: 3/10/2026, 12:48:04 PM
1class Solution {
2    public List<String> letterCombinations(String digits) {
3        List<String> result = new ArrayList<>();
4        
5        if (digits == null || digits.length() == 0) {
6            return result;
7        }
8        
9        for (int i = 0; i < digits.length(); i++) {
10            char c = digits.charAt(i);
11            if (c == '1') {
12                return result; 
13            }
14        }
15
16        Character[][] mapping = {
17            {'a','b','c'},      // digit 2 (index 0)
18            {'d','e','f'},      // digit 3 (index 1)
19            {'g','h','i'},      // digit 4 (index 2)
20            {'j','k','l'},      // digit 5 (index 3)
21            {'m','n','o'},      // digit 6 (index 4)
22            {'p','q','r','s'},  // digit 7 (index 5)
23            {'t','u','v'},      // digit 8 (index 6)
24            {'w','x','y','z'}   // digit 9 (index 7)
25        };
26        
27        backtrack(result, new StringBuilder(), digits, mapping, 0);
28        
29        return result;
30    }
31    
32    private void backtrack(List<String> result, StringBuilder current, 
33                          String digits, Character[][] mapping, int index) {
34        if (index == digits.length()) {
35            result.add(current.toString());
36            return;
37        }
38        
39
40        int digit = digits.charAt(index) - '0';
41        Character[] letters = mapping[digit - 2]; 
42        
43        for (int i = 0; i < letters.length; i++) {
44            current.append(letters[i]);
45            
46            backtrack(result, current, digits, mapping, index + 1);
47            
48            current.deleteCharAt(current.length() - 1);
49        }
50    }
51}