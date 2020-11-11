import java.util.ArrayList;

public class Bug extends Create {

    private ArrayList<Skill> skills = new ArrayList<Skill>();

    public Bug() {
        System.out.println("И тут выползает невиданный жучара");
    }

    public Bug(String nickname, ArrayList<Skill> skillset) {
        super(nickname);
        skills = skillset;
        System.out.println("Жуки - " + nickname + " явились миру");
    }

    public ArrayList<Skill> GetSkills() {
        return skills;
    }
}
