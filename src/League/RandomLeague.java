package League;
import blocks.*;
import java.util.*;
import types.*;

public class RandomLeague
{
	enum RandomTeam {
		LIVERPOOL,
		ARSENAL,
		CHELSIA,
		MANUNITED,
		MANCITY,
		/*TOTANHAM,
		LIESTERCITY,
		EVERTON,
		SOUTHHAMTOM,
		WESTBROM,
		BURNLYFC,
		STOCKCITY,
		BOURNMOUTH,
		WATFORD,
		WESTHAM,
		CRYSTALPALACE,
		SWANSACITY,
		HULLCITY,
		MIDLESBURG,*/
		SUNDERLAND;

		
		public String getTeam(){
			return this.name();
		}
		public int getRank(){
			return this.ordinal();
		}
	}
	private Roster _roster = null;
	private List<Team> _teamList = null;
	private Random _rand = new Random();
	public void createMatches() {
		RandomTeam teams[] = RandomTeam.values();
		_teamList= new ArrayList<Team>();
		_roster = new BaseRoster();;
		for(int i=0; i < teams.length; i++){
			_teamList.add(new BaseTeam(teams[i].name(), teams[i].ordinal()+1));
		}
		_roster.randomImpementation(_teamList);
	}
	public void playMatches() {
		int leagueSize = RandomTeam.values().length;
		int maxChance = leagueSize+4;
		
		for(MatchDay matchDay : _roster.getMatchDays()){
			
			//maxChance = match.getAwayTeam().getRank().getRank()
			//+ match.getHomeTeam().getRank().getRank();
			for(Match match : matchDay.getMatchs()){
			int chanceHomeTeam = _rand.nextInt(maxChance)
			+(leagueSize - match.getHomeTeam().getRank().getRank());
			int chanceAwayTeam = _rand.nextInt(maxChance)
				+(leagueSize - match.getAwayTeam().getRank().getRank());
				
			System.out.println(match.getHomeTeam().getName()
			+ "(" + chanceHomeTeam
			+ ")\t\tVs.\t(" +chanceAwayTeam
			+ ")" + match.getAwayTeam().getName());
			
			if(chanceHomeTeam < chanceAwayTeam) {
				match.getAwayTeam().getStat().win();
				match.getHomeTeam().getStat().loose();
				
			}
			else if(chanceHomeTeam > chanceAwayTeam){
				match.getAwayTeam().getStat().loose();
				match.getHomeTeam().getStat().win();
			}
			else {
				match.getAwayTeam().getStat().draw();
				match.getHomeTeam().getStat().draw();
			}}
			System.out.println();
		}
		List<Stat> stats= new ArrayList<Stat>();
		for(Team team : _teamList){
			stats.add(team.getStat());
			//team.getStat().defaultDisplay();
			
		}
		java.util.Collections.sort((ArrayList)stats);
		for(Stat st: stats){
			st.defaultDisplay(stats.indexOf(st)+1);
		}
	}
}


