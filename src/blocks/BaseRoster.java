package blocks;
import types.Roster;
import java.util.List;
import types.Match;
import types.Team;
import types.RostorGenerator;
import java.util.Iterator;
import java.util.ArrayList;
import types.*;

public class BaseRoster implements Roster
{

	@Override
	public List<MatchDay> getMatchDays()
	{
		// TODO: Implement this method
		return _rostor.getMatchDays();
	}

	private List<Match> _matchs= null;
	private RostorGenerator _rostor = null; 
	@Override
	public void setMatches(List<Match> list)
	{
		_matchs = list;
	}

	@Override
	public List<Match> getMatches()
	{
		
		return _matchs;
	}
	public void randomImpementation(List<Team> teams) {
		_rostor= new BaseRostorGenerator();
		_rostor.setTeams(teams);
		_rostor.generate();
		_matchs = _rostor.getMatchs();
		//basicImplementation(teams);
	}
	protected void basicImplementation(List<Team> teams){
		Iterator<Team> _teamA = teams.iterator();
		_matchs = new ArrayList<Match>();

		while(_teamA.hasNext()){
			Team _tempA = _teamA.next();
			Iterator<Team> _teamB = teams.iterator();
			while(_teamB.hasNext()){
				Team _tempB = _teamB.next();

				if(!_tempA.equals(_tempB)){
					_matchs.add(new BaseMatch(_tempA, _tempB));
				}
			}
		}
	}
	
}
