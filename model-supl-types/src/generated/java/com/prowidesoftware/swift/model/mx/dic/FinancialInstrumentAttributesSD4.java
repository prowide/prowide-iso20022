
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
 * Provides additional information regarding security that will being distributed as part of entitlement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAttributesSD4", propOrder = {
    "csdDsbrsdSctyId",
    "csdDsbrsdSctyDesc",
    "csdDsbrsdFrctnlSctyId"
})
public class FinancialInstrumentAttributesSD4 {

    @XmlElement(name = "CSDDsbrsdSctyId")
    protected SecurityIdentification15 csdDsbrsdSctyId;
    @XmlElement(name = "CSDDsbrsdSctyDesc")
    protected String csdDsbrsdSctyDesc;
    @XmlElement(name = "CSDDsbrsdFrctnlSctyId")
    protected SecurityIdentification15 csdDsbrsdFrctnlSctyId;

    /**
     * Gets the value of the csdDsbrsdSctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification15 }
     *     
     */
    public SecurityIdentification15 getCSDDsbrsdSctyId() {
        return csdDsbrsdSctyId;
    }

    /**
     * Sets the value of the csdDsbrsdSctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification15 }
     *     
     */
    public FinancialInstrumentAttributesSD4 setCSDDsbrsdSctyId(SecurityIdentification15 value) {
        this.csdDsbrsdSctyId = value;
        return this;
    }

    /**
     * Gets the value of the csdDsbrsdSctyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSDDsbrsdSctyDesc() {
        return csdDsbrsdSctyDesc;
    }

    /**
     * Sets the value of the csdDsbrsdSctyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FinancialInstrumentAttributesSD4 setCSDDsbrsdSctyDesc(String value) {
        this.csdDsbrsdSctyDesc = value;
        return this;
    }

    /**
     * Gets the value of the csdDsbrsdFrctnlSctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification15 }
     *     
     */
    public SecurityIdentification15 getCSDDsbrsdFrctnlSctyId() {
        return csdDsbrsdFrctnlSctyId;
    }

    /**
     * Sets the value of the csdDsbrsdFrctnlSctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification15 }
     *     
     */
    public FinancialInstrumentAttributesSD4 setCSDDsbrsdFrctnlSctyId(SecurityIdentification15 value) {
        this.csdDsbrsdFrctnlSctyId = value;
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
