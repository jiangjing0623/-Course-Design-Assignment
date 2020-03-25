package state;


import strategy.Price;
import strategy.discount_Strategy;
import strategy.GoodsStrategy;
import strategy.newStrategy;


public class menuFirst_state  extends input implements State {
	Store store;
	public menuFirst_state(Store store){
		this.store=store;
	}
	public void pay(Object o, int num) {
		// TODO Auto-generated method stub
		
	}
	public void cal() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	float goodsPrice = 0.0F;
	float z = 0.0F;
	
	GoodsStrategy strategy = new discount_Strategy();
	GoodsStrategy strategy1 = new newStrategy();
	
	Price price = new Price(strategy);
	
	//new baseStrategy();
	
	Price price1 = new Price(strategy1);
	
	float mix_after_discount;
	float monney;

	
	@Override
	public int type() {
		/*Scanner choises = new Scanner(System.in);//选商品种类
		int t = choises.nextInt();*/
		int t=input();
		if(t==1){
			System.out.println("请选择圣诞树led灯种类及数量：1.银色，2.彩色");
			store.setState(store.getlight_state());//切换到选购圣诞灯模式
			//System.out.println(store);
		}
		else if (t == 2) {
			System.out.println("请选择树的种类及数量：1.枞树，2.松树");
			store.setState(store.gettree_state());
		// TODO Auto-generated method stub
		}
		else if (t == 3) {
			System.out.println("请选择圣诞星种类及数量：1.小份，2.大份");
			store.setState(store.getstar_state());
		}
		else if (t == 4) {
			System.out.println("请选择圣诞铃铛种类及数量：1.雪人吊坠，2.大金球");
			store.setState(store.getbell_state());
		}
		return 0;
	}
	
	public String toString() {
		return "~~~~~~~~~~~~xxxx设计模式集团xxxxx~~~~~~~~~~~~";
	}
	
	public void show(){
		System.out.println("------------圣诞树专题商店--------------");
		System.out.println("~~~~~~~~~~~~~圣诞节有优惠！~~~~~~~~~~~~·");
		System.out.println("1.买点单品			     	2.圣诞树套餐 ");
		int sing_or_mix_choise=input();
		switch (sing_or_mix_choise) {
		case 1 :
			System.out.println("1.闪闪圣诞彩灯，2.不可或缺的圣诞树，3.圣诞星，4.圣诞铃铛");
			//store.type();//切换到选购圣诞灯模式
			break;
		case 2 :
			System.out.println("套餐更惊喜！  :");
			store.setState(store.getpakage());
			
			
		}
	}
	

	@Override
	public int num() {
		return 0;
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cal(int type, int num) {
		// TODO Auto-generated method stub
		
	}
	
	
}
