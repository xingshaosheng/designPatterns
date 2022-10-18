package Structured.adapter.pattern.Advanced;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVIc() {
        //ignore
    }

    @Override
    public void playMp4() {
        System.out.println("Mp4Player play Mp4 file!");
    }
}
