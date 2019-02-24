package AbstractFactory;

public abstract class House {

    House(HouseType type, Location location)
    {
        this.type = type;
        this.location = location;
    }

    abstract void construct();

    HouseType type = null;
    Location location = null;

    HouseType getType()
    {
        return type;
    }

    void setType(HouseType type)
    {
        this.type = type;
    }

    Location getLocation()
    {
        return location;
    }

    void setLocation(Location location)
    {
        this.location = location;
    }

    @Override
    public String toString()
    {
        return "HouseType - "+type + " \nLocated in - "+location+"\n";
    }
}
