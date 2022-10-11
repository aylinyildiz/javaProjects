package abstractClasses;

public abstract class GameCalculator {
	
	//classı kim inherit ediyorsa calculate içermek zorunda, 
	//calculate'i override etmek kendi calculateini yazmak zorunda
	public abstract void calculate();
	
	
	//GameCalculator'ı kim kullanıyorsa gameOver'ı olduğu gibi kullanmak zorunda
	public final void gameOver() {
		System.out.println("Game over");
	}

}
