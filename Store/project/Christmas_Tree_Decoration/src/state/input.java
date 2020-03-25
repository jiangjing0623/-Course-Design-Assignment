package state;

import java.util.Scanner;

//防止System.in二次调用时关闭
public class input {
	public static int input(){
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	return t;
	
}
}
