package animals;

import animals.mammals.Cat;
import animals.reptiles.Dinosaur;

public class Zoo{
	
	Cat cat = new Cat();
	Dinosaur dinosaur = new Dinosaur();
	
	public void visit(){
		System.out.println("Let's visit the cat.");
		cat.meow();
		System.out.println("Let's visit the dinosaur.");
		dinosaur.roar();
	}
}