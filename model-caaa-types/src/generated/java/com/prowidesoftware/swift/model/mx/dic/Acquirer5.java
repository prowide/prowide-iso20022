
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
 * Acquirer involved in the card payment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Acquirer5", propOrder = {
    "id",
    "paramsVrsn"
})
public class Acquirer5 {

    @XmlElement(name = "Id", required = true)
    protected GenericIdentification53 id;
    @XmlElement(name = "ParamsVrsn")
    protected String paramsVrsn;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification53 }
     *     
     */
    public GenericIdentification53 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification53 }
     *     
     */
    public Acquirer5 setId(GenericIdentification53 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the paramsVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamsVrsn() {
        return paramsVrsn;
    }

    /**
     * Sets the value of the paramsVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Acquirer5 setParamsVrsn(String value) {
        this.paramsVrsn = value;
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
