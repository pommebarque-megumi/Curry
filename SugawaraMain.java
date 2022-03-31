import java.util.*;
public class SugawaraMain{
	public static void main(String[] args){
		String[] curry = {"ポーク","ビーフ","チキン"};
		final String[] TOPPINGS ={
			"大根",
			"セロリ",
			"里芋",
			"カブ",
			"ゴーヤ",
			"キュウリ",
			"カツオのたたき",
			"ラム肉",
			"鯖の水煮",
			"ブリ",
			"タコ",
			"ちくわ",
			"魚肉ソーセージ",
			"こんにゃく",
			"ツナ缶",
			"納豆",
			"アボガド",
			"レーズン",
			"あげ玉",
		};

		//質問をしてカレーのベースを決める
		System.out.print("カレーのベースを選んでください ポーク:0,ビーフ:1,チキン:2>>");
		int base =new Scanner(System.in).nextInt();

		//トッピングが何種類かを聞く
		System.out.print("トッピングは何種類にしますか？0～19>>");
		int topping =new Scanner(System.in).nextInt();
		//トッピング配列をシャッフル
		for(int i=0 ; i<TOPPINGS.length ; i++){
			int pickup = new Random().nextInt(TOPPINGS.length-i)+i;
			String temp = TOPPINGS[pickup];
			TOPPINGS[pickup] = TOPPINGS[i];
			TOPPINGS[i] = temp;
		}
		//トッピング数だけ、配列の頭から取り出しながら文字列連結
		String pickupTopping="";
		for(int i=0; i<topping ; i++){
			pickupTopping+=TOPPINGS[i];
		}

		//結果を表示する
		System.out.printf("今夜のかれーは・・・%sのせ%sカレーです。",pickupTopping,curry[base]);
	}
}
