
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
 * Reference to a message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkedMessage5Choice", propOrder = {
    "prvsRef",
    "othrRef"
})
public class LinkedMessage5Choice {

    @XmlElement(name = "PrvsRef")
    protected AdditionalReference13 prvsRef;
    @XmlElement(name = "OthrRef")
    protected AdditionalReference13 othrRef;

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference13 }
     *     
     */
    public AdditionalReference13 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference13 }
     *     
     */
    public LinkedMessage5Choice setPrvsRef(AdditionalReference13 value) {
        this.prvsRef = value;
        return this;
    }

    /**
     * Gets the value of the othrRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference13 }
     *     
     */
    public AdditionalReference13 getOthrRef() {
        return othrRef;
    }

    /**
     * Sets the value of the othrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference13 }
     *     
     */
    public LinkedMessage5Choice setOthrRef(AdditionalReference13 value) {
        this.othrRef = value;
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
