
public class max {
	public static void main(String[] args) {
		int num1=42;
		int num2=32;
		int num3=42;
		if (num1>num2&&num1>num3) {
		System.out.println(num1+" is the maximum between " +num1+","+num2+","+num3);
		
	} else if (num2>num1&&num2>num3) {
	System.out.println(num2+" is the maximum between " +num1+","+num2+","+num3);
	} else if (num3>num1&&num3>num2) {
System.out.println(num3+" is the maximum between " +num1+","+num2+","+num3);
	}else if (num1>num2&&num1==num3) {
		System.out.println(num1+" is greater than " +num2+" and equal to"+num3);
	}else if (num2>num3&&num2==num1) {
		System.out.println(num2+" is greater than " +num3+" and equal to"+num1);
	}else if (num3>num1&&num3==num2) {
		System.out.println(num3+" is greater than " +num1+" and equal to"+num2);
	}else {
		System.out.println("All are equal");
	}}}
