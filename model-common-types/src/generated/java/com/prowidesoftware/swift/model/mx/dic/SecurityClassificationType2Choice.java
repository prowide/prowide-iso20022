
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
 * Choice between a CFI code and an other type of identification for the classification of a financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityClassificationType2Choice", propOrder = {
    "cfi",
    "altrnClssfctn"
})
public class SecurityClassificationType2Choice {

    @XmlElement(name = "CFI")
    protected String cfi;
    @XmlElement(name = "AltrnClssfctn")
    protected GenericIdentification3 altrnClssfctn;

    /**
     * Gets the value of the cfi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCFI() {
        return cfi;
    }

    /**
     * Sets the value of the cfi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityClassificationType2Choice setCFI(String value) {
        this.cfi = value;
        return this;
    }

    /**
     * Gets the value of the altrnClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification3 }
     *     
     */
    public GenericIdentification3 getAltrnClssfctn() {
        return altrnClssfctn;
    }

    /**
     * Sets the value of the altrnClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification3 }
     *     
     */
    public SecurityClassificationType2Choice setAltrnClssfctn(GenericIdentification3 value) {
        this.altrnClssfctn = value;
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
