
package com.prowidesoftware.swift.model.mx.dic;

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
 * Details of a buy-in.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyInAdviceDetails2", propOrder = {
    "ref",
    "buyInStat",
    "buyInDfrrl",
    "finInstrmId",
    "qty",
    "buyInPric",
    "cshCompstnAmt",
    "buyInSttlmDt"
})
public class BuyInAdviceDetails2 {

    @XmlElement(name = "Ref", required = true)
    protected References31 ref;
    @XmlElement(name = "BuyInStat", required = true)
    @XmlSchemaType(name = "string")
    protected BuyInState1Code buyInStat;
    @XmlElement(name = "BuyInDfrrl", required = true)
    @XmlSchemaType(name = "string")
    protected BuyInDeferral1Code buyInDfrrl;
    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "Qty")
    protected FinancialInstrumentQuantity1Choice qty;
    @XmlElement(name = "BuyInPric")
    protected RateAndAmountFormat39Choice buyInPric;
    @XmlElement(name = "CshCompstnAmt")
    protected AmountAndDirection102 cshCompstnAmt;
    @XmlElement(name = "BuyInSttlmDt")
    protected DateAndDateTime2Choice buyInSttlmDt;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link References31 }
     *     
     */
    public References31 getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link References31 }
     *     
     */
    public BuyInAdviceDetails2 setRef(References31 value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the buyInStat property.
     * 
     * @return
     *     possible object is
     *     {@link BuyInState1Code }
     *     
     */
    public BuyInState1Code getBuyInStat() {
        return buyInStat;
    }

    /**
     * Sets the value of the buyInStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyInState1Code }
     *     
     */
    public BuyInAdviceDetails2 setBuyInStat(BuyInState1Code value) {
        this.buyInStat = value;
        return this;
    }

    /**
     * Gets the value of the buyInDfrrl property.
     * 
     * @return
     *     possible object is
     *     {@link BuyInDeferral1Code }
     *     
     */
    public BuyInDeferral1Code getBuyInDfrrl() {
        return buyInDfrrl;
    }

    /**
     * Sets the value of the buyInDfrrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyInDeferral1Code }
     *     
     */
    public BuyInAdviceDetails2 setBuyInDfrrl(BuyInDeferral1Code value) {
        this.buyInDfrrl = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public BuyInAdviceDetails2 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public BuyInAdviceDetails2 setQty(FinancialInstrumentQuantity1Choice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the buyInPric property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat39Choice }
     *     
     */
    public RateAndAmountFormat39Choice getBuyInPric() {
        return buyInPric;
    }

    /**
     * Sets the value of the buyInPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat39Choice }
     *     
     */
    public BuyInAdviceDetails2 setBuyInPric(RateAndAmountFormat39Choice value) {
        this.buyInPric = value;
        return this;
    }

    /**
     * Gets the value of the cshCompstnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getCshCompstnAmt() {
        return cshCompstnAmt;
    }

    /**
     * Sets the value of the cshCompstnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public BuyInAdviceDetails2 setCshCompstnAmt(AmountAndDirection102 value) {
        this.cshCompstnAmt = value;
        return this;
    }

    /**
     * Gets the value of the buyInSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getBuyInSttlmDt() {
        return buyInSttlmDt;
    }

    /**
     * Sets the value of the buyInSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public BuyInAdviceDetails2 setBuyInSttlmDt(DateAndDateTime2Choice value) {
        this.buyInSttlmDt = value;
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
