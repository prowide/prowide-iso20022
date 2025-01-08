
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
 * Instruction to be cancelled.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelInstruction3", propOrder = {
    "snglInstrId",
    "instdPos"
})
public class CancelInstruction3 {

    @XmlElement(name = "SnglInstrId", required = true)
    protected String snglInstrId;
    @XmlElement(name = "InstdPos")
    protected SafekeepingAccount13 instdPos;

    /**
     * Gets the value of the snglInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnglInstrId() {
        return snglInstrId;
    }

    /**
     * Sets the value of the snglInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CancelInstruction3 setSnglInstrId(String value) {
        this.snglInstrId = value;
        return this;
    }

    /**
     * Gets the value of the instdPos property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingAccount13 }
     *     
     */
    public SafekeepingAccount13 getInstdPos() {
        return instdPos;
    }

    /**
     * Sets the value of the instdPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingAccount13 }
     *     
     */
    public CancelInstruction3 setInstdPos(SafekeepingAccount13 value) {
        this.instdPos = value;
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
