
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
 * Description of the element that creates the mismatch.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementIdentification1", propOrder = {
    "docIndx",
    "elmtPth",
    "elmtNm",
    "elmtVal"
})
public class ElementIdentification1 {

    @XmlElement(name = "DocIndx", required = true)
    protected String docIndx;
    @XmlElement(name = "ElmtPth", required = true)
    protected String elmtPth;
    @XmlElement(name = "ElmtNm", required = true)
    protected String elmtNm;
    @XmlElement(name = "ElmtVal")
    protected String elmtVal;

    /**
     * Gets the value of the docIndx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocIndx() {
        return docIndx;
    }

    /**
     * Sets the value of the docIndx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ElementIdentification1 setDocIndx(String value) {
        this.docIndx = value;
        return this;
    }

    /**
     * Gets the value of the elmtPth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElmtPth() {
        return elmtPth;
    }

    /**
     * Sets the value of the elmtPth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ElementIdentification1 setElmtPth(String value) {
        this.elmtPth = value;
        return this;
    }

    /**
     * Gets the value of the elmtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElmtNm() {
        return elmtNm;
    }

    /**
     * Sets the value of the elmtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ElementIdentification1 setElmtNm(String value) {
        this.elmtNm = value;
        return this;
    }

    /**
     * Gets the value of the elmtVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElmtVal() {
        return elmtVal;
    }

    /**
     * Sets the value of the elmtVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ElementIdentification1 setElmtVal(String value) {
        this.elmtVal = value;
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
