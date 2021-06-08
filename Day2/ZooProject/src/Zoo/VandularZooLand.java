package Zoo;

import org.animals.*;

public class VandularZooLand {
			
			public Animals animal;
			public void setAnimal(Animals animal)
			{
				this.animal=animal;
			}
				public void getCharacteristics()
				{
					animal.details();
					animal.canClimb();
					animal.isVegetarian();
					animal.sound();
				}

}
