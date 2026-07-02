
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
 * Specifies a choice between one party or a group of parties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyOrGroup3Choice", propOrder = {
    "grpId",
    "pty"
})
public class PartyOrGroup3Choice {

    @XmlElement(name = "GrpId")
    protected String grpId;
    @XmlElement(name = "Pty")
    protected PartyAndCertificate6 pty;

    /**
     * Gets the value of the grpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpId() {
        return grpId;
    }

    /**
     * Sets the value of the grpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PartyOrGroup3Choice setGrpId(String value) {
        this.grpId = value;
        return this;
    }

    /**
     * Gets the value of the pty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAndCertificate6 }
     *     
     */
    public PartyAndCertificate6 getPty() {
        return pty;
    }

    /**
     * Sets the value of the pty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAndCertificate6 }
     *     
     */
    public PartyOrGroup3Choice setPty(PartyAndCertificate6 value) {
        this.pty = value;
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
