public class Skill {

    private String name;
    private String how;

    public Skill(String naming) {
        name = naming;
    }

    public Skill(String naming, String info) {
        name = naming;
        how = info;
    }

    public String GetName() {
        return name;
    }

    public String GetInfo() {
        if (how == null)
            return "";
        else
            return how;
    }

}
