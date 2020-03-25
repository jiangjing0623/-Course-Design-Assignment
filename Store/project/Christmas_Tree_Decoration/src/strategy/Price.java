package strategy;


public class Price {
	//策略模式实现不同优惠
	private GoodsStrategy strategy;//商品价格
	public Price(GoodsStrategy strategy) {
		this.strategy = strategy;
	}
	public Price(newStrategy strategy1) {
		this.strategy = strategy1;
	}	
	public float quote(float price) {
		//经过打折strategy的价格
		return this.strategy.acti_Price(price);
	}
}