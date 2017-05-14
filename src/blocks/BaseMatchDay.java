package blocks;
import types.MatchDay;
import java.util.*;
import types.*;
public class BaseMatchDay implements MatchDay
{
	private List<Match> _matches = null;
	public BaseMatchDay(List<Match> matches) {
		_matches = matches;
	}
	@Override
	public List<Match> getMatchs()
	{
		// TODO: Implement this method
		return _matches;
	}

	
}
