package types;

public interface Stat
{
	public int getNumberOfWin();
	public int win();
	public int getNumberOfDraw();
	public int draw();
	public int getNumberOfLoses();
	public int loose();
	public int getNumberPlayed();
	public Team getTeam();
	public void defaultDisplay(int c);
}
