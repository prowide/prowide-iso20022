
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
 * Voting participation method at a general meeting.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificInstructionRequest4", propOrder = {
    "prtcptnMtd",
    "sctiesRegn"
})
public class SpecificInstructionRequest4 {

    @XmlElement(name = "PrtcptnMtd")
    protected ParticipationMethod3Choice prtcptnMtd;
    @XmlElement(name = "SctiesRegn")
    protected Boolean sctiesRegn;

    /**
     * Gets the value of the prtcptnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipationMethod3Choice }
     *     
     */
    public ParticipationMethod3Choice getPrtcptnMtd() {
        return prtcptnMtd;
    }

    /**
     * Sets the value of the prtcptnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipationMethod3Choice }
     *     
     */
    public SpecificInstructionRequest4 setPrtcptnMtd(ParticipationMethod3Choice value) {
        this.prtcptnMtd = value;
        return this;
    }

    /**
     * Gets the value of the sctiesRegn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSctiesRegn() {
        return sctiesRegn;
    }

    /**
     * Sets the value of the sctiesRegn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SpecificInstructionRequest4 setSctiesRegn(Boolean value) {
        this.sctiesRegn = value;
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
