package no.hvl.dat100.javel.oppgave3;

public class Customer {

    private String name;
    private String email;
    private int customer_id;
    private PowerAgreementType agreement;

    public Customer(){
        String name;
        String email;
        int customer_id;
        PowerAgreementType agreement;
    }

    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {
        this.name = name;
        this.email = email;
        this.customer_id = customer_id;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public int getCustomer_id(){
        return customer_id;
    }
    public PowerAgreementType getAgreement(){
        return agreement;
    }

    public void setName(String ny){
        name = ny;
    }
    public void setEmail(String ny){
        email = ny;
    }
    public void setCustomer_id(int ny){
        customer_id = ny;
    }
    public void setAgreement(PowerAgreementType ny){
        agreement = ny;
    }

    public String toString(){
        return  "Customer number" + customer_id + "\n" +
                "Name" +name + "\n"+
                "Email" + email + "\n"+
                "Agreement" + agreement;
    }

}
