package state.ejerEnClase;

public class ConsumoCpu {
    private int percentageUse=0;


    public ConsumoCpu(int percentageUse,String nameProgram){
        this.percentageUse=percentageUse;
    }

    public int getPercentageUse() {
        return percentageUse;
    }

    public void setPercentageUse(int percentageUse) {
        this.percentageUse = percentageUse;
    }

}
