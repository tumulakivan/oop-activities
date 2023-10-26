import java.util.Scanner;
import java.text.DecimalFormat;

public class Beverage{
    String name;
    int volume;
    boolean isChilled;

    private static final DecimalFormat df = new DecimalFormat("0.0");

    boolean isEmpty(){
        if(this.volume != 0)
            return false;

        return true;
    }

    public Beverage(String name, int volume, boolean isChilled){
        this.name = name;
        this.volume = volume;
        this.isChilled = isChilled;
    }

    public String getName(){
        return this.name;
    }

    public int getVolume(){
        return this.volume;
    }

    public boolean getIsChilled(){
        return this.isChilled;
    }

    @Override
    public String toString(){
        if(this.isChilled(false))
            return this.name + "(" + volume + "mL) is not chilled anymore ";

        return this.name + "(" + volume + "mL) is chilled ";
    }

    final class Water extends Beverage{
        String type; // Purified, Distilled, Regular *only*

        //volume, isChilled, type
        public Water(int volume, boolean isChilled, String type){
            super("Water", this.volume, this.isChilled);
            this.type = type;
        }

        //volume, isChilled
        public Water(int volume, isChilled){
            super("Water", this.volume, this.isChilled);
            this.type = "Regular";
        }

        public String getType(){
            return this.type;
        }
    }

    final class Beer extends Beverage{
        double alcoholicContent;

        public Beer(int volume, boolean isChilled, double alcoholicContent){
            super("Beer", this.volume, this.isChilled);
            this.alcoholicContent = alcoholicContent;
        }

        public double getAlcoholicContent(){
            return this.alcoholicContent;
        }

        public String getType(){
            if(this.alcoholicContent < 0.03)
                return "Flavored";
            else if(this.alcoholicContent < 0.06 && this.alcoholicContent >= 0.03)
                return "Regular";

            return "Strong";
        }

        @Override
        public String toString(){
            super.toString() + "(" + df.format(this.alcoholicContent * 100) + "% alcoholic content)";
        }
    }
}