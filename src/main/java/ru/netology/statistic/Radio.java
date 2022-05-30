package ru.netology.statistic;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;

    public void setCurrentRadioStation(int CurrentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 10) {
            return;
        }
        this.currentRadioStation = currentRadioStation;

    }

    public int getCurrentStation() {
        return currentRadioStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setNextStation() {

        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }

    }

    public int getNextStation() {
        return currentRadioStation;
    }


    public void setPrevStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        }
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    public int getPrevStation() {
        return currentRadioStation;
    }


    public int plusVolume;

    public void setPlusVolume() {

        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 0;
        }
    }

    public int getPlusVolume() {
        return currentVolume;
    }


    public int minusVolume;

    public void setMinusVolume() {
        if (currentVolume == 0) {
            currentVolume = 10;
        }
        if (currentVolume < 10) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getMinusVolume() {

        return currentVolume;
    }
}
