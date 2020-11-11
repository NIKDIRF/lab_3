import java.util.ArrayList;

public class Human extends Create {

    private ArrayList<Skill> skills = new ArrayList<Skill>();
    private Thing to;
    private Thing second;

    public Human() {
        System.out.println("Некто явился миру");
    }

    public Human(String nickname, ArrayList<Skill> skillist) {
        super(nickname);
        skills = skillist;
        System.out.println("Человек/и - " + nickname + " явился миру");
    }

    public Human(String nickname, ArrayList<Skill> skillist, Thing tothing) {
        super(nickname);
        skills = skillist;
        to = tothing;
        System.out.println("Человек/и - " + nickname + " явился миру");
    }

    public Human(String nickname, ArrayList<Skill> skillist, Thing tothing, Thing secondthing) {
        super(nickname);
        skills = skillist;
        to = tothing;
        second = secondthing;
        System.out.println("Человек/и - " + nickname + " явился миру");
    }

    public String GetTo() {
        return to.GetDescription() + to.GetName() + to.GetHow();
    }

    public String GetSecond() {
        return second.GetDescription() + second.GetName() + second.GetHow();
    }

    public ArrayList<Skill> GetSkills() {
        return skills;
    }
}
