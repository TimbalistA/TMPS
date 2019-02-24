package Builder;

public class Jewellery {

    private int id;
    private String type;
    private String gold;

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getGold() {
        return gold;
    }

    private Jewellery(JewelleryBuilder builder) {
        this.id=builder.id;
        this.type=builder.type;
        this.gold=builder.gold;
    }

    //Builder Class
    public static class JewelleryBuilder{

        private int id;
        private String type;
        private String gold;

        public JewelleryBuilder(int id,String type, String gold){
            this.id=id;
            this.type=type;
            this.gold=gold;
        }

        public Jewellery build(){
            return new Jewellery(this);
        }

    }

}

