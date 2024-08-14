
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides details on the request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceiptDetails1", propOrder = {
    "rltdRef",
    "reqHdlg"
})
public class ReceiptDetails1 {

    @XmlElement(name = "RltdRef", required = true)
    protected AdditionalReferences rltdRef;
    @XmlElement(name = "ReqHdlg")
    protected RequestHandling reqHdlg;

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReferences }
     *     
     */
    public AdditionalReferences getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReferences }
     *     
     */
    public ReceiptDetails1 setRltdRef(AdditionalReferences value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the reqHdlg property.
     * 
     * @return
     *     possible object is
     *     {@link RequestHandling }
     *     
     */
    public RequestHandling getReqHdlg() {
        return reqHdlg;
    }

    /**
     * Sets the value of the reqHdlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHandling }
     *     
     */
    public ReceiptDetails1 setReqHdlg(RequestHandling value) {
        this.reqHdlg = value;
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
