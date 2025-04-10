
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
 * Charge is expressed as a code or a bilaterally agreed code.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeTypeChoice", propOrder = {
    "cd",
    "prtryCd"
})
public class ChargeTypeChoice {

    @XmlElement(name = "Cd")
    @XmlSchemaType(name = "string")
    protected ChargeType1Code cd;
    @XmlElement(name = "PrtryCd")
    protected String prtryCd;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeType1Code }
     *     
     */
    public ChargeType1Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType1Code }
     *     
     */
    public ChargeTypeChoice setCd(ChargeType1Code value) {
        this.cd = value;
        return this;
    }

    /**
     * Gets the value of the prtryCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtryCd() {
        return prtryCd;
    }

    /**
     * Sets the value of the prtryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ChargeTypeChoice setPrtryCd(String value) {
        this.prtryCd = value;
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
