import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {3, 13, 1, 4, 20};
		Bubble(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void Bubble(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}
}
