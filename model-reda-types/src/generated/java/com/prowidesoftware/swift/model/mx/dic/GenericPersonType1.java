
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
 * Specifies a generic type of identification requested for a person.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericPersonType1", propOrder = {
    "reqd",
    "schmeNm"
})
public class GenericPersonType1 {

    @XmlElement(name = "Reqd")
    protected boolean reqd;
    @XmlElement(name = "SchmeNm", required = true)
    protected PersonIdentificationSchemeName1Choice schmeNm;

    /**
     * Gets the value of the reqd property.
     * 
     */
    public boolean isReqd() {
        return reqd;
    }

    /**
     * Sets the value of the reqd property.
     * 
     */
    public GenericPersonType1 setReqd(boolean value) {
        this.reqd = value;
        return this;
    }

    /**
     * Gets the value of the schmeNm property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentificationSchemeName1Choice }
     *     
     */
    public PersonIdentificationSchemeName1Choice getSchmeNm() {
        return schmeNm;
    }

    /**
     * Sets the value of the schmeNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentificationSchemeName1Choice }
     *     
     */
    public GenericPersonType1 setSchmeNm(PersonIdentificationSchemeName1Choice value) {
        this.schmeNm = value;
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
