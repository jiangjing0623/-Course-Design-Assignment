package Filter;

import java.util.HashSet;
//重写hashset的contains
public class regExHashSet  extends HashSet<String >  {
	 public boolean containsRegEx( String regex ) {
	        for( String string : this ) {
	            if( string.matches( regex ) ) {
	                return true;
	            }
	        }
	        return false;
	    }
}
