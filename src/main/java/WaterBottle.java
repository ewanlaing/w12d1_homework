public class WaterBottle {

    private int volume;
    public WaterBottle(){
        this.volume = 100;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void drink(){
        this.setVolume(this.getVolume() - 10);
    }

    public void empty(){
        this.setVolume(0);
    }

    public void fill(){
        this.setVolume(100);
    }
}
