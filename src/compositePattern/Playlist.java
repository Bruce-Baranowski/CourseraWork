package compositePattern;

import java.util.ArrayList;

public class Playlist implements IComponent {

	public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList<IComponent>();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}

	@Override
	public void play() {
		for (IComponent s: playlist) {
			s.play();
		}
	}

	@Override
	public void setPlaybackSpeed(float speed) {
		for (IComponent s: playlist) {
			s.setPlaybackSpeed(speed);
		}
	}

	@Override
	public String getName() {
		return playlistName;
	}

	public void add(IComponent component) {
		playlist.add(component);
		
	}
	
	public void remove(IComponent component) {
		playlist.remove(component);
	}

}
