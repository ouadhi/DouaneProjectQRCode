package com.example.mac.douaneproject;


import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.math.BigDecimal;
import java.security.PrivilegedActionException;
import java.security.Timestamp;
import java.util.Date;

public class Declaration  implements Serializable {
    private static final long serialVersionUID = 1L;

    private DeclarationPK id;

    private String adrFrs;

    private String adrRangee;

    private String agenceDom;

    private Date anAgrt;

    private Date anManif;

    private Date anOper;
    private short articles;

    private int atEt;

    private String bnqDom;

    private short burArrive;


    private short burDepart;

    private String circuit;

    private short codeBurManif;

    private String codeEng;

    private int codeOper;

    private short codeReg;

    private BigDecimal coeffAjust;

    private int colisDecl;

    private short cptTint;

    private Date datDateHeur;

    private Timestamp dateBae;

    private String dateCotation;

    private Date dateHeur;

    private Timestamp dateInspect;

    private String datePrimo;

    private Timestamp dateVerif;

    private Timestamp decAnDecl;

    private short decCodeBur;

    private int decNumDecl;

    private String dossierDcl;

    private short dureeAt;

    private String etatDcl;

    private String etatRcv;

    private String identTint;

    private BigDecimal kgDouane;

    private BigDecimal lavaleur;

    private BigDecimal lcAss;

    private BigDecimal lcFrais;

    private BigDecimal lcFret;

    private BigDecimal lcPtfn;

    private String lieuAt;

    private int matAgt;

    private String modTint;

    private String modeFinance;

    private String modePaiement;

    private BigDecimal monDcl;

    private String monnaieAss;

    private String monnaieFrais;

    private String monnaieFret;

    private String monnaiePtfn;

    private BigDecimal mtAss;

    private BigDecimal mtAss2;

    private BigDecimal mtCaution;

    private BigDecimal mtCoef;

    private BigDecimal mtFrais;

    private BigDecimal mtFrais2;

    private BigDecimal mtFret;

    private BigDecimal mtFret2;

    private BigDecimal mtPtfn;

    private BigDecimal mtPtfn2;

    private String natContrat;

    private short nbrArt;

    @Override
    public String toString() {
        return "Declaration{" +
                "id=" + id +
                ", adrFrs='" + adrFrs + '\'' +
                ", adrRangee='" + adrRangee + '\'' +
                ", agenceDom='" + agenceDom + '\'' +
                ", anAgrt=" + anAgrt +
                ", anManif=" + anManif +
                ", anOper=" + anOper +
                ", articles=" + articles +
                ", atEt=" + atEt +
                ", bnqDom='" + bnqDom + '\'' +
                ", burArrive=" + burArrive +
                ", burDepart=" + burDepart +
                ", circuit='" + circuit + '\'' +
                ", codeBurManif=" + codeBurManif +
                ", codeEng='" + codeEng + '\'' +
                ", codeOper=" + codeOper +
                ", codeReg=" + codeReg +
                ", coeffAjust=" + coeffAjust +
                ", colisDecl=" + colisDecl +
                ", cptTint=" + cptTint +
                ", datDateHeur=" + datDateHeur +
                ", dateBae=" + dateBae +
                ", dateCotation='" + dateCotation + '\'' +
                ", dateHeur=" + dateHeur +
                ", dateInspect=" + dateInspect +
                ", datePrimo='" + datePrimo + '\'' +
                ", dateVerif=" + dateVerif +
                ", decAnDecl=" + decAnDecl +
                ", decCodeBur=" + decCodeBur +
                ", decNumDecl=" + decNumDecl +
                ", dossierDcl='" + dossierDcl + '\'' +
                ", dureeAt=" + dureeAt +
                ", etatDcl='" + etatDcl + '\'' +
                ", etatRcv='" + etatRcv + '\'' +
                ", identTint='" + identTint + '\'' +
                ", kgDouane=" + kgDouane +
                ", lavaleur=" + lavaleur +
                ", lcAss=" + lcAss +
                ", lcFrais=" + lcFrais +
                ", lcFret=" + lcFret +
                ", lcPtfn=" + lcPtfn +
                ", lieuAt='" + lieuAt + '\'' +
                ", matAgt=" + matAgt +
                ", modTint='" + modTint + '\'' +
                ", modeFinance='" + modeFinance + '\'' +
                ", modePaiement='" + modePaiement + '\'' +
                ", monDcl=" + monDcl +
                ", monnaieAss='" + monnaieAss + '\'' +
                ", monnaieFrais='" + monnaieFrais + '\'' +
                ", monnaieFret='" + monnaieFret + '\'' +
                ", monnaiePtfn='" + monnaiePtfn + '\'' +
                ", mtAss=" + mtAss +
                ", mtAss2=" + mtAss2 +
                ", mtCaution=" + mtCaution +
                ", mtCoef=" + mtCoef +
                ", mtFrais=" + mtFrais +
                ", mtFrais2=" + mtFrais2 +
                ", mtFret=" + mtFret +
                ", mtFret2=" + mtFret2 +
                ", mtPtfn=" + mtPtfn +
                ", mtPtfn2=" + mtPtfn2 +
                ", natContrat='" + natContrat + '\'' +
                ", nbrArt=" + nbrArt +
                ", nomFrs='" + nomFrs + '\'' +
                ", numAgrt=" + numAgrt +
                ", numCred=" + numCred +
                ", numDom='" + numDom + '\'' +
                ", numGroup=" + numGroup +
                ", numLigne=" + numLigne +
                ", numManif=" + numManif +
                ", numRep=" + numRep +
                ", passage=" + passage +
                ", payProv='" + payProv + '\'' +
                ", paysFrs='" + paysFrs + '\'' +
                ", plusValue=" + plusValue +
                ", poidsDecl=" + poidsDecl +
                ", poidsnDcl=" + poidsnDcl +
                ", recDcl='" + recDcl + '\'' +
                ", recVerif='" + recVerif + '\'' +
                ", recVisit='" + recVisit + '\'' +
                ", relAv='" + relAv + '\'' +
                ", resVerif='" + resVerif + '\'' +
                ", resVisit='" + resVisit + '\'' +
                ", revue=" + revue +
                ", txSusp=" + txSusp +
                ", typeDcl='" + typeDcl + '\'' +
                ", typeDed='" + typeDed + '\'' +
                ", typeManif='" + typeManif + '\'' +
                ", typeOperat='" + typeOperat + '\'' +
                ", valDouane=" + valDouane +
                ", valider=" + valider +
                '}';
    }

