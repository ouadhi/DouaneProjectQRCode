package com.example.mac.douaneproject;

import java.io.Serializable;
import java.util.Date;

public class DeclarationPK implements Serializable {
    private static final long serialVersionUID = 1L;

    private Date anDecl;

    private int numDecl;

    private int codeBur;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Date getAnDecl() {
        return anDecl;
    }

    public void setAnDecl(Date anDecl) {
        this.anDecl = anDecl;
    }

    public int getNumDecl() {
        return numDecl;
    }

    public void setNumDecl(int numDecl) {
        this.numDecl = numDecl;
    }

    public int getCodeBur() {
        return codeBur;
    }

    public void setCodeBur(int codeBur) {
        this.codeBur = codeBur;
    }
}
