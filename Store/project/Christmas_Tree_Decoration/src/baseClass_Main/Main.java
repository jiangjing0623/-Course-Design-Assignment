package baseClass_Main;

import state.Store;
import state.input;

public class Main extends input{
	public static void main(String[] args) {
		Store store=new Store();	//menu state进入不同模式
		System.out.print(store);
		
		store.show();//展示商店界面
		store.type();//展示商店里你选择的商品属性	
		int type=store.type();	
		int num=store.num();
		store.cal(type,num);
		int monney=input();
		System.out.println("我没有写判断程序，那就假装你已经付好全款了叭，圣诞快乐！");
		System.out.println("~~~~~~~~~~~~~~~~~~~~谢谢~~~~~~~~~~~~~~~~~~~");
		
		
	
		
		
		
		
	}
}