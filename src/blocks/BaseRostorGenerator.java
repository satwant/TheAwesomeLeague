package blocks;
import types.RostorGenerator;
import java.util.*;
import types.*;
public class BaseRostorGenerator 
implements RostorGenerator
{

	@Override
	public void setTeams(List<Team> teams)
	{
		_teams = teams;
	}

	private List<Match> _matches;
	private List<MatchDay> _matchdays;
	private List<Team> _teams;
	@Override
	public boolean generate()
	{
		_matches = new ArrayList<Match>();
		_matchdays = new ArrayList<MatchDay>();
		// TODO: Implement this method
		return true;
	}

	@Override
	public List<Match> getMatchs()
	{
		// TODO: Implement this method
		return _matches;
	}

	@Override
	public List<MatchDay> getMatchDays()
	{
		// TODO: Implement this method
		return _matchdays;
	}

}
