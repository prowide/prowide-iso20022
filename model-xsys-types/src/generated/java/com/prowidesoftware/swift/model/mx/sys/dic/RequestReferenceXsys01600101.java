
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
 * Java class for RequestReference complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestReference", propOrder = {
    "snFRef",
    "usrRef"
})
public class RequestReferenceXsys01600101 {

    @XmlElement(name = "SnFRef", namespace = "urn:swift:snl:ns.Sw")
    protected String snFRef;
    @XmlElement(name = "UsrRef")
    protected String usrRef;

    /**
     * StoreAndForwardReference
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnFRef() {
        return snFRef;
    }

    /**
     * Sets the value of the snFRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RequestReferenceXsys01600101 setSnFRef(String value) {
        this.snFRef = value;
        return this;
    }

    /**
     * Gets the value of the usrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrRef() {
        return usrRef;
    }

    /**
     * Sets the value of the usrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RequestReferenceXsys01600101 setUsrRef(String value) {
        this.usrRef = value;
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
