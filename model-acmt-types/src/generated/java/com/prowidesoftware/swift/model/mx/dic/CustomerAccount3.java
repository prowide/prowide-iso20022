
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlType(name = "CustomerAccount3", propOrder = {
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
    "opngDt"
})
public class CustomerAccount3 {

    @XmlElement(name = "Id", required = true)
    protected AccountIdentification4Choice id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected AccountStatus3Code sts;
    @XmlElement(name = "Tp")
    protected CashAccountType2 tp;
    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "MnthlyPmtVal")
    protected BigDecimal mnthlyPmtVal;
    @XmlElement(name = "MnthlyRcvdVal")
    protected BigDecimal mnthlyRcvdVal;
    @XmlElement(name = "MnthlyTxNb")
    protected String mnthlyTxNb;
    @XmlElement(name = "AvrgBal")
    protected BigDecimal avrgBal;
    @XmlElement(name = "AcctPurp")
    protected String acctPurp;
    @XmlElement(name = "FlrNtfctnAmt")
    protected BigDecimal flrNtfctnAmt;
    @XmlElement(name = "ClngNtfctnAmt")
    protected BigDecimal clngNtfctnAmt;
    @XmlElement(name = "StmtCycl")
    @XmlSchemaType(name = "string")
    protected Frequency3Code stmtCycl;
    @XmlElement(name = "ClsgDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar clsgDt;
    @XmlElement(name = "Rstrctn")
    protected List<Restriction1> rstrctn;
    @XmlElement(name = "OpngDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar opngDt;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public CustomerAccount3 setId(AccountIdentification4Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerAccount3 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatus3Code }
     *     
     */
    public AccountStatus3Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatus3Code }
     *     
     */
    public CustomerAccount3 setSts(AccountStatus3Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountType2 }
     *     
     */
    public CashAccountType2 getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountType2 }
     *     
     */
    public CustomerAccount3 setTp(CashAccountType2 value) {
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
    public CustomerAccount3 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the mnthlyPmtVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMnthlyPmtVal() {
        return mnthlyPmtVal;
    }

    /**
     * Sets the value of the mnthlyPmtVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CustomerAccount3 setMnthlyPmtVal(BigDecimal value) {
        this.mnthlyPmtVal = value;
        return this;
    }

    /**
     * Gets the value of the mnthlyRcvdVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMnthlyRcvdVal() {
        return mnthlyRcvdVal;
    }

    /**
     * Sets the value of the mnthlyRcvdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CustomerAccount3 setMnthlyRcvdVal(BigDecimal value) {
        this.mnthlyRcvdVal = value;
        return this;
    }

    /**
     * Gets the value of the mnthlyTxNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnthlyTxNb() {
        return mnthlyTxNb;
    }

    /**
     * Sets the value of the mnthlyTxNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerAccount3 setMnthlyTxNb(String value) {
        this.mnthlyTxNb = value;
        return this;
    }

    /**
     * Gets the value of the avrgBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvrgBal() {
        return avrgBal;
    }

    /**
     * Sets the value of the avrgBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CustomerAccount3 setAvrgBal(BigDecimal value) {
        this.avrgBal = value;
        return this;
    }

    /**
     * Gets the value of the acctPurp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctPurp() {
        return acctPurp;
    }

    /**
     * Sets the value of the acctPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerAccount3 setAcctPurp(String value) {
        this.acctPurp = value;
        return this;
    }

    /**
     * Gets the value of the flrNtfctnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlrNtfctnAmt() {
        return flrNtfctnAmt;
    }

    /**
     * Sets the value of the flrNtfctnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CustomerAccount3 setFlrNtfctnAmt(BigDecimal value) {
        this.flrNtfctnAmt = value;
        return this;
    }

    /**
     * Gets the value of the clngNtfctnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClngNtfctnAmt() {
        return clngNtfctnAmt;
    }

    /**
     * Sets the value of the clngNtfctnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CustomerAccount3 setClngNtfctnAmt(BigDecimal value) {
        this.clngNtfctnAmt = value;
        return this;
    }

    /**
     * Gets the value of the stmtCycl property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency3Code }
     *     
     */
    public Frequency3Code getStmtCycl() {
        return stmtCycl;
    }

    /**
     * Sets the value of the stmtCycl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency3Code }
     *     
     */
    public CustomerAccount3 setStmtCycl(Frequency3Code value) {
        this.stmtCycl = value;
        return this;
    }

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerAccount3 setClsgDt(Calendar value) {
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
     * {@link Restriction1 }
     * 
     * 
     * @return
     *     The value of the rstrctn property.
     */
    public List<Restriction1> getRstrctn() {
        if (rstrctn == null) {
            rstrctn = new ArrayList<>();
        }
        return this.rstrctn;
    }

    /**
     * Gets the value of the opngDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getOpngDt() {
        return opngDt;
    }

    /**
     * Sets the value of the opngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CustomerAccount3 setOpngDt(Calendar value) {
        this.opngDt = value;
        return this;
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
     * Adds a new item to the rstrctn list.
     * @see #getRstrctn()
     * 
     */
    public CustomerAccount3 addRstrctn(Restriction1 rstrctn) {
        getRstrctn().add(rstrctn);
        return this;
    }

}
