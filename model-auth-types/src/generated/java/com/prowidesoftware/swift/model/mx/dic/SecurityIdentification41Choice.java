
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
 * Choice between ISIN and an alternative format for the identification of a financial instrument. ISIN is the preferred format.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityIdentification41Choice", propOrder = {
    "isin",
    "altrntvInstrmId",
    "unqPdctIdr",
    "bskt",
    "indx",
    "othr",
    "idNotAvlbl"
})
public class SecurityIdentification41Choice {

    @XmlElement(name = "ISIN")
    protected String isin;
    @XmlElement(name = "AltrntvInstrmId")
    protected String altrntvInstrmId;
    @XmlElement(name = "UnqPdctIdr")
    protected UniqueProductIdentifier2Choice unqPdctIdr;
    @XmlElement(name = "Bskt")
    protected CustomBasket4 bskt;
    @XmlElement(name = "Indx")
    protected IndexIdentification1 indx;
    @XmlElement(name = "Othr")
    protected GenericIdentification184 othr;
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
    public SecurityIdentification41Choice setISIN(String value) {
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
    public SecurityIdentification41Choice setAltrntvInstrmId(String value) {
        this.altrntvInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the unqPdctIdr property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueProductIdentifier2Choice }
     *     
     */
    public UniqueProductIdentifier2Choice getUnqPdctIdr() {
        return unqPdctIdr;
    }

    /**
     * Sets the value of the unqPdctIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueProductIdentifier2Choice }
     *     
     */
    public SecurityIdentification41Choice setUnqPdctIdr(UniqueProductIdentifier2Choice value) {
        this.unqPdctIdr = value;
        return this;
    }

    /**
     * Gets the value of the bskt property.
     * 
     * @return
     *     possible object is
     *     {@link CustomBasket4 }
     *     
     */
    public CustomBasket4 getBskt() {
        return bskt;
    }

    /**
     * Sets the value of the bskt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomBasket4 }
     *     
     */
    public SecurityIdentification41Choice setBskt(CustomBasket4 value) {
        this.bskt = value;
        return this;
    }

    /**
     * Gets the value of the indx property.
     * 
     * @return
     *     possible object is
     *     {@link IndexIdentification1 }
     *     
     */
    public IndexIdentification1 getIndx() {
        return indx;
    }

    /**
     * Sets the value of the indx property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexIdentification1 }
     *     
     */
    public SecurityIdentification41Choice setIndx(IndexIdentification1 value) {
        this.indx = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification184 }
     *     
     */
    public GenericIdentification184 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification184 }
     *     
     */
    public SecurityIdentification41Choice setOthr(GenericIdentification184 value) {
        this.othr = value;
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
    public SecurityIdentification41Choice setIdNotAvlbl(UnderlyingIdentification1Code value) {
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
