
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
 * Details of the amendment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amendment9", propOrder = {
    "udrtkgAmdmntRspnMsg"
})
public class Amendment9 {

    @XmlElement(name = "UdrtkgAmdmntRspnMsg", required = true)
    protected UndertakingAmendmentResponseMessage1 udrtkgAmdmntRspnMsg;

    /**
     * Gets the value of the udrtkgAmdmntRspnMsg property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingAmendmentResponseMessage1 }
     *     
     */
    public UndertakingAmendmentResponseMessage1 getUdrtkgAmdmntRspnMsg() {
        return udrtkgAmdmntRspnMsg;
    }

    /**
     * Sets the value of the udrtkgAmdmntRspnMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingAmendmentResponseMessage1 }
     *     
     */
    public Amendment9 setUdrtkgAmdmntRspnMsg(UndertakingAmendmentResponseMessage1 value) {
        this.udrtkgAmdmntRspnMsg = value;
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
