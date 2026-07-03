
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
 * Statement of the financial performance of a legal entity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncomeStatement1", propOrder = {
    "clrFees",
    "othrOprgRvn",
    "oprgExpnss",
    "oprgPrftOrLoss",
    "netIntrstIncm",
    "othrNonOprgRvn",
    "nonOprgExpnss",
    "preTaxPrftOrLoss",
    "pstTaxPrftOrLoss"
})
public class IncomeStatement1 {

    @XmlElement(name = "ClrFees", required = true)
    protected ActiveCurrencyAndAmount clrFees;
    @XmlElement(name = "OthrOprgRvn", required = true)
    protected ActiveCurrencyAndAmount othrOprgRvn;
    @XmlElement(name = "OprgExpnss", required = true)
    protected ActiveCurrencyAndAmount oprgExpnss;
    @XmlElement(name = "OprgPrftOrLoss", required = true)
    protected AmountAndDirection102 oprgPrftOrLoss;
    @XmlElement(name = "NetIntrstIncm", required = true)
    protected ActiveCurrencyAndAmount netIntrstIncm;
    @XmlElement(name = "OthrNonOprgRvn", required = true)
    protected ActiveCurrencyAndAmount othrNonOprgRvn;
    @XmlElement(name = "NonOprgExpnss", required = true)
    protected ActiveCurrencyAndAmount nonOprgExpnss;
    @XmlElement(name = "PreTaxPrftOrLoss", required = true)
    protected AmountAndDirection102 preTaxPrftOrLoss;
    @XmlElement(name = "PstTaxPrftOrLoss", required = true)
    protected AmountAndDirection102 pstTaxPrftOrLoss;

    /**
     * Gets the value of the clrFees property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getClrFees() {
        return clrFees;
    }

    /**
     * Sets the value of the clrFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public IncomeStatement1 setClrFees(ActiveCurrencyAndAmount value) {
        this.clrFees = value;
        return this;
    }

    /**
     * Gets the value of the othrOprgRvn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getOthrOprgRvn() {
        return othrOprgRvn;
    }

    /**
     * Sets the value of the othrOprgRvn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public IncomeStatement1 setOthrOprgRvn(ActiveCurrencyAndAmount value) {
        this.othrOprgRvn = value;
        return this;
    }

    /**
     * Gets the value of the oprgExpnss property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getOprgExpnss() {
        return oprgExpnss;
    }

    /**
     * Sets the value of the oprgExpnss property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public IncomeStatement1 setOprgExpnss(ActiveCurrencyAndAmount value) {
        this.oprgExpnss = value;
        return this;
    }

    /**
     * Gets the value of the oprgPrftOrLoss property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getOprgPrftOrLoss() {
        return oprgPrftOrLoss;
    }

    /**
     * Sets the value of the oprgPrftOrLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public IncomeStatement1 setOprgPrftOrLoss(AmountAndDirection102 value) {
        this.oprgPrftOrLoss = value;
        return this;
    }

    /**
     * Gets the value of the netIntrstIncm property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNetIntrstIncm() {
        return netIntrstIncm;
    }

    /**
     * Sets the value of the netIntrstIncm property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public IncomeStatement1 setNetIntrstIncm(ActiveCurrencyAndAmount value) {
        this.netIntrstIncm = value;
        return this;
    }

    /**
     * Gets the value of the othrNonOprgRvn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getOthrNonOprgRvn() {
        return othrNonOprgRvn;
    }

    /**
     * Sets the value of the othrNonOprgRvn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public IncomeStatement1 setOthrNonOprgRvn(ActiveCurrencyAndAmount value) {
        this.othrNonOprgRvn = value;
        return this;
    }

    /**
     * Gets the value of the nonOprgExpnss property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNonOprgExpnss() {
        return nonOprgExpnss;
    }

    /**
     * Sets the value of the nonOprgExpnss property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public IncomeStatement1 setNonOprgExpnss(ActiveCurrencyAndAmount value) {
        this.nonOprgExpnss = value;
        return this;
    }

    /**
     * Gets the value of the preTaxPrftOrLoss property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getPreTaxPrftOrLoss() {
        return preTaxPrftOrLoss;
    }

    /**
     * Sets the value of the preTaxPrftOrLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public IncomeStatement1 setPreTaxPrftOrLoss(AmountAndDirection102 value) {
        this.preTaxPrftOrLoss = value;
        return this;
    }

    /**
     * Gets the value of the pstTaxPrftOrLoss property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getPstTaxPrftOrLoss() {
        return pstTaxPrftOrLoss;
    }

    /**
     * Sets the value of the pstTaxPrftOrLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public IncomeStatement1 setPstTaxPrftOrLoss(AmountAndDirection102 value) {
        this.pstTaxPrftOrLoss = value;
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
