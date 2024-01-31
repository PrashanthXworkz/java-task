package collectionvector;

import java.util.Stack;

public class StackRunner {

	public static void main(String[] args) {
		Stack st=new Stack();
		st.push("Java");
		st.push("SQL");
		st.push("WEB");
		st.push("Cloud");
		
		System.out.println("The elements in the stack:"+st);
		System.out.println("The element at the top:"+st.peek());
		System.out.println("The element poped out of the stack:"+st.pop());
		System.out.println("The element in a stack after pop out in a element:"+st);
		System.out.println("The result of serach element:"+st.search(1));
		

	}

}
