package upei.project;
import java.util.*;
import java.util.List;

public class Player {
    private ArrayList<java.util.Properties> properties = new ArrayList<java.util.Properties>();
    private final String name;
    private int position;
    private int money = 1500;

    public boolean inJail = false;
    public int outOfJailCards = 0;
    public int turnsInJail = 0;

    public Player(String name){
        this.name = name;
        position = 0;
    }

    public String getName() { return name; }

    public int getPosition() { return position; }

    public int getMoney() { return money; }

    public void addMoney(int addMoney){
        if(money < -addMoney){
            broke(-addMoney - money);
        }

        this.money += addMoney;
    }

    private void broke(int amountNeeded){
        System.out.println("You are missing $" + amountNeeded);
        List<PlayerOption> options = Arrays.asList(
                new MortgageOption(this)
        );
    }

    public void pay(Player receiving, int amount){
        receiving.addMoney(amount);
        addMoney(-amount);
    }

    public void move(int numSquares, Square board){
        position += numSquares;

        //if pass GO
        if(position >= 40){
            System.out.println(name + " passed GO and collected $200");
            money += 200;
            position %= 40;
        }

        System.out.println("Landed on " + board.getCurrentSquare(this));
        board.getCurrentSquare(this).doAction(this);
    }

    public void moveTo(int toPosition, Board board){
        move((40 - position + toPosition) % 40, board);
    }

    //add property to Player's properties
    public void buy(Properties property){
        addMoney(-property.getPrice());
        properties.add(property);
        sortPropertiesByGroup(properties);
    }

    public void sell(Properties property){
        addMoney(property.getPrice() / 2);
        property.setOwner(null);
    }

    public void mortgage(Properties property){
        property.mortgaged = true;
        addMoney(property.getPrice() / 2);
    }

    public void payMortgage(Properties property){
        property.mortgaged = false;
        addMoney( (int) (-property.getPrice() * 0.55) );
    }

    public int getWorth(){
        int total = 0;

        for(Properties p : properties){
            if(p instanceof PropertyDetails){
                total += (((PropertyDetails) p).getNumHouses() * ((PropertyDetails) p).getHouseCost()) / 2;
            }

            total += p.getPrice() / 2;
        }

        return total + money;
    }

    private void sortPropertiesByGroup(ArrayList<Properties> properties){
        ArrayList<Utility> utilities = new ArrayList<>();
        ArrayList<Railroad> railroads = new ArrayList<>();
        ArrayList<Properties> sorted = new ArrayList<>();

        for(Properties property : properties){
            if(property instanceof Utility){
                utilities.add((Utility) property);
            } else if(property instanceof Railroad){
                railroads.add((Railroad) property);
            } else {
                sorted.add(property);
            }
        }
        Collections.sort(utilities);
        Collections.sort(railroads);
        Collections.sort(sorted);

        sorted.addAll(railroads);
        sorted.addAll(utilities);

        this.properties = sorted;
    }

    public void listProperties(){
        if(properties.isEmpty()){
            System.out.println("You do not own any properties");
        }
        for(Properties property : properties){
            System.out.println(property);
        }
    }

    public int getNumRailroads(){
        int numRailroads = 0;
        for(Properties p : properties){
            if(p instanceof Railroad){
                numRailroads++;
            }
        }

        return numRailroads;
    }

    public int getNumUtilities(){
        int numUtilities = 0;
        for(Properties p : properties){
            if(p instanceof Utility){
                numUtilities++;
            }
        }

        return numUtilities;
    }

    //returns list of all properties that Player owns color group
    public ArrayList<PropertyDetails> getOwnColorGroupList(){
        ArrayList<PropertyDetails> list = new ArrayList<>();
        for(Properties property: properties){
            if(property instanceof PropertyDetails && ownsGroup(((PropertyDetails) property).getGroup())){
                list.add((PropertyDetails) property);
            }
        }
        return list;
    }

    //return list of all properties that Player can place house
    public ArrayList<PropertyDetails> getHouseableProperties(){
        ArrayList<PropertyDetails> houseable = new ArrayList<>();
        for(PropertyDetails i : getOwnColorGroupList()){
            boolean lowestHouses = true;

            for(PropertyDetails j : getOwnColorGroupList()){
                if(i.getGroup() == j.getGroup() && i.getNumHouses() > j.getNumHouses()){
                    lowestHouses = false;
                }
            }

            if(lowestHouses && i.getNumHouses() != 5){
                houseable.add(i);
            }
        }

        return houseable;
    }

    //return list of properties without houses (that can be mortgaged)
    public ArrayList<Properties> getUnimprovedProperties(){
        ArrayList<Properties> unimproved = new ArrayList<>();
        for(Properties property : properties){
            if(property instanceof PropertyDetails && ((PropertyDetails) property).getNumHouses() != 0);
            else {
                unimproved.add(property);
            }
        }

        return unimproved;
    }

    public ArrayList<Properties> getMortgagedProperties(){
        ArrayList<Properties> mortgaged = new ArrayList<>();
        for(Properties property : properties){
            if(property.mortgaged){
                mortgaged.add(property);
            }
        }

        return mortgaged;
    }

    //check if property is in Player's properties
    private boolean owns(Properties property){
        return properties.contains(property);
    }

    //check if Player owns all of a certain color group
    public boolean ownsGroup(PropertyDetails.Group group){
        int count = 0;

        for(Properties property : properties){
            if(property instanceof PropertyDetails && ((PropertyDetails) property).getGroup() == group){
                count++;
            }
        }

        return (count == group.maxInGroup);
    }
}


}
