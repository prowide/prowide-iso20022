
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
 * Funding sources used to finance margin loans.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundingSource1", propOrder = {
    "tp",
    "mktVal"
})
public class FundingSource1 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected FundingSourceType1Code tp;
    @XmlElement(name = "MktVal", required = true)
    protected ActiveOrHistoricCurrencyAndAmount mktVal;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link FundingSourceType1Code }
     *     
     */
    public FundingSourceType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingSourceType1Code }
     *     
     */
    public FundingSource1 setTp(FundingSourceType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the mktVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getMktVal() {
        return mktVal;
    }

    /**
     * Sets the value of the mktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public FundingSource1 setMktVal(ActiveOrHistoricCurrencyAndAmount value) {
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
