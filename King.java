public class King extends Character
{
	public King()
  {
  	weaponbehavior = new SwordBehavior();
  	characterbehavior = new RunBehavior();
  }
	
  public void display()
  {
  	System.out.println("I'm a King");
  }
	
}
