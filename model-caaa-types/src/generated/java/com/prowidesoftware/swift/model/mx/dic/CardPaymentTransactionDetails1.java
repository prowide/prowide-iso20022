
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
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
 * Details of the transaction in the authorisation request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentTransactionDetails1", propOrder = {
    "ccy",
    "ttlAmt",
    "amtQlfr",
    "dtldAmt",
    "vldtyDt",
    "onLineRsn",
    "uattnddLvlCtgy",
    "acctTp",
    "rcrngTx",
    "pdct",
    "iccRltdData"
})
public class CardPaymentTransactionDetails1 {

    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "TtlAmt", required = true)
    protected BigDecimal ttlAmt;
    @XmlElement(name = "AmtQlfr")
    @XmlSchemaType(name = "string")
    protected TypeOfAmount1Code amtQlfr;
    @XmlElement(name = "DtldAmt")
    protected List<DetailedAmount1> dtldAmt;
    @XmlElement(name = "VldtyDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate vldtyDt;
    @XmlElement(name = "OnLineRsn")
    @XmlSchemaType(name = "string")
    protected OnLineReason1Code onLineRsn;
    @XmlElement(name = "UattnddLvlCtgy")
    protected String uattnddLvlCtgy;
    @XmlElement(name = "AcctTp")
    @XmlSchemaType(name = "string")
    protected CardAccountType1Code acctTp;
    @XmlElement(name = "RcrngTx")
    protected RecurringTransaction1 rcrngTx;
    @XmlElement(name = "Pdct")
    protected List<Product1> pdct;
    @XmlElement(name = "ICCRltdData")
    protected byte[] iccRltdData;

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
    public CardPaymentTransactionDetails1 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CardPaymentTransactionDetails1 setTtlAmt(BigDecimal value) {
        this.ttlAmt = value;
        return this;
    }

    /**
     * Gets the value of the amtQlfr property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAmount1Code }
     *     
     */
    public TypeOfAmount1Code getAmtQlfr() {
        return amtQlfr;
    }

    /**
     * Sets the value of the amtQlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAmount1Code }
     *     
     */
    public CardPaymentTransactionDetails1 setAmtQlfr(TypeOfAmount1Code value) {
        this.amtQlfr = value;
        return this;
    }

    /**
     * Gets the value of the dtldAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dtldAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtldAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount1 }
     * 
     * 
     * @return
     *     The value of the dtldAmt property.
     */
    public List<DetailedAmount1> getDtldAmt() {
        if (dtldAmt == null) {
            dtldAmt = new ArrayList<>();
        }
        return this.dtldAmt;
    }

    /**
     * Gets the value of the vldtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getVldtyDt() {
        return vldtyDt;
    }

    /**
     * Sets the value of the vldtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentTransactionDetails1 setVldtyDt(LocalDate value) {
        this.vldtyDt = value;
        return this;
    }

    /**
     * Gets the value of the onLineRsn property.
     * 
     * @return
     *     possible object is
     *     {@link OnLineReason1Code }
     *     
     */
    public OnLineReason1Code getOnLineRsn() {
        return onLineRsn;
    }

    /**
     * Sets the value of the onLineRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnLineReason1Code }
     *     
     */
    public CardPaymentTransactionDetails1 setOnLineRsn(OnLineReason1Code value) {
        this.onLineRsn = value;
        return this;
    }

    /**
     * Gets the value of the uattnddLvlCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUattnddLvlCtgy() {
        return uattnddLvlCtgy;
    }

    /**
     * Sets the value of the uattnddLvlCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CardPaymentTransactionDetails1 setUattnddLvlCtgy(String value) {
        this.uattnddLvlCtgy = value;
        return this;
    }

    /**
     * Gets the value of the acctTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccountType1Code }
     *     
     */
    public CardAccountType1Code getAcctTp() {
        return acctTp;
    }

    /**
     * Sets the value of the acctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccountType1Code }
     *     
     */
    public CardPaymentTransactionDetails1 setAcctTp(CardAccountType1Code value) {
        this.acctTp = value;
        return this;
    }

    /**
     * Gets the value of the rcrngTx property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringTransaction1 }
     *     
     */
    public RecurringTransaction1 getRcrngTx() {
        return rcrngTx;
    }

    /**
     * Sets the value of the rcrngTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringTransaction1 }
     *     
     */
    public CardPaymentTransactionDetails1 setRcrngTx(RecurringTransaction1 value) {
        this.rcrngTx = value;
        return this;
    }

    /**
     * Gets the value of the pdct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pdct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Product1 }
     * 
     * 
     * @return
     *     The value of the pdct property.
     */
    public List<Product1> getPdct() {
        if (pdct == null) {
            pdct = new ArrayList<>();
        }
        return this.pdct;
    }

    /**
     * Gets the value of the iccRltdData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getICCRltdData() {
        return iccRltdData;
    }

    /**
     * Sets the value of the iccRltdData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public CardPaymentTransactionDetails1 setICCRltdData(byte[] value) {
        this.iccRltdData = value;
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
     * Adds a new item to the dtldAmt list.
     * @see #getDtldAmt()
     * 
     */
    public CardPaymentTransactionDetails1 addDtldAmt(DetailedAmount1 dtldAmt) {
        getDtldAmt().add(dtldAmt);
        return this;
    }

    /**
     * Adds a new item to the pdct list.
     * @see #getPdct()
     * 
     */
    public CardPaymentTransactionDetails1 addPdct(Product1 pdct) {
        getPdct().add(pdct);
        return this;
    }

}
