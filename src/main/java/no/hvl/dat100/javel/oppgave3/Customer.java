package no.hvl.dat100.javel.oppgave3;

public class Customer {

    private String name;
    private String email;
    private int custumer_id;
    private PowerAgreementType agreement;

    public Customer(){
        String name;
        String email;
        int custumer_id;
        PowerAgreementType agreement;
    }

    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public int getCustumer_id(){
        return custumer_id;
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
    public void setCustumer_id(int ny){
        custumer_id = ny;
    }
    public void setAgreement(PowerAgreementType ny){
        agreement = ny;
    }
    // TODO - toString method

}
