package offer3_arrays;

public class Arrays {
	private int arr[][];
	
	public boolean cin(int a[][],int nu)
	{
		this.arr = a;
		int i = 0;
		int j = arr[0].length-1;
		
		while(i<arr.length&&j>=0){
			int u = i;
			int v = j;
			if(nu==arr[u][v]){
				return true;
			}
			
			if(nu>arr[u][v]){
				i++;
			}
			
			if(nu<arr[u][v]){
				j--;
			}
		}
		return false;
	}
}
