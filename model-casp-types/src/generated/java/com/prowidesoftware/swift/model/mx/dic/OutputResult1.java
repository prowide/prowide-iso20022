
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information related to the result the output (display, print, input).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputResult1", propOrder = {
    "dvcTp",
    "infQlfr",
    "rspn"
})
public class OutputResult1 {

    @XmlElement(name = "DvcTp", required = true)
    @XmlSchemaType(name = "string")
    protected UserInterface4Code dvcTp;
    @XmlElement(name = "InfQlfr", required = true)
    @XmlSchemaType(name = "string")
    protected InformationQualify1Code infQlfr;
    @XmlElement(name = "Rspn", required = true)
    protected ResponseType9 rspn;

    /**
     * Gets the value of the dvcTp property.
     * 
     * @return
     *     possible object is
     *     {@link UserInterface4Code }
     *     
     */
    public UserInterface4Code getDvcTp() {
        return dvcTp;
    }

    /**
     * Sets the value of the dvcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInterface4Code }
     *     
     */
    public OutputResult1 setDvcTp(UserInterface4Code value) {
        this.dvcTp = value;
        return this;
    }

    /**
     * Gets the value of the infQlfr property.
     * 
     * @return
     *     possible object is
     *     {@link InformationQualify1Code }
     *     
     */
    public InformationQualify1Code getInfQlfr() {
        return infQlfr;
    }

    /**
     * Sets the value of the infQlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationQualify1Code }
     *     
     */
    public OutputResult1 setInfQlfr(InformationQualify1Code value) {
        this.infQlfr = value;
        return this;
    }

    /**
     * Gets the value of the rspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType9 }
     *     
     */
    public ResponseType9 getRspn() {
        return rspn;
    }

    /**
     * Sets the value of the rspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType9 }
     *     
     */
    public OutputResult1 setRspn(ResponseType9 value) {
        this.rspn = value;
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
