package star;

import factory.Goods;
import factory.Interface_Goods;

public abstract class Star_abstract extends Goods implements Interface_Goods {
	public void printMessage() {
		System.out.println("--" + this.name + "圣诞星\t 单价：" + this.price + "数量"
				+ this.num);
	}
}