package classTest02;

public class MavelMain1 {

	public static void main(String[] args) {
		MarvelHero1 ironMan= new MarvelHero1("아이언맨","에너지빔",20);
		System.out.println(ironMan);
		
		ironMan.heroInfo();
		
		MarvelHero1 hulk= new MarvelHero1();
		System.out.println(hulk);	
		
		ironMan.name="아이언맨";
		ironMan.superPower="에너지 빔";
		ironMan.age=40;
		 
		hulk.name="헐크";
		hulk.superPower="근력파워";
		hulk.age=35;

		hulk.heroInfo();
		ironMan.heroInfo();
	}

}
