package p03h;
//고치기, 수정필요
public class heapSort {

	private int SIZE;
	private int heapArr[];
	
	public heapSort() {
		SIZE = 0;
		heapArr = new int[50];
	}
	
	
	public void insertionHeap(int input) {
		int i = ++SIZE;
		while((i != 1) && input < heapArr[i/2]) {
			heapArr[i] = heapArr[i/2] ;
			i /= 2;
			
		}
		heapArr[i] = input;
	}
	
	public int getHeapSize()
	{
		return SIZE;
	}

	
	public int deleteHeap() {
		
		int parent, child;
		int temp, data;
		data = heapArr[1];
		
		temp = heapArr[SIZE];		
		SIZE -= 1;
		parent = 1; child = 2;
		
				
		while (child <= SIZE) {
			if((child<SIZE)&&(heapArr[child] > heapArr[child + 1])){
				child++;
			}
			
			if(temp < heapArr[child]) break;
			
			heapArr[parent] = heapArr[child];
			parent = child;
			child *= 2;
		}
		
		heapArr[parent] = temp;
		return data;
	}
	
	public void printHeap(){
		System.out.println("====MIN HEAP====");
		for(int i=1; i<=SIZE; i++) {
			System.out.printf("[%d]", heapArr[i]);
		}
	}
	public static void main(String[] args) {
		heapSort h = new heapSort();
		h.insertionHeap(80);
		h.insertionHeap(50);
		h.insertionHeap(30);
		h.insertionHeap(70);
		h.insertionHeap(40);
		h.insertionHeap(10);
		h.insertionHeap(60);
		h.insertionHeap(20);
		
		h.printHeap();
		int n, data;
		n = h.getHeapSize();
		for(int i=1; i<=n; i++){    
			data = h.deleteHeap();  
			System.out.printf("\n 출력 : [%d]", data);
		}

	}

}
