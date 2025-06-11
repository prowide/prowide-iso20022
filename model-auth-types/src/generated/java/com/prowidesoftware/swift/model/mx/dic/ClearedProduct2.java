
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Financial instrument cleared by a central counterparty, with cleared gross notional amount.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearedProduct2", propOrder = {
    "tradgVn",
    "ccpPdctId",
    "uvrslPdctId",
    "pdct",
    "opnIntrst",
    "trdsClrd",
    "clrdGrssNtnlAmt"
})
public class ClearedProduct2 {

    @XmlElement(name = "TradgVn", required = true)
    protected List<String> tradgVn;
    @XmlElement(name = "CCPPdctId", required = true)
    protected GenericIdentification168 ccpPdctId;
    @XmlElement(name = "UvrslPdctId")
    protected GenericIdentification168 uvrslPdctId;
    @XmlElement(name = "Pdct", required = true)
    protected Product1Choice pdct;
    @XmlElement(name = "OpnIntrst", required = true)
    protected OpenInterest1 opnIntrst;
    @XmlElement(name = "TrdsClrd")
    protected BigDecimal trdsClrd;
    @XmlElement(name = "ClrdGrssNtnlAmt", required = true)
    protected ActiveCurrencyAnd24Amount clrdGrssNtnlAmt;

    /**
     * Gets the value of the tradgVn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradgVn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradgVn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTradgVn() {
        if (tradgVn == null) {
            tradgVn = new ArrayList<String>();
        }
        return this.tradgVn;
    }

    /**
     * Gets the value of the ccpPdctId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification168 }
     *     
     */
    public GenericIdentification168 getCCPPdctId() {
        return ccpPdctId;
    }

    /**
     * Sets the value of the ccpPdctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification168 }
     *     
     */
    public ClearedProduct2 setCCPPdctId(GenericIdentification168 value) {
        this.ccpPdctId = value;
        return this;
    }

    /**
     * Gets the value of the uvrslPdctId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification168 }
     *     
     */
    public GenericIdentification168 getUvrslPdctId() {
        return uvrslPdctId;
    }

    /**
     * Sets the value of the uvrslPdctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification168 }
     *     
     */
    public ClearedProduct2 setUvrslPdctId(GenericIdentification168 value) {
        this.uvrslPdctId = value;
        return this;
    }

    /**
     * Gets the value of the pdct property.
     * 
     * @return
     *     possible object is
     *     {@link Product1Choice }
     *     
     */
    public Product1Choice getPdct() {
        return pdct;
    }

    /**
     * Sets the value of the pdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Product1Choice }
     *     
     */
    public ClearedProduct2 setPdct(Product1Choice value) {
        this.pdct = value;
        return this;
    }

    /**
     * Gets the value of the opnIntrst property.
     * 
     * @return
     *     possible object is
     *     {@link OpenInterest1 }
     *     
     */
    public OpenInterest1 getOpnIntrst() {
        return opnIntrst;
    }

    /**
     * Sets the value of the opnIntrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenInterest1 }
     *     
     */
    public ClearedProduct2 setOpnIntrst(OpenInterest1 value) {
        this.opnIntrst = value;
        return this;
    }

    /**
     * Gets the value of the trdsClrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrdsClrd() {
        return trdsClrd;
    }

    /**
     * Sets the value of the trdsClrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public ClearedProduct2 setTrdsClrd(BigDecimal value) {
        this.trdsClrd = value;
        return this;
    }

    /**
     * Gets the value of the clrdGrssNtnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd24Amount }
     *     
     */
    public ActiveCurrencyAnd24Amount getClrdGrssNtnlAmt() {
        return clrdGrssNtnlAmt;
    }

    /**
     * Sets the value of the clrdGrssNtnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd24Amount }
     *     
     */
    public ClearedProduct2 setClrdGrssNtnlAmt(ActiveCurrencyAnd24Amount value) {
        this.clrdGrssNtnlAmt = value;
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
     * Adds a new item to the tradgVn list.
     * @see #getTradgVn()
     * 
     */
    public ClearedProduct2 addTradgVn(String tradgVn) {
        getTradgVn().add(tradgVn);
        return this;
    }

}
