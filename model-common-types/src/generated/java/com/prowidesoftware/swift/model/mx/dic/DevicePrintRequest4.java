
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Content of the Print Request message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DevicePrintRequest4", propOrder = {
    "docQlfr",
    "rspnMd",
    "intgrtdPrtFlg",
    "reqrdSgntrFlg",
    "outptCntt"
})
public class DevicePrintRequest4 {

    @XmlElement(name = "DocQlfr", required = true)
    @XmlSchemaType(name = "string")
    protected DocumentType7Code docQlfr;
    @XmlElement(name = "RspnMd", required = true)
    @XmlSchemaType(name = "string")
    protected ResponseMode2Code rspnMd;
    @XmlElement(name = "IntgrtdPrtFlg")
    protected Boolean intgrtdPrtFlg;
    @XmlElement(name = "ReqrdSgntrFlg")
    protected Boolean reqrdSgntrFlg;
    @XmlElement(name = "OutptCntt", required = true)
    protected ActionMessage9 outptCntt;

    /**
     * Gets the value of the docQlfr property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType7Code }
     *     
     */
    public DocumentType7Code getDocQlfr() {
        return docQlfr;
    }

    /**
     * Sets the value of the docQlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType7Code }
     *     
     */
    public DevicePrintRequest4 setDocQlfr(DocumentType7Code value) {
        this.docQlfr = value;
        return this;
    }

    /**
     * Gets the value of the rspnMd property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseMode2Code }
     *     
     */
    public ResponseMode2Code getRspnMd() {
        return rspnMd;
    }

    /**
     * Sets the value of the rspnMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseMode2Code }
     *     
     */
    public DevicePrintRequest4 setRspnMd(ResponseMode2Code value) {
        this.rspnMd = value;
        return this;
    }

    /**
     * Gets the value of the intgrtdPrtFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntgrtdPrtFlg() {
        return intgrtdPrtFlg;
    }

    /**
     * Sets the value of the intgrtdPrtFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public DevicePrintRequest4 setIntgrtdPrtFlg(Boolean value) {
        this.intgrtdPrtFlg = value;
        return this;
    }

    /**
     * Gets the value of the reqrdSgntrFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReqrdSgntrFlg() {
        return reqrdSgntrFlg;
    }

    /**
     * Sets the value of the reqrdSgntrFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public DevicePrintRequest4 setReqrdSgntrFlg(Boolean value) {
        this.reqrdSgntrFlg = value;
        return this;
    }

    /**
     * Gets the value of the outptCntt property.
     * 
     * @return
     *     possible object is
     *     {@link ActionMessage9 }
     *     
     */
    public ActionMessage9 getOutptCntt() {
        return outptCntt;
    }

    /**
     * Sets the value of the outptCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage9 }
     *     
     */
    public DevicePrintRequest4 setOutptCntt(ActionMessage9 value) {
        this.outptCntt = value;
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
