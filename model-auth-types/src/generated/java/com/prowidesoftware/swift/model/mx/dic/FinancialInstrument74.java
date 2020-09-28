
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
 * Provides details about the collateral received in the context of the reverse repurchase agreement.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument74", propOrder = {
    "finInstrmId",
    "drgtnRcvdAssts",
    "ttlVal"
})
public class FinancialInstrument74 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected InstrumentIdentification3Choice finInstrmId;
    @XmlElement(name = "DrgtnRcvdAssts")
    protected boolean drgtnRcvdAssts;
    @XmlElement(name = "TtlVal", required = true)
    protected CurrencyExchange14 ttlVal;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentIdentification3Choice }
     *     
     */
    public InstrumentIdentification3Choice getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentIdentification3Choice }
     *     
     */
    public FinancialInstrument74 setFinInstrmId(InstrumentIdentification3Choice value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the drgtnRcvdAssts property.
     * 
     */
    public boolean isDrgtnRcvdAssts() {
        return drgtnRcvdAssts;
    }

    /**
     * Sets the value of the drgtnRcvdAssts property.
     * 
     */
    public FinancialInstrument74 setDrgtnRcvdAssts(boolean value) {
        this.drgtnRcvdAssts = value;
        return this;
    }

    /**
     * Gets the value of the ttlVal property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyExchange14 }
     *     
     */
    public CurrencyExchange14 getTtlVal() {
        return ttlVal;
    }

    /**
     * Sets the value of the ttlVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyExchange14 }
     *     
     */
    public FinancialInstrument74 setTtlVal(CurrencyExchange14 value) {
        this.ttlVal = value;
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
