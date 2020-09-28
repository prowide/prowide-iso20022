
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
 * Specifies the opening and valuation conditions for the non deliverable forward
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonDeliverableForwardConditions2", propOrder = {
    "opngConds",
    "fxgConds"
})
public class NonDeliverableForwardConditions2 {

    @XmlElement(name = "OpngConds", required = true)
    protected OpeningConditions1 opngConds;
    @XmlElement(name = "FxgConds")
    protected FixingConditions1 fxgConds;

    /**
     * Gets the value of the opngConds property.
     * 
     * @return
     *     possible object is
     *     {@link OpeningConditions1 }
     *     
     */
    public OpeningConditions1 getOpngConds() {
        return opngConds;
    }

    /**
     * Sets the value of the opngConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpeningConditions1 }
     *     
     */
    public NonDeliverableForwardConditions2 setOpngConds(OpeningConditions1 value) {
        this.opngConds = value;
        return this;
    }

    /**
     * Gets the value of the fxgConds property.
     * 
     * @return
     *     possible object is
     *     {@link FixingConditions1 }
     *     
     */
    public FixingConditions1 getFxgConds() {
        return fxgConds;
    }

    /**
     * Sets the value of the fxgConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixingConditions1 }
     *     
     */
    public NonDeliverableForwardConditions2 setFxgConds(FixingConditions1 value) {
        this.fxgConds = value;
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
