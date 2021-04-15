
public class Knight extends Character
{
	public Knight()
  {
  	weaponbehavior = new KnifeBehavior();
  	characterbehavior = new SuperSpeedBehavior();
  }
  

  public void display()
  {
  	System.out.println("I'm a Knight");
  }
  
}