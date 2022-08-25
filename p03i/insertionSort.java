package p03i;

public class insertionSort {
	public static void insertionRun(int[] arr1, int count) {
		int i = 0;
		int j = 0;
		int temp = 0;
		
		for(i = 1; i<count; i++) {
			temp = arr1[i];
			
			j=i;
			
			while(j>0 && arr1[j-1] > temp) {
				arr1[j] = arr1[j-1];
				j =j-1;
			}
			arr1[j] = temp;
		}
		
		System.out.println("반복 :" + i +"번");
		printSort(arr1,count);
	}
	
	public static void printSort(int[] arr2, int count) {
		
		int i = 0;
		for(i=0; i<count; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		// Insertion Sort의 기본 개념은 이미 정렬된 상태의 요소에 새로운 요소를 추가할 때 정렬하여 추가하는 개념이다
		// 두 번째 요소 부터 이전 요소들과 비교하면서 insert 될 위치를 찾아가며 정렬하는 알고리즘
		
		int[] arr = {80, 50, 70, 10, 60, 20, 40, 30 };
		int count = arr.length;
		
		insertionRun(arr, count);	
	}

}
