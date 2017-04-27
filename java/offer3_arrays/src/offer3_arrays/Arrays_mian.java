package offer3_arrays;

public class Arrays_mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays search = new Arrays();
		int m = 1;
		int arr[][] = new int[10][10];
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				arr[i][j] = m++;
			}
		}
		
		boolean anwser = search.cin(arr, -1);
		System.out.println(anwser);
	}

}
