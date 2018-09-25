package config;

import beans.MyBean;
import mediaplayer.MediaPlayer;
import mediaplayer.PlayList;
import mediaplayer.Track;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

//tell Spring that this class contains bean definition or locations
@Configuration
@ComponentScan
public class AppContextConfig3 {

    @Bean
    public MyBean myBean() {
        return  new MyBean("Hello World!");
    }

    @Bean
    public PlayList playList() {
       List<Track> tracks = new ArrayList<Track>();
        tracks.add(track1());
        tracks.add(track2());
        tracks.add(track3());
        PlayList playList = new PlayList(tracks);
        return playList;
    }


    @Bean
    public Track track1() {
        return new Track("SULTANS_OF_SWING","DIRE_STRAITS");
    }
    @Bean
    public Track track2() {
        return new Track("RUN_TO_THE_HILLS","IRON_MAIDEN");
    }
    @Bean
    public Track track3() {
        return new Track("LAYLA","ERIC_CLAPTON");
    }

}
