package surprise;

public class Main {

	public static void main(String[] args) {
		
		BagFactoryOptimizeStorage test = new BagFactoryOptimizeStorage();
		IBag fifoBag = test.makeBag("FIFO");
		
		for (int i = 0 ; i < 5; i++) {
			fifoBag.put(GatherSurprises.gather());
		}
		
		GiveSurpriseAndHug surpriza1 = new GiveSurpriseAndHug("FIFO", 1);
		//surpriza1.put(fifoBag);
		//System.out.println(surpriza1);
		//surpriza1.giveAll();
		
		GiveSurpriseAndApplause surpriza2 = new GiveSurpriseAndApplause("LIFO", 3);
		//surpriza2.put(fifoBag);
		//System.out.println(surpriza2);
		//surpriza2.giveAll();
		
		GiveSurpriseAndSing surpriza3 = new GiveSurpriseAndSing("RANDOM", 5);
		//surpriza3.put(fifoBag);
		//System.out.println(surpriza3);
		//surpriza3.giveAll();
		
		// Bagul este de tipul FIFO
		surpriza1.put(GatherSurprises.gather(10));
		System.out.println(surpriza1);
		surpriza1.giveAll();
		
		for (int i = 0; i < 5; i++) {
			surpriza1.put(GatherSurprises.gather());
		}
		System.out.println(surpriza1);
		for (int i = 0; i < 5; i++) {
			surpriza1.give();;
		}
		
		
		surpriza2.put(GatherSurprises.gather(15));
		System.out.println(surpriza2);
		surpriza2.giveAll();
		
		surpriza3.put(GatherSurprises.gather(5));
		System.out.println(surpriza3);
		surpriza3.giveAll();
		
		
		
		
	}

}
