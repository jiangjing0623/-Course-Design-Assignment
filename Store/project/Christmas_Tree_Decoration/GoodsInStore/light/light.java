package light;

import factory.Goods;

public class light extends Goods {
	public void printMessage() {
		System.out.println("--" + this.name + "LED灯\t 单价：" + this.price + "数量:*"
				+ this.num + "合计" + this.OriginalPrice());
	}

	public void Silver_light(int num) {
		this.name = "银色de";
		this.price = 30.0F;
		this.num = num;
	}

	public void colorful_light(int num) {
		this.name = "彩色de";
		this.price = 50.0F;
		this.num = num;
	}
}