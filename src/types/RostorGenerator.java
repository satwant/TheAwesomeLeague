package types;
import java.util.List;
public interface RostorGenerator
{
	public boolean generate();
	public List<Match> getMatchs();
	public List<MatchDay> getMatchDays();
	public void setTeams(List<Team> teams);
	
}
