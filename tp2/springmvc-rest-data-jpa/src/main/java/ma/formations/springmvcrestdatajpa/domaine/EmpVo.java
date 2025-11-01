package ma.formations.springmvcrestdatajpa.domaine;

public class EmpVo {
    private Long id;
    private String name;
    private Double salary;
    private String fonction;
    public EmpVo() {
        super();
    }
    public EmpVo(Long id, String name, Double salary, String fonction) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.fonction = fonction;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public String getFonction() {
        return fonction;
    }
    public void setFonction(String fonction) {
        this.fonction = fonction;
    }
}