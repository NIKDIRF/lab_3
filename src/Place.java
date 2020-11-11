public class Place {
    private String map;
    private String info;
    private Thing has;

    public Place(String minimap) {
        map = minimap;
    }

    public Place(String minimap, String condition) {
        map = minimap;
        info = condition;
    }

    public Place(String minimap, String condition, Thing got) {
        map = minimap;
        info = condition;
        has = got;
    }

    public String GetMap() {
        return info == null ? map : map + " " + info;
    }

}
