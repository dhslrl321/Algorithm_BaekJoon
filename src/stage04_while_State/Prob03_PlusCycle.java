package stage04_while_State;

import java.util.Scanner;
/*
*  좋은 문제
*  수학적 논리가 부족해서 값의 흐름을 추적하기가 어려움.
* */
public class Prob03_PlusCycle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int inputNum = input.nextInt();

        int left, right, compNum = 0, count = 0;

        left = inputNum / 10;
        right = inputNum % 10;

        while(inputNum != compNum){
            compNum = left * 10 + right;

        }
    }
}
