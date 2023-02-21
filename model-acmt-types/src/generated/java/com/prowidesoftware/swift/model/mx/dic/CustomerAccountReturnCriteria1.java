
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Indicates which fields must be present in the response.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAccountReturnCriteria1", propOrder = {
    "id",
    "nm",
    "sts",
    "tp",
    "ccy",
    "mnthlyPmtVal",
    "mnthlyRcvdVal",
    "mnthlyTxNb",
    "avrgBal",
    "acctPurp",
    "flrNtfctnAmt",
    "clngNtfctnAmt",
    "stmtCycl",
    "clsgDt",
    "rstrctn",
    "opngDt",
    "acctOwnr",
    "refAcct",
    "prtry"
})
public class CustomerAccountReturnCriteria1 {

    @XmlElement(name = "Id")
    protected boolean id;
    @XmlElement(name = "Nm")
    protected boolean nm;
    @XmlElement(name = "Sts")
    protected boolean sts;
    @XmlElement(name = "Tp")
    protected boolean tp;
    @XmlElement(name = "Ccy")
    protected boolean ccy;
    @XmlElement(name = "MnthlyPmtVal")
    protected boolean mnthlyPmtVal;
    @XmlElement(name = "MnthlyRcvdVal")
    protected boolean mnthlyRcvdVal;
    @XmlElement(name = "MnthlyTxNb")
    protected boolean mnthlyTxNb;
    @XmlElement(name = "AvrgBal")
    protected boolean avrgBal;
    @XmlElement(name = "AcctPurp")
    protected boolean acctPurp;
    @XmlElement(name = "FlrNtfctnAmt")
    protected boolean flrNtfctnAmt;
    @XmlElement(name = "ClngNtfctnAmt")
    protected boolean clngNtfctnAmt;
    @XmlElement(name = "StmtCycl")
    protected boolean stmtCycl;
    @XmlElement(name = "ClsgDt")
    protected boolean clsgDt;
    @XmlElement(name = "Rstrctn")
    protected boolean rstrctn;
    @XmlElement(name = "OpngDt")
    protected boolean opngDt;
    @XmlElement(name = "AcctOwnr")
    protected boolean acctOwnr;
    @XmlElement(name = "RefAcct")
    protected boolean refAcct;
    @XmlElement(name = "Prtry")
    protected List<GenericIdentification42> prtry;

