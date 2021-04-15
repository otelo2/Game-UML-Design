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

