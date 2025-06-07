
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
 * Specifies the elements that identify a prox appointed to represent a party authorised to vote at a general meeting.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Proxy", propOrder = {
    "prxyTp",
    "prssgndPrxy"
})
public class Proxy {

    @XmlElement(name = "PrxyTp", required = true)
    @XmlSchemaType(name = "string")
    protected ProxyType2Code prxyTp;
    @XmlElement(name = "PrssgndPrxy")
    protected IndividualPerson7 prssgndPrxy;

    /**
     * Gets the value of the prxyTp property.
     * 
     * @return
     *     possible object is
     *     {@link ProxyType2Code }
     *     
     */
    public ProxyType2Code getPrxyTp() {
        return prxyTp;
    }

    /**
     * Sets the value of the prxyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxyType2Code }
     *     
     */
    public Proxy setPrxyTp(ProxyType2Code value) {
        this.prxyTp = value;
        return this;
    }

    /**
     * Gets the value of the prssgndPrxy property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPerson7 }
     *     
     */
    public IndividualPerson7 getPrssgndPrxy() {
        return prssgndPrxy;
    }

    /**
     * Sets the value of the prssgndPrxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPerson7 }
     *     
     */
    public Proxy setPrssgndPrxy(IndividualPerson7 value) {
        this.prssgndPrxy = value;
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
