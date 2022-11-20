
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
 * Reference details of the contract registration.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractRegistrationReference2Choice", propOrder = {
    "regdCtrctId",
    "ctrct"
})
public class ContractRegistrationReference2Choice {

    @XmlElement(name = "RegdCtrctId")
    protected String regdCtrctId;
    @XmlElement(name = "Ctrct")
    protected DocumentIdentification35 ctrct;

    /**
     * Gets the value of the regdCtrctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegdCtrctId() {
        return regdCtrctId;
    }

    /**
     * Sets the value of the regdCtrctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContractRegistrationReference2Choice setRegdCtrctId(String value) {
        this.regdCtrctId = value;
        return this;
    }

    /**
     * Gets the value of the ctrct property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification35 }
     *     
     */
    public DocumentIdentification35 getCtrct() {
        return ctrct;
    }

    /**
     * Sets the value of the ctrct property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification35 }
     *     
     */
    public ContractRegistrationReference2Choice setCtrct(DocumentIdentification35 value) {
        this.ctrct = value;
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
