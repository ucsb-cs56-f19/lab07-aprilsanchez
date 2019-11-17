package hello;

public class EqSearch implements java.io.Serializable {
    private int distance;
    private int minmag;

    EqSearch() {}

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return this.distance;
    }

    public void setMinmag(int minmag) {
        this.minmag = minmag;
    }

    public int getMinmag() {
        return this.minmag;
    }
}
