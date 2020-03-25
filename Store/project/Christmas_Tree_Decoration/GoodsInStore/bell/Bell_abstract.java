package bell;

import factory.Goods;
import factory.Interface_Goods;

public abstract class Bell_abstract extends Goods implements Interface_Goods {
	public void printMessage() {
		System.out.println("~~~~~~~" + this.name + "铃铛\t 单价：" + this.price + "\t数量"
				+ this.num+"\n"+this.meanning+"\n");
	}
}