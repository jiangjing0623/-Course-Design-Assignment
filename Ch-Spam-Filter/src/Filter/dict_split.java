package Filter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

//字典方法分词
public class dict_split {
	private Object memory;
	private Object price;
	private static String[] newkeywords;


	public boolean equals(Object obj){
        if(this == obj){//如果引用地址是相同的,证明是同一个对象,那当然相同
            return true;
        }
        if(obj ==null){//如果对象是空的,没有比较的必要,直接返回false
            return false;
        }
        if(!(obj instanceof dict_split)){//如果obj不是segmentation的一个对象实例,直接返回false
            return false;
        }
        dict_split p = (dict_split)obj;//编译需要,强制类型转换
        
        if( this.price==p.price && this.memory==p.memory ){
            return true;
        }
        else{
            return false;
        }  
    }

	
/*	重写contains
 * public static boolean contains(String a,String b){
        if(a==null||b==null){
            return false;
        }else{
            HashSet<Character> set=new HashSet<Character>();
            int length=a.length();
            for(int i=0;i<length;i++){
                set.add(a.charAt(i));//build hash to a
            }
            length=b.length();
            for(int i=0;i<length;i++){
                if( !set.contains(b.charAt(i)) ){//if a don't hava b.charAt(i),return false
                    return false;
                }
            }
            return true;
        }
	}*/
	
	public static void main(String [] args) throws IOException{		
		
		StringBuffer buffer = new StringBuffer();
        BufferedReader bf= new BufferedReader(new FileReader("D:\\eclipse-64\\workplace--\\Spam-Filter-master\\dictionary.txt"));
        BufferedReader test= new BufferedReader(new FileReader("TrainingSet/2000.txt"));
        String[] test1=test.toString().split("[^\u4e00-\u9fa5]");
        String s = null;
        String t = null;
        while((s = bf.readLine())!=null){//使用readLine方法，一次读一行
            buffer.append(s.trim());
        }
        String xml = buffer.toString();
        bf.close();
        String [] str=xml.split("\\s");		//以空格分割
//        System.out.println(str.length);		//输出数组的大小
       HashSet<String> set = new HashSet<>(Arrays.asList(str));	//将数组转换为set集合，去掉重复的（hashmap特有）     
//        System.out.println(set.size());	//输出set中元素的个数
        //String text="记者席记者记者证记住既得利益既定既来之";
       while((t = test.readLine())!=null){
    	   t=t.replaceAll("spam", "").replaceAll("ham", "").trim();    	  
        String text=t;
        int i=text.length();
        newkeywords = null;
        int q=0;
        int k=0;
        while(text.length()!=0){       	
        	String a=text.substring(0, i);
      
        	/*将TEXT给hashset
        	 * HashSet a =new HashSet();
        	a.add(text.substring(0, i));*/
        	/*
        	 for (int q = 0; q < str.length-1; q++) {
        		 if(contains(a,str[q])) {        			
        	        	System.out.println("1213 "+q+"\n");        	     
        	    		text=text.substring(i, text.length());
        	    		i=text.length();
        	        	
        	    	}
        		 else{
        	    		i--;
        	        	
        	    	}
             }
        	*/
        	
        	 //System.out.println(contains);
        	//System.out.println(a.length());用于测试a
        	//Java中Set的contains()方法 见 https://blog.csdn.net/violet_echo_0908/article/details/50152915 
        	 if(set.contains(a)==true){
        	//	 newkeyword[q]=a;
        		System.out.println("1"+a);
        		text=text.substring(i, text.length());
        		i=text.length();
        	//	q++;
        	}
        	else{
        		i--;
        	}
        	
        	if(a.length()==1)
        	{
        		//newkeywords[k]=a;
        		System.out.println(a);
        		text=text.substring(1, text.length());
        		i=text.length();
        		//k++;
        	}
        }		
	}
       
	}
	}

