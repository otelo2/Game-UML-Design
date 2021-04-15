//---				CHARACTER					---
public abstract class Character
{
	WeaponBehavior weaponbehavior;
  CharacterBehavior characterbehavior;
  
  public Character()
  {
  }
  
  public abstract void display()
  {
  }
  
  public void fight()
  {
  	weaponbehavior.useWeapon();
    characterbehavior.moveCharacter();
  }
  
  public void setWeapon(WeaponBehavior wb)
  {
  	weaponbehavior = wb;
  }
  
  public void setMovement(CharacterBehavior cb)
  {
  	characterbehavior = cb;
  }
  
  public void showCharacter()
  {
  	display();
  	fight();
  }
  
}


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


//---				WEAPONS					---
public interface WeaponBehavior
{
	public void useWeapon();
}

public class KnifeBehavior extends WeaponBehavior
{
	@Override
	public void useWeapon()
  {
  	System.out.println("I'm cutting with a knife");
  }
}

public class BowAndArrowBehavior extends WeaponBehavior
{
	@Override
	public void useWeapon()
  {
  	System.out.println("I'm shooting an arrow with a bow");  
  }
}

public class AxeBehavior extends WeaponBehavior
{
	@Override
	public void useWeapon()
  {
  	System.out.println("I'm chopping off with an axe");
  }
}

public class SwordBehavior extends WeaponBehavior
{
	@Override
	public void useWeapon()
  {
  	System.out.println("I'm swinging a sword");
  }
}


//---				MOVEMENTS					---
public interface CharacterBehavior
{
	public void moveCharacter();
}

public class WalkBehavior implements CharacterBehavior
{
	@Override
	public void moveCharacter()
  {
  	System.out.println("I'm walking");
  }
}

public class RunBehavior implements CharacterBehavior
{
	@Override
	public void moveCharacter()
  {
  	System.out.println("I'm running");
  }
}

public class SuperSpeedBehavior implements CharacterBehavior
{
	@Override
	public void moveCharacter()
  {
  	System.out.println("I'm running with super speed");
  }
}

public class CrawlBehavior implements CharacterBehavior
{
	@Override
	public void moveCharacter()
  {
  	System.out.println("I'm crawling");
  }
}