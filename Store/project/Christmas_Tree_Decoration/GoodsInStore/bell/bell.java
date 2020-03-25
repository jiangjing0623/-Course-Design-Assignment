package bell;

import factory.Goods;
import factory.Interface_Goods;

public class bell extends Goods implements Interface_Goods {
	
	public void printMessage() {
		System.out.println("~~~~~~~" + this.name + "铃铛\t 单价：" + this.price + "\t数量"
				+ this.num+"\n"+this.meanning+"\n"+ "原价合计:" + this.OriginalPrice());
	}

	public void snowman(int num) {
		this.name = "雪人吊坠";
		this.price = 59.0F;
		this.num = num;
		this.meanning="雪人吊坠》》铃声既有喜悦福音之意，同时也有驱赶厄运的意思。》》";
	}

	public void ball(int num) {
		this.name = "大金球";
		this.price = 15.0F;
		this.num = num;
		this.meanning="大金球》》铃声既有喜悦福音之意，同时也有驱赶厄运的意思。》》";
	}
}