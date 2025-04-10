
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of the financial instrument removal request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestDetails28", propOrder = {
    "rmvl",
    "finInstrmAndAttrbts",
    "ctrPty",
    "sfkpgAcct",
    "blckChainAdrOrWllt",
    "ref"
})
public class RequestDetails28 {

    @XmlElement(name = "Rmvl", required = true)
    protected RemovalTypeAndReason1 rmvl;
    @XmlElement(name = "FinInstrmAndAttrbts")
    protected List<RemovalProcessing2Choice> finInstrmAndAttrbts;
    @XmlElement(name = "CtrPty")
    protected CollateralParties4 ctrPty;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet3 blckChainAdrOrWllt;
    @XmlElement(name = "Ref")
    protected Reference21 ref;

    /**
     * Gets the value of the rmvl property.
     * 
     * @return
     *     possible object is
     *     {@link RemovalTypeAndReason1 }
     *     
     */
    public RemovalTypeAndReason1 getRmvl() {
        return rmvl;
    }

    /**
     * Sets the value of the rmvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemovalTypeAndReason1 }
     *     
     */
    public RequestDetails28 setRmvl(RemovalTypeAndReason1 value) {
        this.rmvl = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmAndAttrbts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finInstrmAndAttrbts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmAndAttrbts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemovalProcessing2Choice }
     * 
     * 
     * @return
     *     The value of the finInstrmAndAttrbts property.
     */
    public List<RemovalProcessing2Choice> getFinInstrmAndAttrbts() {
        if (finInstrmAndAttrbts == null) {
            finInstrmAndAttrbts = new ArrayList<>();
        }
        return this.finInstrmAndAttrbts;
    }

    /**
     * Gets the value of the ctrPty property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralParties4 }
     *     
     */
    public CollateralParties4 getCtrPty() {
        return ctrPty;
    }

    /**
     * Sets the value of the ctrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralParties4 }
     *     
     */
    public RequestDetails28 setCtrPty(CollateralParties4 value) {
        this.ctrPty = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public RequestDetails28 setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
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
    public RequestDetails28 setBlckChainAdrOrWllt(BlockChainAddressWallet3 value) {
        this.blckChainAdrOrWllt = value;
        return this;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link Reference21 }
     *     
     */
    public Reference21 getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference21 }
     *     
     */
    public RequestDetails28 setRef(Reference21 value) {
        this.ref = value;
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

    /**
     * Adds a new item to the finInstrmAndAttrbts list.
     * @see #getFinInstrmAndAttrbts()
     * 
     */
    public RequestDetails28 addFinInstrmAndAttrbts(RemovalProcessing2Choice finInstrmAndAttrbts) {
        getFinInstrmAndAttrbts().add(finInstrmAndAttrbts);
        return this;
    }

}
