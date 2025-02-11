
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Repurchase agreement where a single, pre defined, financial instrument is sold and repurchased.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificCollateral3", propOrder = {
    "finInstrmId",
    "mktVal"
})
public class SpecificCollateral3 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected FinancialInstrument104 finInstrmId;
    @XmlElement(name = "MktVal", required = true)
    protected ActiveCurrencyAnd24Amount mktVal;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument104 }
     *     
     */
    public FinancialInstrument104 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument104 }
     *     
     */
    public SpecificCollateral3 setFinInstrmId(FinancialInstrument104 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the mktVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd24Amount }
     *     
     */
    public ActiveCurrencyAnd24Amount getMktVal() {
        return mktVal;
    }

    /**
     * Sets the value of the mktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd24Amount }
     *     
     */
    public SpecificCollateral3 setMktVal(ActiveCurrencyAnd24Amount value) {
        this.mktVal = value;
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
