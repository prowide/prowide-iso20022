
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
@XmlType(name = "OtherAmounts8", propOrder = {
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
public class OtherAmounts8 {

    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection23 acrdIntrstAmt;
    @XmlElement(name = "ChrgsFees")
    protected AmountAndDirection23 chrgsFees;
    @XmlElement(name = "TradAmt")
    protected AmountAndDirection23 tradAmt;
    @XmlElement(name = "ExctgBrkrAmt")
    protected AmountAndDirection23 exctgBrkrAmt;
    @XmlElement(name = "LclTax")
    protected AmountAndDirection23 lclTax;
    @XmlElement(name = "LclBrkrComssn")
    protected AmountAndDirection23 lclBrkrComssn;
    @XmlElement(name = "Othr")
    protected AmountAndDirection23 othr;
    @XmlElement(name = "StmpDty")
    protected AmountAndDirection23 stmpDty;
    @XmlElement(name = "TxTax")
    protected AmountAndDirection23 txTax;
    @XmlElement(name = "WhldgTax")
    protected AmountAndDirection23 whldgTax;
    @XmlElement(name = "CsmptnTax")
    protected AmountAndDirection23 csmptnTax;

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection23 }
     *     
     */
    public AmountAndDirection23 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection23 }
     *     
     */
    public OtherAmounts8 setAcrdIntrstAmt(AmountAndDirection23 value) {
        this.acrdIntrstAmt = value;
        return this;
    }

    /**
     * Gets the value of the chrgsFees property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection23 }
     *     
     */
    public AmountAndDirection23 getChrgsFees() {
        return chrgsFees;
    }

    /**
     * Sets the value of the chrgsFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection23 }
     *     
     */
    public OtherAmounts8 setChrgsFees(AmountAndDirection23 value) {
        this.chrgsFees = value;
        return this;
    }

    /**
     * Gets the value of the tradAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection23 }
     *     
     */
    public AmountAndDirection23 getTradAmt() {
        return tradAmt;
    }

    /**
     * Sets the value of the tradAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection23 }
     *     
     */
    public OtherAmounts8 setTradAmt(AmountAndDirection23 value) {
        this.tradAmt = value;
        return this;
    }

    /**
     * Gets the value of the exctgBrkrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection23 }
     *     
     */
    public AmountAndDirection23 getExctgBrkrAmt() {
        return exctgBrkrAmt;
    }

    /**
     * Sets the value of the exctgBrkrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection23 }
     *     
     */
    public OtherAmounts8 setExctgBrkrAmt(AmountAndDirection23 value) {
        this.exctgBrkrAmt = value;
        return this;
    }

    /**
     * Gets the value of the lclTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection23 }
     *     
     */
    public AmountAndDirection23 getLclTax() {
        return lclTax;
    }

    /**
     * Sets the value of the lclTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection23 }
     *     
     */
    public OtherAmounts8 setLclTax(AmountAndDirection23 value) {
        this.lclTax = value;
        return this;
    }

    /**
     * Gets the value of the lclBrkrComssn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection23 }
     *     
     */
    public AmountAndDirection23 getLclBrkrComssn() {
        return lclBrkrComssn;
    }

    /**
     * Sets the value of the lclBrkrComssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection23 }
     *     
     */
    public OtherAmounts8 setLclBrkrComssn(AmountAndDirection23 value) {
        this.lclBrkrComssn = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection23 }
     *     
     */
    public AmountAndDirection23 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection23 }
     *     
     */
    public OtherAmounts8 setOthr(AmountAndDirection23 value) {
        this.othr = value;
        return this;
    }

    /**
     * Gets the value of the stmpDty property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection23 }
     *     
     */
    public AmountAndDirection23 getStmpDty() {
        return stmpDty;
    }

    /**
     * Sets the value of the stmpDty property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection23 }
     *     
     */
    public OtherAmounts8 setStmpDty(AmountAndDirection23 value) {
        this.stmpDty = value;
        return this;
    }

    /**
     * Gets the value of the txTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection23 }
     *     
     */
    public AmountAndDirection23 getTxTax() {
        return txTax;
    }

    /**
     * Sets the value of the txTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection23 }
     *     
     */
    public OtherAmounts8 setTxTax(AmountAndDirection23 value) {
        this.txTax = value;
        return this;
    }

    /**
     * Gets the value of the whldgTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection23 }
     *     
     */
    public AmountAndDirection23 getWhldgTax() {
        return whldgTax;
    }

    /**
     * Sets the value of the whldgTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection23 }
     *     
     */
    public OtherAmounts8 setWhldgTax(AmountAndDirection23 value) {
        this.whldgTax = value;
        return this;
    }

    /**
     * Gets the value of the csmptnTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection23 }
     *     
     */
    public AmountAndDirection23 getCsmptnTax() {
        return csmptnTax;
    }

    /**
     * Sets the value of the csmptnTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection23 }
     *     
     */
    public OtherAmounts8 setCsmptnTax(AmountAndDirection23 value) {
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
