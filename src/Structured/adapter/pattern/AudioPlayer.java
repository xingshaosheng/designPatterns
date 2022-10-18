package Structured.adapter.pattern;

public class AudioPlayer implements MediaPlayer{
    @Override
    public void play(String type) {
        if(type.equalsIgnoreCase("mp3")) System.out.println("播放Mp3文件");
        else if(type.equalsIgnoreCase("mp4")) new MediaAdapter(type).play(type);
        else if(type.equalsIgnoreCase("VIc")) new MediaAdapter(type).play(type);
        else System.out.println("文件格式不支持播放");
    }
}
