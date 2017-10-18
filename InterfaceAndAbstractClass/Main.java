
public class Main {

	public static void main(String[]args) {
		Animals[] animals = new Animals[2];
		animals[0] = new Lion();
		animals[1] = new Bird();
		
		for(int i = 0; i <animals.length; i++){
			animals[i].eat();
			animals[i].fly();
		}
	}
}
