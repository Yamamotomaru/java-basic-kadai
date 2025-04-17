package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	public void dic(String[] fruit) {
	HashMap<String,String> jisyo = new HashMap<String,String>();
	jisyo.put("apple","りんご");
	jisyo.put("peach","桃");
	jisyo.put("banana","バナナ");
	jisyo.put("lemon","レモン");
	jisyo.put("pear","梨");
	jisyo.put("kiwi","キウィ");
	jisyo.put("strawberry","いちご");
	jisyo.put("grape","ぶどう");
	jisyo.put("muscat","マスカット");
	jisyo.put("cherry","さくらんぼ");
	
	
		
	for (int i = 0;i<fruit.length;i++) {
		String result ="";
		result = jisyo.get(fruit[i]);
		
		if(result == null) {
			System.out.println(fruit[i]+ "は辞書に存在しません");
		}else {
			System.out.println(fruit[i]+"の意味は"+result+"です");
		}
		
	}
	}

}
