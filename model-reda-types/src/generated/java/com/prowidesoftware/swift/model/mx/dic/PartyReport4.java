
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
 * Report information about party reference data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyReport4", propOrder = {
    "ptyId",
    "ptyOrErr"
})
public class PartyReport4 {

    @XmlElement(name = "PtyId", required = true)
    protected SystemPartyIdentification8 ptyId;
    @XmlElement(name = "PtyOrErr", required = true)
    protected PartyOrBusinessError4Choice ptyOrErr;

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public SystemPartyIdentification8 getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public PartyReport4 setPtyId(SystemPartyIdentification8 value) {
        this.ptyId = value;
        return this;
    }

    /**
     * Gets the value of the ptyOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyOrBusinessError4Choice }
     *     
     */
    public PartyOrBusinessError4Choice getPtyOrErr() {
        return ptyOrErr;
    }

    /**
     * Sets the value of the ptyOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyOrBusinessError4Choice }
     *     
     */
    public PartyReport4 setPtyOrErr(PartyOrBusinessError4Choice value) {
        this.ptyOrErr = value;
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
