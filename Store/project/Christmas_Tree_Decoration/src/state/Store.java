package state;



//实现state接口
public class Store {
	State light_state;
	State tree_state;
	State star_state;
	State bell_state;
	State menuFirst_state;
	State pakage;
	State state;
	   public Store(){
		    light_state=new light_state(this);
			tree_state=new tree_state(this);
			star_state=new star_state(this);
			bell_state=new bell_state(this);
			menuFirst_state=new menuFirst_state(this);
			pakage=new pakage_state(this);
			state=menuFirst_state;//一开始先进入menu模式		
	   }
	   public void setState(State State){
	      this.state = State;     
	   }
	 
	   public State getState(){
	      return state;
	   }

	   public State getpakage() {
		  
	        return pakage;
	    }
	   public State getlight_state() {
		 
	        return light_state;
	    }

	    public State gettree_state() {
	        return tree_state;
	    }

	    public State getstar_state() {
	        return star_state;
	    }
	    
	    public State getno_state() {
	        return menuFirst_state;
	    }

	    public State getbell_state() {
	        return bell_state;
	    }
	 
	    public String toString() {
			StringBuffer result = new StringBuffer();		
			result.append(state + "\n");
			return result.toString();
		} 
	   
	   
		public void cal(int type,int num) {
			state.cal(type,num);
			
		}
		
		public void show() {
			state.show();
			// TODO Auto-generated method stub
			
		}

		public int num() {
			return state.num();
			
		}

		public int type() {
			return state.type();
			// TODO Auto-generated method stub
			
		}
		
}
