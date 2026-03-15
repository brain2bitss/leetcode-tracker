// Last updated: 3/15/2026, 2:34:49 PM
1class Solution {
2    public int strStr(String haystack, String needle) {
3
4        int len = needle.length();int result = -1;
5
6        if(haystack.length() < len){
7            return result;
8        }
9        for(int i = 0; i < haystack.length(); i++){
10            String new_string = haystack.substring(i,len);
11            if(new_string.equals(needle)){
12                result = i;
13                break;
14            }else{
15                len++;
16                if(len > haystack.length()){
17                    break;
18                }
19            }
20        }
21        return result;
22    }
23}