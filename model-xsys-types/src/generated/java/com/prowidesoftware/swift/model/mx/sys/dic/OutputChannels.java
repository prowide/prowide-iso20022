
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
 * Java class for OutputChannels complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputChannels", propOrder = {
    "outptChanlPattrn"
})
public class OutputChannels {

    @XmlElement(name = "OutptChanlPattrn", required = true)
    protected String outptChanlPattrn;

    /**
     * Gets the value of the outptChanlPattrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutptChanlPattrn() {
        return outptChanlPattrn;
    }

    /**
     * Sets the value of the outptChanlPattrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public OutputChannels setOutptChanlPattrn(String value) {
        this.outptChanlPattrn = value;
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
