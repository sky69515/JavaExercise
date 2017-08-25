package niuketest;

import java.util.Scanner;
/**
 * 题目描述
 * 		世界上有10种人，一种懂二进制，一种不懂。那么你知道两个int32整数m和n的二进制表达，有多少个位(bit)不同么？
 * 
 * 输入
* 		1999 2299
* 		
* 输出
* 		7
 * @author lenovo
 *
 * @param <T>
 */
public class Xiaomi_02 {
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while (in.hasNext()) {
			int m=in.nextInt();
			int n=in.nextInt();
//			Xiaomi_02 xiaomi_02=new Xiaomi_02();
//			xiaomi_02.print(xiaomi_02.gettTwo(n));	
			System.out.println(new Xiaomi_02().countBitDiff(m, n));
		}
	}
	/**
	 * 计算两个正整数的二进制表示有多个个bit不同
	 * @param m 正整数1
	 * @param n	正整数2
	 * @return	不同bit位总个数
	 */
	public int countBitDiff(int m, int n) {
        int[] temp1 = gettTwo(m);
        int[] temp2 = gettTwo(n);
        int sum=0;
        for(int i=0;i<32;i++){
            if(temp1[i]!=temp2[i]){
                sum++;
            }
        }
        return sum;
    }
    /**
     * 某个正整数的二进制表示
     * @param n  正整数
     * @return	表示n的二进制数组
     */
    private int[] gettTwo(int n){
    	int[] arr=new int[32];
    	for(int i=0;n!=0;i++,n=n/2){
    		arr[i]=n%2;
    	}
    	return arr;
    }
    
    
    private void print(int[] arr){
    	for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
    }
}
