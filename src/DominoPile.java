import java.util.ArrayList;
import java.util.Random;
public class DominoPile {
    private ArrayList<Domino> pile = new ArrayList();

    public DominoPile(){
        pile.clear();
    }
    public ArrayList<Domino> getPile(){
        return this.pile;
    }
    public void newStack6() {
        for(int i = 0; i<7; i++){
            for(int a = i; a<7; a++){
                Domino domino = new Domino(i,a);
                pile.add(domino);
            }
        }
    }
    public void shuffle(){
        Random random = new Random();
        ArrayList<Domino> newarray = new ArrayList<Domino>();
        //System.out.println(());
        System.out.println(pile);

        for(int i = pile.size(); i>0; i--){
            Domino d = pile.get(random.nextInt(this.pile.size()));
            pile.remove(d);
            newarray.add(d);
        }

        System.out.println(pile);
        pile = newarray;
        System.out.println(newarray);
    }
}
