package factory;
//产品属性写这里
//
public class Goods  {

	public String name;//种类
    public int num;//数量
	public float price;//价格
	public String meanning;//商品推荐语

   public float acti_Price(float foodPrice) {
      return (float)this.num * this.price;
   }
   
	//总价（原价）
   public float OriginalPrice() {
      return (float)this.num * this.price;
   }
   
}