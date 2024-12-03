package upei.project;

public class Block implements Comparable<Block>{
    protected final String name;
    protected int index;

    // constructor
    public Block(String name)
    {
        this.name = name;
    }

    public void doAction(Player currentPlayer){};

    public String toString(){
        return name;
    }

    public int compareTo(Block x){
        return Integer.compare(index, x.index);
    }
}


