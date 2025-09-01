
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
 * Capabilities of the terminal performing the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteractionCapabilities4", propOrder = {
    "cardRdngCpblties",
    "cardWrttgCpblties",
    "crdhldrVrfctnCpblties",
    "pinLngthCpblties",
    "apprvlCdLngth",
    "mxScrptLngth",
    "cardCaptrCpbl",
    "onLineCpblties",
    "msgCpblties"
})
public class PointOfInteractionCapabilities4 {

    @XmlElement(name = "CardRdngCpblties", required = true)
    @XmlSchemaType(name = "string")
    protected List<CardDataReading2Code> cardRdngCpblties;
    @XmlElement(name = "CardWrttgCpblties")
    @XmlSchemaType(name = "string")
    protected List<CardDataReading3Code> cardWrttgCpblties;
    @XmlElement(name = "CrdhldrVrfctnCpblties")
    @XmlSchemaType(name = "string")
    protected List<CardholderVerificationCapability2Code> crdhldrVrfctnCpblties;
    @XmlElement(name = "PINLngthCpblties")
    protected BigDecimal pinLngthCpblties;
    @XmlElement(name = "ApprvlCdLngth")
    protected BigDecimal apprvlCdLngth;
    @XmlElement(name = "MxScrptLngth")
    protected BigDecimal mxScrptLngth;
    @XmlElement(name = "CardCaptrCpbl")
    protected Boolean cardCaptrCpbl;
    @XmlElement(name = "OnLineCpblties")
    @XmlSchemaType(name = "string")
    protected OnLineCapability1Code onLineCpblties;
    @XmlElement(name = "MsgCpblties")
    protected List<DisplayCapabilities3> msgCpblties;

    /**
     * Gets the value of the cardRdngCpblties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardRdngCpblties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardRdngCpblties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardDataReading2Code }
     * 
     * 
     */
    public List<CardDataReading2Code> getCardRdngCpblties() {
        if (cardRdngCpblties == null) {
            cardRdngCpblties = new ArrayList<CardDataReading2Code>();
        }
        return this.cardRdngCpblties;
    }

    /**
     * Gets the value of the cardWrttgCpblties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardWrttgCpblties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardWrttgCpblties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardDataReading3Code }
     * 
     * 
     */
    public List<CardDataReading3Code> getCardWrttgCpblties() {
        if (cardWrttgCpblties == null) {
            cardWrttgCpblties = new ArrayList<CardDataReading3Code>();
        }
        return this.cardWrttgCpblties;
    }

    /**
     * Gets the value of the crdhldrVrfctnCpblties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crdhldrVrfctnCpblties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrdhldrVrfctnCpblties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardholderVerificationCapability2Code }
     * 
     * 
     */
    public List<CardholderVerificationCapability2Code> getCrdhldrVrfctnCpblties() {
        if (crdhldrVrfctnCpblties == null) {
            crdhldrVrfctnCpblties = new ArrayList<CardholderVerificationCapability2Code>();
        }
        return this.crdhldrVrfctnCpblties;
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
    public PointOfInteractionCapabilities4 setPINLngthCpblties(BigDecimal value) {
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
    public PointOfInteractionCapabilities4 setApprvlCdLngth(BigDecimal value) {
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
    public PointOfInteractionCapabilities4 setMxScrptLngth(BigDecimal value) {
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
    public PointOfInteractionCapabilities4 setCardCaptrCpbl(Boolean value) {
        this.cardCaptrCpbl = value;
        return this;
    }

    /**
     * Gets the value of the onLineCpblties property.
     * 
     * @return
     *     possible object is
     *     {@link OnLineCapability1Code }
     *     
     */
    public OnLineCapability1Code getOnLineCpblties() {
        return onLineCpblties;
    }

    /**
     * Sets the value of the onLineCpblties property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnLineCapability1Code }
     *     
     */
    public PointOfInteractionCapabilities4 setOnLineCpblties(OnLineCapability1Code value) {
        this.onLineCpblties = value;
        return this;
    }

    /**
     * Gets the value of the msgCpblties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the msgCpblties property.
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
     * {@link DisplayCapabilities3 }
     * 
     * 
     */
    public List<DisplayCapabilities3> getMsgCpblties() {
        if (msgCpblties == null) {
            msgCpblties = new ArrayList<DisplayCapabilities3>();
        }
        return this.msgCpblties;
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
     * Adds a new item to the cardRdngCpblties list.
     * @see #getCardRdngCpblties()
     * 
     */
    public PointOfInteractionCapabilities4 addCardRdngCpblties(CardDataReading2Code cardRdngCpblties) {
        getCardRdngCpblties().add(cardRdngCpblties);
        return this;
    }

    /**
     * Adds a new item to the cardWrttgCpblties list.
     * @see #getCardWrttgCpblties()
     * 
     */
    public PointOfInteractionCapabilities4 addCardWrttgCpblties(CardDataReading3Code cardWrttgCpblties) {
        getCardWrttgCpblties().add(cardWrttgCpblties);
        return this;
    }

    /**
     * Adds a new item to the crdhldrVrfctnCpblties list.
     * @see #getCrdhldrVrfctnCpblties()
     * 
     */
    public PointOfInteractionCapabilities4 addCrdhldrVrfctnCpblties(CardholderVerificationCapability2Code crdhldrVrfctnCpblties) {
        getCrdhldrVrfctnCpblties().add(crdhldrVrfctnCpblties);
        return this;
    }

    /**
     * Adds a new item to the msgCpblties list.
     * @see #getMsgCpblties()
     * 
     */
    public PointOfInteractionCapabilities4 addMsgCpblties(DisplayCapabilities3 msgCpblties) {
        getMsgCpblties().add(msgCpblties);
        return this;
    }

}
