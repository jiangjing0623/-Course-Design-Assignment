package factory;

import star.Star_abstract;
import tree.christmas_tree_abstract;
import light.Light_abstract;
import bell.Bell_abstract;

public interface IChristmas_Tree_DecorationFactory {
	//抽象工厂类
	Light_abstract createLight(int num);

	Star_abstract createStar(int num);

	christmas_tree_abstract createChristmas_tree_i(int num);

	Bell_abstract createBell(int num);
	
	//如果要加新产品：
	nothing_abstract1 creatnothing();	
	
}