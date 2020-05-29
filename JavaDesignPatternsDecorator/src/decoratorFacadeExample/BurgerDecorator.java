package decoratorFacadeExample;

public abstract class BurgerDecorator implements Burger {
	
	protected Burger burgerWithSupplements;
	
	public BurgerDecorator(Burger burgerWithSupplements) {
		this.burgerWithSupplements = burgerWithSupplements;
		
	}
	
	@Override
	public void addSupplement() 
	{
		this.burgerWithSupplements.addSupplement();
	}
}
