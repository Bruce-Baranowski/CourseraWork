package adapterPattern;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
	private OldCoffeeMachine oldMachine = new OldCoffeeMachine();

	@Override
	public void chooseFirstSelection() {
		oldMachine.selectA();
	}

	@Override
	public void chooseSecondSelection() {
		oldMachine.selectB();
	}

}
