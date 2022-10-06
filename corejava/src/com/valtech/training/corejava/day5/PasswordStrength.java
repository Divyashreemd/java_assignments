package com.valtech.training.corejava.day5;

public class PasswordStrength {
	
	public boolean islower(String s1) {
		for (int  i = 0; i < s1.length(); i++) {
			 char ch = s1.charAt(i);
            if (Character.isLowerCase(ch)) {
                
                    return true;
                } 
        }
        return false;
	    }
	
	public boolean isupper(String str) {
		for (int  i = 0; i < str.length(); i++) {
			 char ch = str.charAt(i);
			 if (Character.isUpperCase(ch)) {
	        	   return true;
	          }
	      }
	       return false;
	   }
	
	 public int  checkdigit(String str) {
		 int dcount=0;
		 int flag =0;
		  for (int i= 0; i < str.length(); i++) {
			  char ch = str.charAt(i);
	           if (Character.isDigit(ch)) {
	        	   if(flag==0) {
	        		   dcount=5;
	        		   flag=1;
	        	   }else {
	        		   dcount+=1;
	        	   }
	     }
	       
	   }
		  return dcount;
	}
	 
	 public int checkspecialchar(String str) {
	        int scount =0;
	        int flag =0;
	       String specialChars = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
	        for (int i = 0; i < str.length(); i++) {
	            String strChar = Character.toString(str.charAt(i));
	            // Check whether String contains special character or not
	            if (specialChars.contains(strChar)) {
	            	if(flag==0) {
		        		   scount=5;
		        		   flag=1;
		        	   }else {
		        		   scount+=2;
		        	   }
	            }

	       }
	      return scount;  
	    }
	
	   
	public String passwordStrengthChecker(String pass) {
		int lcount=0;
		int ucount =0;
		int dicount=0;
		int spcount=0;
		String str1="Characters is less than 8";
		if(pass.length()<8) return str1;
		if(islower(pass)) {
			lcount=5;
		}
		
		if(isupper(pass)) {
			ucount =5;
		}
		
    	dicount = checkdigit(pass);
		
		spcount = checkspecialchar(pass);
		
		int tcount=lcount+ucount+dicount+spcount;
		
		
		if(tcount > 25 ) return "Strong";
		if(tcount>20 && tcount <25) return "Moderate";
		return "weak";
		
			
		
		
	}

}
