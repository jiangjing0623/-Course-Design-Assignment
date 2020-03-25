package state;

import strategy.Price;
import strategy.discount_Strategy;
import strategy.GoodsStrategy;
import strategy.newStrategy;
import light.light;


public class light_state extends input implements State  {
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
	Store store;
	
	
	
	public light_state(Store store){
		this.store=store;
	}
	
	
	@Override
	public void cal(int type,int num) {
		
		// TODO Auto-generated method stub
		new newStrategy();
		light l1 = new light();
		light l2 = new light();
		
		if(type==2){
			l2.colorful_light( num);
			l2.printMessage();
			
			System.out.print("是否有优惠券？   1.有   2.无    ");
			int i = input();
			//Scanner choises = new Scanner(System.in);
			//int i = choises.nextInt();
			if(i==1){
				monney = new_price1.quote(l2.OriginalPrice());
				System.out.println("￥￥使用优惠券后价格为：" + monney);
			}
			else if (i==2){
				monney=l2.OriginalPrice();
			}
			
			
			activity_monney = new_price1.quote(l2.OriginalPrice());
			System.out.println("￥￥活动期间打折价为：" + activity_monney);
			
		}
		else if(type==1){
			l1.Silver_light(num);
			l1.printMessage();
			System.out.print("是否有优惠券？   1.有   2.无    ");
			//Scanner choises = new Scanner(System.in);
			int i = input();
			if(i==1){
				monney = new_price1.quote(l1.OriginalPrice());
				System.out.println("￥￥使用优惠券后价格为：" + monney);
			}
			else if (i==2){
				monney=l1.OriginalPrice();
			}
			activity_monney = discount_price.quote(monney);
			System.out.println("￥￥活动期间打折价为：" + activity_monney);
			
			
		}
		
		System.out.println("￥￥总计" + activity_monney);
		System.out.println("❥(^_-)请付款:");
	}
	
	public int num() {
		// TODO Auto-generated method stub
		/*System.out.println("请输入数量");
		Scanner choises = new Scanner(System.in);//选商品数量
		int num = choises.nextInt();*/
		System.out.println("请输入数量");
		int num=input();
		return num;
		
	}
	


	@Override
	public int type() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
}
