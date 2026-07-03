
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
 * Set of elements used to identify a person or an organisation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification270", propOrder = {
    "id",
    "addtlIdInf"
})
public class PartyIdentification270 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification246Choice id;
    @XmlElement(name = "AddtlIdInf")
    protected PartyAdditionalIdentification2Choice addtlIdInf;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification246Choice }
     *     
     */
    public PartyIdentification246Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification246Choice }
     *     
     */
    public PartyIdentification270 setId(PartyIdentification246Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the addtlIdInf property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAdditionalIdentification2Choice }
     *     
     */
    public PartyAdditionalIdentification2Choice getAddtlIdInf() {
        return addtlIdInf;
    }

    /**
     * Sets the value of the addtlIdInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAdditionalIdentification2Choice }
     *     
     */
    public PartyIdentification270 setAddtlIdInf(PartyAdditionalIdentification2Choice value) {
        this.addtlIdInf = value;
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
