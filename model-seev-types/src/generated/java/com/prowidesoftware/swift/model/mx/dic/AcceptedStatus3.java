
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
@XmlType(name = "AcceptedStatus3", propOrder = {
    "accptdQty",
    "accptdRsn"
})
public class AcceptedStatus3 {

    @XmlElement(name = "AccptdQty")
    protected Quantity54Choice accptdQty;
    @XmlElement(name = "AccptdRsn", required = true)
    protected AcceptedStatus13Choice accptdRsn;

    /**
     * Gets the value of the accptdQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity54Choice }
     *     
     */
    public Quantity54Choice getAccptdQty() {
        return accptdQty;
    }

    /**
     * Sets the value of the accptdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity54Choice }
     *     
     */
    public AcceptedStatus3 setAccptdQty(Quantity54Choice value) {
        this.accptdQty = value;
        return this;
    }

    /**
     * Gets the value of the accptdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptedStatus13Choice }
     *     
     */
    public AcceptedStatus13Choice getAccptdRsn() {
        return accptdRsn;
    }

    /**
     * Sets the value of the accptdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptedStatus13Choice }
     *     
     */
    public AcceptedStatus3 setAccptdRsn(AcceptedStatus13Choice value) {
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
