
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
 * Priority is expressed  as a code or a text.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriorityCodeChoice", propOrder = {
    "cd",
    "prtryCd"
})
public class PriorityCodeChoice {

    @XmlElement(name = "Cd")
    @XmlSchemaType(name = "string")
    protected Priority1Code cd;
    @XmlElement(name = "PrtryCd")
    protected String prtryCd;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link Priority1Code }
     *     
     */
    public Priority1Code getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority1Code }
     *     
     */
    public PriorityCodeChoice setCd(Priority1Code value) {
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
    public PriorityCodeChoice setPrtryCd(String value) {
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
