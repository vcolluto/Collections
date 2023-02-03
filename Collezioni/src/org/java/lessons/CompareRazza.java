package org.java.lessons;

import java.util.Comparator;

public class CompareRazza  implements Comparator<Animale>{	//ordinamento per razza

	@Override
	public int compare(Animale o1, Animale o2) {
		
		return o1.getRazza().compareTo(o2.getRazza());
	}

}
