
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
 * Replacement of an existing content by a different one.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Replacement2", propOrder = {
    "curVal",
    "propsdVal"
})
public class Replacement2 {

    @XmlElement(name = "CurVal", required = true)
    protected String curVal;
    @XmlElement(name = "PropsdVal", required = true)
    protected String propsdVal;

    /**
     * Gets the value of the curVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurVal() {
        return curVal;
    }

    /**
     * Sets the value of the curVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Replacement2 setCurVal(String value) {
        this.curVal = value;
        return this;
    }

    /**
     * Gets the value of the propsdVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropsdVal() {
        return propsdVal;
    }

    /**
     * Sets the value of the propsdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Replacement2 setPropsdVal(String value) {
        this.propsdVal = value;
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
