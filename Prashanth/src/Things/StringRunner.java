package Things;

public class StringRunner {

	public static void main(String[] args) {
	  String name1="Avinash";
	  String name2="praveen";
	  
	  System.out.println("the length is:"+name1.length());
	  System.out.println("the string is equal :"+name1.equals(name2));
	  
	   String sentance="Hello guys,Good evening";
	   
	   // word count
	   for( int i=0;i<sentance.length();i++) {
		   System.out.println("The length of count is:"+sentance.charAt(i));
	   }
	   
	   //splitting
	   String name[]=sentance.split(" ");
	   for(String i:name) {
		   System.out.println("the split value is" +i);
	   }
	   //charcter count
	   char [] ch=sentance.toCharArray();
	   for(int j=0;j<sentance.length();j++) {
		  System.out.println("Character count:" +sentance.charAt(j));
		  }
	   
	   //reverse the string
	   for(int k=ch.length-1;k>=0;k--) {
		   System.out.println("the reverse string is:"+ch[k]);
		   
	   }
	   
	   System.out.println("the upper string is:"+sentance.toUpperCase());
	   System.out.println("the lower string is:"+sentance.toLowerCase());
	   System.out.println(sentance.endsWith("evening"));
	   System.out.println(sentance.isEmpty());
	   
	   
	   
	   
	   
	   }

}
