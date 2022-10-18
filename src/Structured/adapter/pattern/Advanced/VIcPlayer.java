package Structured.adapter.pattern.Advanced;

public class VIcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVIc() {
        System.out.println("VIcPlayer play VIc file!");
    }

    @Override
    public void playMp4() {
        //ignore
    }
}
