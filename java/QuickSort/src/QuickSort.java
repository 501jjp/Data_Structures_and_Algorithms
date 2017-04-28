import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author jjp
 * øÏÀŸ≈≈–Ú
 */
public class QuickSort {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String strs[] = str.split(" ");
		ArrayList num = new ArrayList();
		for(int i=0;i<strs.length;i++){
			num.add(Integer.parseInt(strs[i]));
		}
		
		ArrayList an = quickSort(num);
		
		for(int i=0;i<an.size();i++){
			System.out.print(an.get(i)+" ");
		}
	}
	
	public static ArrayList quickSort(ArrayList num){
		ArrayList left = new ArrayList();
		ArrayList right = new ArrayList();
		
		if(num.size()<=1){
			return num;
		}
		
		for(int i=1;i<num.size();i++){			
			if((int)num.get(i)<(int)num.get(0)){
				left.add(num.get(i));
			}else{
				right.add(num.get(i));
			}
		}
		
		ArrayList left1 = quickSort(left);
		ArrayList right1 = quickSort(right);
		
		left1.add(num.get(0));
		left1.addAll(right1);
		return left1;
	}

}
