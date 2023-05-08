
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
 * Capabilities of the terminal.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Capabilities1", propOrder = {
    "cardRdngCpblty",
    "othrCardRdngCpblties",
    "cardWrtgCpblties",
    "othrCardWrtgCpblties",
    "pinLngthCpblties",
    "apprvlCdLngth",
    "mxScrptLngth",
    "pinPadInprtv",
    "cardCaptrCpbl",
    "onLineCpblties",
    "msgCpblties",
    "crdhldrVrfctnCpblty"
})
public class Capabilities1 {

    @XmlElement(name = "CardRdngCpblty")
    @XmlSchemaType(name = "string")
    protected List<CardDataReading7Code> cardRdngCpblty;
    @XmlElement(name = "OthrCardRdngCpblties")
    protected List<String> othrCardRdngCpblties;
    @XmlElement(name = "CardWrtgCpblties")
    @XmlSchemaType(name = "string")
    protected List<CardDataWriting1Code> cardWrtgCpblties;
    @XmlElement(name = "OthrCardWrtgCpblties")
    protected List<String> othrCardWrtgCpblties;
    @XmlElement(name = "PINLngthCpblties")
    protected BigDecimal pinLngthCpblties;
    @XmlElement(name = "ApprvlCdLngth")
    protected BigDecimal apprvlCdLngth;
    @XmlElement(name = "MxScrptLngth")
    protected BigDecimal mxScrptLngth;
    @XmlElement(name = "PINPadInprtv")
    protected Boolean pinPadInprtv;
    @XmlElement(name = "CardCaptrCpbl")
    protected Boolean cardCaptrCpbl;
    @XmlElement(name = "OnLineCpblties")
    @XmlSchemaType(name = "string")
    protected OnLineCapability2Code onLineCpblties;
    @XmlElement(name = "MsgCpblties")
    protected List<DisplayCapabilities6> msgCpblties;
    @XmlElement(name = "CrdhldrVrfctnCpblty")
    protected List<CardholderVerificationCapabilities1> crdhldrVrfctnCpblty;

    /**
     * Gets the value of the cardRdngCpblty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cardRdngCpblty property.
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
     * {@link CardDataReading7Code }
     * 
     * 
     * @return
     *     The value of the cardRdngCpblty property.
     */
    public List<CardDataReading7Code> getCardRdngCpblty() {
        if (cardRdngCpblty == null) {
            cardRdngCpblty = new ArrayList<>();
        }
        return this.cardRdngCpblty;
    }

    /**
     * Gets the value of the othrCardRdngCpblties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrCardRdngCpblties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrCardRdngCpblties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the othrCardRdngCpblties property.
     */
    public List<String> getOthrCardRdngCpblties() {
        if (othrCardRdngCpblties == null) {
            othrCardRdngCpblties = new ArrayList<>();
        }
        return this.othrCardRdngCpblties;
    }

    /**
     * Gets the value of the cardWrtgCpblties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cardWrtgCpblties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardWrtgCpblties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardDataWriting1Code }
     * 
     * 
     * @return
     *     The value of the cardWrtgCpblties property.
     */
    public List<CardDataWriting1Code> getCardWrtgCpblties() {
        if (cardWrtgCpblties == null) {
            cardWrtgCpblties = new ArrayList<>();
        }
        return this.cardWrtgCpblties;
    }

    /**
     * Gets the value of the othrCardWrtgCpblties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrCardWrtgCpblties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrCardWrtgCpblties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the othrCardWrtgCpblties property.
     */
    public List<String> getOthrCardWrtgCpblties() {
        if (othrCardWrtgCpblties == null) {
            othrCardWrtgCpblties = new ArrayList<>();
        }
        return this.othrCardWrtgCpblties;
    }

    /**
     * Gets the value of the pinLngthCpblties property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPINLngthCpblties() {
        return pinLngthCpblties;
    }

    /**
     * Sets the value of the pinLngthCpblties property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Capabilities1 setPINLngthCpblties(BigDecimal value) {
        this.pinLngthCpblties = value;
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
    public Capabilities1 setApprvlCdLngth(BigDecimal value) {
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
    public Capabilities1 setMxScrptLngth(BigDecimal value) {
        this.mxScrptLngth = value;
        return this;
    }

    /**
     * Gets the value of the pinPadInprtv property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPINPadInprtv() {
        return pinPadInprtv;
    }

    /**
     * Sets the value of the pinPadInprtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Capabilities1 setPINPadInprtv(Boolean value) {
        this.pinPadInprtv = value;
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
    public Capabilities1 setCardCaptrCpbl(Boolean value) {
        this.cardCaptrCpbl = value;
        return this;
    }

    /**
     * Gets the value of the onLineCpblties property.
     * 
     * @return
     *     possible object is
     *     {@link OnLineCapability2Code }
     *     
     */
    public OnLineCapability2Code getOnLineCpblties() {
        return onLineCpblties;
    }

    /**
     * Sets the value of the onLineCpblties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnLineCapability2Code }
     *     
     */
    public Capabilities1 setOnLineCpblties(OnLineCapability2Code value) {
        this.onLineCpblties = value;
        return this;
    }

    /**
     * Gets the value of the msgCpblties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the msgCpblties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgCpblties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisplayCapabilities6 }
     * 
     * 
     * @return
     *     The value of the msgCpblties property.
     */
    public List<DisplayCapabilities6> getMsgCpblties() {
        if (msgCpblties == null) {
            msgCpblties = new ArrayList<>();
        }
        return this.msgCpblties;
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
    public Capabilities1 addCardRdngCpblty(CardDataReading7Code cardRdngCpblty) {
        getCardRdngCpblty().add(cardRdngCpblty);
        return this;
    }

    /**
     * Adds a new item to the othrCardRdngCpblties list.
     * @see #getOthrCardRdngCpblties()
     * 
     */
    public Capabilities1 addOthrCardRdngCpblties(String othrCardRdngCpblties) {
        getOthrCardRdngCpblties().add(othrCardRdngCpblties);
        return this;
    }

    /**
     * Adds a new item to the cardWrtgCpblties list.
     * @see #getCardWrtgCpblties()
     * 
     */
    public Capabilities1 addCardWrtgCpblties(CardDataWriting1Code cardWrtgCpblties) {
        getCardWrtgCpblties().add(cardWrtgCpblties);
        return this;
    }

    /**
     * Adds a new item to the othrCardWrtgCpblties list.
     * @see #getOthrCardWrtgCpblties()
     * 
     */
    public Capabilities1 addOthrCardWrtgCpblties(String othrCardWrtgCpblties) {
        getOthrCardWrtgCpblties().add(othrCardWrtgCpblties);
        return this;
    }

    /**
     * Adds a new item to the msgCpblties list.
     * @see #getMsgCpblties()
     * 
     */
    public Capabilities1 addMsgCpblties(DisplayCapabilities6 msgCpblties) {
        getMsgCpblties().add(msgCpblties);
        return this;
    }

    /**
     * Adds a new item to the crdhldrVrfctnCpblty list.
     * @see #getCrdhldrVrfctnCpblty()
     * 
     */
    public Capabilities1 addCrdhldrVrfctnCpblty(CardholderVerificationCapabilities1 crdhldrVrfctnCpblty) {
        getCrdhldrVrfctnCpblty().add(crdhldrVrfctnCpblty);
        return this;
    }

}
