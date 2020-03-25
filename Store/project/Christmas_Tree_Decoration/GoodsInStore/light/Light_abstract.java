package light;

import factory.Goods;
import factory.Interface_Goods;
//创建实现接口的实体类
public class Light_abstract extends Goods implements Interface_Goods {
	
	public void printMessage() {
		System.out.println("--" + this.name + "灯\t 单价：" + this.price + "数量"
				+ this.num);
	}
}