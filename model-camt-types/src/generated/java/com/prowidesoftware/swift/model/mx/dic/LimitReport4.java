
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
@XmlType(name = "LimitReport4", propOrder = {
    "lmtId",
    "lmtOrErr"
})
public class LimitReport4 {

    @XmlElement(name = "LmtId", required = true)
    protected LimitIdentification1 lmtId;
    @XmlElement(name = "LmtOrErr", required = true)
    protected LimitOrError1Choice lmtOrErr;

    /**
     * Gets the value of the lmtId property.
     * 
     * @return
     *     possible object is
     *     {@link LimitIdentification1 }
     *     
     */
    public LimitIdentification1 getLmtId() {
        return lmtId;
    }

    /**
     * Sets the value of the lmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitIdentification1 }
     *     
     */
    public LimitReport4 setLmtId(LimitIdentification1 value) {
        this.lmtId = value;
        return this;
    }

    /**
     * Gets the value of the lmtOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link LimitOrError1Choice }
     *     
     */
    public LimitOrError1Choice getLmtOrErr() {
        return lmtOrErr;
    }

    /**
     * Sets the value of the lmtOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitOrError1Choice }
     *     
     */
    public LimitReport4 setLmtOrErr(LimitOrError1Choice value) {
        this.lmtOrErr = value;
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
