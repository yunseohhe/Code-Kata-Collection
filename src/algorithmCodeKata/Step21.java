package algorithmCodeKata;

class Solution21 {
    public boolean solution(int x) {
        boolean answer = true;
        String[] arr = String.valueOf(x).split("");

        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        if(x % sum == 0) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}
