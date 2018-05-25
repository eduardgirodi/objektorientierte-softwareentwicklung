package uebung3.aufgabe3;

public class Stereoanlage implements Playable{

	@Override
	public void song() {

	}

	public void play(Playable p) {
		p.song();
	}
}