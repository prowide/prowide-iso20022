
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
 * Java class for DeleteOutputChannelSnFRequest complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteOutputChannelSnFRequest", propOrder = {
    "outputChannel"
})
public class SwDeleteOutputChannelSnFRequest {

    @XmlElement(name = "OutputChannel", required = true)
    protected String outputChannel;

    /**
     * Gets the value of the outputChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputChannel() {
        return outputChannel;
    }

    /**
     * Sets the value of the outputChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwDeleteOutputChannelSnFRequest setOutputChannel(String value) {
        this.outputChannel = value;
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
