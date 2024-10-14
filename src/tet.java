import java.lang.Math
public class Point{
    private int posx;
    private int posy;
    public Point(){
        this(0,0);
    }
    public Point(int posx,int posy){
        this.posx=posx;
        this.posy=posy;
    }
    public int getposx(){
        return posx;
    }
    public void setposx(int posx){
        this.posx=posx;
    }
    public int getposy(){
        return posy;
    }
    public void setposy(int posy){
        this.posy=posy;
    }
    @Override
    public String toString(){
        return "point de cordonnee:("+posx+","+posy+")";
    }
    public int distance(Point p){
        return Math.sqrt((this.posx-p.posx)**2+(this.posy-p.posy**2));
    }
    public void deplaceToi(int newx,int newy){
        this.posx=newx;
        this.posy=newy;
    }

}