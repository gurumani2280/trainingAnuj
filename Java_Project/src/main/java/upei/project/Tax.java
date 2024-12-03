package upei.project;

public class Tax extends Block{
    private int taxAmount;

    public Tax(String name, int taxAmount){
        super(name);
        this.taxAmount = taxAmount;
    }

    //TODO
    @Override
    public void doAction(Player p) {

    }
}
