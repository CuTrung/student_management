package Person;

@FunctionalInterface
public interface Activities {
	
	default void studies() {
		System.out.println("Study is necessary for your future !!!");
	}
	
	public void playSport(String sex);
	
}
