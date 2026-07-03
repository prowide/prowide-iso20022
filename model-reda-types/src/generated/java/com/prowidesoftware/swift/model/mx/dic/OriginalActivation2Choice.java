
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
 * Specifies the activation details which is referenced.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalActivation2Choice", propOrder = {
    "orgnlDbtrId",
    "orgnlActvtnData"
})
public class OriginalActivation2Choice {

    @XmlElement(name = "OrgnlDbtrId")
    protected Party49Choice orgnlDbtrId;
    @XmlElement(name = "OrgnlActvtnData")
    protected DebtorActivation3 orgnlActvtnData;

    /**
     * Gets the value of the orgnlDbtrId property.
     * 
     * @return
     *     possible object is
     *     {@link Party49Choice }
     *     
     */
    public Party49Choice getOrgnlDbtrId() {
        return orgnlDbtrId;
    }

    /**
     * Sets the value of the orgnlDbtrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party49Choice }
     *     
     */
    public OriginalActivation2Choice setOrgnlDbtrId(Party49Choice value) {
        this.orgnlDbtrId = value;
        return this;
    }

    /**
     * Gets the value of the orgnlActvtnData property.
     * 
     * @return
     *     possible object is
     *     {@link DebtorActivation3 }
     *     
     */
    public DebtorActivation3 getOrgnlActvtnData() {
        return orgnlActvtnData;
    }

    /**
     * Sets the value of the orgnlActvtnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebtorActivation3 }
     *     
     */
    public OriginalActivation2Choice setOrgnlActvtnData(DebtorActivation3 value) {
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
