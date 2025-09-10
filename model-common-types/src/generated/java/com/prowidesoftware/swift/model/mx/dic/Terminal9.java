
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Payment terminal or ATM performing the transaction
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Terminal9", propOrder = {
    "id",
    "addtlId",
    "tp",
    "othrTp",
    "rdngCpblty",
    "wrtgCpblty",
    "pinLngthCpblty",
    "pinNtrySctyChrtc",
    "othrPINNtrySctyChrtc",
    "apprvlCdLngth",
    "mxScrptLngth",
    "cardCaptrCpbl",
    "onLineCpblty",
    "msgCpblty",
    "crdhldrVrfctnCpblty",
    "tempScrStorg",
    "intgtnTp",
    "geogcLctn",
    "outdr",
    "offPrmiss",
    "onBrd",
    "srlNb",
    "sftwr",
    "certfctnId"
})
public class Terminal9 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "AddtlId")
    protected List<AdditionalData1> addtlId;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected TerminalType1Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "RdngCpblty")
    protected List<CardReadingCapabilities1> rdngCpblty;
    @XmlElement(name = "WrtgCpblty")
    protected List<CardWritingCapabilities1> wrtgCpblty;
    @XmlElement(name = "PINLngthCpblty")
    protected BigDecimal pinLngthCpblty;
    @XmlElement(name = "PINNtrySctyChrtc")
    @XmlSchemaType(name = "string")
    protected PINEntrySecurityCharacteristic1Code pinNtrySctyChrtc;
    @XmlElement(name = "OthrPINNtrySctyChrtc")
    protected String othrPINNtrySctyChrtc;
    @XmlElement(name = "ApprvlCdLngth")
    protected BigDecimal apprvlCdLngth;
    @XmlElement(name = "MxScrptLngth")
    protected BigDecimal mxScrptLngth;
    @XmlElement(name = "CardCaptrCpbl")
    protected Boolean cardCaptrCpbl;
    @XmlElement(name = "OnLineCpblty")
    @XmlSchemaType(name = "string")
    protected OnLineCapability2Code onLineCpblty;
    @XmlElement(name = "MsgCpblty")
    protected List<DisplayCapabilities6> msgCpblty;
    @XmlElement(name = "CrdhldrVrfctnCpblty")
    protected List<CardholderVerificationCapabilities1> crdhldrVrfctnCpblty;
    @XmlElement(name = "TempScrStorg")
    protected Boolean tempScrStorg;
    @XmlElement(name = "IntgtnTp")
    @XmlSchemaType(name = "string")
    protected TerminalIntegrationCategory1Code intgtnTp;
    @XmlElement(name = "GeogcLctn")
    protected String geogcLctn;
    @XmlElement(name = "Outdr")
    protected Boolean outdr;
    @XmlElement(name = "OffPrmiss")
    protected Boolean offPrmiss;
    @XmlElement(name = "OnBrd")
    protected Boolean onBrd;
    @XmlElement(name = "SrlNb")
    protected String srlNb;
    @XmlElement(name = "Sftwr")
    protected List<Software1> sftwr;
    @XmlElement(name = "CertfctnId")
    protected String certfctnId;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Terminal9 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the addtlId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlId property.
     */
    public List<AdditionalData1> getAddtlId() {
        if (addtlId == null) {
            addtlId = new ArrayList<>();
        }
        return this.addtlId;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalType1Code }
     *     
     */
    public TerminalType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalType1Code }
     *     
     */
    public Terminal9 setTp(TerminalType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the othrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Sets the value of the othrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Terminal9 setOthrTp(String value) {
        this.othrTp = value;
        return this;
    }

    /**
     * Gets the value of the rdngCpblty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rdngCpblty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRdngCpblty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardReadingCapabilities1 }
     * 
     * 
     * @return
     *     The value of the rdngCpblty property.
     */
    public List<CardReadingCapabilities1> getRdngCpblty() {
        if (rdngCpblty == null) {
            rdngCpblty = new ArrayList<>();
        }
        return this.rdngCpblty;
    }

    /**
     * Gets the value of the wrtgCpblty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the wrtgCpblty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWrtgCpblty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardWritingCapabilities1 }
     * 
     * 
     * @return
     *     The value of the wrtgCpblty property.
     */
    public List<CardWritingCapabilities1> getWrtgCpblty() {
        if (wrtgCpblty == null) {
            wrtgCpblty = new ArrayList<>();
        }
        return this.wrtgCpblty;
    }

    /**
     * Gets the value of the pinLngthCpblty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPINLngthCpblty() {
        return pinLngthCpblty;
    }

    /**
     * Sets the value of the pinLngthCpblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Terminal9 setPINLngthCpblty(BigDecimal value) {
        this.pinLngthCpblty = value;
        return this;
    }

    /**
     * Gets the value of the pinNtrySctyChrtc property.
     * 
     * @return
     *     possible object is
     *     {@link PINEntrySecurityCharacteristic1Code }
     *     
     */
    public PINEntrySecurityCharacteristic1Code getPINNtrySctyChrtc() {
        return pinNtrySctyChrtc;
    }

    /**
     * Sets the value of the pinNtrySctyChrtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PINEntrySecurityCharacteristic1Code }
     *     
     */
    public Terminal9 setPINNtrySctyChrtc(PINEntrySecurityCharacteristic1Code value) {
        this.pinNtrySctyChrtc = value;
        return this;
    }

    /**
     * Gets the value of the othrPINNtrySctyChrtc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrPINNtrySctyChrtc() {
        return othrPINNtrySctyChrtc;
    }

    /**
     * Sets the value of the othrPINNtrySctyChrtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Terminal9 setOthrPINNtrySctyChrtc(String value) {
        this.othrPINNtrySctyChrtc = value;
        return this;
    }

    /**
     * Gets the value of the apprvlCdLngth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApprvlCdLngth() {
        return apprvlCdLngth;
    }

    /**
     * Sets the value of the apprvlCdLngth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Terminal9 setApprvlCdLngth(BigDecimal value) {
        this.apprvlCdLngth = value;
        return this;
    }

    /**
     * Gets the value of the mxScrptLngth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMxScrptLngth() {
        return mxScrptLngth;
    }

    /**
     * Sets the value of the mxScrptLngth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Terminal9 setMxScrptLngth(BigDecimal value) {
        this.mxScrptLngth = value;
        return this;
    }

    /**
     * Gets the value of the cardCaptrCpbl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardCaptrCpbl() {
        return cardCaptrCpbl;
    }

    /**
     * Sets the value of the cardCaptrCpbl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Terminal9 setCardCaptrCpbl(Boolean value) {
        this.cardCaptrCpbl = value;
        return this;
    }

    /**
     * Gets the value of the onLineCpblty property.
     * 
     * @return
     *     possible object is
     *     {@link OnLineCapability2Code }
     *     
     */
    public OnLineCapability2Code getOnLineCpblty() {
        return onLineCpblty;
    }

    /**
     * Sets the value of the onLineCpblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnLineCapability2Code }
     *     
     */
    public Terminal9 setOnLineCpblty(OnLineCapability2Code value) {
        this.onLineCpblty = value;
        return this;
    }

    /**
     * Gets the value of the msgCpblty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the msgCpblty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgCpblty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisplayCapabilities6 }
     * 
     * 
     * @return
     *     The value of the msgCpblty property.
     */
    public List<DisplayCapabilities6> getMsgCpblty() {
        if (msgCpblty == null) {
            msgCpblty = new ArrayList<>();
        }
        return this.msgCpblty;
    }

    /**
     * Gets the value of the crdhldrVrfctnCpblty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the crdhldrVrfctnCpblty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrdhldrVrfctnCpblty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardholderVerificationCapabilities1 }
     * 
     * 
     * @return
     *     The value of the crdhldrVrfctnCpblty property.
     */
    public List<CardholderVerificationCapabilities1> getCrdhldrVrfctnCpblty() {
        if (crdhldrVrfctnCpblty == null) {
            crdhldrVrfctnCpblty = new ArrayList<>();
        }
        return this.crdhldrVrfctnCpblty;
    }

    /**
     * Gets the value of the tempScrStorg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTempScrStorg() {
        return tempScrStorg;
    }

    /**
     * Sets the value of the tempScrStorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Terminal9 setTempScrStorg(Boolean value) {
        this.tempScrStorg = value;
        return this;
    }

    /**
     * Gets the value of the intgtnTp property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalIntegrationCategory1Code }
     *     
     */
    public TerminalIntegrationCategory1Code getIntgtnTp() {
        return intgtnTp;
    }

    /**
     * Sets the value of the intgtnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalIntegrationCategory1Code }
     *     
     */
    public Terminal9 setIntgtnTp(TerminalIntegrationCategory1Code value) {
        this.intgtnTp = value;
        return this;
    }

    /**
     * Gets the value of the geogcLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeogcLctn() {
        return geogcLctn;
    }

    /**
     * Sets the value of the geogcLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Terminal9 setGeogcLctn(String value) {
        this.geogcLctn = value;
        return this;
    }

    /**
     * Gets the value of the outdr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutdr() {
        return outdr;
    }

    /**
     * Sets the value of the outdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Terminal9 setOutdr(Boolean value) {
        this.outdr = value;
        return this;
    }

    /**
     * Gets the value of the offPrmiss property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOffPrmiss() {
        return offPrmiss;
    }

    /**
     * Sets the value of the offPrmiss property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Terminal9 setOffPrmiss(Boolean value) {
        this.offPrmiss = value;
        return this;
    }

    /**
     * Gets the value of the onBrd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnBrd() {
        return onBrd;
    }

    /**
     * Sets the value of the onBrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Terminal9 setOnBrd(Boolean value) {
        this.onBrd = value;
        return this;
    }

    /**
     * Gets the value of the srlNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrlNb() {
        return srlNb;
    }

    /**
     * Sets the value of the srlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Terminal9 setSrlNb(String value) {
        this.srlNb = value;
        return this;
    }

    /**
     * Gets the value of the sftwr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sftwr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSftwr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Software1 }
     * 
     * 
     * @return
     *     The value of the sftwr property.
     */
    public List<Software1> getSftwr() {
        if (sftwr == null) {
            sftwr = new ArrayList<>();
        }
        return this.sftwr;
    }

    /**
     * Gets the value of the certfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertfctnId() {
        return certfctnId;
    }

    /**
     * Sets the value of the certfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Terminal9 setCertfctnId(String value) {
        this.certfctnId = value;
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
     * Adds a new item to the addtlId list.
     * @see #getAddtlId()
     * 
     */
    public Terminal9 addAddtlId(AdditionalData1 addtlId) {
        getAddtlId().add(addtlId);
        return this;
    }

    /**
     * Adds a new item to the rdngCpblty list.
     * @see #getRdngCpblty()
     * 
     */
    public Terminal9 addRdngCpblty(CardReadingCapabilities1 rdngCpblty) {
        getRdngCpblty().add(rdngCpblty);
        return this;
    }

    /**
     * Adds a new item to the wrtgCpblty list.
     * @see #getWrtgCpblty()
     * 
     */
    public Terminal9 addWrtgCpblty(CardWritingCapabilities1 wrtgCpblty) {
        getWrtgCpblty().add(wrtgCpblty);
        return this;
    }

    /**
     * Adds a new item to the msgCpblty list.
     * @see #getMsgCpblty()
     * 
     */
    public Terminal9 addMsgCpblty(DisplayCapabilities6 msgCpblty) {
        getMsgCpblty().add(msgCpblty);
        return this;
    }

    /**
     * Adds a new item to the crdhldrVrfctnCpblty list.
     * @see #getCrdhldrVrfctnCpblty()
     * 
     */
    public Terminal9 addCrdhldrVrfctnCpblty(CardholderVerificationCapabilities1 crdhldrVrfctnCpblty) {
        getCrdhldrVrfctnCpblty().add(crdhldrVrfctnCpblty);
        return this;
    }

    /**
     * Adds a new item to the sftwr list.
     * @see #getSftwr()
     * 
     */
    public Terminal9 addSftwr(Software1 sftwr) {
        getSftwr().add(sftwr);
        return this;
    }

}
