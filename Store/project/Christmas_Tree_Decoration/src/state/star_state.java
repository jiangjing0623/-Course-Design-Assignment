package state;



import star.star;
import strategy.Price;
import strategy.discount_Strategy;
import strategy.GoodsStrategy;
import strategy.newStrategy;

public class star_state extends input implements State {
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
	
	
	public star_state(Store store){
		this.store=store;
	}
	
	public void cal(int type,int num) {
		// TODO Auto-generated method stub
		new newStrategy();
		star star1 = new star();
		star star2 = new star();
		if(type==2){
			star2.largesize_star(num);
			star2.printMessage();
			System.out.print("是否有优惠券？   1.有   2.无    ");
			//Scanner choises = new Scanner(System.in);
			int i = input();
			if(i==1){
				monney = new_price1.quote(star2.OriginalPrice());
				System.out.println("￥￥使用优惠券后价格为：" + monney);
			}
			else if (i==2){
				monney=star2.OriginalPrice();
			}
			
			
			activity_monney = new_price1.quote(star2.OriginalPrice());
			System.out.println("￥￥活动期间打折价为：" + activity_monney);
		}
		else if(type==1){
			star1.minisize_Star(num);
			star1.printMessage();
			System.out.print("是否有优惠券？   1.有   2.无    ");
			//Scanner choises = new Scanner(System.in);
			int i = input();
			if(i==1){
				monney = new_price1.quote(star1.OriginalPrice());
				System.out.println("￥￥使用优惠券后价格为：" + monney);
			}
			else if (i==2){
				monney=star1.OriginalPrice();
			}
			activity_monney = discount_price.quote(monney);
			System.out.println("￥￥活动期间打折价为：" + activity_monney);
			
			
		}
		
		System.out.println("￥￥总计" + activity_monney);
		System.out.println("❥(^_-)请付款:");
	}
	
	
	public int num() {
		// TODO Auto-generated method stub
		System.out.println("请输入数量");
		//Scanner choises = new Scanner(System.in);//选商品数量
		int num = input();
		return num;
		
	}
	@Override
	public int type() {
		// TODO Auto-generated method stub
		System.out.println("请输入");
		//Scanner choises = new Scanner(System.in);//选商品种类
		int type = input();
		return type;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	

	
}
