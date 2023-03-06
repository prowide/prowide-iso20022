
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
 * This component define the environment, the context and the services to be used with this message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceRequest3", propOrder = {
    "envt",
    "cntxt",
    "svcCntt",
    "dispReq",
    "inptReq",
    "prtReq",
    "playSoundReq",
    "scrInptReq",
    "initlstnCardRdrReq",
    "cardRdrAPDUReq",
    "pwrOffCardRdrReq",
    "trnsmssnReq",
    "inptNtfctn",
    "splmtryData"
})
public class DeviceRequest3 {

    @XmlElement(name = "Envt")
    protected CardPaymentEnvironment75 envt;
    @XmlElement(name = "Cntxt")
    protected CardPaymentContext28 cntxt;
    @XmlElement(name = "SvcCntt", required = true)
    @XmlSchemaType(name = "string")
    protected RetailerService8Code svcCntt;
    @XmlElement(name = "DispReq")
    protected DeviceDisplayRequest2 dispReq;
    @XmlElement(name = "InptReq")
    protected DeviceInputRequest2 inptReq;
    @XmlElement(name = "PrtReq")
    protected DevicePrintRequest2 prtReq;
    @XmlElement(name = "PlaySoundReq")
    protected DevicePlaySoundRequest1 playSoundReq;
    @XmlElement(name = "ScrInptReq")
    protected DeviceSecureInputRequest2 scrInptReq;
    @XmlElement(name = "InitlstnCardRdrReq")
    protected DeviceInitialisationCardReaderRequest2 initlstnCardRdrReq;
    @XmlElement(name = "CardRdrAPDUReq")
    protected DeviceSendApplicationProtocolDataUnitCardReaderRequest1 cardRdrAPDUReq;
    @XmlElement(name = "PwrOffCardRdrReq")
    protected DevicePoweroffCardReaderRequest2 pwrOffCardRdrReq;
    @XmlElement(name = "TrnsmssnReq")
    protected DeviceTransmitMessageRequest2 trnsmssnReq;
    @XmlElement(name = "InptNtfctn")
    protected DeviceInputNotification2 inptNtfctn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment75 }
     *     
     */
    public CardPaymentEnvironment75 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment75 }
     *     
     */
    public DeviceRequest3 setEnvt(CardPaymentEnvironment75 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentContext28 }
     *     
     */
    public CardPaymentContext28 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentContext28 }
     *     
     */
    public DeviceRequest3 setCntxt(CardPaymentContext28 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the svcCntt property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerService8Code }
     *     
     */
    public RetailerService8Code getSvcCntt() {
        return svcCntt;
    }

    /**
     * Sets the value of the svcCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerService8Code }
     *     
     */
    public DeviceRequest3 setSvcCntt(RetailerService8Code value) {
        this.svcCntt = value;
        return this;
    }

    /**
     * Gets the value of the dispReq property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceDisplayRequest2 }
     *     
     */
    public DeviceDisplayRequest2 getDispReq() {
        return dispReq;
    }

    /**
     * Sets the value of the dispReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceDisplayRequest2 }
     *     
     */
    public DeviceRequest3 setDispReq(DeviceDisplayRequest2 value) {
        this.dispReq = value;
        return this;
    }

    /**
     * Gets the value of the inptReq property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInputRequest2 }
     *     
     */
    public DeviceInputRequest2 getInptReq() {
        return inptReq;
    }

    /**
     * Sets the value of the inptReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInputRequest2 }
     *     
     */
    public DeviceRequest3 setInptReq(DeviceInputRequest2 value) {
        this.inptReq = value;
        return this;
    }

    /**
     * Gets the value of the prtReq property.
     * 
     * @return
     *     possible object is
     *     {@link DevicePrintRequest2 }
     *     
     */
    public DevicePrintRequest2 getPrtReq() {
        return prtReq;
    }

    /**
     * Sets the value of the prtReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevicePrintRequest2 }
     *     
     */
    public DeviceRequest3 setPrtReq(DevicePrintRequest2 value) {
        this.prtReq = value;
        return this;
    }

    /**
     * Gets the value of the playSoundReq property.
     * 
     * @return
     *     possible object is
     *     {@link DevicePlaySoundRequest1 }
     *     
     */
    public DevicePlaySoundRequest1 getPlaySoundReq() {
        return playSoundReq;
    }

    /**
     * Sets the value of the playSoundReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevicePlaySoundRequest1 }
     *     
     */
    public DeviceRequest3 setPlaySoundReq(DevicePlaySoundRequest1 value) {
        this.playSoundReq = value;
        return this;
    }

    /**
     * Gets the value of the scrInptReq property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceSecureInputRequest2 }
     *     
     */
    public DeviceSecureInputRequest2 getScrInptReq() {
        return scrInptReq;
    }

    /**
     * Sets the value of the scrInptReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceSecureInputRequest2 }
     *     
     */
    public DeviceRequest3 setScrInptReq(DeviceSecureInputRequest2 value) {
        this.scrInptReq = value;
        return this;
    }

    /**
     * Gets the value of the initlstnCardRdrReq property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInitialisationCardReaderRequest2 }
     *     
     */
    public DeviceInitialisationCardReaderRequest2 getInitlstnCardRdrReq() {
        return initlstnCardRdrReq;
    }

    /**
     * Sets the value of the initlstnCardRdrReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInitialisationCardReaderRequest2 }
     *     
     */
    public DeviceRequest3 setInitlstnCardRdrReq(DeviceInitialisationCardReaderRequest2 value) {
        this.initlstnCardRdrReq = value;
        return this;
    }

    /**
     * Gets the value of the cardRdrAPDUReq property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceSendApplicationProtocolDataUnitCardReaderRequest1 }
     *     
     */
    public DeviceSendApplicationProtocolDataUnitCardReaderRequest1 getCardRdrAPDUReq() {
        return cardRdrAPDUReq;
    }

    /**
     * Sets the value of the cardRdrAPDUReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceSendApplicationProtocolDataUnitCardReaderRequest1 }
     *     
     */
    public DeviceRequest3 setCardRdrAPDUReq(DeviceSendApplicationProtocolDataUnitCardReaderRequest1 value) {
        this.cardRdrAPDUReq = value;
        return this;
    }

    /**
     * Gets the value of the pwrOffCardRdrReq property.
     * 
     * @return
     *     possible object is
     *     {@link DevicePoweroffCardReaderRequest2 }
     *     
     */
    public DevicePoweroffCardReaderRequest2 getPwrOffCardRdrReq() {
        return pwrOffCardRdrReq;
    }

    /**
     * Sets the value of the pwrOffCardRdrReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevicePoweroffCardReaderRequest2 }
     *     
     */
    public DeviceRequest3 setPwrOffCardRdrReq(DevicePoweroffCardReaderRequest2 value) {
        this.pwrOffCardRdrReq = value;
        return this;
    }

    /**
     * Gets the value of the trnsmssnReq property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceTransmitMessageRequest2 }
     *     
     */
    public DeviceTransmitMessageRequest2 getTrnsmssnReq() {
        return trnsmssnReq;
    }

    /**
     * Sets the value of the trnsmssnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceTransmitMessageRequest2 }
     *     
     */
    public DeviceRequest3 setTrnsmssnReq(DeviceTransmitMessageRequest2 value) {
        this.trnsmssnReq = value;
        return this;
    }

    /**
     * Gets the value of the inptNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInputNotification2 }
     *     
     */
    public DeviceInputNotification2 getInptNtfctn() {
        return inptNtfctn;
    }

    /**
     * Sets the value of the inptNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInputNotification2 }
     *     
     */
    public DeviceRequest3 setInptNtfctn(DeviceInputNotification2 value) {
        this.inptNtfctn = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public DeviceRequest3 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
