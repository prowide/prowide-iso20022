
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
@XmlType(name = "Obligation9", propOrder = {
    "ptyA",
    "svcgPtyA",
    "ptyB",
    "svcgPtyB",
    "collAcctId",
    "blckChainAdrOrWllt",
    "xpsrTp",
    "valtnDt"
})
public class Obligation9 {

    @XmlElement(name = "PtyA", required = true)
    protected PartyIdentification178Choice ptyA;
    @XmlElement(name = "SvcgPtyA")
    protected PartyIdentification178Choice svcgPtyA;
    @XmlElement(name = "PtyB", required = true)
    protected PartyIdentification178Choice ptyB;
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
     *     {@link PartyIdentification178Choice }
     *     
     */
    public PartyIdentification178Choice getPtyA() {
        return ptyA;
    }

    /**
     * Sets the value of the ptyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public Obligation9 setPtyA(PartyIdentification178Choice value) {
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
    public Obligation9 setSvcgPtyA(PartyIdentification178Choice value) {
        this.svcgPtyA = value;
        return this;
    }

    /**
     * Gets the value of the ptyB property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public PartyIdentification178Choice getPtyB() {
        return ptyB;
    }

    /**
     * Sets the value of the ptyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public Obligation9 setPtyB(PartyIdentification178Choice value) {
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
    public Obligation9 setSvcgPtyB(PartyIdentification178Choice value) {
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
    public Obligation9 setCollAcctId(CollateralAccount3 value) {
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
    public Obligation9 setBlckChainAdrOrWllt(BlockChainAddressWallet5 value) {
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
    public Obligation9 setXpsrTp(ExposureType11Code value) {
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
    public Obligation9 setValtnDt(DateAndDateTime2Choice value) {
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
