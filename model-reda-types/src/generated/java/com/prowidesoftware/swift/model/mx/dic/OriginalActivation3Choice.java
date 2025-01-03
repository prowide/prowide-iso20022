
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
 * Specifies the activation details which is referenced.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalActivation3Choice", propOrder = {
    "orgnlDbtrId",
    "orgnlActvtnData"
})
public class OriginalActivation3Choice {

    @XmlElement(name = "OrgnlDbtrId")
    protected Party53Choice orgnlDbtrId;
    @XmlElement(name = "OrgnlActvtnData")
    protected DebtorActivation5 orgnlActvtnData;

    /**
     * Gets the value of the orgnlDbtrId property.
     * 
     * @return
     *     possible object is
     *     {@link Party53Choice }
     *     
     */
    public Party53Choice getOrgnlDbtrId() {
        return orgnlDbtrId;
    }

    /**
     * Sets the value of the orgnlDbtrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party53Choice }
     *     
     */
    public OriginalActivation3Choice setOrgnlDbtrId(Party53Choice value) {
        this.orgnlDbtrId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlActvtnData property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorActivation5 }
     *     
     */
    public DebtorActivation5 getOrgnlActvtnData() {
        return orgnlActvtnData;
    }

    /**
     * Sets the value of the orgnlActvtnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorActivation5 }
     *     
     */
    public OriginalActivation3Choice setOrgnlActvtnData(DebtorActivation5 value) {
        this.orgnlActvtnData = value;
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
