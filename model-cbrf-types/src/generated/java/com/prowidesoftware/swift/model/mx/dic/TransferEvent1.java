
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
 * Information about code and number of event of fund transfer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferEvent1", propOrder = {
    "evtCd",
    "evtNb"
})
public class TransferEvent1 {

    @XmlElement(name = "EvtCd", required = true)
    protected String evtCd;
    @XmlElement(name = "EvtNb")
    protected String evtNb;

    /**
     * Gets the value of the evtCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtCd() {
        return evtCd;
    }

    /**
     * Sets the value of the evtCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransferEvent1 setEvtCd(String value) {
        this.evtCd = value;
        return this;
    }

    /**
     * Gets the value of the evtNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtNb() {
        return evtNb;
    }

    /**
     * Sets the value of the evtNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransferEvent1 setEvtNb(String value) {
        this.evtNb = value;
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
