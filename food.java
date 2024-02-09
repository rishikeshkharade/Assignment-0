
public class food {
	public static void main(String[] args) {
    float wallet=50f;
    float vadapaw = 50f; 
    float juice = 24.5f;
    if (vadapaw<=wallet) {
    	System.out.println("Eating Vadapaw");
    	
    }else if (vadapaw>wallet||juice<wallet) {
    	System.out.println("No Vadapaw taking juice");
    }else {
    	System.out.println("Nothing to eat");
    }
	}
}
