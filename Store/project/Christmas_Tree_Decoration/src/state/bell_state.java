package state;

import strategy.Price;
import strategy.discount_Strategy;
import strategy.GoodsStrategy;
import strategy.newStrategy;
import bell.bell;

public class bell_state extends input implements State {
	float monney;
	float monney_after_discount;
	float monney_after_dis_and_activity;
	float monney_after_acti_and_disc;
	float activity_monney;
	float after_discount;
	float goodsPrice = 0.0F;
	float z = 0.0F;
	Store store;
	GoodsStrategy strategy = new discount_Strategy();
	GoodsStrategy strategy1 = new newStrategy();
	
	Price discount_price = new Price(strategy);
	
	Price new_price1 = new Price(strategy1);
	
	
	
	public bell_state(Store store){
		this.store=store;
	}
	
	public void cal(int type,int num) {
		// TODO Auto-generated method stub
		new newStrategy();
		bell b1 = new bell();
		bell b2 = new bell();
		if(type==2){
			b2.ball(num);
			b2.printMessage();
			System.out.print("是否有优惠券？   1.有   2.无    ");
			//Scanner choises = new Scanner(System.in);
			int i = input();
			if(i==1){
				monney = new_price1.quote(b2.OriginalPrice());
				System.out.println("￥￥使用优惠券后价格为：" + monney);
			}
			else if (i==2){
				monney=b2.OriginalPrice();
			}
			
			
			activity_monney = new_price1.quote(b2.OriginalPrice());
			System.out.println("￥￥活动期间打折价为：" + activity_monney);
			
			
	
		}
		else if(type==1){
			b1.snowman(num);
			b1.printMessage();
			System.out.print("是否有优惠券？   1.有   2.无    ");
			//Scanner choises = new Scanner(System.in);
			int i = input();
			if(i==1){
				monney = new_price1.quote(b1.OriginalPrice());
				System.out.println("￥￥使用优惠券后价格为：" + monney);
			}
			else if (i==2){
				monney=b2.OriginalPrice();
			}
			
			
			activity_monney = discount_price.quote(b1.OriginalPrice());
			System.out.println("￥￥活动期间打折价为：" + activity_monney);
			
		}
		System.out.println("￥￥总计" + activity_monney);
		System.out.println("❥(^_-)请付款:");
	}
	
	@Override
	public int type() {
		System.out.println("请输入");
		//Scanner choises = new Scanner(System.in);//选商品种类
		int type = input();
		return type;
		
		
		
	}
	
	
	@Override
	public int num() {
		System.out.println("请输入数量");
		//Scanner choises = new Scanner(System.in);//选商品shu
		int num = input();
		return num;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	
}
