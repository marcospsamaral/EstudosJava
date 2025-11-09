package encapsulamento;

public class Contato {
    private String name;
    private String number;

    public Contato(String name, String number){
        this.name = name;
        this.number = number;
    }

    public String getName(){
        return name;
    }

    public String getNumber(){
        return number;
    }

}
