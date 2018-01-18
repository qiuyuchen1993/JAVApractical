package interview;

import java.util.Scanner;

public class duplicate
{
	// 这是主方法
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String x = sc.next();
		System.out.println("结果是" + dub(x));
	}

	// 这是去除重复项的方法
	public static String dub(String a)
	{
		String b = "";// 用来输出的字符串
		int[] count = new int[a.length()];
		count[0] = 1;
		// count是用来标记是否有重复项的array，比如abbacc，
		// 那么count就是【1，1，0，0，1，0】，1代表第一次出现的，0是重复出现
		for (int i = 1; i < a.length(); i++)
		{
			for (int j = i - 1; j >= 0; j--)
			{ // 从后往前比较
				if (a.charAt(i) == a.charAt(j))
				{ // 如果有重复，那么标记0，并跳出循环
					count[i] = 0;
					break;
				} else
				{
					count[i] = 1;
				}
			}
		}

		// 根据count的array，来把独特项放到b中
		for (int k = 0; k < count.length; k++)
		{
			if (count[k] == 1)
			{
				b += a.charAt(k);
			}
		}

		return b;
	}
}