package niuketest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
/**
 * 题目描述
 * 设有n个正整数，将他们连接成一排，组成一个最大的多位整数。
 * 如:n=3时，3个整数13,312,343,连成的最大整数为34331213。
 * 如:n=4时,4个整数7,13,4,246连接成的最大整数为7424613。
 * 
 * 输入描述:
 * 有多组测试样例，每组测试样例包含两行，第一行为一个整数N（N<=100），第二行包含N个数(每个数不超过1000，空格分开)。
 * 
 * 输出描述:
 * 每组数据输出一个表示最大的整数。
 * 
 * 
 * 示例1
 * 输入
 * 
 * 2
 * 12 123
 * 
 * 4
 * 7 13 4 246
 * 
 * 输出
 * 
 * 12312
 * 
 * 7424613
 * 
 * @author lly
 *
 */
public class ShuChuan {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        String[] arr=new String[n];
        for (int i = 0; i < n; i++) {
			arr[i]=in.nextInt()+"";
		}

//        System.out.println(arr.length);
        Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				String s1=o1+o2;
				String s2=o2+o1;
				
				return s1.compareTo(s2);
			}
		});
        StringBuffer sBuffer=new StringBuffer();
        for (int i=n;i>0;i--) {
//        	System.out.println(string);
			sBuffer.append(arr[i-1]);
		}
        System.out.println(sBuffer);
	}
	
}
