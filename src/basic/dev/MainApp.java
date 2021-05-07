package basic.dev;
/**
 * lab 07
 * @author TranQuocHuy
 *
 */
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * cau a
		 */
		int a = 0;
		int sum = 0;
		while (a <= 100) {
			sum += a ;
			a++ ;
		}
		System.out.println("tong = " +sum);
		//cau b
		int S = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so n = ");
		int n = sc.nextInt();
		
		for(int i = 0 ; i <= n ; i++) {
			if(i%3 == 0) {
				S +=i;
			}
		}
		
		System.out.println("Tong cac so chia het cho 3 nho hon n la: " + S);
		//Fibonacci
		long number1 =0 ;
		long number2 =1 ;
		System.out.println("100 so Fibonaci dau tien la:");
		for(int i = 1; i<=100; i++) {
			System.out.printf("%d\t ",number1);
			long sumNumber1Number2 = number1 + number2;
			number1 = number2;
			number2 = sumNumber1Number2;
		//polinom
	int m,rv,temp,mod;
			
			Scanner Scan = new Scanner(System.in);
			
			System.out.printf("\nNhap vao so m = "); m = Scan.nextInt();
			
			temp = m; rv = 0;
			
		    while (m > 0) {
		    	   mod = m % 10;
		    	   m = m / 10;
		    	   rv= rv * 10 + mod;
		    }
		    
		    if (rv==temp) {
		    	System.out.printf("So %d la so Polinom",temp); 
		    } else {
		                  System.out.printf("So %d kp la so Polinom",temp);
		               //tong cac so tu 100-999 co tong 3 chu so chia het cho 3   
		                int tempMod = 0;
		      			int tempDiv = 0;
		      			int M  = 0;
		      			System.out.println("\nCac so tu 100 - 999 co tong cac chu so chia het cho 3 la:");
		      			
		      			for(int i1 = 100; i1 < 1000 ; i1++) {
		      				tempDiv = i1;
		      				sum = 0;
		      				
		      				while(tempDiv > 0 ) {	
		      				    tempMod = tempDiv%10;
		      				    tempDiv = tempDiv/10;
		      				    sum +=tempMod;
		      				}
		      				
		      				
		      				if(sum%3 == 0) {
		      					System.out.printf(String.format("%d\t",i1));
		      				}
		      				
		      			}
		      }
		}
		
	}
}
