
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Identifies other amounts pertaining to the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherAmounts11", propOrder = {
    "acrdIntrstAmt",
    "chrgsFees",
    "tradAmt",
    "exctgBrkrAmt",
    "lclTax",
    "lclBrkrComssn",
    "othr",
    "stmpDty",
    "txTax",
    "whldgTax",
    "csmptnTax"
})
public class OtherAmounts11 {

    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection26 acrdIntrstAmt;
    @XmlElement(name = "ChrgsFees")
    protected AmountAndDirection26 chrgsFees;
    @XmlElement(name = "TradAmt")
    protected AmountAndDirection26 tradAmt;
    @XmlElement(name = "ExctgBrkrAmt")
    protected AmountAndDirection26 exctgBrkrAmt;
    @XmlElement(name = "LclTax")
    protected AmountAndDirection26 lclTax;
    @XmlElement(name = "LclBrkrComssn")
    protected AmountAndDirection26 lclBrkrComssn;
    @XmlElement(name = "Othr")
    protected AmountAndDirection26 othr;
    @XmlElement(name = "StmpDty")
    protected AmountAndDirection26 stmpDty;
    @XmlElement(name = "TxTax")
    protected AmountAndDirection26 txTax;
    @XmlElement(name = "WhldgTax")
    protected AmountAndDirection26 whldgTax;
    @XmlElement(name = "CsmptnTax")
    protected AmountAndDirection26 csmptnTax;

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection26 }
     *     
     */
    public AmountAndDirection26 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection26 }
     *     
     */
    public OtherAmounts11 setAcrdIntrstAmt(AmountAndDirection26 value) {
        this.acrdIntrstAmt = value;
        return this;
    }

    /**
     * Gets the value of the chrgsFees property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection26 }
     *     
     */
    public AmountAndDirection26 getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Sets the value of the chrgsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection26 }
     *     
     */
    public OtherAmounts11 setChrgsFees(AmountAndDirection26 value) {
        this.chrgsFees = value;
        return this;
    }

    /**
     * Gets the value of the tradAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection26 }
     *     
     */
    public AmountAndDirection26 getTradAmt() {
        return tradAmt;
    }

    /**
     * Sets the value of the tradAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection26 }
     *     
     */
    public OtherAmounts11 setTradAmt(AmountAndDirection26 value) {
        this.tradAmt = value;
        return this;
    }

    /**
     * Gets the value of the exctgBrkrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection26 }
     *     
     */
    public AmountAndDirection26 getExctgBrkrAmt() {
        return exctgBrkrAmt;
    }

    /**
     * Sets the value of the exctgBrkrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection26 }
     *     
     */
    public OtherAmounts11 setExctgBrkrAmt(AmountAndDirection26 value) {
        this.exctgBrkrAmt = value;
        return this;
    }

    /**
     * Gets the value of the lclTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection26 }
     *     
     */
    public AmountAndDirection26 getLclTax() {
        return lclTax;
    }

    /**
     * Sets the value of the lclTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection26 }
     *     
     */
    public OtherAmounts11 setLclTax(AmountAndDirection26 value) {
        this.lclTax = value;
        return this;
    }

    /**
     * Gets the value of the lclBrkrComssn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection26 }
     *     
     */
    public AmountAndDirection26 getLclBrkrComssn() {
        return lclBrkrComssn;
    }

    /**
     * Sets the value of the lclBrkrComssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection26 }
     *     
     */
    public OtherAmounts11 setLclBrkrComssn(AmountAndDirection26 value) {
        this.lclBrkrComssn = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection26 }
     *     
     */
    public AmountAndDirection26 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection26 }
     *     
     */
    public OtherAmounts11 setOthr(AmountAndDirection26 value) {
        this.othr = value;
        return this;
    }

    /**
     * Gets the value of the stmpDty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection26 }
     *     
     */
    public AmountAndDirection26 getStmpDty() {
        return stmpDty;
    }

    /**
     * Sets the value of the stmpDty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection26 }
     *     
     */
    public OtherAmounts11 setStmpDty(AmountAndDirection26 value) {
        this.stmpDty = value;
        return this;
    }

    /**
     * Gets the value of the txTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection26 }
     *     
     */
    public AmountAndDirection26 getTxTax() {
        return txTax;
    }

    /**
     * Sets the value of the txTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection26 }
     *     
     */
    public OtherAmounts11 setTxTax(AmountAndDirection26 value) {
        this.txTax = value;
        return this;
    }

    /**
     * Gets the value of the whldgTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection26 }
     *     
     */
    public AmountAndDirection26 getWhldgTax() {
        return whldgTax;
    }

    /**
     * Sets the value of the whldgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection26 }
     *     
     */
    public OtherAmounts11 setWhldgTax(AmountAndDirection26 value) {
        this.whldgTax = value;
        return this;
    }

    /**
     * Gets the value of the csmptnTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection26 }
     *     
     */
    public AmountAndDirection26 getCsmptnTax() {
        return csmptnTax;
    }

    /**
     * Sets the value of the csmptnTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection26 }
     *     
     */
    public OtherAmounts11 setCsmptnTax(AmountAndDirection26 value) {
        this.csmptnTax = value;
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

}
