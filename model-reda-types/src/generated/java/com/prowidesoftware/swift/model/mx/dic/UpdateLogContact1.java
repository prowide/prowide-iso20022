
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
@XmlType(name = "UpdateLogContact1", propOrder = {
    "od",
    "_new"
})
public class UpdateLogContact1 {

    @XmlElement(name = "Od", required = true)
    protected Contact5 od;
    @XmlElement(name = "New", required = true)
    protected Contact5 _new;

    /**
     * Gets the value of the od property.
     * 
     * @return
     *     possible object is
     *     {@link Contact5 }
     *     
     */
    public Contact5 getOd() {
        return od;
    }

    /**
     * Sets the value of the od property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact5 }
     *     
     */
    public UpdateLogContact1 setOd(Contact5 value) {
        this.od = value;
        return this;
    }

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link Contact5 }
     *     
     */
    public Contact5 getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact5 }
     *     
     */
    public UpdateLogContact1 setNew(Contact5 value) {
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
