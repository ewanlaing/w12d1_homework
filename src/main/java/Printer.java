public class Printer {

    private int paperLeft;
    private int tonerLeft;

    public Printer(int paperLeft, int tonerLeft){
        this.paperLeft = paperLeft;
        this.tonerLeft = tonerLeft;
    }

    public int getPaperLeft() {
        return paperLeft;
    }

    public void setPaperLeft(int paperLeft) {
        this.paperLeft = paperLeft;
    }

    public int getTonerLeft() {
        return tonerLeft;
    }

    public void setTonerLeft(int tonerLeft) {
        this.tonerLeft = tonerLeft;
    }

    public void print(int pages, int copies){
        int totalToSubtract = pages * copies;
        if(getPaperLeft() > totalToSubtract){
            setPaperLeft(getPaperLeft() - totalToSubtract);
            setTonerLeft(getTonerLeft() - totalToSubtract);
        };
    }
}
