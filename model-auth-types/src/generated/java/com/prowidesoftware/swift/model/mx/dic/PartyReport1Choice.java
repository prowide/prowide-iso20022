
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
 * Report of the relevant institution. The report can be either an update or a cancellation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyReport1Choice", propOrder = {
    "upd",
    "cxl"
})
public class PartyReport1Choice {

    @XmlElement(name = "Upd")
    protected PartyUpdate1 upd;
    @XmlElement(name = "Cxl")
    protected PartyCancellation1 cxl;

    /**
     * Gets the value of the upd property.
     * 
     * @return
     *     possible object is
     *     {@link PartyUpdate1 }
     *     
     */
    public PartyUpdate1 getUpd() {
        return upd;
    }

    /**
     * Sets the value of the upd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyUpdate1 }
     *     
     */
    public PartyReport1Choice setUpd(PartyUpdate1 value) {
        this.upd = value;
        return this;
    }

    /**
     * Gets the value of the cxl property.
     * 
     * @return
     *     possible object is
     *     {@link PartyCancellation1 }
     *     
     */
    public PartyCancellation1 getCxl() {
        return cxl;
    }

    /**
     * Sets the value of the cxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyCancellation1 }
     *     
     */
    public PartyReport1Choice setCxl(PartyCancellation1 value) {
        this.cxl = value;
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
