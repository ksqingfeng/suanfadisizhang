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



////1.1.5编写一段程序，如果double 类型的变量x 和y 都严格位于0 和1 之间则打印true，否则打印false。
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

////1.1.6 下面这段程序会打印出什么？
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


//1.1.7 分别给出以下代码段打印出的值：
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
//}	//相当于计算1到999的所有数相加和。

//public class Chapter_1 {
//
//	public static void main(String[] args) {
//		int sum = 0;
//		for (int i = 1; i < 1000; i *= 2)	//2的10次方就1024，因此这一层从2的0次方到2的9次方，循环10次
//			for (int j = 0; j < 1000; j++)	//循环1000次
//				sum++;
//		System.out.println(sum);			
//	}
//}

//1.1.8 下列语句会打印出什么结果？给出解释。
//public class Chapter_1 {
//
//	public static void main(String[] args) {
//		System.out.println('b');
//		System.out.println('b' + 'c');
//		System.out.println((char) ('a' + 4));	
//	}
//}

//1.1.9 编写一段代码，将一个正整数N 用二进制表示并转换为一个String 类型的值s。
//解答：Java 有一个内置方法Integer.toBinaryString(N) 专门完成这个任务，但该题的目的就是给出这个方法的其他实现方法。
//下面就是一个特别简洁的答案：
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

////1.1.10 下面这段代码有什么问题？
//public class Chapter_1 {
//
//	public static void main(String[] args) {
//		int[] a;
//		for (int i = 0; i < 10; i++)
//		a[i] = i * i;
//	}
//}
////解答：它没有用new 为a[] 分配内存。这段代码会产生一个variable a might not have
////been initialized 的编译错误。


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





























