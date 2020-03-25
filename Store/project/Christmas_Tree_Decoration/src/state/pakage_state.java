package state;
import star.Star_abstract;

import strategy.Price;
import strategy.discount_Strategy;
import strategy.GoodsStrategy;
import strategy.newStrategy;

import tree.christmas_tree_abstract;
import light.Light_abstract;

import factory.Christmas_Tree_Decoration_Factory;
import factory.IChristmas_Tree_DecorationFactory;
import bell.Bell_abstract;



public class pakage_state extends input implements State {
	Store store;
	public pakage_state(Store store){
		this.store=store;
	}
	public void pay(Object o, int num) {
		// TODO Auto-generated method stub
		
	}
	public void cal() {
		// TODO Auto-generated method stub
		
	}
	
	float monney;
	float monney_after_discount;
	float monney_after_dis_and_activity;
	float monney_after_acti_and_disc;
	float activity_monney;
	float after_discount;
	float goodsPrice = 0.0F;
	GoodsStrategy strategy = new discount_Strategy();//折扣优惠
	GoodsStrategy strategy1 = new newStrategy();//-10优惠
	Price discount_price = new Price(strategy);
	Price new_price1 = new Price(strategy1);
	float z = 0.0F;

	

	

	
	
	@Override
	public void cal(int type, int num) {
		// TODO Auto-generated method stub
		IChristmas_Tree_DecorationFactory Factory = new Christmas_Tree_Decoration_Factory();
		
		Light_abstract light_abstract = Factory.createLight(1);
		light_abstract.printMessage();
		
		christmas_tree_abstract tree = Factory.createChristmas_tree_i(1);
		tree.printMessage();
		
		Star_abstract french = Factory.createStar(1);
		french.printMessage();
		
		Bell_abstract bell_abstract = Factory.createBell(1);
		bell_abstract.printMessage();
		
		goodsPrice = light_abstract.price + tree.price + french.price+ bell_abstract.price;
		System.out.print("套餐原价：  "+goodsPrice+"\n");
		
		System.out.print("是否有优惠券？   1.有   2.无    ");
		//Scanner choises = new Scanner(System.in);
		int i = input();
		if(i==1){
			monney = new_price1.quote(goodsPrice);
			System.out.println("￥￥使用优惠券后价格为：" + monney);
		}
		else if (i==2){
			monney=goodsPrice;
		}
		activity_monney = discount_price.quote(monney);
		System.out.println("￥￥活动期间打折价为：" + activity_monney);
		
		
		System.out.println("￥￥总计" + activity_monney);
		System.out.println("❥(^_-)请付款:");
		
	}
	@Override
	
	public int type() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int num() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	

}

