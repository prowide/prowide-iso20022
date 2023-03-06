
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
 * Reports either on the risk management limit or on a business error.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditLineReport1", propOrder = {
    "cdtLineId",
    "cdtLineOrErr"
})
public class CreditLineReport1 {

    @XmlElement(name = "CdtLineId", required = true)
    protected CreditLineIdentification1 cdtLineId;
    @XmlElement(name = "CdtLineOrErr", required = true)
    protected CreditLineOrError1Choice cdtLineOrErr;

    /**
     * Gets the value of the cdtLineId property.
     * 
     * @return
     *     possible object is
     *     {@link CreditLineIdentification1 }
     *     
     */
    public CreditLineIdentification1 getCdtLineId() {
        return cdtLineId;
    }

    /**
     * Sets the value of the cdtLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditLineIdentification1 }
     *     
     */
    public CreditLineReport1 setCdtLineId(CreditLineIdentification1 value) {
        this.cdtLineId = value;
        return this;
    }

    /**
     * Gets the value of the cdtLineOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link CreditLineOrError1Choice }
     *     
     */
    public CreditLineOrError1Choice getCdtLineOrErr() {
        return cdtLineOrErr;
    }

    /**
     * Sets the value of the cdtLineOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditLineOrError1Choice }
     *     
     */
    public CreditLineReport1 setCdtLineOrErr(CreditLineOrError1Choice value) {
        this.cdtLineOrErr = value;
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
