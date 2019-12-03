public class Cowsay
{
    public static void main(String[] args)
    {
        Cow[] cows = HeiferGenerator.getCows();
        Cow[] fileCows = HeiferGenerator.getFileCows();

        if (args.length > 0)
        {
            switch (args[0]) //args[0] = print command/message
            {
                case "-l":
                    System.out.print("Regular cows available: ");
                    listCows(cows);
                    System.out.print("File cows available: ");
                    listCows(fileCows);
                    break;

                case "-n":
                    Cow cow = findCow(args[1], cows); //args[1] = cow name
                    if (cow == null)//if cow does not exist
                        System.out.print("Could not find " + args[1] + " cow!\n");

                    else
                    {
                        for (int i = 2; i < args.length; i++)//print everything after cow name (args[1])
                        {
                            System.out.print(args[i] + " ");
                        }

                        System.out.print("\n" + cow.getImage());//print cow image
                        if (cow instanceof Dragon && !(cow instanceof IceDragon))//if cow is dragon but not ice dragon
                            System.out.println("This dragon can breathe fire.");

                        if (cow instanceof IceDragon)//if cow is ice dragon
                            System.out.println("This dragon cannot breathe fire.");

                    }
                    break;

                case "-f":
                    Cow fileCow = findCow(args[1], fileCows);
                    if (fileCow == null)//if filecow not found
                    {
                        System.out.println("Could not find " + args[1] + " cow!\n");
                    }

                    else
                    {
                        System.out.print("\n");
                        for (int i = 2; i < args.length; i++)
                        {
                            System.out.print(args[i] + " ");
                        }
                        System.out.print("\n");
                        System.out.print(fileCow.getImage());//print image of filecow
                    }

                    break;

                default://prints message after "Cowsay"
                    for (String c: args)
                        System.out.print(c + " ");

                    System.out.print("\n" + cows[0].getImage());

            }
        }
    }

    private static void listCows(Cow[] cows)
    {
        //Displays list of available cows from array of Cow objects
        for (Cow cow: cows)
        {
            System.out.print(cow.getName() + " ");
        }

        System.out.print("\n");
    }

    private static Cow findCow(String name, Cow[] cows)
    {
        //Given a name and array of Cow objects, return Cow object
        for (Cow cow: cows)
        {
            if (cow.getName().equals(name))
                return cow;
        }

        return null;
    }
}