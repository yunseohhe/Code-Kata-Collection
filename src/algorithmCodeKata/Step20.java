package algorithmCodeKata;

import java.util.*;

class Solution20 {
    public long solution(long n) {
        long answer = 0;
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }

        return Long.valueOf(sb.reverse().toString());
    }
}