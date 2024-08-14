
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
 * Specifies the old and new values for the contact details
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateLogContact2", propOrder = {
    "od",
    "_new"
})
public class UpdateLogContact2 {

    @XmlElement(name = "Od", required = true)
    protected Contact14 od;
    @XmlElement(name = "New", required = true)
    protected Contact14 _new;

    /**
     * Gets the value of the od property.
     * 
     * @return
     *     possible object is
     *     {@link Contact14 }
     *     
     */
    public Contact14 getOd() {
        return od;
    }

    /**
     * Sets the value of the od property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact14 }
     *     
     */
    public UpdateLogContact2 setOd(Contact14 value) {
        this.od = value;
        return this;
    }

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link Contact14 }
     *     
     */
    public Contact14 getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact14 }
     *     
     */
    public UpdateLogContact2 setNew(Contact14 value) {
        this._new = value;
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
