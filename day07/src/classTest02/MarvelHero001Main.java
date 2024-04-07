package classTest02;

public class MarvelHero001Main {
	public static void main(String[] args) {
		MavelHero001 ironman= new MavelHero001("아이언맨","에너지빔",20);
		System.out.println(ironman);
		ironman.heroInfo();
		
		ironman.name="아이언맨2";
		ironman.superpower="에너지폭탄";
		ironman.age=12;
		ironman.heroInfo();
		
		ironman.performAction();
		
		
		MavelHero001 hulk= new MavelHero001("헐크","근육파워",30);
		System.out.println(hulk);
		hulk.heroInfo();
		
		hulk.name="헐크2";
		hulk.superpower="발차기";
		hulk.age=20;
		hulk.heroInfo();
		
		hulk.performAction();
			
		
		
		
		
		
	}
}
