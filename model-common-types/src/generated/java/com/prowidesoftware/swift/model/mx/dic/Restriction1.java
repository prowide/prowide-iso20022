
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
 * Restriction on capability or operations allowed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Restriction1", propOrder = {
    "rstrctnTp",
    "vldFr",
    "vldUntil"
})
public class Restriction1 {

    @XmlElement(name = "RstrctnTp", required = true)
    protected CodeOrProprietary1Choice rstrctnTp;
    @XmlElement(name = "VldFr", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vldFr;
    @XmlElement(name = "VldUntil")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vldUntil;

    /**
     * Gets the value of the rstrctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CodeOrProprietary1Choice }
     *     
     */
    public CodeOrProprietary1Choice getRstrctnTp() {
        return rstrctnTp;
    }

    /**
     * Sets the value of the rstrctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeOrProprietary1Choice }
     *     
     */
    public Restriction1 setRstrctnTp(CodeOrProprietary1Choice value) {
        this.rstrctnTp = value;
        return this;
    }

    /**
     * Gets the value of the vldFr property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVldFr() {
        return vldFr;
    }

    /**
     * Sets the value of the vldFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Restriction1 setVldFr(XMLGregorianCalendar value) {
        this.vldFr = value;
        return this;
    }

    /**
     * Gets the value of the vldUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVldUntil() {
        return vldUntil;
    }

    /**
     * Sets the value of the vldUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Restriction1 setVldUntil(XMLGregorianCalendar value) {
        this.vldUntil = value;
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
