
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
 * Provides the investigation results.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestigationResult1Choice", propOrder = {
    "rslt",
    "invstgtnSts"
})
public class InvestigationResult1Choice {

    @XmlElement(name = "Rslt")
    protected SupplementaryDataEnvelope1 rslt;
    @XmlElement(name = "InvstgtnSts")
    @XmlSchemaType(name = "string")
    protected InvestigationStatus1Code invstgtnSts;

    /**
     * Gets the value of the rslt property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementaryDataEnvelope1 }
     *     
     */
    public SupplementaryDataEnvelope1 getRslt() {
        return rslt;
    }

    /**
     * Sets the value of the rslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementaryDataEnvelope1 }
     *     
     */
    public InvestigationResult1Choice setRslt(SupplementaryDataEnvelope1 value) {
        this.rslt = value;
        return this;
    }

    /**
     * Gets the value of the invstgtnSts property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationStatus1Code }
     *     
     */
    public InvestigationStatus1Code getInvstgtnSts() {
        return invstgtnSts;
    }

    /**
     * Sets the value of the invstgtnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationStatus1Code }
     *     
     */
    public InvestigationResult1Choice setInvstgtnSts(InvestigationStatus1Code value) {
        this.invstgtnSts = value;
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
