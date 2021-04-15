public class Troll extends Character
{
	public Troll()
  {
  	weaponbehavior = new AxeBehavior();
  	characterbehavior = new CrawlBehavior();
  }
  
	public void display()
  {
  	System.out.println("I'm a Troll");
  }
	
}