    private String nomFrs;

    private int numAgrt;

    private short numCred;

    private String numDom;

    private short numGroup;

    private short numLigne;

    private int numManif;

    private int numRep;
    private short passage;

    private String payProv;

    private String paysFrs;

    private BigDecimal plusValue;

    private BigDecimal poidsDecl;

    private BigDecimal poidsnDcl;

    private String recDcl;

    private String recVerif;

    private String recVisit;

    private String relAv;

    private String resVerif;

    private String resVisit;
    private short revue;

    private BigDecimal txSusp;

    private String typeDcl;

    private String typeDed;

    private String typeManif;

    private String typeOperat;

    private BigDecimal valDouane;
    private int valider;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public DeclarationPK getId() {
        return id;
    }

    public void setId(DeclarationPK id) {
        this.id = id;
    }

    public String getAdrFrs() {
        return adrFrs;
    }

    public void setAdrFrs(String adrFrs) {
        this.adrFrs = adrFrs;
    }

    public String getAdrRangee() {
        return adrRangee;
    }

    public void setAdrRangee(String adrRangee) {
        this.adrRangee = adrRangee;
    }

    public String getAgenceDom() {
        return agenceDom;
    }

    public void setAgenceDom(String agenceDom) {
        this.agenceDom = agenceDom;
    }

    public Date getAnAgrt() {
        return anAgrt;
    }

    public void setAnAgrt(Date anAgrt) {
        this.anAgrt = anAgrt;
    }

    public Date getAnManif() {
        return anManif;
    }

    public void setAnManif(Date anManif) {
        this.anManif = anManif;
    }

    public Date getAnOper() {
        return anOper;
    }

    public void setAnOper(Date anOper) {
        this.anOper = anOper;
    }

    public short getArticles() {
        return articles;
    }

    public void setArticles(short articles) {
        this.articles = articles;
    }

    public int getAtEt() {
        return atEt;
    }

    public void setAtEt(int atEt) {
        this.atEt = atEt;
    }

    public String getBnqDom() {
        return bnqDom;
    }

    public void setBnqDom(String bnqDom) {
        this.bnqDom = bnqDom;
    }

