package daily_code;
import java.util.*;

//1.2.4 ���д�����ӡ��ʲô��
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
//	    System.out.println("s3=s4֮��");
//	    System.out.println("s3="+s3);
//	    System.out.println("s4="+s4);
//	    s4="qweassd";
//	    System.out.println("s4=qweass֮��");
//	    System.out.println("s3="+s3);
//	    System.out.println("s4="+s4);	 //string�ĸ�ֵ�������ַ�����ֵ�������ַ���ָ�롣
//
//	}
//
//}

//1.2.6����ַ���s�е��ַ�ѭ���ƶ�����λ��֮���ܹ��õ���һ���ַ���t����ôs����Ϊt�Ļػ���λ��circular rotation����
//���磬ACTGACG����TGACGAC��һ���ػ���λ����֮��Ȼ���ж���������ڻ��������е��о����Ǻ���Ҫ�ġ�
//��дһ�������������������ַ���s��t�Ƿ�ΪԲ����λ��
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

//1.2.7���µݹ麯���ķ���ֵ��ʲô��
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
}	//����ֵ�ǰ��ַ������������





























