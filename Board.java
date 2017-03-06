import java.util.ArrayList;
import java.util.List;

public class Board {
	public Board(){
		
	}
	
	public static List<Segment> segs = new ArrayList<Segment>();
	
	Go GO = new Go("Go",0);
	Properties OKR = new Properties("Old Kent Road", 60, 1);
	CommunityChest CC1 = new CommunityChest("Community Chest", 2);
	Properties WCR = new Properties("Whitechapel Road", 60, 3);
	Tax Income = new Tax("Income Tax", 200, 4);
	Station KCS = new Station("Kings Cross Station", 200, 5);
	Properties TAI = new Properties("The Angel Islington", 100, 6);
	Chance C1 = new Chance("Chance1", 7);
	Properties ER = new Properties("Euston Road", 100, 8);
	Properties PR = new Properties("Pentonville Road", 120, 9);
	Jail jail = new Jail("Jail", 10);
	Properties PM = new Properties("Pall Mall", 140, 11);
	Tax Electric = new Tax("Electric Company", 200, 12);
	Properties WH = new Properties("Whitehall", 140, 13);
	Properties NUA = new Properties("Northumrld Avenue", 160, 14);
	Station MS = new Station("Marylebone Station", 200, 15);
	Properties BS = new Properties("Bow Street", 180, 16);
	CommunityChest CC2 = new CommunityChest("Community Chest", 17);
	Properties MarlS = new Properties("Marlborough Street", 180, 18);
	Properties VS = new Properties("Vine Street", 200, 19);
	FreeParking FP = new FreeParking("Free Parking", 20);
	Properties S = new Properties("Strand", 220, 21);
	Chance C2 = new Chance("Chance2", 22);
	Properties FS = new Properties("Fleet Street", 220, 23);
	Properties TS = new Properties("Trafalgar Square", 240, 24);
	Station FSS = new Station("Fenchurch St. Station", 200, 25);
	Properties LS = new Properties("Leicester Square", 260, 26);
	Properties CS = new Properties("Coventry Street", 260, 27);
	Tax WW = new Tax("Water Works", 200, 28);
	Properties P = new Properties("Piccadilly", 280, 29);
	GoToJail goToJail = new GoToJail("Go to Jail", 30);
	Properties RS = new Properties("Regent Street", 300, 31);
	Properties OS = new Properties("Oxford Street", 300, 32);
	CommunityChest CC3 = new CommunityChest("Community Chest", 33);
	Properties Bond = new Properties("Bond Street", 320, 34);
	Station LSS = new Station("Liverpool St. Station", 200, 35);
	Chance C3 = new Chance("Chance", 36);
	Properties PL = new Properties("Park Lane", 250, 37);
	Tax Super = new Tax("Super Tax", 200, 38);
	Properties M = new Properties("Mayfair", 400, 39);	
	
	public void createBoard(){
		
		segs.add(GO);
		segs.add(OKR);
		segs.add(CC1);
		segs.add(WCR);
		segs.add(Income);
		segs.add(KCS);
		segs.add(TAI);
		segs.add(C1);
		segs.add(ER);
		segs.add(PR);
		segs.add(goToJail);
		segs.add(PM);
		segs.add(Electric);
		segs.add(WH);
		segs.add(NUA);
		segs.add(MS);
		segs.add(BS);
		segs.add(CC2);
		segs.add(MarlS);
		segs.add(VS);
		segs.add(FP);
		segs.add(S);
		segs.add(C2);
		segs.add(FS);
		segs.add(TS);
		segs.add(FSS);
		segs.add(LS);
		segs.add(CS);
		segs.add(WW);
		segs.add(P);
		segs.add(goToJail);
		segs.add(RS);
		segs.add(OS);
		segs.add(CC3);
		segs.add(Bond);
		segs.add(LSS);
		segs.add(C3);
		segs.add(PL);
		segs.add(Super);
		segs.add(M);
		
		//add segments to board array
		//Round()
		
	}
	
	public Segment getSegment(int position){
		//System.out.println(Arrays.toString(segs.toArray()));
		if(position <= 39){
			return segs.get(position);
		}
		else{
			return segs.get(position - 39);
		}
		
		
	}
	
}
