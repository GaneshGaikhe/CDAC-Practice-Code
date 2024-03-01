import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		/*
		 * ////////////remove the duplicate element int [] arr= {1,2,5,5,8,9,7,6,6,6,6};
		 * Arrays.sort(arr); int [] newarr=new int[arr.length]; int j=0; for(int
		 * i=0;i<arr.length-1;i++) { if(arr[i]!=arr[i+1]) { newarr[j]=arr[i]; j++; } }
		 * newarr[j]=arr[arr.length-1];
		 * 
		 * System.out.println(" ");
		 * 
		 * 
		 * for(int i=0;i<newarr.length;i++) { System.out.print (newarr[i]+" "); }
		 * 
		 * int k=0; for(int i=0;i<arr.length-1;i++) {
		 * 
		 * arr[k]=newarr[i]; k++;
		 * 
		 * } System.out.println(" ");
		 * 
		 * for(int i=0;i<newarr.length;i++) { System.out.print(arr[i]+" "); }
		 */

		/*
		 * //maximum from sorted array int [] arr= {1,2,99,5,60000,4,0,2,5,7,88,55};
		 * Arrays.sort(arr); System.out.println(arr[arr.length-1]);
		 */

		/*
		 * maximum from unsorted array int [] arr= {1,2,5,8,9,7000,46,9,96,999,8}; int
		 * max=0; for(int i=0;i<arr.length;i++) { if(max<arr[i]) { max=arr[i]; } }
		 * 
		 * System.out.println(max);
		 */

		/*
		 * //rever the array int [] arr= {1,2,5,0,8,0,8,9,6,5,6,5,100,99};
		 * 
		 * for(int i=0;i<arr.length;i++) { System.out.print(arr[i]+" "); }
		 * System.out.println(); for(int i=arr.length-1;i>=0;i--) {
		 * System.out.print(arr[i]+" "); }
		 */

		/*
		 * ////palindrone number Scanner sc=new Scanner(System.in);
		 * System.out.println("enter the number"); int num=sc.nextInt(); String
		 * chnum=String.valueOf(num); char [] ar=chnum.toCharArray(); int left=0; int
		 * right=ar.length-1; while(left<right) { if(ar[left]!=ar[right]) {
		 * System.out.println("not"); return ; } left++; right--; }
		 * System.out.println("yes");
		 */

		
		  ///////orrance of every number in array 
		int [] arr= {1,55,8,99,5,55,7,9,8,6,5};
		Arrays.sort(arr);
		int count=1; 
		for(int i=0;i<arr.length-1;i++)
		{ 
			if(arr[i]==arr[i+1]) 
			{ 
				count++; 
				continue; 
			}
		  System.out.println(arr[i]+"  "+count); }
		 

		/*
		 * int [] arr= {1,5,99,0,2,5}; int temp=0; for(int i=0;i<arr.length;i++) {
		 * for(int j=0;j<arr.length;j++) { if(arr[i]<arr[j]) { temp=arr[j];
		 * arr[j]=arr[i]; arr[i]=temp; } } }
		 * 
		 * 
		 * for(int i=0;i<arr.length;i++) { System.out.print(arr[i]+" "); }
		 */

		//int arr[] = { 1, 8, 99, 5, 6, 55, 333 };

	}

}