    /**
     * Gets the value of the id property.
     * 
     */
    public boolean isId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public CustomerAccountReturnCriteria1 setId(boolean value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     */
    public boolean isNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     */
    public CustomerAccountReturnCriteria1 setNm(boolean value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     */
    public boolean isSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     */
    public CustomerAccountReturnCriteria1 setSts(boolean value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     */
    public boolean isTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     */
    public CustomerAccountReturnCriteria1 setTp(boolean value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     */
    public boolean isCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     */
    public CustomerAccountReturnCriteria1 setCcy(boolean value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the mnthlyPmtVal property.
     * 
     */
    public boolean isMnthlyPmtVal() {
        return mnthlyPmtVal;
    }

    /**
     * Sets the value of the mnthlyPmtVal property.
     * 
     */
    public CustomerAccountReturnCriteria1 setMnthlyPmtVal(boolean value) {
        this.mnthlyPmtVal = value;
        return this;
    }

    /**
     * Gets the value of the mnthlyRcvdVal property.
     * 
     */
    public boolean isMnthlyRcvdVal() {
        return mnthlyRcvdVal;
    }

    /**
     * Sets the value of the mnthlyRcvdVal property.
     * 
     */
    public CustomerAccountReturnCriteria1 setMnthlyRcvdVal(boolean value) {
        this.mnthlyRcvdVal = value;
        return this;
    }

    /**
     * Gets the value of the mnthlyTxNb property.
     * 
     */
    public boolean isMnthlyTxNb() {
        return mnthlyTxNb;
    }

    /**
     * Sets the value of the mnthlyTxNb property.
     * 
     */
    public CustomerAccountReturnCriteria1 setMnthlyTxNb(boolean value) {
        this.mnthlyTxNb = value;
        return this;
    }

    /**
     * Gets the value of the avrgBal property.
     * 
     */
    public boolean isAvrgBal() {
        return avrgBal;
    }

    /**
     * Sets the value of the avrgBal property.
     * 
     */
    public CustomerAccountReturnCriteria1 setAvrgBal(boolean value) {
        this.avrgBal = value;
        return this;
    }

    /**
     * Gets the value of the acctPurp property.
     * 
     */
    public boolean isAcctPurp() {
        return acctPurp;
    }

    /**
     * Sets the value of the acctPurp property.
     * 
     */
    public CustomerAccountReturnCriteria1 setAcctPurp(boolean value) {
        this.acctPurp = value;
        return this;
    }

    /**
     * Gets the value of the flrNtfctnAmt property.
     * 
     */
    public boolean isFlrNtfctnAmt() {
        return flrNtfctnAmt;
    }

    /**
     * Sets the value of the flrNtfctnAmt property.
     * 
     */
    public CustomerAccountReturnCriteria1 setFlrNtfctnAmt(boolean value) {
        this.flrNtfctnAmt = value;
        return this;
    }

    /**
     * Gets the value of the clngNtfctnAmt property.
     * 
     */
    public boolean isClngNtfctnAmt() {
        return clngNtfctnAmt;
    }

    /**
     * Sets the value of the clngNtfctnAmt property.
     * 
     */
    public CustomerAccountReturnCriteria1 setClngNtfctnAmt(boolean value) {
        this.clngNtfctnAmt = value;
        return this;
    }

    /**
     * Gets the value of the stmtCycl property.
     * 
     */
    public boolean isStmtCycl() {
        return stmtCycl;
    }

    /**
     * Sets the value of the stmtCycl property.
     * 
     */
    public CustomerAccountReturnCriteria1 setStmtCycl(boolean value) {
        this.stmtCycl = value;
        return this;
    }

    /**
     * Gets the value of the clsgDt property.
     * 
     */
    public boolean isClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     */
    public CustomerAccountReturnCriteria1 setClsgDt(boolean value) {
        this.clsgDt = value;
        return this;
    }

    /**
     * Gets the value of the rstrctn property.
     * 
     */
    public boolean isRstrctn() {
        return rstrctn;
    }

    /**
     * Sets the value of the rstrctn property.
     * 
     */
    public CustomerAccountReturnCriteria1 setRstrctn(boolean value) {
        this.rstrctn = value;
        return this;
    }

    /**
     * Gets the value of the opngDt property.
     * 
     */
    public boolean isOpngDt() {
        return opngDt;
    }

    /**
     * Sets the value of the opngDt property.
     * 
     */
    public CustomerAccountReturnCriteria1 setOpngDt(boolean value) {
        this.opngDt = value;
        return this;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     */
    public boolean isAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     */
    public CustomerAccountReturnCriteria1 setAcctOwnr(boolean value) {
        this.acctOwnr = value;
        return this;
    }

    /**
     * Gets the value of the refAcct property.
     * 
     */
    public boolean isRefAcct() {
        return refAcct;
    }

    /**
     * Sets the value of the refAcct property.
     * 
     */
    public CustomerAccountReturnCriteria1 setRefAcct(boolean value) {
        this.refAcct = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification42 }
     * 
     * 
     */
    public List<GenericIdentification42> getPrtry() {
        if (prtry == null) {
            prtry = new ArrayList<GenericIdentification42>();
        }
        return this.prtry;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the prtry list.
     * @see #getPrtry()
     * 
     */
    public CustomerAccountReturnCriteria1 addPrtry(GenericIdentification42 prtry) {
        getPrtry().add(prtry);
        return this;
    }

}
