package com.workintech.developers;

public class HRManager extends Employee {

    private JuniorDeveloper[] juniorDevelopers; // JuniorDeveloper tipinde bir dizi oluşturduk
    private MidDeveloper[] midDevelopers; // Mid developer tipinde bir dizi
    private SeniorDeveloper[] seniorDevelopers; // SeniorDeveloper tipinde bir diz


    public HRManager(long id , String name , int salary) {
        super(id , name , salary);
    }

    public HRManager(
            long id,
            String name,
            int salary,
            int junDevSize,
            int midDevSize,
            int senDevSize
    ) {
        super (id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[junDevSize];
        this.midDevelopers = new MidDeveloper[midDevSize];
        this.seniorDevelopers = new SeniorDeveloper[senDevSize];
    }

    public JuniorDeveloper[] getJuniorDevelopers() {
        return juniorDevelopers;
    }

    public MidDeveloper[] getMidDevelopers() {
        return midDevelopers;
    }

    public SeniorDeveloper[] getSeniorDevelopers() {
        return seniorDevelopers;
    }

    @Override
    public void work() {
        System.out.println("HRManager Salary updated.");
        super.setSalary(super.getSalary() + 10000);
    }

    @Override
    public String toString() {
        return "HRManager " + super.toString();
    }

    public void addEmployee(JuniorDeveloper juniorDeveloper) {
        addToArray(juniorDevelopers, juniorDeveloper);
    }

    public void addEmployee(MidDeveloper midDeveloper) {
        addToArray(midDevelopers, midDeveloper);
    }

    public void addEmployee(SeniorDeveloper seniorDeveloper) {
        addToArray(seniorDevelopers, seniorDeveloper);
    }

    public <Temp> void addToArray(Temp[] array, Temp dev) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == null) {
                array[i] = dev;
                System.out.println(dev.getClass().getSimpleName() + " added to array");
                return;
            }
        }
        System.out.println("No space in array " + dev.getClass().getSimpleName());
    }
}
