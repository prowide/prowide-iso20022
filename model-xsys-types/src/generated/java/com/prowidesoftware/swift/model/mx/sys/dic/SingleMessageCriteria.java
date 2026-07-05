
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for SingleMessageCriteria complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleMessageCriteria", propOrder = {
    "inptCrit",
    "outptCrit"
})
public class SingleMessageCriteria {

    @XmlElement(name = "InptCrit")
    protected InputOutputCriteria inptCrit;
    @XmlElement(name = "OutptCrit")
    protected InputOutputCriteria outptCrit;

    /**
     * Gets the value of the inptCrit property.
     * 
     * @return
     *     possible object is
     *     {@link InputOutputCriteria }
     *     
     */
    public InputOutputCriteria getInptCrit() {
        return inptCrit;
    }

    /**
     * Sets the value of the inptCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputOutputCriteria }
     *     
     */
    public SingleMessageCriteria setInptCrit(InputOutputCriteria value) {
        this.inptCrit = value;
        return this;
    }

    /**
     * Gets the value of the outptCrit property.
     * 
     * @return
     *     possible object is
     *     {@link InputOutputCriteria }
     *     
     */
    public InputOutputCriteria getOutptCrit() {
        return outptCrit;
    }

    /**
     * Sets the value of the outptCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputOutputCriteria }
     *     
     */
    public SingleMessageCriteria setOutptCrit(InputOutputCriteria value) {
        this.outptCrit = value;
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
