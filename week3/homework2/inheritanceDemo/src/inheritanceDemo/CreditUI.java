package inheritanceDemo;

public class CreditUI {
	//baseCreditmanager diğer creditmanagerların referansını tutabilir. 
	//Tek tek yazmak yerine baseCreditManager parametre olarak geçildi
	public void CreditCalculate(BaseCreditManager baseCreditManager) {
		baseCreditManager.Calculate();
	}

}
