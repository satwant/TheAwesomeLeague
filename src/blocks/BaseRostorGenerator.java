package blocks;
import types.RostorGenerator;
import java.util.*;
import types.*;
import utils.StandardCircularList;
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
		StandardCircularList<Team> scl= new StandardCircularList<Team>(_teams);
		int size = (_teams.size() -1);
		for(int loop=0; loop <size; loop++){
			scl.diffrence(loop);
			List<Match> tlist = new ArrayList<Match>();
			while(scl.canIterate()){
				Match temp = new BaseMatch(scl.nextA(), scl.nextB());
				System.out.println(temp.getHomeTeam().getName()+" "+ temp.getAwayTeam().getName());
				tlist.add(temp);
			}
			
			_matchdays.add( new BaseMatchDay(tlist));
			_matches.addAll(tlist);
		}
		for(int loop=1; loop <= 0; loop++){
			scl.diffrence(loop);
			List<Match> tlist = new ArrayList<Match>();
			while(scl.canIterate()){
				Match temp = new BaseMatch(scl.nextB(), scl.nextA());
				tlist.add(temp);
			}
			
			_matchdays.add( new BaseMatchDay(tlist));
			_matches.addAll(tlist);
		}
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
