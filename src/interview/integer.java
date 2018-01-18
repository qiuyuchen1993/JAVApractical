package interview;

public class integer
{

	public static void main(String[] args)
	{
		Integer a = new Integer(3);
		Integer b = 3; // 将3自动装箱成Integer类型
		int c = 3;
		System.out.println(a == b); // false 两个引用没有引用同一对象
		System.out.println(a == c); // true a自动拆箱成int类型再和c比较

		Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;

		System.out.println(f1 == f2);
		System.out.println(f3 == f4);

		// intern
		String a1 = "b";
		String b1 = "b";

		System.out.println(a1 == b1);

		String c1 = "d";
		String d1 = new String("d").intern();
		System.out.println(c1 == d1);

		//
		String s1 = "ab123";
		String s2 = new String("ab123");
		System.out.println(s1 == s2);
		String s3 = s2.intern();
		System.out.println(s1 == s3);
	}
}