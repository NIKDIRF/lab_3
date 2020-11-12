public class Tribunal {

    public static void Expulsion(Student person, boolean ROBOTECHNIKI, boolean IVTESHNIKI, boolean SPPOSHNIKI, boolean RANDOM, boolean FULL_MOON) {

        long beer = Math.round(Math.random() * 3);
        System.out.println("Счастливчик получит " + beer + " бутылок пива");

        if (person.GetType() == StudentType.ROBOT) {
            if (!ROBOTECHNIKI) {
                System.out.println(person.GetName() + "\n" + person.GetTypeName() + "\n" + "Не будет отчислен\nПо причине: везение" + "\n");
                System.out.println("Сегодня тебе повезло, держи " + beer + " бутылочки пивка"  + "\n");
            } else if (!person.GetProgramDebt()) {
                System.out.println(person.GetName() + "\n" + person.GetTypeName() + "\n" + "Не будет отчислен\nПо причине: отсутсвия задолжностей" + "\n");
            } else
                System.out.println(person.GetName() + "\n" + person.GetTypeName() + "\n" + "Отчислен\nПо причине: задолжности"  + "\n");
        }

        if (person.GetType() == StudentType.IVT) {
            if (!IVTESHNIKI) {
                System.out.println(person.GetName() + "\n" + person.GetTypeName() + "\n" + "Не будет отчислен\nПо причине: везение"  + "\n");
                System.out.println("Сегодня тебе повезло, держи " + beer + " бутылочки пивка"  + "\n");
            } else if (RANDOM && Math.random() > 0.5) {
                System.out.println(person.GetName() + "\n" + person.GetTypeName() + "\n" + "Отчислен\nПо причине: выпала решка" + "\n");
            } else if (person.GetDebt()) {
                System.out.println(person.GetName() + "\n" + person.GetTypeName() + "\n" + "Отчислен\nПо причине: задолжности"  + "\n");
            } else {
                System.out.println(person.GetName() + "\n" + person.GetTypeName() + "\n" + "Не будет отчислен\nПо причине: везение и отсутсвия задолжностей"  + "\n");
            }
        }

        if (person.GetType() == StudentType.SPPO) {
            if (!SPPOSHNIKI | person.GetName() == "Фридкин Даниил Валерьевич") {
                System.out.println(person.GetName() + "\n" + person.GetTypeName() + "\n" + "Не будет отчислен\nПо причине: везение" + "\n");
                System.out.println("Да ты в рубашке родился, держи " + beer + " бутылочки пивка" + "\n");
            } else if (!RANDOM && FULL_MOON) {
                System.out.println(person.GetName() + "\n" + person.GetTypeName() + "\n" + "Отчислен\nПо причине: полнолуние" + "\n");
            } else if (person.GetDebt()) {
                System.out.println(person.GetName() + "\n" + person.GetTypeName() + "\n" + "Отчислен\nПо причине: задолжности" + "\n");
            } else {
                System.out.println(person.GetName() + "\n" + person.GetTypeName() + "\n" + "Не будет отчислен\nПо причине: везение и отсутсвия задолжностей" + "\n");
            }
        }



    }
}
