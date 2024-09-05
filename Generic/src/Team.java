import java.util.ArrayList;
import java.util.List;

public class Team<T>  {
    private String name;
    private List<T> teamMembers;

    public Team(String name){
        this.name = name;
        teamMembers = new ArrayList<T>();
    }

    public List<T> getTeamMembers() {
        return teamMembers;
    }

    public String getName() {
        return name;
    }

    public void addTeamMember(T member){
        if(!teamMembers.contains(member))
            teamMembers.add(member);
    }
}
