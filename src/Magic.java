public class Magic {
    public enum type {ATTACK,DEFENCE,BOTH};
    private int id;
    private String magicName;
    private type magicType;

    public Magic(int id, String magicName, type magicType) {
        this.id = id;
        this.magicName = magicName;
        this.magicType = magicType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMagicName() {
        return magicName;
    }

    public void setMagicName(String magicName) {
        this.magicName = magicName;
    }

    public type getMagicType() {
        return magicType;
    }

    public void setMagicType(type magicType) {
        this.magicType = magicType;
    }

}
