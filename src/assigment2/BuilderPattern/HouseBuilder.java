package assigment2.BuilderPattern;

public class HouseBuilder {
    String foundation;
    String structure;
    String roof;
    boolean hasGarage;
    boolean hasPool;

    public HouseBuilder(String foundation, String structure) {
        this.foundation = foundation;
        this.structure = structure;
    }
    public HouseBuilder withRoof(String roof) {
        this.roof = roof;
        return this;
    }
    public HouseBuilder withGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }
    public HouseBuilder withPool(boolean hasPool) {
        this.hasPool = hasPool;
        return this;
    }
    public House build() {
        return new House(this);
    }
    @Override
    public String toString() {
        return "House [foundation=" + foundation + ", structure=" + structure + ", roof=" + roof +
                ", hasGarage=" + hasGarage + ", hasPool=" + hasPool + "]";
    }

}
