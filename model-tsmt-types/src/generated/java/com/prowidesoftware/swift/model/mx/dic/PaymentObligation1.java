
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Payment obligation contracted between two financial institutions related to the financing of a commercial transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentObligation1", propOrder = {
    "oblgrBk",
    "rcptBk",
    "amt",
    "pctg",
    "chrgsAmt",
    "chrgsPctg",
    "xpryDt",
    "aplblLaw",
    "pmtTerms",
    "sttlmTerms"
})
public class PaymentObligation1 {

    @XmlElement(name = "OblgrBk", required = true)
    protected BICIdentification1 oblgrBk;
    @XmlElement(name = "RcptBk", required = true)
    protected BICIdentification1 rcptBk;
    @XmlElement(name = "Amt")
    protected CurrencyAndAmount amt;
    @XmlElement(name = "Pctg")
    protected BigDecimal pctg;
    @XmlElement(name = "ChrgsAmt")
    protected CurrencyAndAmount chrgsAmt;
    @XmlElement(name = "ChrgsPctg")
    protected BigDecimal chrgsPctg;
    @XmlElement(name = "XpryDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpryDt;
    @XmlElement(name = "AplblLaw")
    protected String aplblLaw;
    @XmlElement(name = "PmtTerms")
    protected List<PaymentTerms2> pmtTerms;
    @XmlElement(name = "SttlmTerms")
    protected SettlementTerms2 sttlmTerms;

    /**
     * Gets the value of the oblgrBk property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getOblgrBk() {
        return oblgrBk;
    }

    /**
     * Sets the value of the oblgrBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public PaymentObligation1 setOblgrBk(BICIdentification1 value) {
        this.oblgrBk = value;
        return this;
    }

    /**
     * Gets the value of the rcptBk property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getRcptBk() {
        return rcptBk;
    }

    /**
     * Sets the value of the rcptBk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public PaymentObligation1 setRcptBk(BICIdentification1 value) {
        this.rcptBk = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public PaymentObligation1 setAmt(CurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the pctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctg() {
        return pctg;
    }

    /**
     * Sets the value of the pctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PaymentObligation1 setPctg(BigDecimal value) {
        this.pctg = value;
        return this;
    }

    /**
     * Gets the value of the chrgsAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getChrgsAmt() {
        return chrgsAmt;
    }

    /**
     * Sets the value of the chrgsAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public PaymentObligation1 setChrgsAmt(CurrencyAndAmount value) {
        this.chrgsAmt = value;
        return this;
    }

    /**
     * Gets the value of the chrgsPctg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChrgsPctg() {
        return chrgsPctg;
    }

    /**
     * Sets the value of the chrgsPctg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public PaymentObligation1 setChrgsPctg(BigDecimal value) {
        this.chrgsPctg = value;
        return this;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentObligation1 setXpryDt(XMLGregorianCalendar value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the aplblLaw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAplblLaw() {
        return aplblLaw;
    }

    /**
     * Sets the value of the aplblLaw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentObligation1 setAplblLaw(String value) {
        this.aplblLaw = value;
        return this;
    }

    /**
     * Gets the value of the pmtTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pmtTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTerms2 }
     * 
     * 
     */
    public List<PaymentTerms2> getPmtTerms() {
        if (pmtTerms == null) {
            pmtTerms = new ArrayList<PaymentTerms2>();
        }
        return this.pmtTerms;
    }

    /**
     * Gets the value of the sttlmTerms property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTerms2 }
     *     
     */
    public SettlementTerms2 getSttlmTerms() {
        return sttlmTerms;
    }

    /**
     * Sets the value of the sttlmTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTerms2 }
     *     
     */
    public PaymentObligation1 setSttlmTerms(SettlementTerms2 value) {
        this.sttlmTerms = value;
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
     * Adds a new item to the pmtTerms list.
     * @see #getPmtTerms()
     * 
     */
    public PaymentObligation1 addPmtTerms(PaymentTerms2 pmtTerms) {
        getPmtTerms().add(pmtTerms);
        return this;
    }

}
