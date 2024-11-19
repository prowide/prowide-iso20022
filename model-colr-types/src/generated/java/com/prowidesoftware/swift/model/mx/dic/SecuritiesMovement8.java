
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
 * Movements of securities.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesMovement8", propOrder = {
    "sctiesMvmntTp",
    "finInstrmId",
    "sctiesQty",
    "mvmntSts",
    "collMvmnt",
    "sctiesMvmntsApprvd",
    "posTp",
    "sfkpgAcct",
    "blckChainAdrOrWllt",
    "clntSctiesMvmntId",
    "trptyAgtSvcPrvdrSctiesMvmntId",
    "mrgndVal"
})
public class SecuritiesMovement8 {

    @XmlElement(name = "SctiesMvmntTp", required = true)
    @XmlSchemaType(name = "string")
    protected ReceiveDelivery1Code sctiesMvmntTp;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "SctiesQty", required = true)
    protected Quantity51Choice sctiesQty;
    @XmlElement(name = "MvmntSts")
    protected SecuritiesMovementStatus1Choice mvmntSts;
    @XmlElement(name = "CollMvmnt")
    protected boolean collMvmnt;
    @XmlElement(name = "SctiesMvmntsApprvd")
    protected Boolean sctiesMvmntsApprvd;
    @XmlElement(name = "PosTp")
    protected Boolean posTp;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet3 blckChainAdrOrWllt;
    @XmlElement(name = "ClntSctiesMvmntId")
    protected String clntSctiesMvmntId;
    @XmlElement(name = "TrptyAgtSvcPrvdrSctiesMvmntId")
    protected String trptyAgtSvcPrvdrSctiesMvmntId;
    @XmlElement(name = "MrgndVal")
    protected AmountAndDirection44 mrgndVal;

    /**
     * Gets the value of the sctiesMvmntTp property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiveDelivery1Code }
     *     
     */
    public ReceiveDelivery1Code getSctiesMvmntTp() {
        return sctiesMvmntTp;
    }

    /**
     * Sets the value of the sctiesMvmntTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiveDelivery1Code }
     *     
     */
    public SecuritiesMovement8 setSctiesMvmntTp(ReceiveDelivery1Code value) {
        this.sctiesMvmntTp = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecuritiesMovement8 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the sctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity51Choice }
     *     
     */
    public Quantity51Choice getSctiesQty() {
        return sctiesQty;
    }

    /**
     * Sets the value of the sctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity51Choice }
     *     
     */
    public SecuritiesMovement8 setSctiesQty(Quantity51Choice value) {
        this.sctiesQty = value;
        return this;
    }

    /**
     * Gets the value of the mvmntSts property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesMovementStatus1Choice }
     *     
     */
    public SecuritiesMovementStatus1Choice getMvmntSts() {
        return mvmntSts;
    }

    /**
     * Sets the value of the mvmntSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesMovementStatus1Choice }
     *     
     */
    public SecuritiesMovement8 setMvmntSts(SecuritiesMovementStatus1Choice value) {
        this.mvmntSts = value;
        return this;
    }

    /**
     * Gets the value of the collMvmnt property.
     * 
     */
    public boolean isCollMvmnt() {
        return collMvmnt;
    }

    /**
     * Sets the value of the collMvmnt property.
     * 
     */
    public SecuritiesMovement8 setCollMvmnt(boolean value) {
        this.collMvmnt = value;
        return this;
    }

    /**
     * Gets the value of the sctiesMvmntsApprvd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSctiesMvmntsApprvd() {
        return sctiesMvmntsApprvd;
    }

    /**
     * Sets the value of the sctiesMvmntsApprvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesMovement8 setSctiesMvmntsApprvd(Boolean value) {
        this.sctiesMvmntsApprvd = value;
        return this;
    }

    /**
     * Gets the value of the posTp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPosTp() {
        return posTp;
    }

    /**
     * Sets the value of the posTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public SecuritiesMovement8 setPosTp(Boolean value) {
        this.posTp = value;
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
    public SecuritiesMovement8 setSfkpgAcct(SecuritiesAccount19 value) {
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
    public SecuritiesMovement8 setBlckChainAdrOrWllt(BlockChainAddressWallet3 value) {
        this.blckChainAdrOrWllt = value;
        return this;
    }

    /**
     * Gets the value of the clntSctiesMvmntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntSctiesMvmntId() {
        return clntSctiesMvmntId;
    }

    /**
     * Sets the value of the clntSctiesMvmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesMovement8 setClntSctiesMvmntId(String value) {
        this.clntSctiesMvmntId = value;
        return this;
    }

    /**
     * Gets the value of the trptyAgtSvcPrvdrSctiesMvmntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyAgtSvcPrvdrSctiesMvmntId() {
        return trptyAgtSvcPrvdrSctiesMvmntId;
    }

    /**
     * Sets the value of the trptyAgtSvcPrvdrSctiesMvmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesMovement8 setTrptyAgtSvcPrvdrSctiesMvmntId(String value) {
        this.trptyAgtSvcPrvdrSctiesMvmntId = value;
        return this;
    }

    /**
     * Gets the value of the mrgndVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getMrgndVal() {
        return mrgndVal;
    }

    /**
     * Sets the value of the mrgndVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public SecuritiesMovement8 setMrgndVal(AmountAndDirection44 value) {
        this.mrgndVal = value;
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
