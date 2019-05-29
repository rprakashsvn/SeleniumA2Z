package JavaConcepts;

class indoorGames {
	public void games() {
		System.out.println("Indoor  Games");
	}
}

class OutdoorGames extends indoorGames {
	public void games() {
		System.out.println("Outdoor Games");
	}
}

public class ObjectMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		indoorGames IG = new indoorGames();
		OutdoorGames OG = new OutdoorGames();
		IG.games();
		OG.games();
		IG = OG;
		IG.games();

	}

}
