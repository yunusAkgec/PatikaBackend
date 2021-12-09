package salaryCalculator;

public class Employee {
    String name;
    double salary;
    double workHours;
    double bonus;
    double rise;
    double tax;
    double newSalary;
    int hireYear;



    public Employee(String name , double salary , double workHours , int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if (this.salary >= 1000) {
            double duty = this.salary*0.03;

        }
        else{
            return salary =1000;
        }
        return 0;
    }
    public void bonus(){
        if (workHours < 168 && workHours > 0) {
            if (this.workHours > 40) {
                double bonus = (double) ((this.workHours - 40) * 30);
            } else {
                bonus = 0;
            }
        }
        else {
            System.out.println("Hatalı Veri Girişi Yaptınız.");
        }
    }
    public void raiseSalary(){
        if ( this.hireYear < 10 ){
            this.rise= (this.salary*0.05) ;
        }
        if (this.hireYear>9 && this.hireYear<20){
            this.rise= (this.salary*0.1);
        }
        if (this.hireYear>19 ) {
            this.rise=(this.salary*0.05);
        }
    }
    public void newSalary(){
        double newSalary = this.salary + this.bonus - this.tax();
    }

    public void print(){
        System.out.println("Adı : " + this.name );
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati :" + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + this.tax );
        System.out.println("Bonus : " + this.bonus);
        System.out.println("Maaş Artışı : " + this.rise);
        System.out.println("Vergiler ve Bonuslarla Beraber Aldığı Maaş : " + this.newSalary);
        System.out.println("Toplam Maaş : " + (this.newSalary + this.rise));

    }
}
