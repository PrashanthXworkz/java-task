package Things;

public class Wrapper1 {

	public static void main(String[] args) {
		byte value=10;
		//converting to string
		String byteValue=Byte.toString(value);
		System.out.println(byteValue);
		
		
		//converting to original
		Byte b=Byte.valueOf(value);
		byte returnValue=b.byteValue();
		Byte t=new Byte((byte)120);
		
		
		byte values=124;
		Byte c=new Byte(values);
		
		int value1=20;
		String intValue=Integer.toString(value1);
		System.out.println(intValue);
		
	
		String a="56";
		String type=String.valueOf(a);
		System.out.println(type);

	}

}
