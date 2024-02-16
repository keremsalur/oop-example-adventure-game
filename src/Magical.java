public class Magical extends Item{
    private Magic magic;
    public Magical(int id, String name, int price, Magic magic) {
        super(id, name, price);
        this.magic = magic;
    }

    public Magic getMagic() {
        return magic;
    }

    public void setMagic(Magic magic) {
        this.magic = magic;
    }
}
