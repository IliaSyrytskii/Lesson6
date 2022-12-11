public class Computer {
    public static class RAM {
        String name;
        int size;

        RAM() {
            this.name = "DDR4";
            this.size = 8;
        }
        RAM(String name, int size) {
            this.name = name;
            this.size = size;
        }

        @Override
        public String toString() {
            return "RAM{" +
                    "name='" + name + '\'' +
                    ", size=" + size +
                    '}';
        }
    }
    public static class HDD {
        String name;
        int volume;
        String type;

        HDD() {
            this.name = "Toshiba";
            this.volume = 1000;
            this.type = "internal";
        }



        HDD (String name, int volume, String type) {
            this.name = name;
            this.volume = volume;
            this.type = type;

        }
        @Override
        public String toString() {
            return "HDD{" +
                    "name='" + name + '\'' +
                    ", volume=" + volume +
                    ", type='" + type + '\'' +
                    '}';
        }
    }

    int cost;
    String model;
    RAM ram;
    HDD hdd;

    Computer(int i, String asus) {
        this.cost = 2500;
        this.model = "Asus";
        this.ram = new RAM();
        this.hdd = new HDD();
    }
    Computer(int cost, String model, HDD hdd, RAM ram) {
        this.cost = cost;
        this.model = model;
        this.hdd = hdd;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cost=" + cost +
                ", model='" + model + '\'' +
                ", RAM=" + ram +
                ", HDD=" + hdd +
                '}';
    }
    public static void main (String[] args) {
        Computer comp1 = new Computer(2500, "Asus");
        System.out.println(comp1);

        Computer.RAM ram1 = new RAM("DDR5", 16);
        HDD hdd1 = new HDD("Seagate", 2000, "internal");


        Computer comp2 = new Computer(4000, "Asus", hdd1, ram1);
        System.out.println(comp2);
    }
}


