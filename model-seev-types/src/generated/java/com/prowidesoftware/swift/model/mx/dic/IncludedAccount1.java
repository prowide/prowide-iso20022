
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
 * Provides information about the account that is impacted or not by the standing instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncludedAccount1", propOrder = {
    "sctiesAcctId",
    "inclInd"
})
public class IncludedAccount1 {

    @XmlElement(name = "SctiesAcctId", required = true)
    protected String sctiesAcctId;
    @XmlElement(name = "InclInd")
    protected boolean inclInd;

    /**
     * Gets the value of the sctiesAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesAcctId() {
        return sctiesAcctId;
    }

    /**
     * Sets the value of the sctiesAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IncludedAccount1 setSctiesAcctId(String value) {
        this.sctiesAcctId = value;
        return this;
    }

    /**
     * Gets the value of the inclInd property.
     * 
     */
    public boolean isInclInd() {
        return inclInd;
    }

    /**
     * Sets the value of the inclInd property.
     * 
     */
    public IncludedAccount1 setInclInd(boolean value) {
        this.inclInd = value;
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
