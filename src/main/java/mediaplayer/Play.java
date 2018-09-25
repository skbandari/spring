package mediaplayer;

import java.util.*;

public class Play {

    public static void main(String[] args) {

        Track track1 = new Track("SULTANS_OF_SWING", "DIRE_STRAITS");
        Track track2 = new Track("RUN_TO_THE_HILLS", "IRON_MAIDEN");
        Track track3 = new Track("LAYLA", "ERIC_CLAPTON");

        List<Track> tracks = new ArrayList<Track>();

        tracks.add(track1);
        tracks.add(track2);
        tracks.add(track3);

        PlayList playList = new PlayList(tracks);

        MediaPlayer mediaPlayer = new MediaPlayer(playList);
        mediaPlayer.play();



    }
}
