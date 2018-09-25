package mediaplayer;

import java.util.List;

public class PlayList {

    private List<Track> tracks;

    public PlayList(List<Track> tracks) {
        this.tracks = tracks;
    }

    public void add(Track track) {
        tracks.add(track);
    }

    public List<Track> getTracks() {
        return tracks;
    }
}
