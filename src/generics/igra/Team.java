package generics.igra;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant>{
    private String name;
    private List<T> participants= new ArrayList<>();

    public Team(String name /*List<Participant> participants*/) {
        this.name = name;
    }
    public void addNewParticipant(T p){
        participants.add(p);
        System.out.println("V komandu "+name +" bil dobavlen novii uciastnic po imeni "+p.getName());
    }
    public  void playwith(Team<T> team){
        String winnerName;
        Random random= new Random();
        int i=random.nextInt(2);
        if(i==0)
        {
            winnerName=this.name;
        }else
        {
            winnerName=team.name;
        }
        System.out.println("viigrala comanda "+winnerName);
    }
}
