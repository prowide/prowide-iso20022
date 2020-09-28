
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
 * Specifies the old and new values for a limit status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateLogLimitStatus1", propOrder = {
    "od",
    "_new"
})
public class UpdateLogLimitStatus1 {

    @XmlElement(name = "Od", required = true)
    protected LimitStatus1Choice od;
    @XmlElement(name = "New", required = true)
    protected LimitStatus1Choice _new;

    /**
     * Gets the value of the od property.
     * 
     * @return
     *     possible object is
     *     {@link LimitStatus1Choice }
     *     
     */
    public LimitStatus1Choice getOd() {
        return od;
    }

    /**
     * Sets the value of the od property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitStatus1Choice }
     *     
     */
    public UpdateLogLimitStatus1 setOd(LimitStatus1Choice value) {
        this.od = value;
        return this;
    }

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link LimitStatus1Choice }
     *     
     */
    public LimitStatus1Choice getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitStatus1Choice }
     *     
     */
    public UpdateLogLimitStatus1 setNew(LimitStatus1Choice value) {
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
