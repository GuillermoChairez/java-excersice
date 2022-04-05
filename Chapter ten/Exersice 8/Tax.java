package com.company;

public enum Tax {
    SINGLE_FILER(0,50000), MARRIED_JOINTLY_OR_QUALIFYNG_WIDOW(1,50000),
    MARRIED_SEPERATLEY(2,50000), HEAD_OF_HOUSEHOLD(3,50000);

    int fillingStatus;
    int[][] brackets = {{27050,65550,136750,297350},
                        {45200,109250,166500,297350},
                        {22600,54625,83250,148675},
                        {36250,93650,151650,297350}};
    double[] rate = {15,27.5,30.5,35.5,39.1};
    double taxableIncome;

    private Tax(int fillingStatus, double taxableIncome){
        this.fillingStatus = fillingStatus;
        this.taxableIncome = taxableIncome;
    }

    public int getFillingStatus() {
        return fillingStatus;
    }

    public void setFillingStatus(int fillingStatus) {
        this.fillingStatus = fillingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRate() {
        return rate;
    }

    public void setRate(double[] rate) {
        this.rate = rate;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    double getTax(){
        for(int i = 0; i < this.brackets[this.fillingStatus].length; i++){
            if(this.taxableIncome <= this.brackets[this.fillingStatus][i]){
                return (rate[i]/100)*this.taxableIncome;
            }
        }
        return (rate[4])*this.taxableIncome;
    }
}
