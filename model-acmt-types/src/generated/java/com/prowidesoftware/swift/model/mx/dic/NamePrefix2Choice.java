
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
 * Prefix used for name.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamePrefix2Choice", propOrder = {
    "nmPrfx",
    "xtndedNmPrfx"
})
public class NamePrefix2Choice {

    @XmlElement(name = "NmPrfx")
    @XmlSchemaType(name = "string")
    protected NamePrefix1Code nmPrfx;
    @XmlElement(name = "XtndedNmPrfx")
    protected String xtndedNmPrfx;

    /**
     * Gets the value of the nmPrfx property.
     * 
     * @return
     *     possible object is
     *     {@link NamePrefix1Code }
     *     
     */
    public NamePrefix1Code getNmPrfx() {
        return nmPrfx;
    }

    /**
     * Sets the value of the nmPrfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamePrefix1Code }
     *     
     */
    public NamePrefix2Choice setNmPrfx(NamePrefix1Code value) {
        this.nmPrfx = value;
        return this;
    }

    /**
     * Gets the value of the xtndedNmPrfx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedNmPrfx() {
        return xtndedNmPrfx;
    }

    /**
     * Sets the value of the xtndedNmPrfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NamePrefix2Choice setXtndedNmPrfx(String value) {
        this.xtndedNmPrfx = value;
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
