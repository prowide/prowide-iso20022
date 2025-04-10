
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
 * Contains credential information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Credentials1", propOrder = {
    "idCd",
    "othrIdCd",
    "idVal"
})
public class Credentials1 {

    @XmlElement(name = "IdCd", required = true)
    @XmlSchemaType(name = "string")
    protected Identification2Code idCd;
    @XmlElement(name = "OthrIdCd")
    protected String othrIdCd;
    @XmlElement(name = "IdVal", required = true)
    protected String idVal;

    /**
     * Gets the value of the idCd property.
     * 
     * @return
     *     possible object is
     *     {@link Identification2Code }
     *     
     */
    public Identification2Code getIdCd() {
        return idCd;
    }

    /**
     * Sets the value of the idCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identification2Code }
     *     
     */
    public Credentials1 setIdCd(Identification2Code value) {
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
    public Credentials1 setOthrIdCd(String value) {
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
    public Credentials1 setIdVal(String value) {
        this.idVal = value;
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
