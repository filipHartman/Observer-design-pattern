package com.filip.math_example;

import java.beans.PropertyChangeEvent;

class SubtractionNumberObserver implements NumberObserver {
    private int numberToSubtract = 5;
    public int number;

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.number = (int) evt.getNewValue() - numberToSubtract;
    }
}
