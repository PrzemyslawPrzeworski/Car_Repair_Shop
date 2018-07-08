package pl.coderslab.model;

public class Order {

    private int id;
    private String acceptance_date;
    private String repair_date;
    private int employee_id;
    private String problem_description;
    private String repair_description;
    private String status;
    private int car_id;
    private double client_cost;
    private double parts_cost;
    private double manhour_cost;
    private int manhour;

    public Order() {}

    public Order(int id, String acceptance_date, String repair_date, int employee_id, String problem_description, String repair_description, String status, int car_id, double client_cost, double parts_cost, double manhour_cost, int manhour) {
        setId(id);
        setAcceptance_date(acceptance_date);
        setRepair_date(repair_date);
        setEmployee_id(employee_id);
        setProblem_description(problem_description);
        setRepair_description(repair_description);
        setStatus(status);
        setCar_id(car_id);
        setClient_cost(client_cost);
        setParts_cost(parts_cost);
        setManhour_cost(manhour_cost);
        setManhour(manhour);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAcceptance_date() {
        return acceptance_date;
    }

    public void setAcceptance_date(String acceptance_date) {
        this.acceptance_date = acceptance_date;
    }

    public String getRepair_date() {
        return repair_date;
    }

    public void setRepair_date(String repair_date) {
        this.repair_date = repair_date;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getProblem_description() {
        return problem_description;
    }

    public void setProblem_description(String problem_description) {
        this.problem_description = problem_description;
    }

    public String getRepair_description() {
        return repair_description;
    }

    public void setRepair_description(String repair_description) {
        this.repair_description = repair_description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public double getClient_cost() {
        return client_cost;
    }

    public void setClient_cost(double client_cost) {
        this.client_cost = client_cost;
    }

    public double getParts_cost() {
        return parts_cost;
    }

    public void setParts_cost(double parts_cost) {
        this.parts_cost = parts_cost;
    }

    public double getManhour_cost() {
        return manhour_cost;
    }

    public void setManhour_cost(double manhour_cost) {
        this.manhour_cost = manhour_cost;
    }

    public int getManhour() {
        return manhour;
    }

    public void setManhour(int manhour) {
        this.manhour = manhour;
    }
}
