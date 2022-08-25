package p01;

public class MinMaxPronlem {
	
	public static void main(String[] args) {
		int[] numbers = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
		
		//처음에 잇는 값을 max와 min으로 두고, 마지막 숫자까지 비교하면서 값을 change
		int min = numbers[0];
		int max = numbers[0];
		int minPos = 0;
		int maxPos = 0;
		
		for(int i=1; i<numbers.length; i++) {
			if(min > numbers[i]) {
				min = numbers[i];
				minPos = i+1;
			}
			
			if(max < numbers[i]) {
				max = numbers[i];
				maxPos = i+1;
			}
		}
		
		System.out.println("가장 작은 수는 " + min +"이고, 위치는 " + minPos + "번째 입니다.");
		System.out.println("가장 큰 수는 " + max +"이고, 위치는 " + maxPos + "번째 입니다.");
		
		
		
	}

}
