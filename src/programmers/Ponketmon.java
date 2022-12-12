package programmers;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ponketmon {
    public static void main(String[] args){
        int[] nums = {3,1,2,3};
        System.out.println(solution(nums));
    }

    public static int solution(int[] nums){
        int answer = 0;

        answer = (int)Math.min(nums.length/2, Arrays.stream(nums).distinct().count());

        return answer;
    }
}
