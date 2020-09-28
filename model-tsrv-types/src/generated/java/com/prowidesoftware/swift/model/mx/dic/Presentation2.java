
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
 * Information for the presentation of documents.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Presentation2", propOrder = {
    "presntr",
    "bnfcryPresntnDt"
})
public class Presentation2 {

    @XmlElement(name = "Presntr")
    protected PartyIdentification43 presntr;
    @XmlElement(name = "BnfcryPresntnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bnfcryPresntnDt;

    /**
     * Gets the value of the presntr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification43 }
     *     
     */
    public PartyIdentification43 getPresntr() {
        return presntr;
    }

    /**
     * Sets the value of the presntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification43 }
     *     
     */
    public Presentation2 setPresntr(PartyIdentification43 value) {
        this.presntr = value;
        return this;
    }

    /**
     * Gets the value of the bnfcryPresntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBnfcryPresntnDt() {
        return bnfcryPresntnDt;
    }

    /**
     * Sets the value of the bnfcryPresntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Presentation2 setBnfcryPresntnDt(XMLGregorianCalendar value) {
        this.bnfcryPresntnDt = value;
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
