public class Thing implements Craft {

    private ThingType type;
    private String description;
    private String action;
    private String how;

    public Thing(ThingType retype) {
        type = retype;
    }

    public Thing(ThingType retype, String desc) {
        type = retype;
        description = desc;
    }

    public Thing(ThingType retype, String desc, String act) {
        type = retype;
        action = act;
        description = desc;
    }

    public Thing(ThingType retype, String desc, String act, String so) {
        type = retype;
        action = act;
        description = desc;
        how = so;
    }

    public String GetName() {
        String typename = "";
        switch (type) {
            case Feast:
                typename = "пиршество";
                break;
            case Table:
                typename = " столами";
                break;
            case Rocket:
                typename = "Ракета";
                break;
            case Stars:
                typename = "Дождь белых вёзд";
                break;
            case Fountain:
                typename = "фонтан";
                break;
            case Storm:
                typename = "вьюга.";
                break;
            case Barrel:
                typename = "бочку";
                break;
            case Dishes:
                typename = "посуда";
                break;
            case Cup:
                typename = "чашка";
                break;
            case Wineglass:
                typename = "бокал";
                break;
            case Goblet:
                typename = "кубок";
                break;
            case Conch:
                typename = "ракушку";
                break;
            case Sheet:
                typename = "лист";
                break;
        }
        return typename;
    }

    public String GetDescription() {
        return description == null ? "" : description;
    }

    public String GetAction() {
        return action == null ? "" : action;
    }

    public String GetHow() {
        return how == null ? "" : how;
    }

    @Override
    public String toString() {
        return GetName() + " ("+type+")";
    }

    @Override
    public boolean equals(Object obj) {
        return (this.hashCode() == obj.hashCode());
    }

    @Override
    public int hashCode() {
        return GetName().hashCode() + type.hashCode();
    }

}
