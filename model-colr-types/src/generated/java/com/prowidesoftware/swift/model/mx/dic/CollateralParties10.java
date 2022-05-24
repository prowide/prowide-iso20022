
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice of format for the trading capacity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralParties10", propOrder = {
    "ptyA",
    "clntPtyA",
    "ptyB",
    "clntPtyB",
    "trptyAgt",
    "collAcct"
})
public class CollateralParties10 {

    @XmlElement(name = "PtyA", required = true)
    protected PartyIdentificationAndAccount202 ptyA;
    @XmlElement(name = "ClntPtyA")
    protected PartyIdentificationAndAccount202 clntPtyA;
    @XmlElement(name = "PtyB", required = true)
    protected PartyIdentificationAndAccount203 ptyB;
    @XmlElement(name = "ClntPtyB")
    protected PartyIdentificationAndAccount203 clntPtyB;
    @XmlElement(name = "TrptyAgt")
    protected PartyIdentification136 trptyAgt;
    @XmlElement(name = "CollAcct")
    protected SecuritiesAccount19 collAcct;

    /**
     * Gets the value of the ptyA property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount202 }
     *     
     */
    public PartyIdentificationAndAccount202 getPtyA() {
        return ptyA;
    }

    /**
     * Sets the value of the ptyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount202 }
     *     
     */
    public CollateralParties10 setPtyA(PartyIdentificationAndAccount202 value) {
        this.ptyA = value;
        return this;
    }

    /**
     * Gets the value of the clntPtyA property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount202 }
     *     
     */
    public PartyIdentificationAndAccount202 getClntPtyA() {
        return clntPtyA;
    }

    /**
     * Sets the value of the clntPtyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount202 }
     *     
     */
    public CollateralParties10 setClntPtyA(PartyIdentificationAndAccount202 value) {
        this.clntPtyA = value;
        return this;
    }

    /**
     * Gets the value of the ptyB property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount203 }
     *     
     */
    public PartyIdentificationAndAccount203 getPtyB() {
        return ptyB;
    }

    /**
     * Sets the value of the ptyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount203 }
     *     
     */
    public CollateralParties10 setPtyB(PartyIdentificationAndAccount203 value) {
        this.ptyB = value;
        return this;
    }

    /**
     * Gets the value of the clntPtyB property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount203 }
     *     
     */
    public PartyIdentificationAndAccount203 getClntPtyB() {
        return clntPtyB;
    }

    /**
     * Sets the value of the clntPtyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount203 }
     *     
     */
    public CollateralParties10 setClntPtyB(PartyIdentificationAndAccount203 value) {
        this.clntPtyB = value;
        return this;
    }

    /**
     * Gets the value of the trptyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getTrptyAgt() {
        return trptyAgt;
    }

    /**
     * Sets the value of the trptyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public CollateralParties10 setTrptyAgt(PartyIdentification136 value) {
        this.trptyAgt = value;
        return this;
    }

    /**
     * Gets the value of the collAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getCollAcct() {
        return collAcct;
    }

    /**
     * Sets the value of the collAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public CollateralParties10 setCollAcct(SecuritiesAccount19 value) {
        this.collAcct = value;
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
