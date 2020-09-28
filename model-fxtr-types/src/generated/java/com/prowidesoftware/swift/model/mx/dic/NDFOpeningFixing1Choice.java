
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
 * Choice of providing the opening conditions or fixing conditions for an NDF instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NDFOpeningFixing1Choice", propOrder = {
    "opngConds",
    "opngConfRef"
})
public class NDFOpeningFixing1Choice {

    @XmlElement(name = "OpngConds")
    protected OpeningConditions1 opngConds;
    @XmlElement(name = "OpngConfRef")
    protected String opngConfRef;

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
    public NDFOpeningFixing1Choice setOpngConds(OpeningConditions1 value) {
        this.opngConds = value;
        return this;
    }

    /**
     * Gets the value of the opngConfRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpngConfRef() {
        return opngConfRef;
    }

    /**
     * Sets the value of the opngConfRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NDFOpeningFixing1Choice setOpngConfRef(String value) {
        this.opngConfRef = value;
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
