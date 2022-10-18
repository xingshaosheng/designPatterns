package Structured.adapter.pattern;

import Structured.adapter.pattern.Advanced.AdvancedMediaPlayer;
import Structured.adapter.pattern.Advanced.Mp4Player;
import Structured.adapter.pattern.Advanced.VIcPlayer;

public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String type){
        if(type.equalsIgnoreCase("mp4")) advancedMediaPlayer = new Mp4Player();
        else advancedMediaPlayer = new VIcPlayer();
    }

    @Override
    public void play(String type) {
        if(type.equalsIgnoreCase("mp4")) advancedMediaPlayer.playMp4();
        else advancedMediaPlayer.playVIc();
    }
}
