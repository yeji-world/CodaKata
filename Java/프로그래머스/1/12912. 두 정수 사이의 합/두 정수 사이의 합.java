class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (a>b) {
            int temp = b;
            b = a;
            a = temp;
        } 
        for (int i=a; i<=b; i++) {
            answer += i;
        }
        if (a==b) {
            answer = a;
        }
        return answer;
    }
}