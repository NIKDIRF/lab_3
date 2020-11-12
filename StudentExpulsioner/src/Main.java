public class Main {

    public static void main(String[] args) {

        Student bot1 = new Student("Иванов Иван Иванович", StudentType.ROBOT, false, false);
        Student bot2 = new Student("Балтабаев Дамир Темиржанович", StudentType.ROBOT, false, true);
        Student bot3 = new Student("Хатиб Ватан", StudentType.ROBOT, true, false);

        Student ivt1 = new Student("Назарбаев Нурсултан Абишулы", StudentType.IVT, false, true);
        Student ivt2 = new Student("Нуруллаев Даниил Романович", StudentType.IVT, true, false);
        Student ivt3 = new Student("Чин Ду Хуок", StudentType.IVT, true, true);

        Student sppo1 = new Student("Кошкарбаев Никита Юрьевич", StudentType.SPPO, true, true);
        Student sppo2 = new Student("Фридкин Даниил Валерьевич", StudentType.SPPO, true, false);
        Student sppo3 = new Student("Осипов Василий Васильевич", StudentType.SPPO, false, false);

        System.out.println("ROBOTECHNIKI - " + args[0] + " IVTESHNIKI - " + args[1] + " SPPOSHNIKI - " + args[2] + " RANDOM - " + args[3] + " FULL_MOON - " + args[4] + "\n");

        boolean ROBOTECHNIKI = Boolean.parseBoolean(args[0]);
        boolean IVTESHNIKI = Boolean.parseBoolean(args[1]);
        boolean SPPOSHNIKI = Boolean.parseBoolean(args[2]);
        boolean RANDOM = Boolean.parseBoolean(args[3]);
        boolean FULL_MOON = Boolean.parseBoolean(args[4]);


        Tribunal.Expulsion(bot1, ROBOTECHNIKI, IVTESHNIKI, SPPOSHNIKI, RANDOM, FULL_MOON);
        Tribunal.Expulsion(bot2, ROBOTECHNIKI, IVTESHNIKI, SPPOSHNIKI, RANDOM, FULL_MOON);
        Tribunal.Expulsion(bot3, ROBOTECHNIKI, IVTESHNIKI, SPPOSHNIKI, RANDOM, FULL_MOON);
        Tribunal.Expulsion(ivt1, ROBOTECHNIKI, IVTESHNIKI, SPPOSHNIKI, RANDOM, FULL_MOON);
        Tribunal.Expulsion(ivt2, ROBOTECHNIKI, IVTESHNIKI, SPPOSHNIKI, RANDOM, FULL_MOON);
        Tribunal.Expulsion(ivt3, ROBOTECHNIKI, IVTESHNIKI, SPPOSHNIKI, RANDOM, FULL_MOON);
        Tribunal.Expulsion(sppo1, ROBOTECHNIKI, IVTESHNIKI, SPPOSHNIKI, RANDOM, FULL_MOON);
        Tribunal.Expulsion(sppo2, ROBOTECHNIKI, IVTESHNIKI, SPPOSHNIKI, RANDOM, FULL_MOON);
        Tribunal.Expulsion(sppo3, ROBOTECHNIKI, IVTESHNIKI, SPPOSHNIKI, RANDOM, FULL_MOON);
    }
}
