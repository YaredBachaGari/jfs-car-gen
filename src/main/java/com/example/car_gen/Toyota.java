package com.example.car_gen;

public class Toyota extends Car{
    private boolean greatGasMilage;
     public Toyota(){
         super("blue",180, 180);
     }

    //Getter
    public boolean getGreatGasMilage(){
        return this.greatGasMilage;
    }
    //Setter
    public void setGreatGasMilage(boolean greatGasMilage){
         this.greatGasMilage = greatGasMilage;
    }
}
