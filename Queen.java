public class Queen extends Character
{
	public Queen()
  {
  	weaponbehavior = new BowAndArrowBehavior();
  	characterbehavior = new WalkBehavior();
  }
	public void display()
  {
  	System.out.println("I'm a Queen");
  }
	
}
