
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
 * Status and quantity information related to an accepted instruction request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptedStatus2", propOrder = {
    "accptdQty",
    "accptdRsn"
})
public class AcceptedStatus2 {

    @XmlElement(name = "AccptdQty")
    protected Quantity51Choice accptdQty;
    @XmlElement(name = "AccptdRsn", required = true)
    protected AcceptedStatus8Choice accptdRsn;

    /**
     * Gets the value of the accptdQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity51Choice }
     *     
     */
    public Quantity51Choice getAccptdQty() {
        return accptdQty;
    }

    /**
     * Sets the value of the accptdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity51Choice }
     *     
     */
    public AcceptedStatus2 setAccptdQty(Quantity51Choice value) {
        this.accptdQty = value;
        return this;
    }

    /**
     * Gets the value of the accptdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptedStatus8Choice }
     *     
     */
    public AcceptedStatus8Choice getAccptdRsn() {
        return accptdRsn;
    }

    /**
     * Sets the value of the accptdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptedStatus8Choice }
     *     
     */
    public AcceptedStatus2 setAccptdRsn(AcceptedStatus8Choice value) {
        this.accptdRsn = value;
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
