public class Cow
{
    public String name;
    public String image;

    public Cow(String name)
    {
        //constructor
        this.name = name;
    }

    public String getName()
    {
        //Returns name of cow
        return name;
    }

    public String getImage()
    {
        //Returns image used to display cow (after the message)
        return image;
    }

    public void setImage(String _image)
    {
        //Sets image used to display the cow (after the message)
        this.image = _image;
    }
}
