public class Encapsulayion2 {
    private double load, maxLoad;
    public Encapsulayion2 (double max){
        this.maxLoad = max;
    }
    public double getLoad(){
        return this.load;
    }
    public double getMaxLoad(){
        return this.maxLoad;
    }
    public boolean addBox(double weight){
        double temp = 0.0D;
        temp = this.load + weight;
        if(temp <= maxLoad){
            this.load = this.load + weight;
            return true;
        }else{
            return false;
        }
    }
}
