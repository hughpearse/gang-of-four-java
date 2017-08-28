package structural.adapter.duckturkey;

public class Client {

	public static void main(String[] args) {
		/*
		 * Details:
		 * Allows an interface to be used while modifying the underlying method executed
		 * 
		 * Outputs:
		 * structural.adapter.duckturkey.MallardDuck quack()=Quack
		 * structural.adapter.duckturkey.WildTurkey gobble()=Goggle gobble
		 * structural.adapter.duckturkey.TurkeyAdapter quack()=Goggle gobble
		 */
		MallardDuck md = new MallardDuck();
		System.out.println(md.getClass().getName() + " quack()=" + md.quack());
		
		WildTurkey wt = new WildTurkey();
		System.out.println(wt.getClass().getName() + " gobble()=" + wt.gobble());
		
		WildTurkey confusedTu = new WildTurkey();
		TurkeyAdapter confusedTuAd = new TurkeyAdapter(confusedTu);
		System.out.println(confusedTuAd.getClass().getName() + " quack()=" + confusedTuAd.quack());
	}

}
