
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
@XmlType(name = "OtherAmounts36", propOrder = {
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
public class OtherAmounts36 {

    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection72 acrdIntrstAmt;
    @XmlElement(name = "ChrgsFees")
    protected AmountAndDirection72 chrgsFees;
    @XmlElement(name = "TradAmt")
    protected AmountAndDirection72 tradAmt;
    @XmlElement(name = "ExctgBrkrAmt")
    protected AmountAndDirection72 exctgBrkrAmt;
    @XmlElement(name = "LclTax")
    protected AmountAndDirection72 lclTax;
    @XmlElement(name = "LclBrkrComssn")
    protected AmountAndDirection72 lclBrkrComssn;
    @XmlElement(name = "Othr")
    protected AmountAndDirection72 othr;
    @XmlElement(name = "StmpDty")
    protected AmountAndDirection72 stmpDty;
    @XmlElement(name = "TxTax")
    protected AmountAndDirection72 txTax;
    @XmlElement(name = "WhldgTax")
    protected AmountAndDirection72 whldgTax;
    @XmlElement(name = "CsmptnTax")
    protected AmountAndDirection72 csmptnTax;

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public AmountAndDirection72 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public OtherAmounts36 setAcrdIntrstAmt(AmountAndDirection72 value) {
        this.acrdIntrstAmt = value;
        return this;
    }

    /**
     * Gets the value of the chrgsFees property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public AmountAndDirection72 getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Sets the value of the chrgsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public OtherAmounts36 setChrgsFees(AmountAndDirection72 value) {
        this.chrgsFees = value;
        return this;
    }

    /**
     * Gets the value of the tradAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public AmountAndDirection72 getTradAmt() {
        return tradAmt;
    }

    /**
     * Sets the value of the tradAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public OtherAmounts36 setTradAmt(AmountAndDirection72 value) {
        this.tradAmt = value;
        return this;
    }

    /**
     * Gets the value of the exctgBrkrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public AmountAndDirection72 getExctgBrkrAmt() {
        return exctgBrkrAmt;
    }

    /**
     * Sets the value of the exctgBrkrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public OtherAmounts36 setExctgBrkrAmt(AmountAndDirection72 value) {
        this.exctgBrkrAmt = value;
        return this;
    }

    /**
     * Gets the value of the lclTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public AmountAndDirection72 getLclTax() {
        return lclTax;
    }

    /**
     * Sets the value of the lclTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public OtherAmounts36 setLclTax(AmountAndDirection72 value) {
        this.lclTax = value;
        return this;
    }

    /**
     * Gets the value of the lclBrkrComssn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public AmountAndDirection72 getLclBrkrComssn() {
        return lclBrkrComssn;
    }

    /**
     * Sets the value of the lclBrkrComssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public OtherAmounts36 setLclBrkrComssn(AmountAndDirection72 value) {
        this.lclBrkrComssn = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public AmountAndDirection72 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public OtherAmounts36 setOthr(AmountAndDirection72 value) {
        this.othr = value;
        return this;
    }

    /**
     * Gets the value of the stmpDty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public AmountAndDirection72 getStmpDty() {
        return stmpDty;
    }

    /**
     * Sets the value of the stmpDty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public OtherAmounts36 setStmpDty(AmountAndDirection72 value) {
        this.stmpDty = value;
        return this;
    }

    /**
     * Gets the value of the txTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public AmountAndDirection72 getTxTax() {
        return txTax;
    }

    /**
     * Sets the value of the txTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public OtherAmounts36 setTxTax(AmountAndDirection72 value) {
        this.txTax = value;
        return this;
    }

    /**
     * Gets the value of the whldgTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public AmountAndDirection72 getWhldgTax() {
        return whldgTax;
    }

    /**
     * Sets the value of the whldgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public OtherAmounts36 setWhldgTax(AmountAndDirection72 value) {
        this.whldgTax = value;
        return this;
    }

    /**
     * Gets the value of the csmptnTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public AmountAndDirection72 getCsmptnTax() {
        return csmptnTax;
    }

    /**
     * Sets the value of the csmptnTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection72 }
     *     
     */
    public OtherAmounts36 setCsmptnTax(AmountAndDirection72 value) {
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
