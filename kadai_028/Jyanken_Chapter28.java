package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	public  String  getMyChoice(){
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			
		System.out.println("自分のじゃんけんの手を入力しましょう\nグーはrockのrを入力しましょう\n チョキはscissorsのsを入力しましょう\nパーはpaperのpを入力しましょう");
		
		
		String input = scanner.nextLine();
		
		if(input.equals("r") || input.equals("s") || input.equals("p")) {
			scanner.close();
			return input;
			
		    }
		else{
			System.out.println("じゃんけんの手が正しくありません。再度じゃんけんの手を選んでください");
			}	
		
		
		}
		
		
	}
	
	public String getRandom(){
		String [] eneHand = new String[] {"r","s","p"};
		int ranNum =(int)Math.floor(Math.random()*3);
		return eneHand[ranNum];

	}
	public void playGame(/*String enemy,String player*/){
		
		HashMap<String,String> hand = new HashMap<String, String>();
		hand.put("r", "グー");
		hand.put("s", "チョキ");
		hand.put("p", "パー");
		
		String my = getMyChoice();
		String ene = getRandom();
		
		System.out.println("自分の手は"+hand.get(my)+",対戦相手の手は"+hand.get(ene));
		
		
		if(my.equals(ene)){
			System.out.println("あいこです");
		}
		else if(my.equals("p") && ene.equals("g")||my.equals("s") && ene.equals("r")||my.equals("r") && ene.equals("s")){
			System.out.println("あなたの勝ちです");	
			}
		else {
			System.out.println("あなたの負けです");	
			
		}
		
		
		

	}

}