    public short getBurArrive() {
        return burArrive;
    }

    public void setBurArrive(short burArrive) {
        this.burArrive = burArrive;
    }

    public short getBurDepart() {
        return burDepart;
    }

    public void setBurDepart(short burDepart) {
        this.burDepart = burDepart;
    }

    public String getCircuit() {
        return circuit;
    }

    public void setCircuit(String circuit) {
        this.circuit = circuit;
    }

    public short getCodeBurManif() {
        return codeBurManif;
    }

    public void setCodeBurManif(short codeBurManif) {
        this.codeBurManif = codeBurManif;
    }

    public String getCodeEng() {
        return codeEng;
    }

    public void setCodeEng(String codeEng) {
        this.codeEng = codeEng;
    }

    public int getCodeOper() {
        return codeOper;
    }

    public void setCodeOper(int codeOper) {
        this.codeOper = codeOper;
    }

    public short getCodeReg() {
        return codeReg;
    }

    public void setCodeReg(short codeReg) {
        this.codeReg = codeReg;
    }

    public BigDecimal getCoeffAjust() {
        return coeffAjust;
    }

    public void setCoeffAjust(BigDecimal coeffAjust) {
        this.coeffAjust = coeffAjust;
    }

    public int getColisDecl() {
        return colisDecl;
    }

    public void setColisDecl(int colisDecl) {
        this.colisDecl = colisDecl;
    }

    public short getCptTint() {
        return cptTint;
    }

    public void setCptTint(short cptTint) {
        this.cptTint = cptTint;
    }

    public Date getDatDateHeur() {
        return datDateHeur;
    }

    public void setDatDateHeur(Date datDateHeur) {
        this.datDateHeur = datDateHeur;
    }

    public Timestamp getDateBae() {
        return dateBae;
    }

    public void setDateBae(Timestamp dateBae) {
        this.dateBae = dateBae;
    }

    public String getDateCotation() {
        return dateCotation;
    }

    public void setDateCotation(String dateCotation)
    {
        this.dateCotation = dateCotation;
    }

    public Date getDateHeur() {
        return dateHeur;
    }

    public void setDateHeur(Date dateHeur) {
        this.dateHeur = dateHeur;
    }

    public Timestamp getDateInspect() {
        return dateInspect;
    }

    public void setDateInspect(Timestamp dateInspect) {
        this.dateInspect = dateInspect;
    }

    public String getDatePrimo() {
        return datePrimo;
    }

    public void setDatePrimo(String datePrimo) {
        this.datePrimo = datePrimo;
    }

    public Timestamp getDateVerif() {
        return dateVerif;
    }

    public void setDateVerif(Timestamp dateVerif) {
        this.dateVerif = dateVerif;
    }

    public Timestamp getDecAnDecl() {
        return decAnDecl;
    }

    public void setDecAnDecl(Timestamp decAnDecl) {
        this.decAnDecl = decAnDecl;
    }

    public short getDecCodeBur() {
        return decCodeBur;
    }

    public void setDecCodeBur(short decCodeBur) {
        this.decCodeBur = decCodeBur;
    }

    public int getDecNumDecl() {
        return decNumDecl;
    }

    public void setDecNumDecl(int decNumDecl) {
        this.decNumDecl = decNumDecl;
    }

    public String getDossierDcl() {
        return dossierDcl;
    }

    public void setDossierDcl(String dossierDcl) {
        this.dossierDcl = dossierDcl;
    }

    public short getDureeAt() {
        return dureeAt;
    }

    public void setDureeAt(short dureeAt) {
        this.dureeAt = dureeAt;
    }

    public String getEtatDcl() {
        return etatDcl;
    }

    public void setEtatDcl(String etatDcl) {
        this.etatDcl = etatDcl;
    }

    public String getEtatRcv() {
        return etatRcv;
    }

    public void setEtatRcv(String etatRcv) {
        this.etatRcv = etatRcv;
    }

    public String getIdentTint() {
        return identTint;
    }

    public void setIdentTint(String identTint) {
        this.identTint = identTint;
    }

    public BigDecimal getKgDouane() {
        return kgDouane;
    }

    public void setKgDouane(BigDecimal kgDouane) {
        this.kgDouane = kgDouane;
    }

    public BigDecimal getLavaleur() {
        return lavaleur;
    }

    public void setLavaleur(BigDecimal lavaleur) {
        this.lavaleur = lavaleur;
    }

