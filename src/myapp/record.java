/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

/**
 *
 * @author Hp
 */
public class record {
    private int id;
    private String topic;
    private String date;
    private String amount;
    private String qty;
    private double total;
    private String app;
    private String cer;
    private byte[] picture;

    public record(int id, String topic, String date, String amount, String qty, double total, String app, String cer, byte[] picture) {
        this.id = id;
        this.topic = topic;
        this.date = date;
        this.amount = amount;
        this.qty = qty;
        this.total = total;
        this.app = app;
        this.cer = cer;
        this.picture = picture;
    }

    public double getTotal() {
        return total;
    }

    public int getId() {
        return id;
    }

    public String getTopic() {
        return topic;
    }

    public String getDate() {
        return date;
    }

    public String getAmount() {
        return amount;
    }

    public String getQty() {
        return qty;
    }

    public String getApp() {
        return app;
    }

    public String getCer() {
        return cer;
    }

    public byte[] getPicture() {
        return picture;
    }
    
    
}
