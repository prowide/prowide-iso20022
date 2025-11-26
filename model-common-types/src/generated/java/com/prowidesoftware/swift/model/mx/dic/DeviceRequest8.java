
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
 * Specifies the environment, the context and the services to be used with a device request message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceRequest8", propOrder = {
    "envt",
    "cntxt",
    "svcCntt",
    "dispReq",
    "inptReq",
    "prtReq",
    "playRsrcReq",
    "scrInptReq",
    "initlstnCardRdrReq",
    "cardRdrAPDUReq",
    "pwrOffCardRdrReq",
    "trnsmssnReq",
    "inptNtfctn",
    "splmtryData"
})
public class DeviceRequest8 {

    @XmlElement(name = "Envt")
    protected CardPaymentEnvironment81 envt;
    @XmlElement(name = "Cntxt")
    protected PaymentContext30 cntxt;
    @XmlElement(name = "SvcCntt", required = true)
    @XmlSchemaType(name = "string")
    protected RetailerService8Code svcCntt;
    @XmlElement(name = "DispReq")
    protected DeviceDisplayRequest6 dispReq;
    @XmlElement(name = "InptReq")
    protected DeviceInputRequest6 inptReq;
    @XmlElement(name = "PrtReq")
    protected DevicePrintRequest6 prtReq;
    @XmlElement(name = "PlayRsrcReq")
    protected DevicePlayResourceRequest1 playRsrcReq;
    @XmlElement(name = "ScrInptReq")
    protected DeviceSecureInputRequest6 scrInptReq;
    @XmlElement(name = "InitlstnCardRdrReq")
    protected DeviceInitialisationCardReaderRequest6 initlstnCardRdrReq;
    @XmlElement(name = "CardRdrAPDUReq")
    protected DeviceSendApplicationProtocolDataUnitCardReaderRequest1 cardRdrAPDUReq;
    @XmlElement(name = "PwrOffCardRdrReq")
    protected DevicePoweroffCardReaderRequest6 pwrOffCardRdrReq;
    @XmlElement(name = "TrnsmssnReq")
    protected DeviceTransmitMessageRequest2 trnsmssnReq;
    @XmlElement(name = "InptNtfctn")
    protected DeviceInputNotification6 inptNtfctn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment81 }
     *     
     */
    public CardPaymentEnvironment81 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment81 }
     *     
     */
    public DeviceRequest8 setEnvt(CardPaymentEnvironment81 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentContext30 }
     *     
     */
    public PaymentContext30 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentContext30 }
     *     
     */
    public DeviceRequest8 setCntxt(PaymentContext30 value) {
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
    public DeviceRequest8 setSvcCntt(RetailerService8Code value) {
        this.svcCntt = value;
        return this;
    }

    /**
     * Gets the value of the dispReq property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceDisplayRequest6 }
     *     
     */
    public DeviceDisplayRequest6 getDispReq() {
        return dispReq;
    }

    /**
     * Sets the value of the dispReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceDisplayRequest6 }
     *     
     */
    public DeviceRequest8 setDispReq(DeviceDisplayRequest6 value) {
        this.dispReq = value;
        return this;
    }

    /**
     * Gets the value of the inptReq property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInputRequest6 }
     *     
     */
    public DeviceInputRequest6 getInptReq() {
        return inptReq;
    }

    /**
     * Sets the value of the inptReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInputRequest6 }
     *     
     */
    public DeviceRequest8 setInptReq(DeviceInputRequest6 value) {
        this.inptReq = value;
        return this;
    }

    /**
     * Gets the value of the prtReq property.
     * 
     * @return
     *     possible object is
     *     {@link DevicePrintRequest6 }
     *     
     */
    public DevicePrintRequest6 getPrtReq() {
        return prtReq;
    }

    /**
     * Sets the value of the prtReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevicePrintRequest6 }
     *     
     */
    public DeviceRequest8 setPrtReq(DevicePrintRequest6 value) {
        this.prtReq = value;
        return this;
    }

    /**
     * Gets the value of the playRsrcReq property.
     * 
     * @return
     *     possible object is
     *     {@link DevicePlayResourceRequest1 }
     *     
     */
    public DevicePlayResourceRequest1 getPlayRsrcReq() {
        return playRsrcReq;
    }

    /**
     * Sets the value of the playRsrcReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevicePlayResourceRequest1 }
     *     
     */
    public DeviceRequest8 setPlayRsrcReq(DevicePlayResourceRequest1 value) {
        this.playRsrcReq = value;
        return this;
    }

    /**
     * Gets the value of the scrInptReq property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceSecureInputRequest6 }
     *     
     */
    public DeviceSecureInputRequest6 getScrInptReq() {
        return scrInptReq;
    }

    /**
     * Sets the value of the scrInptReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceSecureInputRequest6 }
     *     
     */
    public DeviceRequest8 setScrInptReq(DeviceSecureInputRequest6 value) {
        this.scrInptReq = value;
        return this;
    }

    /**
     * Gets the value of the initlstnCardRdrReq property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInitialisationCardReaderRequest6 }
     *     
     */
    public DeviceInitialisationCardReaderRequest6 getInitlstnCardRdrReq() {
        return initlstnCardRdrReq;
    }

    /**
     * Sets the value of the initlstnCardRdrReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInitialisationCardReaderRequest6 }
     *     
     */
    public DeviceRequest8 setInitlstnCardRdrReq(DeviceInitialisationCardReaderRequest6 value) {
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
    public DeviceRequest8 setCardRdrAPDUReq(DeviceSendApplicationProtocolDataUnitCardReaderRequest1 value) {
        this.cardRdrAPDUReq = value;
        return this;
    }

    /**
     * Gets the value of the pwrOffCardRdrReq property.
     * 
     * @return
     *     possible object is
     *     {@link DevicePoweroffCardReaderRequest6 }
     *     
     */
    public DevicePoweroffCardReaderRequest6 getPwrOffCardRdrReq() {
        return pwrOffCardRdrReq;
    }

    /**
     * Sets the value of the pwrOffCardRdrReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevicePoweroffCardReaderRequest6 }
     *     
     */
    public DeviceRequest8 setPwrOffCardRdrReq(DevicePoweroffCardReaderRequest6 value) {
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
    public DeviceRequest8 setTrnsmssnReq(DeviceTransmitMessageRequest2 value) {
        this.trnsmssnReq = value;
        return this;
    }

    /**
     * Gets the value of the inptNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInputNotification6 }
     *     
     */
    public DeviceInputNotification6 getInptNtfctn() {
        return inptNtfctn;
    }

    /**
     * Sets the value of the inptNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInputNotification6 }
     *     
     */
    public DeviceRequest8 setInptNtfctn(DeviceInputNotification6 value) {
        this.inptNtfctn = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
    public DeviceRequest8 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
