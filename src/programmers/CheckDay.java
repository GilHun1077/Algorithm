package programmers;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class CheckDay {
    public static void main(String[] args){
        System.out.println(solution(5,24));
    }

    public static String solution(int a, int b) {
        String answer = "";
        LocalDate ld = LocalDate.of(2016,a,b);
        answer = ld.getDayOfWeek().toString().substring(0,3);
        return answer;
    }
}
