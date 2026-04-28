
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 * Capabilities of the terminal.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Capabilities2", propOrder = {
    "cardRdngCpblty",
    "cardWrtgCpblty",
    "pinLngthCpblty",
    "pinNtrySctyChrtc",
    "othrPINNtrySctyChrtc",
    "apprvlCdLngth",
    "mxScrptLngth",
    "cardCaptrCpbl",
    "onLineCpblty",
    "msgCpblty",
    "crdhldrVrfctnCpblty",
    "tempScrCardDataStorg"
})
public class Capabilities2 {

    @XmlElement(name = "CardRdngCpblty")
    protected List<CardReadingCapabilities1> cardRdngCpblty;
    @XmlElement(name = "CardWrtgCpblty")
    protected List<CardWritingCapabilities1> cardWrtgCpblty;
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
    @XmlElement(name = "TempScrCardDataStorg")
    protected Boolean tempScrCardDataStorg;

    /**
     * Gets the value of the cardRdngCpblty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardRdngCpblty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardRdngCpblty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardReadingCapabilities1 }
     * 
     * 
     */
    public List<CardReadingCapabilities1> getCardRdngCpblty() {
        if (cardRdngCpblty == null) {
            cardRdngCpblty = new ArrayList<CardReadingCapabilities1>();
        }
        return this.cardRdngCpblty;
    }

    /**
     * Gets the value of the cardWrtgCpblty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardWrtgCpblty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardWrtgCpblty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardWritingCapabilities1 }
     * 
     * 
     */
    public List<CardWritingCapabilities1> getCardWrtgCpblty() {
        if (cardWrtgCpblty == null) {
            cardWrtgCpblty = new ArrayList<CardWritingCapabilities1>();
        }
        return this.cardWrtgCpblty;
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
    public Capabilities2 setPINLngthCpblty(BigDecimal value) {
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
    public Capabilities2 setPINNtrySctyChrtc(PINEntrySecurityCharacteristic1Code value) {
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
    public Capabilities2 setOthrPINNtrySctyChrtc(String value) {
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
    public Capabilities2 setApprvlCdLngth(BigDecimal value) {
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
    public Capabilities2 setMxScrptLngth(BigDecimal value) {
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
    public Capabilities2 setCardCaptrCpbl(Boolean value) {
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
    public Capabilities2 setOnLineCpblty(OnLineCapability2Code value) {
        this.onLineCpblty = value;
        return this;
    }

    /**
     * Gets the value of the msgCpblty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the msgCpblty property.
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
     */
    public List<DisplayCapabilities6> getMsgCpblty() {
        if (msgCpblty == null) {
            msgCpblty = new ArrayList<DisplayCapabilities6>();
        }
        return this.msgCpblty;
    }

    /**
     * Gets the value of the crdhldrVrfctnCpblty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crdhldrVrfctnCpblty property.
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
     */
    public List<CardholderVerificationCapabilities1> getCrdhldrVrfctnCpblty() {
        if (crdhldrVrfctnCpblty == null) {
            crdhldrVrfctnCpblty = new ArrayList<CardholderVerificationCapabilities1>();
        }
        return this.crdhldrVrfctnCpblty;
    }

    /**
     * Gets the value of the tempScrCardDataStorg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTempScrCardDataStorg() {
        return tempScrCardDataStorg;
    }

    /**
     * Sets the value of the tempScrCardDataStorg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Capabilities2 setTempScrCardDataStorg(Boolean value) {
        this.tempScrCardDataStorg = value;
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
     * Adds a new item to the cardRdngCpblty list.
     * @see #getCardRdngCpblty()
     * 
     */
    public Capabilities2 addCardRdngCpblty(CardReadingCapabilities1 cardRdngCpblty) {
        getCardRdngCpblty().add(cardRdngCpblty);
        return this;
    }

    /**
     * Adds a new item to the cardWrtgCpblty list.
     * @see #getCardWrtgCpblty()
     * 
     */
    public Capabilities2 addCardWrtgCpblty(CardWritingCapabilities1 cardWrtgCpblty) {
        getCardWrtgCpblty().add(cardWrtgCpblty);
        return this;
    }

    /**
     * Adds a new item to the msgCpblty list.
     * @see #getMsgCpblty()
     * 
     */
    public Capabilities2 addMsgCpblty(DisplayCapabilities6 msgCpblty) {
        getMsgCpblty().add(msgCpblty);
        return this;
    }

    /**
     * Adds a new item to the crdhldrVrfctnCpblty list.
     * @see #getCrdhldrVrfctnCpblty()
     * 
     */
    public Capabilities2 addCrdhldrVrfctnCpblty(CardholderVerificationCapabilities1 crdhldrVrfctnCpblty) {
        getCrdhldrVrfctnCpblty().add(crdhldrVrfctnCpblty);
        return this;
    }

}
