
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
 * Account owned by a customer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAccountModification1", propOrder = {
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
    "stmtFrqcyAndFrmt",
    "clsgDt",
    "rstrctn"
})
public class CustomerAccountModification1 {

    @XmlElement(name = "Id", required = true)
    protected List<AccountIdentification4Choice> id;
    @XmlElement(name = "Nm")
    protected NameModification1 nm;
    @XmlElement(name = "Sts")
    protected AccountStatusModification1 sts;
    @XmlElement(name = "Tp")
    protected TypeModification1 tp;
    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "MnthlyPmtVal")
    protected AmountModification1 mnthlyPmtVal;
    @XmlElement(name = "MnthlyRcvdVal")
    protected AmountModification1 mnthlyRcvdVal;
    @XmlElement(name = "MnthlyTxNb")
    protected NumberModification1 mnthlyTxNb;
    @XmlElement(name = "AvrgBal")
    protected AmountModification1 avrgBal;
    @XmlElement(name = "AcctPurp")
    protected PurposeModification1 acctPurp;
    @XmlElement(name = "FlrNtfctnAmt")
    protected AmountModification1 flrNtfctnAmt;
    @XmlElement(name = "ClngNtfctnAmt")
    protected AmountModification1 clngNtfctnAmt;
    @XmlElement(name = "StmtFrqcyAndFrmt")
    protected List<StatementFrequencyAndFormModification1> stmtFrqcyAndFrmt;
    @XmlElement(name = "ClsgDt")
    protected DateModification1 clsgDt;
    @XmlElement(name = "Rstrctn")
    protected List<RestrictionModification1> rstrctn;

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountIdentification4Choice }
     * 
     * 
     * @return
     *     The value of the id property.
     */
    public List<AccountIdentification4Choice> getId() {
        if (id == null) {
            id = new ArrayList<>();
        }
        return this.id;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link NameModification1 }
     *     
     */
    public NameModification1 getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameModification1 }
     *     
     */
    public CustomerAccountModification1 setNm(NameModification1 value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatusModification1 }
     *     
     */
    public AccountStatusModification1 getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatusModification1 }
     *     
     */
    public CustomerAccountModification1 setSts(AccountStatusModification1 value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TypeModification1 }
     *     
     */
    public TypeModification1 getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeModification1 }
     *     
     */
    public CustomerAccountModification1 setTp(TypeModification1 value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerAccountModification1 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the mnthlyPmtVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountModification1 }
     *     
     */
    public AmountModification1 getMnthlyPmtVal() {
        return mnthlyPmtVal;
    }

    /**
     * Sets the value of the mnthlyPmtVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountModification1 }
     *     
     */
    public CustomerAccountModification1 setMnthlyPmtVal(AmountModification1 value) {
        this.mnthlyPmtVal = value;
        return this;
    }

    /**
     * Gets the value of the mnthlyRcvdVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountModification1 }
     *     
     */
    public AmountModification1 getMnthlyRcvdVal() {
        return mnthlyRcvdVal;
    }

    /**
     * Sets the value of the mnthlyRcvdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountModification1 }
     *     
     */
    public CustomerAccountModification1 setMnthlyRcvdVal(AmountModification1 value) {
        this.mnthlyRcvdVal = value;
        return this;
    }

    /**
     * Gets the value of the mnthlyTxNb property.
     * 
     * @return
     *     possible object is
     *     {@link NumberModification1 }
     *     
     */
    public NumberModification1 getMnthlyTxNb() {
        return mnthlyTxNb;
    }

    /**
     * Sets the value of the mnthlyTxNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberModification1 }
     *     
     */
    public CustomerAccountModification1 setMnthlyTxNb(NumberModification1 value) {
        this.mnthlyTxNb = value;
        return this;
    }

    /**
     * Gets the value of the avrgBal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountModification1 }
     *     
     */
    public AmountModification1 getAvrgBal() {
        return avrgBal;
    }

    /**
     * Sets the value of the avrgBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountModification1 }
     *     
     */
    public CustomerAccountModification1 setAvrgBal(AmountModification1 value) {
        this.avrgBal = value;
        return this;
    }

    /**
     * Gets the value of the acctPurp property.
     * 
     * @return
     *     possible object is
     *     {@link PurposeModification1 }
     *     
     */
    public PurposeModification1 getAcctPurp() {
        return acctPurp;
    }

    /**
     * Sets the value of the acctPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurposeModification1 }
     *     
     */
    public CustomerAccountModification1 setAcctPurp(PurposeModification1 value) {
        this.acctPurp = value;
        return this;
    }

    /**
     * Gets the value of the flrNtfctnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountModification1 }
     *     
     */
    public AmountModification1 getFlrNtfctnAmt() {
        return flrNtfctnAmt;
    }

    /**
     * Sets the value of the flrNtfctnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountModification1 }
     *     
     */
    public CustomerAccountModification1 setFlrNtfctnAmt(AmountModification1 value) {
        this.flrNtfctnAmt = value;
        return this;
    }

    /**
     * Gets the value of the clngNtfctnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountModification1 }
     *     
     */
    public AmountModification1 getClngNtfctnAmt() {
        return clngNtfctnAmt;
    }

    /**
     * Sets the value of the clngNtfctnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountModification1 }
     *     
     */
    public CustomerAccountModification1 setClngNtfctnAmt(AmountModification1 value) {
        this.clngNtfctnAmt = value;
        return this;
    }

    /**
     * Gets the value of the stmtFrqcyAndFrmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stmtFrqcyAndFrmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStmtFrqcyAndFrmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementFrequencyAndFormModification1 }
     * 
     * 
     * @return
     *     The value of the stmtFrqcyAndFrmt property.
     */
    public List<StatementFrequencyAndFormModification1> getStmtFrqcyAndFrmt() {
        if (stmtFrqcyAndFrmt == null) {
            stmtFrqcyAndFrmt = new ArrayList<>();
        }
        return this.stmtFrqcyAndFrmt;
    }

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateModification1 }
     *     
     */
    public DateModification1 getClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateModification1 }
     *     
     */
    public CustomerAccountModification1 setClsgDt(DateModification1 value) {
        this.clsgDt = value;
        return this;
    }

    /**
     * Gets the value of the rstrctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rstrctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRstrctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RestrictionModification1 }
     * 
     * 
     * @return
     *     The value of the rstrctn property.
     */
    public List<RestrictionModification1> getRstrctn() {
        if (rstrctn == null) {
            rstrctn = new ArrayList<>();
        }
        return this.rstrctn;
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
     * Adds a new item to the id list.
     * @see #getId()
     * 
     */
    public CustomerAccountModification1 addId(AccountIdentification4Choice id) {
        getId().add(id);
        return this;
    }

    /**
     * Adds a new item to the stmtFrqcyAndFrmt list.
     * @see #getStmtFrqcyAndFrmt()
     * 
     */
    public CustomerAccountModification1 addStmtFrqcyAndFrmt(StatementFrequencyAndFormModification1 stmtFrqcyAndFrmt) {
        getStmtFrqcyAndFrmt().add(stmtFrqcyAndFrmt);
        return this;
    }

    /**
     * Adds a new item to the rstrctn list.
     * @see #getRstrctn()
     * 
     */
    public CustomerAccountModification1 addRstrctn(RestrictionModification1 rstrctn) {
        getRstrctn().add(rstrctn);
        return this;
    }

}
