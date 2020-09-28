
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
 * Unique and unambiguous way to identify a person.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonIdentification10", propOrder = {
    "frstNm",
    "nm",
    "birthDt",
    "othr"
})
public class PersonIdentification10 {

    @XmlElement(name = "FrstNm", required = true)
    protected String frstNm;
    @XmlElement(name = "Nm", required = true)
    protected String nm;
    @XmlElement(name = "BirthDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDt;
    @XmlElement(name = "Othr", required = true)
    protected GenericPersonIdentification1 othr;

    /**
     * Gets the value of the frstNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrstNm() {
        return frstNm;
    }

    /**
     * Sets the value of the frstNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PersonIdentification10 setFrstNm(String value) {
        this.frstNm = value;
        return this;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PersonIdentification10 setNm(String value) {
        this.nm = value;
        return this;
    }

    /**
     * Gets the value of the birthDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDt() {
        return birthDt;
    }

    /**
     * Sets the value of the birthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public PersonIdentification10 setBirthDt(XMLGregorianCalendar value) {
        this.birthDt = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPersonIdentification1 }
     *     
     */
    public GenericPersonIdentification1 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPersonIdentification1 }
     *     
     */
    public PersonIdentification10 setOthr(GenericPersonIdentification1 value) {
        this.othr = value;
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
