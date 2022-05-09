package session3;

import java.util.Iterator;

public class Hour2 {
	
	public static boolean isPrimeNumber(int num) {
		boolean res = false;
		int i =0, flag = 0;
		if(num == 0 || num == 1 ) {
			res = false;
		} else {
			for(i=2; i<=num/2;i++) {
				if (num%i == 0) {
					res = false;
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				res = true;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12;
		System.out.println(isPrimeNumber(n));
		int a = 32768;
		a++;
		System.out.println(a);
	}

}
