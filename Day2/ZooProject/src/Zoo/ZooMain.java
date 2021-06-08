package Zoo;

import org.animals.*;

public class ZooMain {

	public static void main(String[] args) {
		Animals lion=new Lion();
		Animals tiger=new Tiger();
		Animals giraffe=new Giraffe();
		Animals deer=new Deer();
			 VandularZooLand v=new VandularZooLand();
			 v.setAnimal(lion);
			 v.getCharacteristics();
			 v.setAnimal(tiger);
			 v.getCharacteristics();
			 v.setAnimal(giraffe);
			 v.getCharacteristics();
			 v.setAnimal(lion);
			 v.getCharacteristics();

	}

}
