package com.filip.math_example;

import java.beans.PropertyChangeSupport;

class ObervableNumber {
    public int number;
    private PropertyChangeSupport support;

    public ObervableNumber() {
        support = new PropertyChangeSupport(this);
    }
    public void addNumberObserver(NumberObserver observer) {
        support.addPropertyChangeListener(observer);
    }

    public void removeNumberObserver(NumberObserver observer) {
        support.removePropertyChangeListener(observer);
    }

    public void changeNumber(int value) {
        support.firePropertyChange("number", this.number, value);
        this.number = value;
    }

}
