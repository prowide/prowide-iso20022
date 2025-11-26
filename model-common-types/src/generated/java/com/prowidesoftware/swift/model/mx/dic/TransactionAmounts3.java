
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Amounts of the card transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionAmounts3", propOrder = {
    "amtQlfr",
    "amt",
    "ccy",
    "crdhldrBllgAmt",
    "crdhldrBllgCcy",
    "crdhldrBllgFctvXchgRate",
    "rcncltnAmt",
    "rcncltnCcy",
    "rcncltnFctvXchgRate",
    "dtldAmt"
})
public class TransactionAmounts3 {

    @XmlElement(name = "AmtQlfr")
    @XmlSchemaType(name = "string")
    protected TypeOfAmount22Code amtQlfr;
    @XmlElement(name = "Amt", required = true)
    protected BigDecimal amt;
    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "CrdhldrBllgAmt")
    protected BigDecimal crdhldrBllgAmt;
    @XmlElement(name = "CrdhldrBllgCcy")
    protected String crdhldrBllgCcy;
    @XmlElement(name = "CrdhldrBllgFctvXchgRate")
    protected BigDecimal crdhldrBllgFctvXchgRate;
    @XmlElement(name = "RcncltnAmt")
    protected BigDecimal rcncltnAmt;
    @XmlElement(name = "RcncltnCcy")
    protected String rcncltnCcy;
    @XmlElement(name = "RcncltnFctvXchgRate")
    protected BigDecimal rcncltnFctvXchgRate;
    @XmlElement(name = "DtldAmt")
    protected List<DetailedAmount22> dtldAmt;

    /**
     * Gets the value of the amtQlfr property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAmount22Code }
     *     
     */
    public TypeOfAmount22Code getAmtQlfr() {
        return amtQlfr;
    }

    /**
     * Sets the value of the amtQlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAmount22Code }
     *     
     */
    public TransactionAmounts3 setAmtQlfr(TypeOfAmount22Code value) {
        this.amtQlfr = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransactionAmounts3 setAmt(BigDecimal value) {
        this.amt = value;
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
    public TransactionAmounts3 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrBllgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCrdhldrBllgAmt() {
        return crdhldrBllgAmt;
    }

    /**
     * Sets the value of the crdhldrBllgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransactionAmounts3 setCrdhldrBllgAmt(BigDecimal value) {
        this.crdhldrBllgAmt = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrBllgCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrdhldrBllgCcy() {
        return crdhldrBllgCcy;
    }

    /**
     * Sets the value of the crdhldrBllgCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionAmounts3 setCrdhldrBllgCcy(String value) {
        this.crdhldrBllgCcy = value;
        return this;
    }

    /**
     * Gets the value of the crdhldrBllgFctvXchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCrdhldrBllgFctvXchgRate() {
        return crdhldrBllgFctvXchgRate;
    }

    /**
     * Sets the value of the crdhldrBllgFctvXchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransactionAmounts3 setCrdhldrBllgFctvXchgRate(BigDecimal value) {
        this.crdhldrBllgFctvXchgRate = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRcncltnAmt() {
        return rcncltnAmt;
    }

    /**
     * Sets the value of the rcncltnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransactionAmounts3 setRcncltnAmt(BigDecimal value) {
        this.rcncltnAmt = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcncltnCcy() {
        return rcncltnCcy;
    }

    /**
     * Sets the value of the rcncltnCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionAmounts3 setRcncltnCcy(String value) {
        this.rcncltnCcy = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnFctvXchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRcncltnFctvXchgRate() {
        return rcncltnFctvXchgRate;
    }

    /**
     * Sets the value of the rcncltnFctvXchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public TransactionAmounts3 setRcncltnFctvXchgRate(BigDecimal value) {
        this.rcncltnFctvXchgRate = value;
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
     * {@link DetailedAmount22 }
     * 
     * 
     * @return
     *     The value of the dtldAmt property.
     */
    public List<DetailedAmount22> getDtldAmt() {
        if (dtldAmt == null) {
            dtldAmt = new ArrayList<>();
        }
        return this.dtldAmt;
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
    public TransactionAmounts3 addDtldAmt(DetailedAmount22 dtldAmt) {
        getDtldAmt().add(dtldAmt);
        return this;
    }

}
