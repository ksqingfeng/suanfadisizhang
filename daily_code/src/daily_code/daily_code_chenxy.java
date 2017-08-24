package daily_code;
import java.util.*;

//1.2.4 下列代码会打印出什么？
//public class daily_code_chenxy {
//
//	public static void main(String[] args) {
//////		double f=1.23456789;
//////		System.out.print(String.format("%.6f",f));
////		String s1="hello world";
////		String s2=s1;
//////		s2=s1;
////		System.out.println(s1);
////		System.out.println(s2);
////		s1="that";
////		System.out.println(s1);
////		System.out.println(s2);
//		String s3=new String("abc");
//		String s4=new String("123");
//	    System.out.println("s3="+s3);
//	    System.out.println("s4="+s4);
//	    s3=s4;
//	    System.out.println("s3=s4之后：");
//	    System.out.println("s3="+s3);
//	    System.out.println("s4="+s4);
//	    s4="qweassd";
//	    System.out.println("s4=qweass之后：");
//	    System.out.println("s3="+s3);
//	    System.out.println("s4="+s4);	 //string的赋值赋的是字符串的值而不是字符串指针。
//
//	}
//
//}

//1.2.6如果字符串s中的字符循环移动任意位置之后能够得到另一个字符串t，那么s被称为t的回环变位（circular rotation）。
//例如，ACTGACG就是TGACGAC的一个回环变位。反之亦然。判定这个条件在基因组序列的研究中是很重要的。
//编写一个程序检查两个给定的字符串s和t是否互为圆环变位。
//public class daily_code_chenxy {
//
//	public static void main(String[] args) {
//		
//		String s = "abcdefg";  
//        String t = "bcdefga";  
//        if (s.length() == t.length() && s.concat(s).indexOf(t) != -1)  
//        {  
//            System.out.println("Yes");  
//        }  
//        else  
//        {  
//            System.out.println("No");  
//        }  
//	}
//}

//1.2.7以下递归函数的返回值是什么？
//public static String mystery(String s)  
//{  
//    int n = s.length();  
//    if (n <= 1) return s;  
//    String a = s.substring(0, n/2);  
//    String b = s.substring(n/2, n);  
//    return mystery(b) + mystery(a);  
//}  
public class daily_code_chenxy {
	public static String mystery(String s)  
    {  
        int n = s.length();  
        if (n <= 1) return s;  
        String a = s.substring(0, n/2);  
        String b = s.substring(n/2, n);  
        return mystery(b) + mystery(a);  
    }  

	public static void main(String[] args) {
		System.out.println(mystery("abcd"));
		System.out.println(mystery("qwer"));
	}
}	//返回值是把字符串倒序输出。





























