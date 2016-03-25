package com.rabidraccoon.intents;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by alex on 3/14/16.
 */
public class Mail implements Parcelable {

    private String to;
    private String subject;
    private String message;


    public Mail(String to, String subject, String message) {
        this.to = to;
        this.subject = subject;
        this.message = message;
    }

    public Mail(Parcel in) {
        String [] content = new String[3];
        in.readStringArray(content);
        this.to = content[0];
        this.subject = content[1];
        this.message = content[2];
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    // PARCELABLE
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        // Writes the values to be passed by the Parcel
        dest.writeStringArray(new String[]{this.to, this.subject, this.message});
    }

    public static final Parcelable.Creator<Mail> CREATOR = new Parcelable.Creator<Mail>() {
        @Override
        public Mail createFromParcel(Parcel source) {
            return new Mail(source);
        }

        @Override
        public Mail[] newArray(int size) {
            return new Mail[size];
        }
    };
}
