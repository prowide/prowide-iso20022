
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
 * Choice between a single or a mass quote.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleOrMassQuote1Choice", propOrder = {
    "snglQtDtls",
    "massQtDtls"
})
public class SingleOrMassQuote1Choice {

    @XmlElement(name = "SnglQtDtls")
    protected SingleQuote1 snglQtDtls;
    @XmlElement(name = "MassQtDtls")
    protected MassQuote1 massQtDtls;

    /**
     * Gets the value of the snglQtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SingleQuote1 }
     *     
     */
    public SingleQuote1 getSnglQtDtls() {
        return snglQtDtls;
    }

    /**
     * Sets the value of the snglQtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleQuote1 }
     *     
     */
    public SingleOrMassQuote1Choice setSnglQtDtls(SingleQuote1 value) {
        this.snglQtDtls = value;
        return this;
    }

    /**
     * Gets the value of the massQtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link MassQuote1 }
     *     
     */
    public MassQuote1 getMassQtDtls() {
        return massQtDtls;
    }

    /**
     * Sets the value of the massQtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link MassQuote1 }
     *     
     */
    public SingleOrMassQuote1Choice setMassQtDtls(MassQuote1 value) {
        this.massQtDtls = value;
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
