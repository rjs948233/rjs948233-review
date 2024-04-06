package musicInter;

public class MusicMain {

	public static void main(String[] args) {
		check(new Rock() );
		check(new Ballad());
		check(new HipHop());

//		Music mu1 = new Rock(); 
//		Music mu2 = new Ballad(); 
//		Music mu3 = new HipHop(); 
    }
	static void check(Music music) 	{
		music.mode();
       	if(music instanceof Ballad) {
       		((Ballad)music).onlyBallad();
       	}else if(music instanceof Rock) {
       		((Rock)music).onlyRock();
       	}else if(music instanceof HipHop) {
       		((HipHop)music).onlyHipHop();
	    }
	} 
	
}
	
