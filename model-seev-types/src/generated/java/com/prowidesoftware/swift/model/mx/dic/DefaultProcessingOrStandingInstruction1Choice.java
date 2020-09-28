
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
 * Choice between default processing or standing instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultProcessingOrStandingInstruction1Choice", propOrder = {
    "dfltOptnInd",
    "stgInstrInd"
})
public class DefaultProcessingOrStandingInstruction1Choice {

    @XmlElement(name = "DfltOptnInd")
    protected Boolean dfltOptnInd;
    @XmlElement(name = "StgInstrInd")
    protected Boolean stgInstrInd;

    /**
     * Gets the value of the dfltOptnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDfltOptnInd() {
        return dfltOptnInd;
    }

    /**
     * Sets the value of the dfltOptnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public DefaultProcessingOrStandingInstruction1Choice setDfltOptnInd(Boolean value) {
        this.dfltOptnInd = value;
        return this;
    }

    /**
     * Gets the value of the stgInstrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStgInstrInd() {
        return stgInstrInd;
    }

    /**
     * Sets the value of the stgInstrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public DefaultProcessingOrStandingInstruction1Choice setStgInstrInd(Boolean value) {
        this.stgInstrInd = value;
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
