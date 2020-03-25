package strategy;


public class discount_Strategy implements GoodsStrategy {
   public float acti_Price(float Price) {  
      return Price * 0.5F;//圣诞打折5     
   }
}