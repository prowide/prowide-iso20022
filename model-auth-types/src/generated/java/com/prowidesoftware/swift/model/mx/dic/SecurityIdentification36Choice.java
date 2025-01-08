
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
 * Choice between ISIN and an alternative format for the identification of a financial instrument. ISIN is the preferred format.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityIdentification36Choice", propOrder = {
    "isin",
    "altrntvInstrmId",
    "unqPdctIdr",
    "bskt",
    "indx",
    "idNotAvlbl"
})
public class SecurityIdentification36Choice {

    @XmlElement(name = "ISIN")
    protected String isin;
    @XmlElement(name = "AltrntvInstrmId")
    protected String altrntvInstrmId;
    @XmlElement(name = "UnqPdctIdr")
    protected String unqPdctIdr;
    @XmlElement(name = "Bskt")
    protected CustomBasket1 bskt;
    @XmlElement(name = "Indx")
    protected SecurityIdentification37Choice indx;
    @XmlElement(name = "IdNotAvlbl")
    @XmlSchemaType(name = "string")
    protected UnderlyingIdentification1Code idNotAvlbl;

    /**
     * Gets the value of the isin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISIN() {
        return isin;
    }

    /**
     * Sets the value of the isin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification36Choice setISIN(String value) {
        this.isin = value;
        return this;
    }

    /**
     * Gets the value of the altrntvInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltrntvInstrmId() {
        return altrntvInstrmId;
    }

    /**
     * Sets the value of the altrntvInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification36Choice setAltrntvInstrmId(String value) {
        this.altrntvInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the unqPdctIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnqPdctIdr() {
        return unqPdctIdr;
    }

    /**
     * Sets the value of the unqPdctIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecurityIdentification36Choice setUnqPdctIdr(String value) {
        this.unqPdctIdr = value;
        return this;
    }

    /**
     * Gets the value of the bskt property.
     * 
     * @return
     *     possible object is
     *     {@link CustomBasket1 }
     *     
     */
    public CustomBasket1 getBskt() {
        return bskt;
    }

    /**
     * Sets the value of the bskt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomBasket1 }
     *     
     */
    public SecurityIdentification36Choice setBskt(CustomBasket1 value) {
        this.bskt = value;
        return this;
    }

    /**
     * Gets the value of the indx property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification37Choice }
     *     
     */
    public SecurityIdentification37Choice getIndx() {
        return indx;
    }

    /**
     * Sets the value of the indx property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification37Choice }
     *     
     */
    public SecurityIdentification36Choice setIndx(SecurityIdentification37Choice value) {
        this.indx = value;
        return this;
    }

    /**
     * Gets the value of the idNotAvlbl property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingIdentification1Code }
     *     
     */
    public UnderlyingIdentification1Code getIdNotAvlbl() {
        return idNotAvlbl;
    }

    /**
     * Sets the value of the idNotAvlbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingIdentification1Code }
     *     
     */
    public SecurityIdentification36Choice setIdNotAvlbl(UnderlyingIdentification1Code value) {
        this.idNotAvlbl = value;
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
