class Demo
{
    public void playmusic()
    {
        System.out.println("Music playing");
    }

    public String getapen(int cost)
    {
        if(cost >= 10)
            return "pen";
        else
            return "nothing";
    }
}

public class Music
{
    public static void main(String args[])
    {
        Demo obj = new Demo();

        obj.playmusic();

        String str = obj.getapen(20);

        System.out.println(str);
    }
}