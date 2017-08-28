package structural.adapter.duckturkey;

public class Client {

	public static void main(String[] args) {
		MallardDuck md = new MallardDuck();
		System.out.println(md.getClass().getName() + " quack()=" + md.quack());
		
		WildTurkey wt = new WildTurkey();
		System.out.println(wt.getClass().getName() + " gobble()=" + wt.gobble());
		
		WildTurkey confusedTu = new WildTurkey();
		TurkeyAdapter confusedTuAd = new TurkeyAdapter(confusedTu);
		System.out.println(confusedTuAd.getClass().getName() + " quack()=" + confusedTuAd.quack());
	}

}
