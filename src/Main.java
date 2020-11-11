import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Skill> allskills = new ArrayList<Skill>();
        allskills.add(new Skill("почувствовали ","себя непринужденнее."));
        allskills.add(new Skill("бросились", " к нему c "));
        Thing dishes = new Thing(ThingType.Dishes);
        Human all = new Human("Все ", allskills, dishes);
        System.out.println(all.GetName() + all.GetSkills().get(0).GetName() + all.GetSkills().get(0).GetInfo());

        Thing feast = new Thing(ThingType.Feast, "Немного погодя ", " было в полном разгаре.");
        System.out.println(feast.GetDescription() + feast.GetName() + feast.GetAction());

        Thing tables = new Thing(ThingType.Table, " маленькими освещенными");
        Place field = new Place( "Долина", "была уставлена", tables);
        System.out.println(field.GetMap() + tables.GetDescription() + tables.GetName() + '.');

        Thing rocket = new Thing(ThingType.Rocket, " взмыла в беспредельную высь", "рассыпалась", " дождём белых звезд.");
        System.out.println(rocket.GetName() + rocket.GetDescription() + " и " + rocket.GetAction() + rocket.GetHow());

        Thing starsrain = new Thing(ThingType.Stars, " стал тихо-тихо", " падать", " на долину.");
        System.out.println(starsrain.GetName() + starsrain.GetDescription() + starsrain.GetAction() + starsrain.GetHow());

        ArrayList<Skill> bugskills = new ArrayList<Skill>();
        bugskills.add(new Skill(" повернулись", " носами к "));
        bugskills.add(new Skill(" и закричали", " \"ура!\". Ах, как чудесно это было!"));
        Bug bugs = new Bug("Букашки-таракашки", bugskills);
        System.out.println(bugs.GetName() + bugs.GetSkills().get(0).GetName() + bugs.GetSkills().get(0).GetInfo() + starsrain.GetName() + bugs.GetSkills().get(1).GetName() + bugs.GetSkills().get(1).GetInfo());

        Thing fountain = new Thing(ThingType.Fountain, " серебряный ", "Забил");
        System.out.print(fountain.GetAction() + fountain.GetDescription() + fountain.GetName() + ",");

        Thing storm = new Thing(ThingType.Storm, " бенгальская ", " замела", " над верхушками деревьев");
        System.out.println(storm.GetAction() + storm.GetHow() + storm.GetDescription() + storm.GetName());

        ArrayList<Skill> dadskils = new ArrayList<Skill>();
        dadskils.add(new Skill(" выкатил на"));
        dadskils.add(new Skill(" наполнил ", " каждому"));
        Place road = new Place(" дорожку", "садовую");
        Thing barrel = new Thing(ThingType.Barrel, " большую ", "", " с пуншем.");
        Human dad = new Human("Муми-папа", dadskils, barrel, dishes);
        System.out.println(dad.GetName() + dad.GetSkills().get(0).GetName() + road.GetMap() + dad.GetTo());

        System.out.println(all.GetName() + all.GetSkills().get(1).GetName() + all.GetSkills().get(1).GetInfo() + dishes.GetName() + ".");

        System.out.print(dad.GetName() + dad.GetSkills().get(1).GetInfo() + dad.GetSkills().get(1).GetName() + dad.GetSecond() + ",");

        Thing cup = new Thing(ThingType.Cup, " будь то ");
        System.out.print(cup.GetDescription() + cup.GetName() + ",");

        Thing glass = new Thing(ThingType.Wineglass, " или ");
        System.out.print(glass.GetDescription() + glass.GetName() + ",");

        Thing goblet = new Thing(ThingType.Goblet, " берестяной ");
        System.out.print(goblet.GetDescription() + goblet.GetName() + ",");

        Thing conch = new Thing(ThingType.Conch, " или ");
        System.out.print(conch.GetDescription() + conch.GetName());

        Thing paper = new Thing(ThingType.Sheet, " или", " свернутый ");
        System.out.print(paper.GetDescription() + paper.GetAction() + paper.GetName() + ".");
    }

}
