
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Additional information with update description and date.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatedURLlnformation3", propOrder = {
    "updDesc",
    "updDt",
    "urlAdr"
})
public class UpdatedURLlnformation3 {

    @XmlElement(name = "UpdDesc")
    protected String updDesc;
    @XmlElement(name = "UpdDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar updDt;
    @XmlElement(name = "URLAdr", required = true)
    protected String urlAdr;

    /**
     * Gets the value of the updDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdDesc() {
        return updDesc;
    }

    /**
     * Sets the value of the updDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UpdatedURLlnformation3 setUpdDesc(String value) {
        this.updDesc = value;
        return this;
    }

    /**
     * Gets the value of the updDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdDt() {
        return updDt;
    }

    /**
     * Sets the value of the updDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public UpdatedURLlnformation3 setUpdDt(XMLGregorianCalendar value) {
        this.updDt = value;
        return this;
    }

    /**
     * Gets the value of the urlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLAdr() {
        return urlAdr;
    }

    /**
     * Sets the value of the urlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UpdatedURLlnformation3 setURLAdr(String value) {
        this.urlAdr = value;
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
