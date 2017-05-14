package blocks;
import types.Roster;
import java.util.List;
import types.Match;
import types.Team;
import java.util.Iterator;
import java.util.ArrayList;

public class BaseRoster implements Roster
{
	private List<Match> _matchs= null;
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
		basicImplementation(teams);
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
