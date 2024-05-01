package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList2311 {
	public static void main(String[] args) {
		/*
		 * Mapの格納方法
		 */
		System.out.println("▼▼▼Mapの格納方法▼▼▼");
		Map<String, Integer> map = mapFunc();
		System.out.println(map);
		System.out.println(map.get("a"));
		
		/*
		 * Mapでリストを格納する方法
		 */
		System.out.println("▼▼▼Mapでリストを格納する方法▼▼▼");
		Map<String, List<Integer>> map2 = mapFunc2();
		System.out.println(map2);
		System.out.println(map2.get("aList").get(3));
	}
	
	public static Map<String, Integer> mapFunc() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// キーと値のペアを追加
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		
		return map;
	}
	
	public static Map<String, List<Integer>> mapFunc2() {
		Map<String, List<Integer>> map = new HashMap<>();
		String keyStr = "aList"; 
		
		//配列を作成して値を格納
		ArrayList<Integer> listA = new ArrayList<>(Arrays.asList(1,2,3));
		//mapに配列を格納する。
		map.put(keyStr, listA);
			
		//リストへの要素の追加と再度のマップへの追加
		ArrayList<Integer> addList = new ArrayList<>(map.get(keyStr));
		addList.add(4);
		map.put(keyStr, addList);
		
		return map;
	}
}
