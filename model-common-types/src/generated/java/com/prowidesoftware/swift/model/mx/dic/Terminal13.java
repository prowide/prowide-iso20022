
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
@XmlType(name = "Terminal13", propOrder = {
    "id",
    "tp",
    "subTp",
    "rdngCpblty",
    "wrtgCpblty",
    "pinLngthCpblty",
    "pinNtrySctyChrtc",
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
    "certfctnId",
    "ctry",
    "prvtData",
    "ntlData"
})
public class Terminal13 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected TerminalType2Code tp;
    @XmlElement(name = "SubTp")
    protected String subTp;
    @XmlElement(name = "RdngCpblty")
    @XmlSchemaType(name = "string")
    protected List<CardDataReading11Code> rdngCpblty;
    @XmlElement(name = "WrtgCpblty")
    @XmlSchemaType(name = "string")
    protected List<CardDataWriting2Code> wrtgCpblty;
    @XmlElement(name = "PINLngthCpblty")
    protected BigDecimal pinLngthCpblty;
    @XmlElement(name = "PINNtrySctyChrtc")
    protected String pinNtrySctyChrtc;
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
    @XmlSchemaType(name = "string")
    protected List<CardholderVerificationCapability6Code> crdhldrVrfctnCpblty;
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
    protected List<Software2> sftwr;
    @XmlElement(name = "CertfctnId")
    protected String certfctnId;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "PrvtData")
    protected List<ATICALaxProcessing> prvtData;
    @XmlElement(name = "NtlData")
    protected List<ATICALaxProcessing> ntlData;

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
    public Terminal13 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalType2Code }
     *     
     */
    public TerminalType2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalType2Code }
     *     
     */
    public Terminal13 setTp(TerminalType2Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the subTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTp() {
        return subTp;
    }

    /**
     * Sets the value of the subTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Terminal13 setSubTp(String value) {
        this.subTp = value;
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
     * {@link CardDataReading11Code }
     * 
     * 
     * @return
     *     The value of the rdngCpblty property.
     */
    public List<CardDataReading11Code> getRdngCpblty() {
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
     * {@link CardDataWriting2Code }
     * 
     * 
     * @return
     *     The value of the wrtgCpblty property.
     */
    public List<CardDataWriting2Code> getWrtgCpblty() {
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
    public Terminal13 setPINLngthCpblty(BigDecimal value) {
        this.pinLngthCpblty = value;
        return this;
    }

    /**
     * Gets the value of the pinNtrySctyChrtc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPINNtrySctyChrtc() {
        return pinNtrySctyChrtc;
    }

    /**
     * Sets the value of the pinNtrySctyChrtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Terminal13 setPINNtrySctyChrtc(String value) {
        this.pinNtrySctyChrtc = value;
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
    public Terminal13 setApprvlCdLngth(BigDecimal value) {
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
    public Terminal13 setMxScrptLngth(BigDecimal value) {
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
    public Terminal13 setCardCaptrCpbl(Boolean value) {
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
    public Terminal13 setOnLineCpblty(OnLineCapability2Code value) {
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
     * {@link CardholderVerificationCapability6Code }
     * 
     * 
     * @return
     *     The value of the crdhldrVrfctnCpblty property.
     */
    public List<CardholderVerificationCapability6Code> getCrdhldrVrfctnCpblty() {
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
    public Terminal13 setTempScrStorg(Boolean value) {
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
    public Terminal13 setIntgtnTp(TerminalIntegrationCategory1Code value) {
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
    public Terminal13 setGeogcLctn(String value) {
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
    public Terminal13 setOutdr(Boolean value) {
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
    public Terminal13 setOffPrmiss(Boolean value) {
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
    public Terminal13 setOnBrd(Boolean value) {
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
    public Terminal13 setSrlNb(String value) {
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
     * {@link Software2 }
     * 
     * 
     * @return
     *     The value of the sftwr property.
     */
    public List<Software2> getSftwr() {
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
    public Terminal13 setCertfctnId(String value) {
        this.certfctnId = value;
        return this;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Terminal13 setCtry(String value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the prvtData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prvtData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrvtData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the prvtData property.
     */
    public List<ATICALaxProcessing> getPrvtData() {
        if (prvtData == null) {
            prvtData = new ArrayList<>();
        }
        return this.prvtData;
    }

    /**
     * Gets the value of the ntlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATICALaxProcessing }
     * 
     * 
     * @return
     *     The value of the ntlData property.
     */
    public List<ATICALaxProcessing> getNtlData() {
        if (ntlData == null) {
            ntlData = new ArrayList<>();
        }
        return this.ntlData;
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
     * Adds a new item to the rdngCpblty list.
     * @see #getRdngCpblty()
     * 
     */
    public Terminal13 addRdngCpblty(CardDataReading11Code rdngCpblty) {
        getRdngCpblty().add(rdngCpblty);
        return this;
    }

    /**
     * Adds a new item to the wrtgCpblty list.
     * @see #getWrtgCpblty()
     * 
     */
    public Terminal13 addWrtgCpblty(CardDataWriting2Code wrtgCpblty) {
        getWrtgCpblty().add(wrtgCpblty);
        return this;
    }

    /**
     * Adds a new item to the msgCpblty list.
     * @see #getMsgCpblty()
     * 
     */
    public Terminal13 addMsgCpblty(DisplayCapabilities6 msgCpblty) {
        getMsgCpblty().add(msgCpblty);
        return this;
    }

    /**
     * Adds a new item to the crdhldrVrfctnCpblty list.
     * @see #getCrdhldrVrfctnCpblty()
     * 
     */
    public Terminal13 addCrdhldrVrfctnCpblty(CardholderVerificationCapability6Code crdhldrVrfctnCpblty) {
        getCrdhldrVrfctnCpblty().add(crdhldrVrfctnCpblty);
        return this;
    }

    /**
     * Adds a new item to the sftwr list.
     * @see #getSftwr()
     * 
     */
    public Terminal13 addSftwr(Software2 sftwr) {
        getSftwr().add(sftwr);
        return this;
    }

    /**
     * Adds a new item to the prvtData list.
     * @see #getPrvtData()
     * 
     */
    public Terminal13 addPrvtData(ATICALaxProcessing prvtData) {
        getPrvtData().add(prvtData);
        return this;
    }

    /**
     * Adds a new item to the ntlData list.
     * @see #getNtlData()
     * 
     */
    public Terminal13 addNtlData(ATICALaxProcessing ntlData) {
        getNtlData().add(ntlData);
        return this;
    }

}
