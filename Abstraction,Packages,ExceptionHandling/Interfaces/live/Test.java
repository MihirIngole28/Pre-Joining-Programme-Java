package Interfaces.live;

import Interfaces.music.*;
import Interfaces.music.string.*;
import Interfaces.music.wind.*;

public class Test {

	public static void main(String[] args) {
		Veena v = new Veena();
		v.play();
		
		Saxophone s = new Saxophone();
		s.play();
		
		System.out.println();
		
		Playable pl;
		pl = new Veena();
		pl.play();
		
		pl = new Saxophone();
		pl.play();
		
	}

}
