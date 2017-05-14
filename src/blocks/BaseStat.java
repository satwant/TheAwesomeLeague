package blocks;
import types.*;

public class BaseStat implements Stat, Comparable<Stat>
{

	


	@Override
	public int compareTo(Stat x)
	{
		
		int ov = x.getNumberOfDraw()+ x.getNumberOfWin()*3;
		int tv= this._draw+ this._win*3;
		// TODO: Implement this method
		return ov-tv;
	}

	private int _win=0;
	private int _loose=0;
	private int _draw = 0;
	private Team _team = null;
	public BaseStat(Team team) {
		_team = team;
	}
	@Override
	public int getNumberOfWin()
	{
		// TODO: Implement this method
		return _win;
	}

	@Override
	public int win()
	{
		// TODO: Implement this method
		return ++_win;
	}

	@Override
	public int getNumberOfDraw()
	{
		// TODO: Implement this method
		return _draw;
	}

	@Override
	public int draw()
	{
		// TODO: Implement this method
		return ++_draw;
	}

	@Override
	public int getNumberOfLoses()
	{
		// TODO: Implement this method
		return _loose;
	}

	@Override
	public int loose()
	{
		// TODO: Implement this method
		return ++_loose;
	}

	@Override
	public int getNumberPlayed()
	{
		// TODO: Implement this method
		return (_win+_draw+_loose);
	}

	@Override
	public Team getTeam()
	{
		// TODO: Implement this method
		return _team;
	}
	public void defaultDisplay(int c) {
		System.out.println(c
						   + "\t" + getTeam().getName().substring(0,7)
						   + "\t" + (this._team.getRank().getRank() -c)
						   + "\t" + getNumberPlayed()
						   + "\t" + getNumberOfWin()
						   + "\t" + getNumberOfDraw()
						   + "\t" + getNumberOfLoses()
						   + "\t" + (getNumberOfWin()*3
						   + getNumberOfDraw())
						   );
	}
}
