
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
 * Identification of partners involved in exchange from the merchant to the issuer, with the relative timestamp of their exchanges.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Traceability1", propOrder = {
    "rlayId",
    "tracDtTmIn",
    "tracDtTmOut"
})
public class Traceability1 {

    @XmlElement(name = "RlayId", required = true)
    protected GenericIdentification31 rlayId;
    @XmlElement(name = "TracDtTmIn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tracDtTmIn;
    @XmlElement(name = "TracDtTmOut", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tracDtTmOut;

    /**
     * Gets the value of the rlayId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification31 }
     *     
     */
    public GenericIdentification31 getRlayId() {
        return rlayId;
    }

    /**
     * Sets the value of the rlayId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification31 }
     *     
     */
    public Traceability1 setRlayId(GenericIdentification31 value) {
        this.rlayId = value;
        return this;
    }

    /**
     * Gets the value of the tracDtTmIn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTracDtTmIn() {
        return tracDtTmIn;
    }

    /**
     * Sets the value of the tracDtTmIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Traceability1 setTracDtTmIn(XMLGregorianCalendar value) {
        this.tracDtTmIn = value;
        return this;
    }

    /**
     * Gets the value of the tracDtTmOut property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTracDtTmOut() {
        return tracDtTmOut;
    }

    /**
     * Sets the value of the tracDtTmOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Traceability1 setTracDtTmOut(XMLGregorianCalendar value) {
        this.tracDtTmOut = value;
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