    public BigDecimal getLcAss() {
        return lcAss;
    }

    public void setLcAss(BigDecimal lcAss) {
        this.lcAss = lcAss;
    }

    public BigDecimal getLcFrais() {
        return lcFrais;
    }

    public void setLcFrais(BigDecimal lcFrais) {
        this.lcFrais = lcFrais;
    }

    public BigDecimal getLcFret() {
        return lcFret;
    }

    public void setLcFret(BigDecimal lcFret) {
        this.lcFret = lcFret;
    }

    public BigDecimal getLcPtfn() {
        return lcPtfn;
    }

    public void setLcPtfn(BigDecimal lcPtfn) {
        this.lcPtfn = lcPtfn;
    }

    public String getLieuAt() {
        return lieuAt;
    }

    public void setLieuAt(String lieuAt) {
        this.lieuAt = lieuAt;
    }

    public int getMatAgt() {
        return matAgt;
    }

    public void setMatAgt(int matAgt) {
        this.matAgt = matAgt;
    }

    public String getModTint() {
        return modTint;
    }

    public void setModTint(String modTint) {
        this.modTint = modTint;
    }

    public String getModeFinance() {
        return modeFinance;
    }

    public void setModeFinance(String modeFinance) {
        this.modeFinance = modeFinance;
    }

    public String getModePaiement() {
        return modePaiement;
    }

    public void setModePaiement(String modePaiement) {
        this.modePaiement = modePaiement;
    }

    public BigDecimal getMonDcl() {
        return monDcl;
    }

    public void setMonDcl(BigDecimal monDcl) {
        this.monDcl = monDcl;
    }

    public String getMonnaieAss() {
        return monnaieAss;
    }

    public void setMonnaieAss(String monnaieAss) {
        this.monnaieAss = monnaieAss;
    }

    public String getMonnaieFrais() {
        return monnaieFrais;
    }

    public void setMonnaieFrais(String monnaieFrais) {
        this.monnaieFrais = monnaieFrais;
    }

    public String getMonnaieFret() {
        return monnaieFret;
    }

    public void setMonnaieFret(String monnaieFret) {
        this.monnaieFret = monnaieFret;
    }

    public String getMonnaiePtfn() {
        return monnaiePtfn;
    }

    public void setMonnaiePtfn(String monnaiePtfn) {
        this.monnaiePtfn = monnaiePtfn;
    }

    public BigDecimal getMtAss() {
        return mtAss;
    }

    public void setMtAss(BigDecimal mtAss) {
        this.mtAss = mtAss;
    }

    public BigDecimal getMtAss2() {
        return mtAss2;
    }

    public void setMtAss2(BigDecimal mtAss2) {
        this.mtAss2 = mtAss2;
    }

    public BigDecimal getMtCaution() {
        return mtCaution;
    }

    public void setMtCaution(BigDecimal mtCaution) {
        this.mtCaution = mtCaution;
    }

    public BigDecimal getMtCoef() {
        return mtCoef;
    }

    public void setMtCoef(BigDecimal mtCoef) {
        this.mtCoef = mtCoef;
    }

    public BigDecimal getMtFrais() {
        return mtFrais;
    }

    public void setMtFrais(BigDecimal mtFrais) {
        this.mtFrais = mtFrais;
    }

    public BigDecimal getMtFrais2() {
        return mtFrais2;
    }

    public void setMtFrais2(BigDecimal mtFrais2) {
        this.mtFrais2 = mtFrais2;
    }

    public BigDecimal getMtFret() {
        return mtFret;
    }

    public void setMtFret(BigDecimal mtFret) {
        this.mtFret = mtFret;
    }

    public BigDecimal getMtFret2() {
        return mtFret2;
    }

    public void setMtFret2(BigDecimal mtFret2) {
        this.mtFret2 = mtFret2;
    }

    public BigDecimal getMtPtfn() {
        return mtPtfn;
    }

    public void setMtPtfn(BigDecimal mtPtfn) {
        this.mtPtfn = mtPtfn;
    }

    public BigDecimal getMtPtfn2() {
        return mtPtfn2;
    }

    public void setMtPtfn2(BigDecimal mtPtfn2) {
        this.mtPtfn2 = mtPtfn2;
    }

    public String getNatContrat() {
        return natContrat;
    }

