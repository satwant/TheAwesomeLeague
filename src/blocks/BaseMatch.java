package blocks;
import types.Match;
import types.Team;

public class BaseMatch implements Match
{

	@Override
	public Team getHomeTeam()
	{
		// TODO: Implement this method
		return _homeTeam;
	}

	@Override
	public Team getAwayTeam()
	{
		// TODO: Implement this method
		return _awayTeam;
	}

	private Team _homeTeam =null;
	private Team _awayTeam = null;
	
	public BaseMatch(Team awayTeam, Team homeTeam){
		_homeTeam= homeTeam;
		_awayTeam= awayTeam;
	}
}
