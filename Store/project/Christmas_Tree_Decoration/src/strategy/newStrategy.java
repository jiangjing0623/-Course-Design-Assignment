package strategy;

public class newStrategy implements GoodsStrategy {
	
	public float acti_Price(float GoodsPrice) {
		return GoodsPrice - 10.0F;////重写计算价格方法 
	}
}