    public void setNatContrat(String natContrat) {
        this.natContrat = natContrat;
    }

    public short getNbrArt() {
        return nbrArt;
    }

    public void setNbrArt(short nbrArt) {
        this.nbrArt = nbrArt;
    }

    public String getNomFrs() {
        return nomFrs;
    }

    public void setNomFrs(String nomFrs) {
        this.nomFrs = nomFrs;
    }

    public int getNumAgrt() {
        return numAgrt;
    }

    public void setNumAgrt(int numAgrt) {
        this.numAgrt = numAgrt;
    }

    public short getNumCred() {
        return numCred;
    }

    public void setNumCred(short numCred) {
        this.numCred = numCred;
    }

    public String getNumDom() {
        return numDom;
    }

    public void setNumDom(String numDom) {
        this.numDom = numDom;
    }

    public short getNumGroup() {
        return numGroup;
    }

    public void setNumGroup(short numGroup) {
        this.numGroup = numGroup;
    }

    public short getNumLigne() {
        return numLigne;
    }

    public void setNumLigne(short numLigne) {
        this.numLigne = numLigne;
    }

    public int getNumManif() {
        return numManif;
    }

    public void setNumManif(int numManif) {
        this.numManif = numManif;
    }

    public int getNumRep() {
        return numRep;
    }

    public void setNumRep(int numRep) {
        this.numRep = numRep;
    }

    public short getPassage() {
        return passage;
    }

    public void setPassage(short passage) {
        this.passage = passage;
    }

    public String getPayProv() {
        return payProv;
    }

    public void setPayProv(String payProv) {
        this.payProv = payProv;
    }

    public String getPaysFrs() {
        return paysFrs;
    }

    public void setPaysFrs(String paysFrs) {
        this.paysFrs = paysFrs;
    }

    public BigDecimal getPlusValue() {
        return plusValue;
    }

    public void setPlusValue(BigDecimal plusValue) {
        this.plusValue = plusValue;
    }

    public BigDecimal getPoidsDecl() {
        return poidsDecl;
    }

    public void setPoidsDecl(BigDecimal poidsDecl) {
        this.poidsDecl = poidsDecl;
    }

    public BigDecimal getPoidsnDcl() {
        return poidsnDcl;
    }

    public void setPoidsnDcl(BigDecimal poidsnDcl) {
        this.poidsnDcl = poidsnDcl;
    }

    public String getRecDcl() {
        return recDcl;
    }

    public void setRecDcl(String recDcl) {
        this.recDcl = recDcl;
    }

    public String getRecVerif() {
        return recVerif;
    }

    public void setRecVerif(String recVerif) {
        this.recVerif = recVerif;
    }

    public String getRecVisit() {
        return recVisit;
    }

    public void setRecVisit(String recVisit) {
        this.recVisit = recVisit;
    }

    public String getRelAv() {
        return relAv;
    }

    public void setRelAv(String relAv) {
        this.relAv = relAv;
    }

    public String getResVerif() {
        return resVerif;
    }

    public void setResVerif(String resVerif) {
        this.resVerif = resVerif;
    }

    public String getResVisit() {
        return resVisit;
    }

    public void setResVisit(String resVisit) {
        this.resVisit = resVisit;
    }

    public short getRevue() {
        return revue;
    }

    public void setRevue(short revue) {
        this.revue = revue;
    }

    public BigDecimal getTxSusp() {
        return txSusp;
    }

    public void setTxSusp(BigDecimal txSusp) {
        this.txSusp = txSusp;
    }

    public String getTypeDcl() {
        return typeDcl;
    }

    public void setTypeDcl(String typeDcl) {
        this.typeDcl = typeDcl;
    }

    public String getTypeDed() {
        return typeDed;
    }

    public void setTypeDed(String typeDed) {
        this.typeDed = typeDed;
    }

    public String getTypeManif() {
        return typeManif;
    }

    public void setTypeManif(String typeManif) {
        this.typeManif = typeManif;
    }

    public String getTypeOperat() {
        return typeOperat;
    }

    public void setTypeOperat(String typeOperat) {
        this.typeOperat = typeOperat;
    }

    public BigDecimal getValDouane() {
        return valDouane;
    }

    public void setValDouane(BigDecimal valDouane) {
        this.valDouane = valDouane;
    }

    public int getValider() {
        return valider;
    }

    public void setValider(int valider) {
        this.valider = valider;
    }


}