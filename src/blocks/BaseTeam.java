package blocks;
import types.Team;
import types.Rank;
import types.*;

public class BaseTeam implements Team
{

	@Override
	public Stat getStat()
	{
		// TODO: Implement this method
		return _stat;
	}

	private String _name =null;
	private Rank _rank = null;
	private Stat _stat = null;
	public BaseTeam(String name) {
		_name = name;
	}
	public BaseTeam(String name, int rank){
		this(name);
		_rank = new BaseRank(rank);
		_stat = new BaseStat(this);
	}
	@Override
	public String getName()
	{
		// TODO: Implement this method
		return _name;
	}

	@Override
	public Rank getRank()
	{
		// TODO: Implement this method
		return _rank;
	}

	
}
