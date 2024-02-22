import java.util.ArrayList;
public class Domino {
    private int topnumber;
    private int bottomnumber;

    public Domino(){
        this.topnumber = 0;
        this.bottomnumber = 0;
    }
    public Domino(int topnumber, int bottomnumber){
        this.topnumber = topnumber;
        this.bottomnumber = bottomnumber;
    }
    public int getTop(){
        return topnumber;
    }
    public int getBottom(){
        return bottomnumber;
    }
    public void setTop(int topnumber){
        this.topnumber = topnumber;
    }
    public void setBottom(int bottomnumber){
        this.bottomnumber = bottomnumber;
    }
    public String toString(){
        return(topnumber + "/"+ bottomnumber );
    }
    public void flip(){
        int a = topnumber;
        this.topnumber = bottomnumber;
        this.bottomnumber = a;
    }
    public void settle(){
        if(topnumber > bottomnumber){
            flip();
        }
    }
    public int compareTo(Domino other){
        settle();
        other.settle();
        if (this.topnumber>other.topnumber){
            return (1);
        }else if(this.topnumber<other.topnumber){
            return(-1);
        }else{
            if(this.bottomnumber>other.bottomnumber){
                return(1);
            }else if(this.bottomnumber<other.bottomnumber){
                return(-1);
            }else{
                return(0);
            }
        }
    }

    public int compareToWeight(Domino other){
        int weighthis = topnumber + bottomnumber;
        int weightother = other.topnumber + other.bottomnumber;
        if (weighthis>weightother){
            return 1;
        }
        else if (weighthis < weightother){
            return -1;
        }
        //else if(weighthis == weightother){
          //  return 0;
      //  }
        return 0;
    }

    public boolean canConnect(Domino other){
        if(this.topnumber == other.topnumber || this.topnumber == other.bottomnumber || this.bottomnumber == other.topnumber|| this.bottomnumber == other.bottomnumber){
            return true;
        }
        return false;
    }





}
