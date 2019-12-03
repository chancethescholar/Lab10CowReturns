public class IceDragon extends Dragon
{
    public IceDragon(String name, String image)
    {
        //constructor
        //creates new IceDragon object with name and image
        super(name, image);
    }

    public boolean canBreatheFire()
    {
        //for Icedragon type, return false
        return false;
    }
}
