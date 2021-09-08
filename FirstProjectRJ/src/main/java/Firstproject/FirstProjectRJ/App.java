package Firstproject.FirstProjectRJ;

import java.util.Arrays;

import junit.framework.Assert;

public class App 
{
	public static void decimalpointchecker(String value) {

    	char[] test = value.toCharArray();
    	char deci = '.';
    	
    	for(int j= test.length-1; j>1; j--) {
//    		System.out.println("value: "+value.charAt(j));
    		boolean condition = value.charAt(3)==deci; 
    		if(condition==true ) {
				System.out.println("value is in two decimal only");
//				Assert.assertTrue(condition);
//	    		Assert.assertTrue(" value is in two decimal only", condition);

			}else {
				boolean check = value.charAt(j)==deci; 
				while(check) {
					System.out.println("decimal is at: "+ j );
					break;
				}
			}
    	}
	}
	
	 public static void indexof( String carName) {
		 System.out.println( "Hello World!" );
	     String[] TYPES = {
	            "Sedan",
	            "Compact",
	            "Roadster",
	            "Minivan",
	            "SUV",
	            "Convertible",
	            "Cargo",
	            "Others"
	        };
	    
	   
	    		int index = -1;
	    		for (int i=0;i<TYPES.length;i++) {
	    		    if (TYPES[i].equals(carName)) {
	    		        index = i;
	    		        break;
	    		    }
	    		}
		
	 }
	
    public static void main( String[] args )
    {
    	indexof("SUV");
        		
        		
//        Arrays.asList(TYPES).indexOf("Sedan");
//        
//        for (int i = 0; i < TYPES.length; i++) {
//            if(TYPES[i].equals(carName)){
//                return i;
//            }
//        }
//        return -1;//not found
//
    }
    	
}
