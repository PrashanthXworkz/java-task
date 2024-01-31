package Things;

public class StringRunner1 {
       	    
     public static void main(String[] args) {
    	 
    	 String input1="Hello I'm Here to meet you";
    	 
    	 StringBuilder stringbuildervariable=new StringBuilder();
    	 
    	 stringbuildervariable.append(input1);
    	 
    	 stringbuildervariable.reverse();
    	 
    	 System.out.println("Reverse String :"+stringbuildervariable);
    	 
    	 
    	 String input2="Hey This is Good Time To Go Trip";
    	 System.out.println("sentance is:"+input2);
    	 
    	 String input3="cAN i hELP yOU";
    	 System.out.println("lowercase output:"+input3.toLowerCase());
    	 System.out.println("uppercase output:"+input3.toUpperCase());
		       
    	 
    	 String input4="Sapthasagaradhache yello";
    	  String wordtoReverse="yello";
    	  String[] Words=input4.split(" ");
    	  String reverse="";
    	  
    	  
    	  for(int w=0;w<Words.length;w++) {
    		  if(Words[w].equalsIgnoreCase(wordtoReverse)) {
    			  for(int i=Words[w].length()-1;i>=0;i--) {
    				  reverse=reverse+Words[w].charAt(i);
    			  }
    			  Words[w]=reverse;
    		  }
    		  
    	  }
    	  for(String w:Words) {
    		  System.out.println(w);
    	  }
    	  
    	 
		    
    }

}
