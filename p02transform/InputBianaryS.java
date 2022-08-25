package p02transform;

import java.util.Arrays;
import java.util.Scanner;

public class InputBianaryS {
	public static void main(String[] args) {
		
		int[] numbers = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};
			
			
			int target = 0;
			int left = 0;
			int right = numbers.length - 1;
			int mid = (left + right)/2;
			
			int temp = numbers[mid]; //비교되는 수; 훨씬 코드가 간편해질 수 있다.
			boolean find = false; //예외처리에 이용할 수 있다.
			
			Scanner sc = new Scanner(System.in);
			System.out.println(Arrays.toString(numbers));
			System.out.println("다음 배열 중 숫자를 입력하세요: ");
			target = sc.nextInt();
			
			
			while(left < right) {
				
				if(temp == target) {
					find = true;
					break;
					
				}
				else if(temp < target) {
					left = mid+1;
				}
				else {
					right = mid-1;
				}
				
				mid = (left + right)/2;
				temp = numbers[mid];
			}
			
			
			if(find = true) {
				mid++;
				System.out.println(target + "의 위치는 " + mid +"번째 입니다.");
			}
			else {
				System.out.println("찾으시는 수가 존재하지 않습니다.");
			}
	}
}
