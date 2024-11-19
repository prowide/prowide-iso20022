
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details about the lottery.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionSD6", propOrder = {
    "ltryRcrdSts"
})
public class CorporateActionSD6 {

    @XmlElement(name = "LtryRcrdSts", required = true)
    @XmlSchemaType(name = "string")
    protected WorkflowStatus1Code ltryRcrdSts;

    /**
     * Gets the value of the ltryRcrdSts property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowStatus1Code }
     *     
     */
    public WorkflowStatus1Code getLtryRcrdSts() {
        return ltryRcrdSts;
    }

    /**
     * Sets the value of the ltryRcrdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowStatus1Code }
     *     
     */
    public CorporateActionSD6 setLtryRcrdSts(WorkflowStatus1Code value) {
        this.ltryRcrdSts = value;
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
