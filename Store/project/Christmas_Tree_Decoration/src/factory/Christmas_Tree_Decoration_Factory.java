package factory;

import star.PakageStar_abstract;
import star.Star_abstract;
import tree.PakageChristmas_tree;
import tree.christmas_tree_abstract;
import light.PakageLight;
import light.Light_abstract;
import bell.Bell_abstract;
import bell.PakageBell;

public class Christmas_Tree_Decoration_Factory implements IChristmas_Tree_DecorationFactory {
	//实例工厂类
	public Light_abstract createLight(int num) {
		return new PakageLight(num);
	}
	public Star_abstract createStar(int num) {
		return new PakageStar_abstract(num);
	}
	public christmas_tree_abstract createChristmas_tree_i(int num) {
		return new PakageChristmas_tree(num);
	}
	public Bell_abstract createBell(int num) {
		return new PakageBell(num);
	}	
//新产品
	@Override
	public nothing_abstract1 creatnothing() {
		// TODO Auto-generated method stub
		return null;
	}
}