package tree;

import factory.Goods;
import factory.Interface_Goods;

public class Christmas_tree extends Goods implements Interface_Goods {
	public void printMessage() {
		System.out.println("--" + this.name + "树种\t 单价：" + this.price + "数量:*"
				+ this.num + "原价合计:" + this.OriginalPrice());
	}

	public void Eucalyptus_Tree(int num) {
		this.name = "枞树";
		this.price = 2500F;
		this.num = num;
		this.meanning="枞树圣诞树》》》不死灵魂，象征着长存的生命";
	}

	public void Pine_Tree(int num) {
		this.name = "洋松";
		this.price = 3500F;
		this.num = num;
		this.meanning="洋松圣诞树》》》不死灵魂，象征着长存的生命";
	}
}