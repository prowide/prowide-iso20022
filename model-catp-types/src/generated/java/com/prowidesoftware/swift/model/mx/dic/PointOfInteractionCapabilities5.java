
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
 * Capabilities of the ATM terminal.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfInteractionCapabilities5", propOrder = {
    "cardRdData",
    "cardWrtData",
    "authntcn",
    "pinLngthCpblties",
    "apprvlCdLngth",
    "mxScrptLngth",
    "cardCaptrCpbl"
})
public class PointOfInteractionCapabilities5 {

    @XmlElement(name = "CardRdData")
    @XmlSchemaType(name = "string")
    protected List<CardDataReading4Code> cardRdData;
    @XmlElement(name = "CardWrtData")
    @XmlSchemaType(name = "string")
    protected List<CardDataReading4Code> cardWrtData;
    @XmlElement(name = "Authntcn")
    @XmlSchemaType(name = "string")
    protected List<CardholderVerificationCapability3Code> authntcn;
    @XmlElement(name = "PINLngthCpblties")
    protected BigDecimal pinLngthCpblties;
    @XmlElement(name = "ApprvlCdLngth")
    protected BigDecimal apprvlCdLngth;
    @XmlElement(name = "MxScrptLngth")
    protected BigDecimal mxScrptLngth;
    @XmlElement(name = "CardCaptrCpbl")
    protected Boolean cardCaptrCpbl;

    /**
     * Gets the value of the cardRdData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardRdData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardRdData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardDataReading4Code }
     * 
     * 
     */
    public List<CardDataReading4Code> getCardRdData() {
        if (cardRdData == null) {
            cardRdData = new ArrayList<CardDataReading4Code>();
        }
        return this.cardRdData;
    }

    /**
     * Gets the value of the cardWrtData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardWrtData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardWrtData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardDataReading4Code }
     * 
     * 
     */
    public List<CardDataReading4Code> getCardWrtData() {
        if (cardWrtData == null) {
            cardWrtData = new ArrayList<CardDataReading4Code>();
        }
        return this.cardWrtData;
    }

    /**
     * Gets the value of the authntcn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authntcn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthntcn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardholderVerificationCapability3Code }
     * 
     * 
     */
    public List<CardholderVerificationCapability3Code> getAuthntcn() {
        if (authntcn == null) {
            authntcn = new ArrayList<CardholderVerificationCapability3Code>();
        }
        return this.authntcn;
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
    public PointOfInteractionCapabilities5 setPINLngthCpblties(BigDecimal value) {
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
    public PointOfInteractionCapabilities5 setApprvlCdLngth(BigDecimal value) {
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
    public PointOfInteractionCapabilities5 setMxScrptLngth(BigDecimal value) {
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
    public PointOfInteractionCapabilities5 setCardCaptrCpbl(Boolean value) {
        this.cardCaptrCpbl = value;
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
     * Adds a new item to the cardRdData list.
     * @see #getCardRdData()
     * 
     */
    public PointOfInteractionCapabilities5 addCardRdData(CardDataReading4Code cardRdData) {
        getCardRdData().add(cardRdData);
        return this;
    }

    /**
     * Adds a new item to the cardWrtData list.
     * @see #getCardWrtData()
     * 
     */
    public PointOfInteractionCapabilities5 addCardWrtData(CardDataReading4Code cardWrtData) {
        getCardWrtData().add(cardWrtData);
        return this;
    }

    /**
     * Adds a new item to the authntcn list.
     * @see #getAuthntcn()
     * 
     */
    public PointOfInteractionCapabilities5 addAuthntcn(CardholderVerificationCapability3Code authntcn) {
        getAuthntcn().add(authntcn);
        return this;
    }

}
