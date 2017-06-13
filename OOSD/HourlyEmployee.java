public class HourlyEmployee extends Employee {
    
    private double wagePerHour;
    private double hourInMonth;
    
    public void HourlyEmployee(String name ,Date hiredate, double wagePerHour , double hourInMonth ){
        
        super(name,hiredate);
        
        this.wagePerHour = wagePerHour;
        this.hourInMonth = hourInMonth;
        
    }
    
}