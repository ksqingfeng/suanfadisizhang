package Chapter_1;
import java.util.*;
//
//public class Chapter_1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		double y=1.0/0.0;
//		Scanner in=new Scanner(System.in);
//		int a=in.nextInt();
//		int b=in.nextInt();
//		int c=in.nextInt();
//		if(a==b&&b==c)
//			System.out.println("equal");
//		else
//			System.out.println("not equal");
////		System.out.println("hello world");
////		System.out.println(y);
////		System.out.println(new Date());
//	}
//}



////1.1.5��дһ�γ������double ���͵ı���x ��y ���ϸ�λ��0 ��1 ֮�����ӡtrue�������ӡfalse��
//public class Chapter_1
//{
//	public static  void main(String[] args)
//	{
//		double x;
//		double y;
//		Scanner in=new Scanner(System.in);
//		x=in.nextDouble();
//		y=in.nextDouble();
//		System.out.println(compare(x)&& compare(y));
//	}
//public static boolean compare(double x)
//	{
//	if(x>0&&x<1)
//		return  true;
//	else 
//		return   false;
//	}
//}

////1.1.6 ������γ�����ӡ��ʲô��
//public class Chapter_1 {
//
//	public static void main(String[] args) {
//		int f = 0;
//		int g = 1;
//		for (int i = 0; i <= 15; i++)
//		{
//		System.out.println(f);  //f=0,1,1,2,3,5,8...
//		f = f + g;						//f=1,1,2,3,5,8,13...
//		g = f - g;						//g=0,1,1,2,3,5,,8...
//		}
//	}
//}


//1.1.7 �ֱ�������´���δ�ӡ����ֵ��
//public class Chapter_1 {
//
//	public static void main(String[] args) {
//		double t = 9.0;
//		while (Math.abs(t - 9.0/t) > .001)
//			t = (9.0/t + t) / 2.0;
//		System.out.println(t);
//	}
//}

//public class Chapter_1 {
//
//	public static void main(String[] args) {
//		int sum = 0;
//		int sun=0;
//		for (int i = 1; i < 1000; i++)
//			for (int j = 0; j < i; j++)
//				sum++;
//		System.out.println(sum);			
//	}
//}	//�൱�ڼ���1��999����������Ӻ͡�

//public class Chapter_1 {
//
//	public static void main(String[] args) {
//		int sum = 0;
//		for (int i = 1; i < 1000; i *= 2)	//2��10�η���1024�������һ���2��0�η���2��9�η���ѭ��10��
//			for (int j = 0; j < 1000; j++)	//ѭ��1000��
//				sum++;
//		System.out.println(sum);			
//	}
//}

//1.1.8 ���������ӡ��ʲô������������͡�
//public class Chapter_1 {
//
//	public static void main(String[] args) {
//		System.out.println('b');
//		System.out.println('b' + 'c');
//		System.out.println((char) ('a' + 4));	
//	}
//}

//1.1.9 ��дһ�δ��룬��һ��������N �ö����Ʊ�ʾ��ת��Ϊһ��String ���͵�ֵs��
//���Java ��һ�����÷���Integer.toBinaryString(N) ר�����������񣬵������Ŀ�ľ��Ǹ����������������ʵ�ַ�����
//�������һ���ر���Ĵ𰸣�
//public class Chapter_1 {
//
//	public static void main(String[] args) {
//		Scanner in=new Scanner(System.in);
//		int N=in.nextInt();
//		String s = "";
//		for (int n = N; n > 0; n /= 2)
//			s = (n % 2) + s;
//		System.out.println(s);
//	}
//}

////1.1.10 ������δ�����ʲô���⣿
//public class Chapter_1 {
//
//	public static void main(String[] args) {
//		int[] a;
//		for (int i = 0; i < 10; i++)
//		a[i] = i * i;
//	}
//}
////�����û����new Ϊa[] �����ڴ档��δ�������һ��variable a might not have
////been initialized �ı������


public class Chapter_1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		String s = "";
		for (int n = N; n > 0; n /= 2)
			s = (n % 2) + s;
		System.out.println(s);
		
	}
}





























