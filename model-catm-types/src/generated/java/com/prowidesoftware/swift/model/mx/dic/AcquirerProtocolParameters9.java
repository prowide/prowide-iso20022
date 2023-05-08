
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Acceptor parameters dedicated to the acquirer protocol.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcquirerProtocolParameters9", propOrder = {
    "actnTp",
    "acqrrId",
    "vrsn",
    "applId",
    "hst",
    "onLineTx",
    "offLineTx",
    "rcncltnXchg",
    "rcncltnByAcqrr",
    "ttlsPerCcy",
    "spltTtls",
    "rcncltnErr",
    "cardDataVrfctn",
    "ntfyOffLineCxl",
    "btchTrfCntt",
    "fileTrfBtch",
    "btchDgtlSgntr",
    "msgItm",
    "prtctCardData",
    "mndtrySctyTrlr"
})
public class AcquirerProtocolParameters9 {

    @XmlElement(name = "ActnTp", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementAction3Code actnTp;
    @XmlElement(name = "AcqrrId", required = true)
    protected List<GenericIdentification53> acqrrId;
    @XmlElement(name = "Vrsn", required = true)
    protected String vrsn;
    @XmlElement(name = "ApplId")
    protected List<String> applId;
    @XmlElement(name = "Hst")
    protected List<AcquirerHostConfiguration3> hst;
    @XmlElement(name = "OnLineTx")
    protected AcquirerProtocolParameters8 onLineTx;
    @XmlElement(name = "OffLineTx")
    protected AcquirerProtocolParameters8 offLineTx;
    @XmlElement(name = "RcncltnXchg")
    protected ExchangeConfiguration6 rcncltnXchg;
    @XmlElement(name = "RcncltnByAcqrr")
    protected Boolean rcncltnByAcqrr;
    @XmlElement(name = "TtlsPerCcy")
    protected Boolean ttlsPerCcy;
    @XmlElement(name = "SpltTtls")
    protected Boolean spltTtls;
    @XmlElement(name = "RcncltnErr")
    protected Boolean rcncltnErr;
    @XmlElement(name = "CardDataVrfctn")
    protected Boolean cardDataVrfctn;
    @XmlElement(name = "NtfyOffLineCxl")
    protected Boolean ntfyOffLineCxl;
    @XmlElement(name = "BtchTrfCntt")
    @XmlSchemaType(name = "string")
    protected List<BatchTransactionType1Code> btchTrfCntt;
    @XmlElement(name = "FileTrfBtch")
    protected Boolean fileTrfBtch;
    @XmlElement(name = "BtchDgtlSgntr")
    protected Boolean btchDgtlSgntr;
    @XmlElement(name = "MsgItm")
    protected List<MessageItemCondition1> msgItm;
    @XmlElement(name = "PrtctCardData")
    protected boolean prtctCardData;
    @XmlElement(name = "MndtrySctyTrlr")
    protected Boolean mndtrySctyTrlr;

    /**
     * Gets the value of the actnTp property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public TerminalManagementAction3Code getActnTp() {
        return actnTp;
    }

    /**
     * Sets the value of the actnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public AcquirerProtocolParameters9 setActnTp(TerminalManagementAction3Code value) {
        this.actnTp = value;
        return this;
    }

    /**
     * Gets the value of the acqrrId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acqrrId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcqrrId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification53 }
     * 
     * 
     * @return
     *     The value of the acqrrId property.
     */
    public List<GenericIdentification53> getAcqrrId() {
        if (acqrrId == null) {
            acqrrId = new ArrayList<>();
        }
        return this.acqrrId;
    }

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AcquirerProtocolParameters9 setVrsn(String value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the applId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the applId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the applId property.
     */
    public List<String> getApplId() {
        if (applId == null) {
            applId = new ArrayList<>();
        }
        return this.applId;
    }

    /**
     * Gets the value of the hst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the hst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcquirerHostConfiguration3 }
     * 
     * 
     * @return
     *     The value of the hst property.
     */
    public List<AcquirerHostConfiguration3> getHst() {
        if (hst == null) {
            hst = new ArrayList<>();
        }
        return this.hst;
    }

    /**
     * Gets the value of the onLineTx property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerProtocolParameters8 }
     *     
     */
    public AcquirerProtocolParameters8 getOnLineTx() {
        return onLineTx;
    }

    /**
     * Sets the value of the onLineTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerProtocolParameters8 }
     *     
     */
    public AcquirerProtocolParameters9 setOnLineTx(AcquirerProtocolParameters8 value) {
        this.onLineTx = value;
        return this;
    }

    /**
     * Gets the value of the offLineTx property.
     * 
     * @return
     *     possible object is
     *     {@link AcquirerProtocolParameters8 }
     *     
     */
    public AcquirerProtocolParameters8 getOffLineTx() {
        return offLineTx;
    }

    /**
     * Sets the value of the offLineTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcquirerProtocolParameters8 }
     *     
     */
    public AcquirerProtocolParameters9 setOffLineTx(AcquirerProtocolParameters8 value) {
        this.offLineTx = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnXchg property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeConfiguration6 }
     *     
     */
    public ExchangeConfiguration6 getRcncltnXchg() {
        return rcncltnXchg;
    }

    /**
     * Sets the value of the rcncltnXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeConfiguration6 }
     *     
     */
    public AcquirerProtocolParameters9 setRcncltnXchg(ExchangeConfiguration6 value) {
        this.rcncltnXchg = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnByAcqrr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRcncltnByAcqrr() {
        return rcncltnByAcqrr;
    }

    /**
     * Sets the value of the rcncltnByAcqrr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AcquirerProtocolParameters9 setRcncltnByAcqrr(Boolean value) {
        this.rcncltnByAcqrr = value;
        return this;
    }

    /**
     * Gets the value of the ttlsPerCcy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTtlsPerCcy() {
        return ttlsPerCcy;
    }

    /**
     * Sets the value of the ttlsPerCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AcquirerProtocolParameters9 setTtlsPerCcy(Boolean value) {
        this.ttlsPerCcy = value;
        return this;
    }

    /**
     * Gets the value of the spltTtls property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpltTtls() {
        return spltTtls;
    }

    /**
     * Sets the value of the spltTtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AcquirerProtocolParameters9 setSpltTtls(Boolean value) {
        this.spltTtls = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnErr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRcncltnErr() {
        return rcncltnErr;
    }

    /**
     * Sets the value of the rcncltnErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AcquirerProtocolParameters9 setRcncltnErr(Boolean value) {
        this.rcncltnErr = value;
        return this;
    }

    /**
     * Gets the value of the cardDataVrfctn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardDataVrfctn() {
        return cardDataVrfctn;
    }

    /**
     * Sets the value of the cardDataVrfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AcquirerProtocolParameters9 setCardDataVrfctn(Boolean value) {
        this.cardDataVrfctn = value;
        return this;
    }

    /**
     * Gets the value of the ntfyOffLineCxl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNtfyOffLineCxl() {
        return ntfyOffLineCxl;
    }

    /**
     * Sets the value of the ntfyOffLineCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AcquirerProtocolParameters9 setNtfyOffLineCxl(Boolean value) {
        this.ntfyOffLineCxl = value;
        return this;
    }

    /**
     * Gets the value of the btchTrfCntt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the btchTrfCntt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBtchTrfCntt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchTransactionType1Code }
     * 
     * 
     * @return
     *     The value of the btchTrfCntt property.
     */
    public List<BatchTransactionType1Code> getBtchTrfCntt() {
        if (btchTrfCntt == null) {
            btchTrfCntt = new ArrayList<>();
        }
        return this.btchTrfCntt;
    }

    /**
     * Gets the value of the fileTrfBtch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFileTrfBtch() {
        return fileTrfBtch;
    }

    /**
     * Sets the value of the fileTrfBtch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AcquirerProtocolParameters9 setFileTrfBtch(Boolean value) {
        this.fileTrfBtch = value;
        return this;
    }

    /**
     * Gets the value of the btchDgtlSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBtchDgtlSgntr() {
        return btchDgtlSgntr;
    }

    /**
     * Sets the value of the btchDgtlSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AcquirerProtocolParameters9 setBtchDgtlSgntr(Boolean value) {
        this.btchDgtlSgntr = value;
        return this;
    }

    /**
     * Gets the value of the msgItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the msgItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageItemCondition1 }
     * 
     * 
     * @return
     *     The value of the msgItm property.
     */
    public List<MessageItemCondition1> getMsgItm() {
        if (msgItm == null) {
            msgItm = new ArrayList<>();
        }
        return this.msgItm;
    }

    /**
     * Gets the value of the prtctCardData property.
     * 
     */
    public boolean isPrtctCardData() {
        return prtctCardData;
    }

    /**
     * Sets the value of the prtctCardData property.
     * 
     */
    public AcquirerProtocolParameters9 setPrtctCardData(boolean value) {
        this.prtctCardData = value;
        return this;
    }

    /**
     * Gets the value of the mndtrySctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMndtrySctyTrlr() {
        return mndtrySctyTrlr;
    }

    /**
     * Sets the value of the mndtrySctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AcquirerProtocolParameters9 setMndtrySctyTrlr(Boolean value) {
        this.mndtrySctyTrlr = value;
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
     * Adds a new item to the acqrrId list.
     * @see #getAcqrrId()
     * 
     */
    public AcquirerProtocolParameters9 addAcqrrId(GenericIdentification53 acqrrId) {
        getAcqrrId().add(acqrrId);
        return this;
    }

    /**
     * Adds a new item to the applId list.
     * @see #getApplId()
     * 
     */
    public AcquirerProtocolParameters9 addApplId(String applId) {
        getApplId().add(applId);
        return this;
    }

    /**
     * Adds a new item to the hst list.
     * @see #getHst()
     * 
     */
    public AcquirerProtocolParameters9 addHst(AcquirerHostConfiguration3 hst) {
        getHst().add(hst);
        return this;
    }

    /**
     * Adds a new item to the btchTrfCntt list.
     * @see #getBtchTrfCntt()
     * 
     */
    public AcquirerProtocolParameters9 addBtchTrfCntt(BatchTransactionType1Code btchTrfCntt) {
        getBtchTrfCntt().add(btchTrfCntt);
        return this;
    }

    /**
     * Adds a new item to the msgItm list.
     * @see #getMsgItm()
     * 
     */
    public AcquirerProtocolParameters9 addMsgItm(MessageItemCondition1 msgItm) {
        getMsgItm().add(msgItm);
        return this;
    }

}
