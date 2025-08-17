package com/imf/mathsprim/domain/model;

public class Exercise {
    private double firstOperand;
    private double secondOperand;
    private double thirdOperand;
    private double fourthOperand;
    private OperationType oprationType;


    public double getFirstOperand() {
        return firstOperand;
    }

    public double getSecondOperand() {
        return secondOperand;
    }

    public double getThirdOperand() {
        return thirdOperand;
    }

    public double getFourthOperand() {
        return fourthOperand;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setFirstOperand(double firstOperand) {
        this.firstOperand = firstOperand;
    }

    public void setSecondOperand(double secondOperand) {
        this.secondOperand = secondOperand
    }

    public void setThirdOperand(double thirdOperand) {
        this.thirdOperand = thirdOperand;
    }

    public void setFourthOperand(double fourthOperand) {
        this.fourthOperand = fourthOperand;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }



}
