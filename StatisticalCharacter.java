package niuketest;
/**
 * 题目描述
 * 		给定一个英文字符串,请写一段代码找出这个字符串中首先出现三次的那个英文字符。
 * 输入描述:
 * 		输入数据一个字符串，包括字母,数字等。
 * 输出描述:
 * 		输出首先出现三次的那个英文字符
 * 示例1
 * 输入
 * 		Have you ever gone shopping and
 * 输出
 * 		e
 * 
 * 
 * @author lilingyun
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StatisticalCharacter {
	public static void main(String[] args) {
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		Scanner in=new Scanner(System.in);

			char[] arr=in.nextLine().toCharArray();
			List<Character> list=new ArrayList<>();
			for(int i=0;i<arr.length;i++){
				if((arr[i]>='a'&&arr[i]<='z')||(arr[i]>='A'&&arr[i]<='Z'))	list.add(new Character(arr[i]));
			}
			System.out.println(list);
			for(int i=0;i<list.size();i++){
				Character character=list.get(i);
				if (!map.containsKey(character)) {
					map.put(character, new Integer(1));
					continue;
				}else {
					int j=map.get(character);
					if(j==2){
						System.out.println(character);
						break;
					}
					map.put(character, new Integer(j+1));
				}
				
			}

	}
}
