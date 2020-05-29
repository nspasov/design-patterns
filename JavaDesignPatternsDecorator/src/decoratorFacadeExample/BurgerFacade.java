package decoratorFacadeExample;

public class BurgerFacade {
	
	private Burger classicBurger;
	private Burger eggBurger;
	private Burger cheeseBurger;
	
	public BurgerFacade() 
	{
		this.classicBurger = new ClassicBurger();
		this.eggBurger = new EggSupplement();
		this.cheeseBurger = new CheeseSupplement();
		
	}
	
	public void orderClassicBurger()
	{
		this.classicBurger.addSupplement();
	}
	
	public void orderBurgerWithEgg() 
	{
		
		this.eggBurger.addSupplement();	
	}
	
	public void orderBurgerWithCheese() 
	{
		
		this.cheeseBurger.addSupplement();
	}
	

}
