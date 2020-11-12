public class Student {
    private String name;
    private StudentType type;
    private boolean program = false;
    private boolean opd = false;

    public Student(String fio, StudentType retype, boolean program_debt, boolean opd_debt) {
        name = fio;
        type = retype;
        program = program_debt;
        opd = opd_debt;
    }

    public String GetName() {
        return name;
    }

    public StudentType GetType() {
        return type;
    }

    public String GetTypeName() {
        String typename = "";
        switch (type) {
            case ROBOT:
                typename = "Робототехника";
                break;
            case IVT:
                typename = "ИВТ";
                break;
            case SPPO:
                typename = "СППО";
                break;
        }
        return typename;
    }

    public boolean GetProgramDebt() {
        return program;
    }

    public boolean GetDebt() {
        return (program | opd);
    }
}
