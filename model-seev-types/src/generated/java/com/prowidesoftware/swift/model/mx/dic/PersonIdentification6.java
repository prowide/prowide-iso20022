
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
 * Unique and unambiguous way to identify a person.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonIdentification6", propOrder = {
    "issr",
    "prsnIdTp"
})
public class PersonIdentification6 {

    @XmlElement(name = "Issr")
    protected String issr;
    @XmlElement(name = "PrsnIdTp", required = true)
    protected PersonIdentificationType1Choice prsnIdTp;

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PersonIdentification6 setIssr(String value) {
        this.issr = value;
        return this;
    }

    /**
     * Gets the value of the prsnIdTp property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentificationType1Choice }
     *     
     */
    public PersonIdentificationType1Choice getPrsnIdTp() {
        return prsnIdTp;
    }

    /**
     * Sets the value of the prsnIdTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentificationType1Choice }
     *     
     */
    public PersonIdentification6 setPrsnIdTp(PersonIdentificationType1Choice value) {
        this.prsnIdTp = value;
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
