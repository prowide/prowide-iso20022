
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides the contract ID and type information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchangeRateInformation3", propOrder = {
    "rateTp",
    "ctrctId"
})
public class ExchangeRateInformation3 {

    @XmlElement(name = "RateTp", required = true)
    @XmlSchemaType(name = "string")
    protected ExchangeRateType4Code rateTp;
    @XmlElement(name = "CtrctId")
    protected String ctrctId;

    /**
     * Gets the value of the rateTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateType4Code }
     *     
     */
    public ExchangeRateType4Code getRateTp() {
        return rateTp;
    }

    /**
     * Sets the value of the rateTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateType4Code }
     *     
     */
    public ExchangeRateInformation3 setRateTp(ExchangeRateType4Code value) {
        this.rateTp = value;
        return this;
    }

    /**
     * Gets the value of the ctrctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrctId() {
        return ctrctId;
    }

    /**
     * Sets the value of the ctrctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ExchangeRateInformation3 setCtrctId(String value) {
        this.ctrctId = value;
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
