
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
@XmlType(name = "OtherAmounts32", propOrder = {
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
public class OtherAmounts32 {

    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection47 acrdIntrstAmt;
    @XmlElement(name = "ChrgsFees")
    protected AmountAndDirection47 chrgsFees;
    @XmlElement(name = "TradAmt")
    protected AmountAndDirection47 tradAmt;
    @XmlElement(name = "ExctgBrkrAmt")
    protected AmountAndDirection47 exctgBrkrAmt;
    @XmlElement(name = "LclTax")
    protected AmountAndDirection47 lclTax;
    @XmlElement(name = "LclBrkrComssn")
    protected AmountAndDirection47 lclBrkrComssn;
    @XmlElement(name = "Othr")
    protected AmountAndDirection47 othr;
    @XmlElement(name = "StmpDty")
    protected AmountAndDirection47 stmpDty;
    @XmlElement(name = "TxTax")
    protected AmountAndDirection47 txTax;
    @XmlElement(name = "WhldgTax")
    protected AmountAndDirection47 whldgTax;
    @XmlElement(name = "CsmptnTax")
    protected AmountAndDirection47 csmptnTax;

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection47 }
     *     
     */
    public AmountAndDirection47 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection47 }
     *     
     */
    public OtherAmounts32 setAcrdIntrstAmt(AmountAndDirection47 value) {
        this.acrdIntrstAmt = value;
        return this;
    }

    /**
     * Gets the value of the chrgsFees property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection47 }
     *     
     */
    public AmountAndDirection47 getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Sets the value of the chrgsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection47 }
     *     
     */
    public OtherAmounts32 setChrgsFees(AmountAndDirection47 value) {
        this.chrgsFees = value;
        return this;
    }

    /**
     * Gets the value of the tradAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection47 }
     *     
     */
    public AmountAndDirection47 getTradAmt() {
        return tradAmt;
    }

    /**
     * Sets the value of the tradAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection47 }
     *     
     */
    public OtherAmounts32 setTradAmt(AmountAndDirection47 value) {
        this.tradAmt = value;
        return this;
    }

    /**
     * Gets the value of the exctgBrkrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection47 }
     *     
     */
    public AmountAndDirection47 getExctgBrkrAmt() {
        return exctgBrkrAmt;
    }

    /**
     * Sets the value of the exctgBrkrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection47 }
     *     
     */
    public OtherAmounts32 setExctgBrkrAmt(AmountAndDirection47 value) {
        this.exctgBrkrAmt = value;
        return this;
    }

    /**
     * Gets the value of the lclTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection47 }
     *     
     */
    public AmountAndDirection47 getLclTax() {
        return lclTax;
    }

    /**
     * Sets the value of the lclTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection47 }
     *     
     */
    public OtherAmounts32 setLclTax(AmountAndDirection47 value) {
        this.lclTax = value;
        return this;
    }

    /**
     * Gets the value of the lclBrkrComssn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection47 }
     *     
     */
    public AmountAndDirection47 getLclBrkrComssn() {
        return lclBrkrComssn;
    }

    /**
     * Sets the value of the lclBrkrComssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection47 }
     *     
     */
    public OtherAmounts32 setLclBrkrComssn(AmountAndDirection47 value) {
        this.lclBrkrComssn = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection47 }
     *     
     */
    public AmountAndDirection47 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection47 }
     *     
     */
    public OtherAmounts32 setOthr(AmountAndDirection47 value) {
        this.othr = value;
        return this;
    }

    /**
     * Gets the value of the stmpDty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection47 }
     *     
     */
    public AmountAndDirection47 getStmpDty() {
        return stmpDty;
    }

    /**
     * Sets the value of the stmpDty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection47 }
     *     
     */
    public OtherAmounts32 setStmpDty(AmountAndDirection47 value) {
        this.stmpDty = value;
        return this;
    }

    /**
     * Gets the value of the txTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection47 }
     *     
     */
    public AmountAndDirection47 getTxTax() {
        return txTax;
    }

    /**
     * Sets the value of the txTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection47 }
     *     
     */
    public OtherAmounts32 setTxTax(AmountAndDirection47 value) {
        this.txTax = value;
        return this;
    }

    /**
     * Gets the value of the whldgTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection47 }
     *     
     */
    public AmountAndDirection47 getWhldgTax() {
        return whldgTax;
    }

    /**
     * Sets the value of the whldgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection47 }
     *     
     */
    public OtherAmounts32 setWhldgTax(AmountAndDirection47 value) {
        this.whldgTax = value;
        return this;
    }

    /**
     * Gets the value of the csmptnTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection47 }
     *     
     */
    public AmountAndDirection47 getCsmptnTax() {
        return csmptnTax;
    }

    /**
     * Sets the value of the csmptnTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection47 }
     *     
     */
    public OtherAmounts32 setCsmptnTax(AmountAndDirection47 value) {
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
