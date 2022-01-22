package ch02;

import java.util.Scanner;

public class BinarySearchProblem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};

        int target = sc.nextInt();

        int left = 0;
        int right = numbers.length-1;
        int mid = (left + right) / 2;

        int temp = numbers[mid];
        boolean find = false;

        while (left <= right) {
            if (target == temp) {   // 수를 찾은 경우
                find = true;
                break;
            } else if (target < temp) {     // 찾으려는 수가 더 작은 경우
                right = mid -1;
            } else {
                left = mid + 1;
            }
            mid = (left + right) / 2;
            temp = numbers[mid];
        }

        if (find == true) {
            mid++;
            System.out.println("찾는 수는 " + mid + "번 째에 있습니다.");
        } else {
            System.out.println("찾는 수가 없습니다.");
        }
    }
}
