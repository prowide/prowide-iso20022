
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Statement of the financial performance of a legal entity, including identification of the clearing member.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncomeStatement2", propOrder = {
    "clrMmbFee",
    "othrOprgRvn",
    "oprgExpnss",
    "oprgPrftOrLoss",
    "netIntrstIncm",
    "othrNonOprgRvn",
    "nonOprgExpnss",
    "preTaxPrftOrLoss",
    "pstTaxPrftOrLoss"
})
public class IncomeStatement2 {

    @XmlElement(name = "ClrMmbFee", required = true)
    protected List<ClearingMemberFee1> clrMmbFee;
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
     * Gets the value of the clrMmbFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the clrMmbFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClrMmbFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClearingMemberFee1 }
     * 
     * 
     * @return
     *     The value of the clrMmbFee property.
     */
    public List<ClearingMemberFee1> getClrMmbFee() {
        if (clrMmbFee == null) {
            clrMmbFee = new ArrayList<>();
        }
        return this.clrMmbFee;
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
    public IncomeStatement2 setOthrOprgRvn(ActiveCurrencyAndAmount value) {
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
    public IncomeStatement2 setOprgExpnss(ActiveCurrencyAndAmount value) {
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
    public IncomeStatement2 setOprgPrftOrLoss(AmountAndDirection102 value) {
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
    public IncomeStatement2 setNetIntrstIncm(ActiveCurrencyAndAmount value) {
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
    public IncomeStatement2 setOthrNonOprgRvn(ActiveCurrencyAndAmount value) {
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
    public IncomeStatement2 setNonOprgExpnss(ActiveCurrencyAndAmount value) {
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
    public IncomeStatement2 setPreTaxPrftOrLoss(AmountAndDirection102 value) {
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
    public IncomeStatement2 setPstTaxPrftOrLoss(AmountAndDirection102 value) {
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

    /**
     * Adds a new item to the clrMmbFee list.
     * @see #getClrMmbFee()
     * 
     */
    public IncomeStatement2 addClrMmbFee(ClearingMemberFee1 clrMmbFee) {
        getClrMmbFee().add(clrMmbFee);
        return this;
    }

}
