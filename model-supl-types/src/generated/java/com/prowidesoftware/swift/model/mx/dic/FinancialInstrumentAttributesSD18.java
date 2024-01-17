
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
 * Provides additional information regarding security that will be distributed as part of entitlement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAttributesSD18", propOrder = {
    "dclrdDsbrsdSctyId",
    "dclrdDsbrsdSctyDesc"
})
public class FinancialInstrumentAttributesSD18 {

    @XmlElement(name = "DclrdDsbrsdSctyId")
    protected SecurityIdentification20 dclrdDsbrsdSctyId;
    @XmlElement(name = "DclrdDsbrsdSctyDesc")
    protected String dclrdDsbrsdSctyDesc;

    /**
     * Gets the value of the dclrdDsbrsdSctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public SecurityIdentification20 getDclrdDsbrsdSctyId() {
        return dclrdDsbrsdSctyId;
    }

    /**
     * Sets the value of the dclrdDsbrsdSctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public FinancialInstrumentAttributesSD18 setDclrdDsbrsdSctyId(SecurityIdentification20 value) {
        this.dclrdDsbrsdSctyId = value;
        return this;
    }

    /**
     * Gets the value of the dclrdDsbrsdSctyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDclrdDsbrsdSctyDesc() {
        return dclrdDsbrsdSctyDesc;
    }

    /**
     * Sets the value of the dclrdDsbrsdSctyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributesSD18 setDclrdDsbrsdSctyDesc(String value) {
        this.dclrdDsbrsdSctyDesc = value;
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
