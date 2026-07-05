
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
 * Reports either on the risk management limit or on a business error.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitReport6", propOrder = {
    "lmtId",
    "lmtOrErr"
})
public class LimitReport6 {

    @XmlElement(name = "LmtId", required = true)
    protected LimitIdentification1 lmtId;
    @XmlElement(name = "LmtOrErr", required = true)
    protected LimitOrError3Choice lmtOrErr;

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
    public LimitReport6 setLmtId(LimitIdentification1 value) {
        this.lmtId = value;
        return this;
    }

    /**
     * Gets the value of the lmtOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link LimitOrError3Choice }
     *     
     */
    public LimitOrError3Choice getLmtOrErr() {
        return lmtOrErr;
    }

    /**
     * Sets the value of the lmtOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitOrError3Choice }
     *     
     */
    public LimitReport6 setLmtOrErr(LimitOrError3Choice value) {
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
