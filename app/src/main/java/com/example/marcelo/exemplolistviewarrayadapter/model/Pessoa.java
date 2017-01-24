package com.example.marcelo.exemplolistviewarrayadapter.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Marcelo on 24/01/2017.
 * Classe modelo de Pessoa.
 */

public class Pessoa implements Parcelable {
    private String nome;
    private String email;
    private  String sexo;

    // Construtor de Pessoa.
    public Pessoa(String nome, String email, String sexo) {
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nome);
        dest.writeString(this.email);
        dest.writeString(this.sexo);
    }

    protected Pessoa(Parcel in) {
        this.nome = in.readString();
        this.email = in.readString();
        this.sexo = in.readString();
    }

    public static final Parcelable.Creator<Pessoa> CREATOR = new Parcelable.Creator<Pessoa>() {
        @Override
        public Pessoa createFromParcel(Parcel source) {
            return new Pessoa(source);
        }

        @Override
        public Pessoa[] newArray(int size) {
            return new Pessoa[size];
        }
    };
}
