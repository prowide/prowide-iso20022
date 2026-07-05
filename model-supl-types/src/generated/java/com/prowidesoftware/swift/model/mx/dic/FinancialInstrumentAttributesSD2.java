
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
 * Provides additional information regarding security that will be distributed as part of entitlement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAttributesSD2", propOrder = {
    "dclrdDsbrsdSctyId",
    "dclrdDsbrsdSctyDesc"
})
public class FinancialInstrumentAttributesSD2 {

    @XmlElement(name = "DclrdDsbrsdSctyId")
    protected SecurityIdentification15 dclrdDsbrsdSctyId;
    @XmlElement(name = "DclrdDsbrsdSctyDesc")
    protected String dclrdDsbrsdSctyDesc;

    /**
     * Gets the value of the dclrdDsbrsdSctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification15 }
     *     
     */
    public SecurityIdentification15 getDclrdDsbrsdSctyId() {
        return dclrdDsbrsdSctyId;
    }

    /**
     * Sets the value of the dclrdDsbrsdSctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification15 }
     *     
     */
    public FinancialInstrumentAttributesSD2 setDclrdDsbrsdSctyId(SecurityIdentification15 value) {
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
    public FinancialInstrumentAttributesSD2 setDclrdDsbrsdSctyDesc(String value) {
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
