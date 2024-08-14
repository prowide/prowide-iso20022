
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
 * Specifies the type of action requested and reason for action.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestigationRequestAction1", propOrder = {
    "actn",
    "actnRsn"
})
public class InvestigationRequestAction1 {

    @XmlElement(name = "Actn", required = true)
    protected InvestigationRequestAction1Choice actn;
    @XmlElement(name = "ActnRsn")
    protected InvestigationActionReason1 actnRsn;

    /**
     * Gets the value of the actn property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationRequestAction1Choice }
     *     
     */
    public InvestigationRequestAction1Choice getActn() {
        return actn;
    }

    /**
     * Sets the value of the actn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationRequestAction1Choice }
     *     
     */
    public InvestigationRequestAction1 setActn(InvestigationRequestAction1Choice value) {
        this.actn = value;
        return this;
    }

    /**
     * Gets the value of the actnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationActionReason1 }
     *     
     */
    public InvestigationActionReason1 getActnRsn() {
        return actnRsn;
    }

    /**
     * Sets the value of the actnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationActionReason1 }
     *     
     */
    public InvestigationRequestAction1 setActnRsn(InvestigationActionReason1 value) {
        this.actnRsn = value;
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
