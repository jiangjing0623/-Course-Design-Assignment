package light;

//工厂的具体实现
public class PakageLight extends Light_abstract {
	public PakageLight(int num) {
		this.name = "彩灯";
		this.price = 50.09F;
		this.num = num;
		this.meanning="圣诞彩灯》》平安夜星光的象征，璀璨闪亮";//
	}
}