package Driver;

import Things.Remote;

public class RemoteRunner {

	public static void main(String[] args) {
		Remote remote=new Remote();
		System.out.println("the remote class is:"+remote.getClass());
		System.out.println("the hashCode is:"+remote.hashCode());
		System.out.println("the String of remote is:"+remote.toString());
		System.out.println("the equal method is:"+remote.equals(remote));
		
		
		
		

	}

}
