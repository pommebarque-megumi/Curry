import java.util.*;
public class KimuraMain{
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
		System.out.println("今夜のカレーを決めます。");
		System.out.print("ベースとなるカレーを選択してください0:ポーク,1:ビーフ,2:チキン>");
		int base = new Scanner(System.in).nextInt();
		String base_curry = "";
		switch(base){
			case 1:
				base_curry = "ビーフ";
				break;
			case 2:
				base_curry = "チキン";
				break;
			default:
				base_curry = "ポーク";
		}
		//トッピングが何種類かを聞く
		System.out.printf("トッピングは何種類?>");
		int top_num = new Scanner(System.in).nextInt();
		//トッピング配列をシャッフル
		for(int i=0;i<TOPPINGS.length;i++){
			int idx = new Random().nextInt(TOPPINGS.length-i)+i;
			String suf = TOPPINGS[i];
			TOPPINGS[i] = TOPPINGS[idx];
			TOPPINGS[idx] = suf;
		}

		//トッピング数だけ、配列の頭から取り出しながら文字列連結
		String my_topping ="";
		for(int i=0;i<top_num;i++){
			my_topping += TOPPINGS[i];
		}
		//結果を表示する
		System.out.printf("今夜のカレーは「%s%sカレー」に決まりました!",my_topping,base_curry);
	}
}
