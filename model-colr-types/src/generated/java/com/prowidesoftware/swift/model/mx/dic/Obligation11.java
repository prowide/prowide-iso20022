
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
 * General information about the collateral agreement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Obligation11", propOrder = {
    "ptyA",
    "svcgPtyA",
    "ptyB",
    "svcgPtyB",
    "collAcctId",
    "blckChainAdrOrWllt",
    "xpsrTp",
    "valtnDt"
})
public class Obligation11 {

    @XmlElement(name = "PtyA", required = true)
    protected PartyIdentification242 ptyA;
    @XmlElement(name = "SvcgPtyA")
    protected PartyIdentification178Choice svcgPtyA;
    @XmlElement(name = "PtyB", required = true)
    protected PartyIdentification242 ptyB;
    @XmlElement(name = "SvcgPtyB")
    protected PartyIdentification178Choice svcgPtyB;
    @XmlElement(name = "CollAcctId")
    protected CollateralAccount3 collAcctId;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet5 blckChainAdrOrWllt;
    @XmlElement(name = "XpsrTp")
    @XmlSchemaType(name = "string")
    protected ExposureType11Code xpsrTp;
    @XmlElement(name = "ValtnDt", required = true)
    protected DateAndDateTime2Choice valtnDt;

    /**
     * Gets the value of the ptyA property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242 }
     *     
     */
    public PartyIdentification242 getPtyA() {
        return ptyA;
    }

    /**
     * Sets the value of the ptyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242 }
     *     
     */
    public Obligation11 setPtyA(PartyIdentification242 value) {
        this.ptyA = value;
        return this;
    }

    /**
     * Gets the value of the svcgPtyA property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public PartyIdentification178Choice getSvcgPtyA() {
        return svcgPtyA;
    }

    /**
     * Sets the value of the svcgPtyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public Obligation11 setSvcgPtyA(PartyIdentification178Choice value) {
        this.svcgPtyA = value;
        return this;
    }

    /**
     * Gets the value of the ptyB property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242 }
     *     
     */
    public PartyIdentification242 getPtyB() {
        return ptyB;
    }

    /**
     * Sets the value of the ptyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242 }
     *     
     */
    public Obligation11 setPtyB(PartyIdentification242 value) {
        this.ptyB = value;
        return this;
    }

    /**
     * Gets the value of the svcgPtyB property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public PartyIdentification178Choice getSvcgPtyB() {
        return svcgPtyB;
    }

    /**
     * Sets the value of the svcgPtyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public Obligation11 setSvcgPtyB(PartyIdentification178Choice value) {
        this.svcgPtyB = value;
        return this;
    }

    /**
     * Gets the value of the collAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAccount3 }
     *     
     */
    public CollateralAccount3 getCollAcctId() {
        return collAcctId;
    }

    /**
     * Sets the value of the collAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAccount3 }
     *     
     */
    public Obligation11 setCollAcctId(CollateralAccount3 value) {
        this.collAcctId = value;
        return this;
    }

    /**
     * Gets the value of the blckChainAdrOrWllt property.
     * 
     * @return
     *     possible object is
     *     {@link BlockChainAddressWallet5 }
     *     
     */
    public BlockChainAddressWallet5 getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Sets the value of the blckChainAdrOrWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockChainAddressWallet5 }
     *     
     */
    public Obligation11 setBlckChainAdrOrWllt(BlockChainAddressWallet5 value) {
        this.blckChainAdrOrWllt = value;
        return this;
    }

    /**
     * Gets the value of the xpsrTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType11Code }
     *     
     */
    public ExposureType11Code getXpsrTp() {
        return xpsrTp;
    }

    /**
     * Sets the value of the xpsrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType11Code }
     *     
     */
    public Obligation11 setXpsrTp(ExposureType11Code value) {
        this.xpsrTp = value;
        return this;
    }

    /**
     * Gets the value of the valtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getValtnDt() {
        return valtnDt;
    }

    /**
     * Sets the value of the valtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public Obligation11 setValtnDt(DateAndDateTime2Choice value) {
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
