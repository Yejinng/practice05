package prob1;

public class Sort {
	public static void main(String[] arg) {
		int array[] = { 5, 9, 3, 8, 60, 20, 1 };
		int temp = 0;
		int count = array.length;

		System.out.println("Before sort.");

		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		
		for (int j = i + 1; j < count; j++){
			if(array[j] <array[i]){
				int a = array[j];
				array[j]= array[i];
				array[i]=a;
			}
		}

			//
			// 선택 정렬 알고리즘이 적용된 코드를 여기에 작성합니다.
			//
		}
			System.out.println("\nAfter Sort.");

		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
