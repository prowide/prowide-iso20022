
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Identifies the chain of collateral parties of counterparty of Party A.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralParties11", propOrder = {
    "ptyB",
    "clntPtyB",
    "trptyAgt",
    "collAcct",
    "blckChainAdrOrWllt"
})
public class CollateralParties11 {

    @XmlElement(name = "PtyB", required = true)
    protected PartyIdentification232 ptyB;
    @XmlElement(name = "ClntPtyB")
    protected PartyIdentification232 clntPtyB;
    @XmlElement(name = "TrptyAgt")
    protected PartyIdentification136 trptyAgt;
    @XmlElement(name = "CollAcct")
    protected SecuritiesAccount19 collAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet3 blckChainAdrOrWllt;

    /**
     * Gets the value of the ptyB property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification232 }
     *     
     */
    public PartyIdentification232 getPtyB() {
        return ptyB;
    }

    /**
     * Sets the value of the ptyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification232 }
     *     
     */
    public CollateralParties11 setPtyB(PartyIdentification232 value) {
        this.ptyB = value;
        return this;
    }

    /**
     * Gets the value of the clntPtyB property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification232 }
     *     
     */
    public PartyIdentification232 getClntPtyB() {
        return clntPtyB;
    }

    /**
     * Sets the value of the clntPtyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification232 }
     *     
     */
    public CollateralParties11 setClntPtyB(PartyIdentification232 value) {
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
    public CollateralParties11 setTrptyAgt(PartyIdentification136 value) {
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
    public CollateralParties11 setCollAcct(SecuritiesAccount19 value) {
        this.collAcct = value;
        return this;
    }

    /**
     * Gets the value of the blckChainAdrOrWllt property.
     * 
     * @return
     *     possible object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public BlockChainAddressWallet3 getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Sets the value of the blckChainAdrOrWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public CollateralParties11 setBlckChainAdrOrWllt(BlockChainAddressWallet3 value) {
        this.blckChainAdrOrWllt = value;
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
