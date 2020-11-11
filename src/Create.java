public abstract class Create implements Creator {

    private String name;

    public Create() {

    }

    public Create(String nickname) {
        name = nickname;
    }

    public String GetName() {
        return name;
    }
}
