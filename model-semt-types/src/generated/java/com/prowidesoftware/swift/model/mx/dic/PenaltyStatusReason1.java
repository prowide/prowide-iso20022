
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
 * Specifies the penalty status reason.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PenaltyStatusReason1", propOrder = {
    "rsn",
    "addtlStsRsn"
})
public class PenaltyStatusReason1 {

    @XmlElement(name = "Rsn", required = true)
    protected PenaltyStatusReason1Choice rsn;
    @XmlElement(name = "AddtlStsRsn")
    protected String addtlStsRsn;

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyStatusReason1Choice }
     *     
     */
    public PenaltyStatusReason1Choice getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyStatusReason1Choice }
     *     
     */
    public PenaltyStatusReason1 setRsn(PenaltyStatusReason1Choice value) {
        this.rsn = value;
        return this;
    }

    /**
     * Gets the value of the addtlStsRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlStsRsn() {
        return addtlStsRsn;
    }

    /**
     * Sets the value of the addtlStsRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PenaltyStatusReason1 setAddtlStsRsn(String value) {
        this.addtlStsRsn = value;
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
