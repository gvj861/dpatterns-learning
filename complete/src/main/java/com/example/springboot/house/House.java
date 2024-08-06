package com.example.springboot.house;

public class House {
    // Required parameters
    private String foundation;
    private String structure;
    private String roof;

    // Optional parameters
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasGarden;
    private boolean hasStatues;

    private House(HouseBuilder builder) {
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.roof = builder.roof;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
        this.hasGarden = builder.hasGarden;
        this.hasStatues = builder.hasStatues;
    }

    @Override
    public String toString() {
        return "House [foundation=" + foundation + ", structure=" + structure + ", roof=" + roof
                + ", hasGarage=" + hasGarage + ", hasSwimmingPool=" + hasSwimmingPool
                + ", hasGarden=" + hasGarden + ", hasStatues=" + hasStatues + "]";
    }

    public static class HouseBuilder {
        // Required parameters
        private String foundation;
        private String structure;
        private String roof;

        // Optional parameters
        private boolean hasGarage;
        private boolean hasSwimmingPool;
        private boolean hasGarden;
        private boolean hasStatues;

        public HouseBuilder(String foundation, String structure, String roof) {
            this.foundation = foundation;
            this.structure = structure;
            this.roof = roof;
        }

        public HouseBuilder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setHasSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public HouseBuilder setHasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public HouseBuilder setHasStatues(boolean hasStatues) {
            this.hasStatues = hasStatues;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}