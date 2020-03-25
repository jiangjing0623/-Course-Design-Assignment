package star;

import factory.Goods;
import factory.Interface_Goods;

public class star extends Goods implements Interface_Goods {
	public void printMessage() {
		System.out.println("--" + this.name + "圣诞星\t 单价：" + this.price + "数量:*"
				+ this.num + "原价合计:" + this.OriginalPrice());
	}

	public void minisize_Star(int num) {
		this.name = "迷你size";
		this.price = 10.0F;
		this.num = num;
		this.meanning="迷你size》》象征人类的期盼与愿望";
	}

	public void largesize_star(int num) {
		this.name = "顶端de大";
		this.price = 15.0F;
		this.num = num;
		this.meanning="顶端de大》》象征人类的期盼与愿望";
	}
}