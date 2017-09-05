package niuketest;
/**
 * 题目描述
 * 继MIUI8推出手机分身功能之后，MIUI9计划推出一个电话号码分身的功能：首先将电话号码中的每个数字加上8取个位，然后使用对应的大写字母代替 （"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"）， 然后随机打乱这些字母，所生成的字符串即为电话号码对应的分身。
 * 输入描述:
 * 第一行是一个整数T（1 ≤ T ≤ 100)表示测试样例数；接下来T行，每行给定一个分身后的电话号码的分身（长度在3到10000之间）。
 * 输出描述:
 * 输出T行，分别对应输入中每行字符串对应的分身前的最小电话号码（允许前导0）。
 * 示例1
 * 输入
 * 
 * 4
 * EIGHT
 * ZEROTWOONE
 * OHWETENRTEO
 * OHEWTIEGTHENRTEO
 * 输出
 * 
 * 0
 * 234
 * 345
 * 0345
 * 
 * 
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class DianhuahaomaFensheng{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     
        int n=sc.nextInt();
        String[] ss=new String[n];
        for(int i=0;i<n;i++){
            ss[i]=sc.next();
        }
        for(int j=0;j<n;j++){
            parse(ss[j]);
        }
    }
 
    private static void parse(String s) {
        // TODO Auto-generated method stub
        StringBuilder sb=new StringBuilder(s);
        List<String> list=new ArrayList<String>();
        while(sb.lastIndexOf("Z")!=-1){
            sb.deleteCharAt(sb.lastIndexOf("Z"));
            sb.deleteCharAt(sb.lastIndexOf("E"));
            sb.deleteCharAt(sb.lastIndexOf("R"));
            sb.deleteCharAt(sb.lastIndexOf("O"));
            list.add("2");
             
        }
        while(sb.lastIndexOf("W")!=-1){
            sb.deleteCharAt(sb.lastIndexOf("T"));
            sb.deleteCharAt(sb.lastIndexOf("W"));
            sb.deleteCharAt(sb.lastIndexOf("O"));
             
            list.add("4");
             
        }
        while(sb.lastIndexOf("U")!=-1){
            sb.deleteCharAt(sb.lastIndexOf("F"));
            sb.deleteCharAt(sb.lastIndexOf("O"));
            sb.deleteCharAt(sb.lastIndexOf("U"));
            sb.deleteCharAt(sb.lastIndexOf("R"));
            list.add("6");
             
        }
        while(sb.lastIndexOf("X")!=-1){
            sb.deleteCharAt(sb.lastIndexOf("S"));
            sb.deleteCharAt(sb.lastIndexOf("I"));
            sb.deleteCharAt(sb.lastIndexOf("X"));
             
            list.add("8");
             
        }
        while(sb.lastIndexOf("G")!=-1){
            sb.deleteCharAt(sb.lastIndexOf("E"));
            sb.deleteCharAt(sb.lastIndexOf("I"));
            sb.deleteCharAt(sb.lastIndexOf("G"));
            sb.deleteCharAt(sb.lastIndexOf("H"));
            sb.deleteCharAt(sb.lastIndexOf("T"));
            list.add("0");
             
        }
        while(sb.lastIndexOf("O")!=-1){
            sb.deleteCharAt(sb.lastIndexOf("O"));
            sb.deleteCharAt(sb.lastIndexOf("N"));
            sb.deleteCharAt(sb.lastIndexOf("E"));
            list.add("3");
             
        }
        while(sb.lastIndexOf("T")!=-1){
            sb.deleteCharAt(sb.lastIndexOf("T"));
            sb.deleteCharAt(sb.lastIndexOf("H"));
            sb.deleteCharAt(sb.lastIndexOf("R"));
            sb.deleteCharAt(sb.lastIndexOf("E"));
            sb.deleteCharAt(sb.lastIndexOf("E"));
            list.add("5");
             
        }
        while(sb.lastIndexOf("F")!=-1){
            sb.deleteCharAt(sb.lastIndexOf("F"));
            sb.deleteCharAt(sb.lastIndexOf("I"));
            sb.deleteCharAt(sb.lastIndexOf("V"));
            sb.deleteCharAt(sb.lastIndexOf("E"));
            list.add("7");
             
        }
        while(sb.lastIndexOf("S")!=-1){
            sb.deleteCharAt(sb.lastIndexOf("S"));
            sb.deleteCharAt(sb.lastIndexOf("E"));
            sb.deleteCharAt(sb.lastIndexOf("V"));
            sb.deleteCharAt(sb.lastIndexOf("E"));
            sb.deleteCharAt(sb.lastIndexOf("N"));
            list.add("9");
             
        }
        while(sb.lastIndexOf("N")!=-1){
            sb.deleteCharAt(sb.lastIndexOf("N"));
            sb.deleteCharAt(sb.lastIndexOf("I"));
            sb.deleteCharAt(sb.lastIndexOf("N"));
            sb.deleteCharAt(sb.lastIndexOf("E"));
            list.add("1");
             
        }
        Collections.sort(list);
        for (String str : list) {
            sb.append(str);
        }
        System.out.println(sb.toString());
         
    }
 
     
}
