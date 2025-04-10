
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
 * Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Obligation4", propOrder = {
    "ptyA",
    "svcgPtyA",
    "ptyB",
    "svcgPtyB",
    "collAcctId",
    "xpsrTp",
    "valtnDt"
})
public class Obligation4 {

    @XmlElement(name = "PtyA", required = true)
    protected PartyIdentification100Choice ptyA;
    @XmlElement(name = "SvcgPtyA")
    protected PartyIdentification100Choice svcgPtyA;
    @XmlElement(name = "PtyB", required = true)
    protected PartyIdentification100Choice ptyB;
    @XmlElement(name = "SvcgPtyB")
    protected PartyIdentification100Choice svcgPtyB;
    @XmlElement(name = "CollAcctId")
    protected CollateralAccount2 collAcctId;
    @XmlElement(name = "XpsrTp")
    @XmlSchemaType(name = "string")
    protected ExposureType5Code xpsrTp;
    @XmlElement(name = "ValtnDt", required = true)
    protected DateAndDateTimeChoice valtnDt;

    /**
     * Gets the value of the ptyA property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100Choice }
     *     
     */
    public PartyIdentification100Choice getPtyA() {
        return ptyA;
    }

    /**
     * Sets the value of the ptyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100Choice }
     *     
     */
    public Obligation4 setPtyA(PartyIdentification100Choice value) {
        this.ptyA = value;
        return this;
    }

    /**
     * Gets the value of the svcgPtyA property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100Choice }
     *     
     */
    public PartyIdentification100Choice getSvcgPtyA() {
        return svcgPtyA;
    }

    /**
     * Sets the value of the svcgPtyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100Choice }
     *     
     */
    public Obligation4 setSvcgPtyA(PartyIdentification100Choice value) {
        this.svcgPtyA = value;
        return this;
    }

    /**
     * Gets the value of the ptyB property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100Choice }
     *     
     */
    public PartyIdentification100Choice getPtyB() {
        return ptyB;
    }

    /**
     * Sets the value of the ptyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100Choice }
     *     
     */
    public Obligation4 setPtyB(PartyIdentification100Choice value) {
        this.ptyB = value;
        return this;
    }

    /**
     * Gets the value of the svcgPtyB property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100Choice }
     *     
     */
    public PartyIdentification100Choice getSvcgPtyB() {
        return svcgPtyB;
    }

    /**
     * Sets the value of the svcgPtyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100Choice }
     *     
     */
    public Obligation4 setSvcgPtyB(PartyIdentification100Choice value) {
        this.svcgPtyB = value;
        return this;
    }

    /**
     * Gets the value of the collAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAccount2 }
     *     
     */
    public CollateralAccount2 getCollAcctId() {
        return collAcctId;
    }

    /**
     * Sets the value of the collAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAccount2 }
     *     
     */
    public Obligation4 setCollAcctId(CollateralAccount2 value) {
        this.collAcctId = value;
        return this;
    }

    /**
     * Gets the value of the xpsrTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType5Code }
     *     
     */
    public ExposureType5Code getXpsrTp() {
        return xpsrTp;
    }

    /**
     * Sets the value of the xpsrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType5Code }
     *     
     */
    public Obligation4 setXpsrTp(ExposureType5Code value) {
        this.xpsrTp = value;
        return this;
    }

    /**
     * Gets the value of the valtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getValtnDt() {
        return valtnDt;
    }

    /**
     * Sets the value of the valtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public Obligation4 setValtnDt(DateAndDateTimeChoice value) {
        this.valtnDt = value;
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
