/**
 * Created by white on 04.01.2017.
 */

class Hero{
    private float xPos;    //Hiding information that contains it fields of the class
    private float yPos;   // So we can use class Hero by using different functions
    private float speed;


    public Hero() {
        xPos=0;
        yPos=0;
        speed=5.0f;
    }

    public void makeStep() {
        xPos=xPos+speed;
    }

    public float getXPos(){
        return xPos;
    }
    public float getYPos(){
        return yPos;
    }

}



public class Main {
    public static void main(String[] args){

        Hero hero=new Hero();
        System.out.println("Heroes x="+hero.getXPos()+" y="+hero.getYPos());
        hero.makeStep();
        hero.makeStep();
        hero.makeStep();
        System.out.println("Heroes x="+hero.getXPos()+" y="+hero.getYPos());

    }
}
