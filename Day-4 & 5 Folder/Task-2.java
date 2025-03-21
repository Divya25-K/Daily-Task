// IMPLEMENTING INTERFACE IN JAVA

interface Playable
{
void play();    
}

 class Guitar implements Playable
{
    @Override 
    public void play()
    {
        System.out.println("** Play Guitar **");
    }
}
class Piano implements Playable
{
    @Override
    public void play()
    {
        System.out.println("** Play Piano **");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Playable g=new Guitar();
        Playable p=new Piano();
        g.play();
        p.play();
    }
}
