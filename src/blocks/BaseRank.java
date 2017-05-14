package blocks;
import types.Rank;
import types.*;
public class BaseRank implements Rank
{
	private int _rank;
	public BaseRank(int rank){
		_rank = rank;
	}
	@Override
	public RankType getType()
	{
		// TODO: Implement this method
		return null;
	}

	@Override
	public int getRank()
	{
		// TODO: Implement this method
		return _rank;
	}

}
