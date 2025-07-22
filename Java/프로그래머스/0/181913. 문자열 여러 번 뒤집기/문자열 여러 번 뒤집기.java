class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();
        for (int[] q: queries){
            int s = q[0], e = q[1];
            while (s < e) {
                char tmp = arr[s];
                arr[s++] = arr[e];
                arr[e--] = tmp;
            }
        } 
        return new String(arr);
    }
}