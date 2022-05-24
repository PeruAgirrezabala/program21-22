/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author agirrezabala.peru
 */
public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public Time(String time){
        String[]parts=time.split(":");
        String orduak =parts[0];
        String minutuak= parts[1];
        String segunduak=parts[2];
        hour=Integer.parseInt(orduak);
        minute=Integer.parseInt(minutuak);
        second=Integer.parseInt(segunduak);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    @Override
    public String toString() {
        String ordua = String.format("%02d:%02d:%02d", hour, minute, second);
        return ordua;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public Time nextSecond() {
        if (second >= 59) {
            second = 0;
            minute++;
            if (minute >= 59) {
                minute = 0;
                hour++;
                if (hour >= 23) {
                    hour = 0;
                }
            }

        } else {
            second = second + 1;
        }
        return this;
    }

    public Time previousSecond() {
        if (second == 0) {
            second = 59;
            minute--;
            if (minute == 0) {
                minute = 59;
                hour--;
                if (hour == 00) {
                    hour = 23;
                }
            }

        } else {
            second = second + 1;
        }
        return this;

    }

}
