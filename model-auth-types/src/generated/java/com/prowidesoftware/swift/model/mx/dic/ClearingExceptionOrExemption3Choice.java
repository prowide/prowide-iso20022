
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
 * Information about contract status.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingExceptionOrExemption3Choice", propOrder = {
    "rsn",
    "ctrPties"
})
public class ClearingExceptionOrExemption3Choice {

    @XmlElement(name = "Rsn")
    @XmlSchemaType(name = "string")
    protected NoReasonCode rsn;
    @XmlElement(name = "CtrPties")
    protected ClearingExceptionOrExemption2 ctrPties;

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public ClearingExceptionOrExemption3Choice setRsn(NoReasonCode value) {
        this.rsn = value;
        return this;
    }

    /**
     * Gets the value of the ctrPties property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingExceptionOrExemption2 }
     *     
     */
    public ClearingExceptionOrExemption2 getCtrPties() {
        return ctrPties;
    }

    /**
     * Sets the value of the ctrPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingExceptionOrExemption2 }
     *     
     */
    public ClearingExceptionOrExemption3Choice setCtrPties(ClearingExceptionOrExemption2 value) {
        this.ctrPties = value;
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
