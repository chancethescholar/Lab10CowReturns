public class Dragon extends Cow
{
    public Dragon(String name, String image)
    {
        //constructor
        //creates new dragon class with given name and image
        super(name);
        super.setImage(image);
    }

    public boolean canBreatheFire()
    {
        //returns true for defualt dragon type
        return true;
    }
}