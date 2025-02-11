
package com.prowidesoftware.swift.model.mx.sys.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for FileResponseHeader complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileResponseHeader", propOrder = {
    "responder",
    "responseRef"
})
public class SwFileResponseHeader {

    @XmlElement(name = "Responder", namespace = "urn:swift:snl:ns.SwInt", required = true)
    protected String responder;
    @XmlElement(name = "ResponseRef", namespace = "urn:swift:snl:ns.SwInt")
    protected String responseRef;

    /**
     * Gets the value of the responder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponder() {
        return responder;
    }

    /**
     * Sets the value of the responder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileResponseHeader setResponder(String value) {
        this.responder = value;
        return this;
    }

    /**
     * Gets the value of the responseRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseRef() {
        return responseRef;
    }

    /**
     * Sets the value of the responseRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwFileResponseHeader setResponseRef(String value) {
        this.responseRef = value;
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
