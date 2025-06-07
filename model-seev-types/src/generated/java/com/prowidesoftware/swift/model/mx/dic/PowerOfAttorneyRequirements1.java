
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the conditions to be filled in to obtain a valid power of attorney.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerOfAttorneyRequirements1", propOrder = {
    "lglRqrmnt",
    "othrDcmnttn"
})
public class PowerOfAttorneyRequirements1 {

    @XmlElement(name = "LglRqrmnt")
    @XmlSchemaType(name = "string")
    protected PowerOfAttorneyLegalisation1Code lglRqrmnt;
    @XmlElement(name = "OthrDcmnttn")
    protected String othrDcmnttn;

    /**
     * Gets the value of the lglRqrmnt property.
     * 
     * @return
     *     possible object is
     *     {@link PowerOfAttorneyLegalisation1Code }
     *     
     */
    public PowerOfAttorneyLegalisation1Code getLglRqrmnt() {
        return lglRqrmnt;
    }

    /**
     * Sets the value of the lglRqrmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerOfAttorneyLegalisation1Code }
     *     
     */
    public PowerOfAttorneyRequirements1 setLglRqrmnt(PowerOfAttorneyLegalisation1Code value) {
        this.lglRqrmnt = value;
        return this;
    }

    /**
     * Gets the value of the othrDcmnttn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrDcmnttn() {
        return othrDcmnttn;
    }

    /**
     * Sets the value of the othrDcmnttn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PowerOfAttorneyRequirements1 setOthrDcmnttn(String value) {
        this.othrDcmnttn = value;
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
