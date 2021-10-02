package lab.example3._5_Wrappers;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boxing();

//		AutoUnboxing();
//		Unboxing();
	}

	public static void Boxing() {
		int numPrimitive = 6;
		Integer numWrapper = Integer.valueOf(numPrimitive);
		System.out.println(numWrapper.getClass().getName() + " �Es un objeto? " + (numWrapper instanceof Object));
	}

	public static void AutoUnboxing() {
		Character chWrapped = 'a'; // Autoboxing
		System.out.println(chWrapped.getClass());

		char ch = 'a';
		System.out.println(((Object) ch).getClass());
	}

	public static void Unboxing() {
		int numPrimitive = 6;
		Integer numWrapper = Integer.valueOf(numPrimitive);
		System.out.println(numWrapper.getClass().getName() + " �Es un objeto? " + (numWrapper instanceof Object));

		int numUnWrapped = numWrapper.intValue();
		System.out.println(numUnWrapped);
	}
}
