package interview;

import java.util.Scanner;

public class hex
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请出入一个十进制数");
		int x = sc.nextInt();
		System.out.println(x + "的十六进制结果是：" + Integer.toHexString(x));
	}
}