
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
 * The process of notifying of an upcoming corporate action. It provides corporate action details including the different options.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionEventStatus1", propOrder = {
    "evtCmpltnsSts",
    "evtConfSts"
})
public class CorporateActionEventStatus1 {

    @XmlElement(name = "EvtCmpltnsSts", required = true)
    @XmlSchemaType(name = "string")
    protected EventCompletenessStatus1Code evtCmpltnsSts;
    @XmlElement(name = "EvtConfSts", required = true)
    @XmlSchemaType(name = "string")
    protected EventConfirmationStatus1Code evtConfSts;

    /**
     * Gets the value of the evtCmpltnsSts property.
     * 
     * @return
     *     possible object is
     *     {@link EventCompletenessStatus1Code }
     *     
     */
    public EventCompletenessStatus1Code getEvtCmpltnsSts() {
        return evtCmpltnsSts;
    }

    /**
     * Sets the value of the evtCmpltnsSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventCompletenessStatus1Code }
     *     
     */
    public CorporateActionEventStatus1 setEvtCmpltnsSts(EventCompletenessStatus1Code value) {
        this.evtCmpltnsSts = value;
        return this;
    }

    /**
     * Gets the value of the evtConfSts property.
     * 
     * @return
     *     possible object is
     *     {@link EventConfirmationStatus1Code }
     *     
     */
    public EventConfirmationStatus1Code getEvtConfSts() {
        return evtConfSts;
    }

    /**
     * Sets the value of the evtConfSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventConfirmationStatus1Code }
     *     
     */
    public CorporateActionEventStatus1 setEvtConfSts(EventConfirmationStatus1Code value) {
        this.evtConfSts = value;
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
