package labproject2;


import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) throws Exception {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("enter the list of transaction array");
			int size = s.nextInt();
			int arr[] = new int[size];
			System.out.println("enter the value of array");
			for(int i=0; i<size; i++) {
				arr[i] = s.nextInt();
}
System.out.println("enter the total no of targets that needs to be achieved");
int targetNo = s.nextInt();
int flag = 0;
while(targetNo-- != 0) {
			
			long target;
			System.out.println("enter the value of target");
			target = s.nextInt();
			long sum = 0;
			for(int i = 0; i<size; i++)
				sum += arr[i];
			if (sum>=target) {
				System.out.println("Target achieved after transactions");
				flag = 1;
				break;
				
			}
			
}

if(flag == 0) {
			System.out.println("Given target is not acheived");
}
		}
}
}
