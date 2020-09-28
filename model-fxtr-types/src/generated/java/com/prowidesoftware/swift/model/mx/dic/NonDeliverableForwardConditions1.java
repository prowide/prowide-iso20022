
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
@XmlType(name = "NonDeliverableForwardConditions1", propOrder = {
    "opngInd",
    "opngFxgConds"
})
public class NonDeliverableForwardConditions1 {

    @XmlElement(name = "OpngInd")
    protected boolean opngInd;
    @XmlElement(name = "OpngFxgConds", required = true)
    protected NDFOpeningFixing1Choice opngFxgConds;

    /**
     * Gets the value of the opngInd property.
     * 
     */
    public boolean isOpngInd() {
        return opngInd;
    }

    /**
     * Sets the value of the opngInd property.
     * 
     */
    public NonDeliverableForwardConditions1 setOpngInd(boolean value) {
        this.opngInd = value;
        return this;
    }

    /**
     * Gets the value of the opngFxgConds property.
     * 
     * @return
     *     possible object is
     *     {@link NDFOpeningFixing1Choice }
     *     
     */
    public NDFOpeningFixing1Choice getOpngFxgConds() {
        return opngFxgConds;
    }

    /**
     * Sets the value of the opngFxgConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link NDFOpeningFixing1Choice }
     *     
     */
    public NonDeliverableForwardConditions1 setOpngFxgConds(NDFOpeningFixing1Choice value) {
        this.opngFxgConds = value;
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
