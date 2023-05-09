
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
 * Details of the transaction in the completion advice.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentTransactionDetails21", propOrder = {
    "ccy",
    "ttlAmt",
    "amtQlfr",
    "dtldAmt",
    "reqdAmt",
    "authrsdAmt",
    "vldtyDt",
    "uattnddLvlCtgy",
    "acctTp",
    "ccyConvs",
    "instlmt",
    "aggtnTx",
    "pdct",
    "cardPmtInvc",
    "iccRltdData"
})
public class CardPaymentTransactionDetails21 {

    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "TtlAmt", required = true)
    protected BigDecimal ttlAmt;
    @XmlElement(name = "AmtQlfr")
    @XmlSchemaType(name = "string")
    protected TypeOfAmount1Code amtQlfr;
    @XmlElement(name = "DtldAmt")
    protected DetailedAmount7 dtldAmt;
    @XmlElement(name = "ReqdAmt")
    protected BigDecimal reqdAmt;
    @XmlElement(name = "AuthrsdAmt")
    protected BigDecimal authrsdAmt;
    @XmlElement(name = "VldtyDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate vldtyDt;
    @XmlElement(name = "UattnddLvlCtgy")
    protected String uattnddLvlCtgy;
    @XmlElement(name = "AcctTp")
    @XmlSchemaType(name = "string")
    protected CardAccountType2Code acctTp;
    @XmlElement(name = "CcyConvs")
    protected CurrencyConversion3 ccyConvs;
    @XmlElement(name = "Instlmt")
    protected RecurringTransaction2 instlmt;
    @XmlElement(name = "AggtnTx")
    protected AggregationTransaction1 aggtnTx;
    @XmlElement(name = "Pdct")
    protected List<Product1> pdct;
    @XmlElement(name = "CardPmtInvc")
    protected CardPaymentInvoice1 cardPmtInvc;
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
    public CardPaymentTransactionDetails21 setCcy(String value) {
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
    public CardPaymentTransactionDetails21 setTtlAmt(BigDecimal value) {
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
    public CardPaymentTransactionDetails21 setAmtQlfr(TypeOfAmount1Code value) {
        this.amtQlfr = value;
        return this;
    }

    /**
     * Gets the value of the dtldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedAmount7 }
     *     
     */
    public DetailedAmount7 getDtldAmt() {
        return dtldAmt;
    }

    /**
     * Sets the value of the dtldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedAmount7 }
     *     
     */
    public CardPaymentTransactionDetails21 setDtldAmt(DetailedAmount7 value) {
        this.dtldAmt = value;
        return this;
    }

    /**
     * Gets the value of the reqdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReqdAmt() {
        return reqdAmt;
    }

    /**
     * Sets the value of the reqdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CardPaymentTransactionDetails21 setReqdAmt(BigDecimal value) {
        this.reqdAmt = value;
        return this;
    }

    /**
     * Gets the value of the authrsdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuthrsdAmt() {
        return authrsdAmt;
    }

    /**
     * Sets the value of the authrsdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CardPaymentTransactionDetails21 setAuthrsdAmt(BigDecimal value) {
        this.authrsdAmt = value;
        return this;
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
    public CardPaymentTransactionDetails21 setVldtyDt(LocalDate value) {
        this.vldtyDt = value;
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
    public CardPaymentTransactionDetails21 setUattnddLvlCtgy(String value) {
        this.uattnddLvlCtgy = value;
        return this;
    }

    /**
     * Gets the value of the acctTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccountType2Code }
     *     
     */
    public CardAccountType2Code getAcctTp() {
        return acctTp;
    }

    /**
     * Sets the value of the acctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccountType2Code }
     *     
     */
    public CardPaymentTransactionDetails21 setAcctTp(CardAccountType2Code value) {
        this.acctTp = value;
        return this;
    }

    /**
     * Gets the value of the ccyConvs property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion3 }
     *     
     */
    public CurrencyConversion3 getCcyConvs() {
        return ccyConvs;
    }

    /**
     * Sets the value of the ccyConvs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion3 }
     *     
     */
    public CardPaymentTransactionDetails21 setCcyConvs(CurrencyConversion3 value) {
        this.ccyConvs = value;
        return this;
    }

    /**
     * Gets the value of the instlmt property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringTransaction2 }
     *     
     */
    public RecurringTransaction2 getInstlmt() {
        return instlmt;
    }

    /**
     * Sets the value of the instlmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringTransaction2 }
     *     
     */
    public CardPaymentTransactionDetails21 setInstlmt(RecurringTransaction2 value) {
        this.instlmt = value;
        return this;
    }

    /**
     * Gets the value of the aggtnTx property.
     * 
     * @return
     *     possible object is
     *     {@link AggregationTransaction1 }
     *     
     */
    public AggregationTransaction1 getAggtnTx() {
        return aggtnTx;
    }

    /**
     * Sets the value of the aggtnTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregationTransaction1 }
     *     
     */
    public CardPaymentTransactionDetails21 setAggtnTx(AggregationTransaction1 value) {
        this.aggtnTx = value;
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
     * Gets the value of the cardPmtInvc property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentInvoice1 }
     *     
     */
    public CardPaymentInvoice1 getCardPmtInvc() {
        return cardPmtInvc;
    }

    /**
     * Sets the value of the cardPmtInvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentInvoice1 }
     *     
     */
    public CardPaymentTransactionDetails21 setCardPmtInvc(CardPaymentInvoice1 value) {
        this.cardPmtInvc = value;
        return this;
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
    public CardPaymentTransactionDetails21 setICCRltdData(byte[] value) {
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
     * Adds a new item to the pdct list.
     * @see #getPdct()
     * 
     */
    public CardPaymentTransactionDetails21 addPdct(Product1 pdct) {
        getPdct().add(pdct);
        return this;
    }

}
