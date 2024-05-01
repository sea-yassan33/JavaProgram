package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArray2311 {
	
	public static void main(String[] args) {
		/*
		 * 配列を利用して格納する方法
		 */
		String[] arrayList = arrayFunc();
		System.out.println("▼▼▼配列を利用して格納する方法▼▼▼");
		System.out.println(arrayList[2]);
		
		/*
		 * 配列を利用して格納する方法2
		 */
		String[] arrayList2 = arrayFunc2();
		System.out.println("▼▼▼配列を利用して格納する方法2▼▼▼");
		System.out.println(arrayList2[2]);
		
		/*
		 * 配列からリスト型へ変換する方法
		 */
		List<String> listStr = listFunc();
		System.out.println("▼▼▼配列からリスト型へ変換する方法▼▼▼");
		System.out.println(listStr.get(3));
		
		/*
		 * 一度にリストに格納する方法
		 */
		List<String> listStr2 = listFunc2();
		System.out.println("▼▼▼一度にリストに格納する方法▼▼▼");
		System.out.println(listStr2.get(2));
	}
	
	public static String[] arrayFunc() {
		String[] arrayStr = new String[3];
		
		//配列の要素に値を代入
		arrayStr[0] = "配列1番目";
		arrayStr[1] = "配列2番目";
		arrayStr[2] = "配列3番目";
		
		return arrayStr;
	}
	
	public static String[] arrayFunc2() {
		//配列を準備
		String[] arrayList = new String[] {
				"配列1番目",
				"配列2番目",
				"配列3番目",
		};
		return arrayList;
	}
	
	public static List<String> listFunc() {
		//配列を準備
		String[] array = new String[3];
		array[0] = "配列1番目";
		array[1] = "配列2番目";
		array[2] = "配列3番目";
			
		// 配列からリストへ変換
		List<String> listStrings = new ArrayList<>(Arrays.asList(array));
			
		// リスト型に追加
		listStrings.add("追加:配列4番目");
		
		return listStrings;
	}
	
	public static List<String> listFunc2() {
		//リストの生成
		List<String> listStrings = new ArrayList<>(Arrays.asList("配列1","配列2","配列3"));
		return listStrings;
	}
}
