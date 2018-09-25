package mediaplayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MediaPlayer {

    @Autowired
    private PlayList playList;

    //MediaPlayer

    public MediaPlayer(PlayList playList) {
        this.playList = playList;
    }

//    public MediaPlayer(PlayList playList) {
//        this.playList = playList;
//    }

    public  void play(){
        for(Track track: playList.getTracks()){
            track.play();
        }
    }

}
