
import java.util.*;
public class Matsuoka{
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
		String toppingname="";
		int basenum,toppingnum;
		//質問をしてカレーのベースを決める
		System.out.print("ベースとなるカレーを選択してください0:ポーク,1:ビーフ,2:チキン>");
		basenum=new Scanner(System.in).nextInt();
		//トッピングが何種類かを聞く
		System.out.print("トッピングは何種類?>");
		toppingnum=new Scanner(System.in).nextInt();

		//トッピング配列をシャッフル
		for(int i=0;i<TOPPINGS.length-1;i++){
			String tmp;
			int idx=new Random().nextInt(TOPPINGS.length-i)+i;
			tmp=TOPPINGS[i];
			TOPPINGS[i]=TOPPINGS[idx];
			TOPPINGS[idx]=tmp;
		}

		//トッピング数だけ、配列の頭から取り出しながら文字列連結
		for(int i=0;i<toppingnum-1;i++){
			toppingname+=TOPPINGS[i];
		}
		//結果を表示する
		toppingname+=curry[basenum];
		System.out.printf("今夜のカレーは「%s」に決まりました!\n",toppingname);
	}
}
