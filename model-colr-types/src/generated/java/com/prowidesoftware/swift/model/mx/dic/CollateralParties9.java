
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
 * Identifies the chain of collateral parties on the instruction side.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralParties9", propOrder = {
    "ptyA",
    "clntPtyA",
    "trptyAgt"
})
public class CollateralParties9 {

    @XmlElement(name = "PtyA")
    protected PartyIdentificationAndAccount202 ptyA;
    @XmlElement(name = "ClntPtyA")
    protected PartyIdentificationAndAccount202 clntPtyA;
    @XmlElement(name = "TrptyAgt")
    protected PartyIdentification136 trptyAgt;

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
    public CollateralParties9 setPtyA(PartyIdentificationAndAccount202 value) {
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
    public CollateralParties9 setClntPtyA(PartyIdentificationAndAccount202 value) {
        this.clntPtyA = value;
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
    public CollateralParties9 setTrptyAgt(PartyIdentification136 value) {
        this.trptyAgt = value;
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
