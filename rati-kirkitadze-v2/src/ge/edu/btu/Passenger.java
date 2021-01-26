package ge.edu.btu;

public class Passenger {
    String Name;
    boolean Ticket;

    public Passenger(String Name, boolean Ticket){
        this.Name = Name;
        this.Ticket =Ticket;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public String getName(){
        return Name;
    }

    public boolean hasTicket(){
        return Ticket;
    }
}
