class Solution {
    public int[] solution(int[] num_list) {
        int l = num_list.length;
        int[] answer = new int[l+1];
        for (int i=0; i<l; i++){
            answer[i] = num_list[i];
        }
        answer[l] = (answer[l-1] > answer[l-2]) ? answer[l-1]-answer[l-2] : 2*answer[l-1] ;
        return answer;
    }
}