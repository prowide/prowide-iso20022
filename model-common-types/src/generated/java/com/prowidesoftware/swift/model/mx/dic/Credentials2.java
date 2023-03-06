
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Contains credential information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Credentials2", propOrder = {
    "idCd",
    "othrIdCd",
    "idVal",
    "idXpryDt",
    "assgnrAuthrty"
})
public class Credentials2 {

    @XmlElement(name = "IdCd", required = true)
    @XmlSchemaType(name = "string")
    protected Identification3Code idCd;
    @XmlElement(name = "OthrIdCd")
    protected String othrIdCd;
    @XmlElement(name = "IdVal", required = true)
    protected String idVal;
    @XmlElement(name = "IdXpryDt")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar idXpryDt;
    @XmlElement(name = "AssgnrAuthrty")
    protected Authority1 assgnrAuthrty;

    /**
     * Gets the value of the idCd property.
     * 
     * @return
     *     possible object is
     *     {@link Identification3Code }
     *     
     */
    public Identification3Code getIdCd() {
        return idCd;
    }

    /**
     * Sets the value of the idCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identification3Code }
     *     
     */
    public Credentials2 setIdCd(Identification3Code value) {
        this.idCd = value;
        return this;
    }

    /**
     * Gets the value of the othrIdCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrIdCd() {
        return othrIdCd;
    }

    /**
     * Sets the value of the othrIdCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Credentials2 setOthrIdCd(String value) {
        this.othrIdCd = value;
        return this;
    }

    /**
     * Gets the value of the idVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdVal() {
        return idVal;
    }

    /**
     * Sets the value of the idVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Credentials2 setIdVal(String value) {
        this.idVal = value;
        return this;
    }

    /**
     * Gets the value of the idXpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIdXpryDt() {
        return idXpryDt;
    }

    /**
     * Sets the value of the idXpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Credentials2 setIdXpryDt(XMLGregorianCalendar value) {
        this.idXpryDt = value;
        return this;
    }

    /**
     * Gets the value of the assgnrAuthrty property.
     * 
     * @return
     *     possible object is
     *     {@link Authority1 }
     *     
     */
    public Authority1 getAssgnrAuthrty() {
        return assgnrAuthrty;
    }

    /**
     * Sets the value of the assgnrAuthrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Authority1 }
     *     
     */
    public Credentials2 setAssgnrAuthrty(Authority1 value) {
        this.assgnrAuthrty = value;
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
