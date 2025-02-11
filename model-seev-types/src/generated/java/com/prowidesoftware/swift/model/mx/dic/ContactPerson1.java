
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
 * Contains information about the contact responsible for the transaction identified in the message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactPerson1", propOrder = {
    "ctctPrsn",
    "instnId"
})
public class ContactPerson1 {

    @XmlElement(name = "CtctPrsn", required = true)
    protected ContactIdentification4 ctctPrsn;
    @XmlElement(name = "InstnId")
    protected PartyIdentification2Choice instnId;

    /**
     * Gets the value of the ctctPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link ContactIdentification4 }
     *     
     */
    public ContactIdentification4 getCtctPrsn() {
        return ctctPrsn;
    }

    /**
     * Sets the value of the ctctPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactIdentification4 }
     *     
     */
    public ContactPerson1 setCtctPrsn(ContactIdentification4 value) {
        this.ctctPrsn = value;
        return this;
    }

    /**
     * Gets the value of the instnId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getInstnId() {
        return instnId;
    }

    /**
     * Sets the value of the instnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public ContactPerson1 setInstnId(PartyIdentification2Choice value) {
        this.instnId = value;
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
