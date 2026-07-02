
package com.prowidesoftware.swift.model.mx.dic;

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
 * This component define the environment, the context and the services to be used with this message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceRequest5", propOrder = {
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
public class DeviceRequest5 {

    @XmlElement(name = "Envt")
    protected CardPaymentEnvironment78 envt;
    @XmlElement(name = "Cntxt")
    protected CardPaymentContext29 cntxt;
    @XmlElement(name = "SvcCntt", required = true)
    @XmlSchemaType(name = "string")
    protected RetailerService8Code svcCntt;
    @XmlElement(name = "DispReq")
    protected DeviceDisplayRequest4 dispReq;
    @XmlElement(name = "InptReq")
    protected DeviceInputRequest4 inptReq;
    @XmlElement(name = "PrtReq")
    protected DevicePrintRequest4 prtReq;
    @XmlElement(name = "PlayRsrcReq")
    protected DevicePlayResourceRequest1 playRsrcReq;
    @XmlElement(name = "ScrInptReq")
    protected DeviceSecureInputRequest4 scrInptReq;
    @XmlElement(name = "InitlstnCardRdrReq")
    protected DeviceInitialisationCardReaderRequest4 initlstnCardRdrReq;
    @XmlElement(name = "CardRdrAPDUReq")
    protected DeviceSendApplicationProtocolDataUnitCardReaderRequest1 cardRdrAPDUReq;
    @XmlElement(name = "PwrOffCardRdrReq")
    protected DevicePoweroffCardReaderRequest4 pwrOffCardRdrReq;
    @XmlElement(name = "TrnsmssnReq")
    protected DeviceTransmitMessageRequest2 trnsmssnReq;
    @XmlElement(name = "InptNtfctn")
    protected DeviceInputNotification4 inptNtfctn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment78 }
     *     
     */
    public CardPaymentEnvironment78 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment78 }
     *     
     */
    public DeviceRequest5 setEnvt(CardPaymentEnvironment78 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentContext29 }
     *     
     */
    public CardPaymentContext29 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentContext29 }
     *     
     */
    public DeviceRequest5 setCntxt(CardPaymentContext29 value) {
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
    public DeviceRequest5 setSvcCntt(RetailerService8Code value) {
        this.svcCntt = value;
        return this;
    }

    /**
     * Gets the value of the dispReq property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceDisplayRequest4 }
     *     
     */
    public DeviceDisplayRequest4 getDispReq() {
        return dispReq;
    }

    /**
     * Sets the value of the dispReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceDisplayRequest4 }
     *     
     */
    public DeviceRequest5 setDispReq(DeviceDisplayRequest4 value) {
        this.dispReq = value;
        return this;
    }

    /**
     * Gets the value of the inptReq property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInputRequest4 }
     *     
     */
    public DeviceInputRequest4 getInptReq() {
        return inptReq;
    }

    /**
     * Sets the value of the inptReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInputRequest4 }
     *     
     */
    public DeviceRequest5 setInptReq(DeviceInputRequest4 value) {
        this.inptReq = value;
        return this;
    }

    /**
     * Gets the value of the prtReq property.
     * 
     * @return
     *     possible object is
     *     {@link DevicePrintRequest4 }
     *     
     */
    public DevicePrintRequest4 getPrtReq() {
        return prtReq;
    }

    /**
     * Sets the value of the prtReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevicePrintRequest4 }
     *     
     */
    public DeviceRequest5 setPrtReq(DevicePrintRequest4 value) {
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
    public DeviceRequest5 setPlayRsrcReq(DevicePlayResourceRequest1 value) {
        this.playRsrcReq = value;
        return this;
    }

    /**
     * Gets the value of the scrInptReq property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceSecureInputRequest4 }
     *     
     */
    public DeviceSecureInputRequest4 getScrInptReq() {
        return scrInptReq;
    }

    /**
     * Sets the value of the scrInptReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceSecureInputRequest4 }
     *     
     */
    public DeviceRequest5 setScrInptReq(DeviceSecureInputRequest4 value) {
        this.scrInptReq = value;
        return this;
    }

    /**
     * Gets the value of the initlstnCardRdrReq property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInitialisationCardReaderRequest4 }
     *     
     */
    public DeviceInitialisationCardReaderRequest4 getInitlstnCardRdrReq() {
        return initlstnCardRdrReq;
    }

    /**
     * Sets the value of the initlstnCardRdrReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInitialisationCardReaderRequest4 }
     *     
     */
    public DeviceRequest5 setInitlstnCardRdrReq(DeviceInitialisationCardReaderRequest4 value) {
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
    public DeviceRequest5 setCardRdrAPDUReq(DeviceSendApplicationProtocolDataUnitCardReaderRequest1 value) {
        this.cardRdrAPDUReq = value;
        return this;
    }

    /**
     * Gets the value of the pwrOffCardRdrReq property.
     * 
     * @return
     *     possible object is
     *     {@link DevicePoweroffCardReaderRequest4 }
     *     
     */
    public DevicePoweroffCardReaderRequest4 getPwrOffCardRdrReq() {
        return pwrOffCardRdrReq;
    }

    /**
     * Sets the value of the pwrOffCardRdrReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevicePoweroffCardReaderRequest4 }
     *     
     */
    public DeviceRequest5 setPwrOffCardRdrReq(DevicePoweroffCardReaderRequest4 value) {
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
    public DeviceRequest5 setTrnsmssnReq(DeviceTransmitMessageRequest2 value) {
        this.trnsmssnReq = value;
        return this;
    }

    /**
     * Gets the value of the inptNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInputNotification4 }
     *     
     */
    public DeviceInputNotification4 getInptNtfctn() {
        return inptNtfctn;
    }

    /**
     * Sets the value of the inptNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInputNotification4 }
     *     
     */
    public DeviceRequest5 setInptNtfctn(DeviceInputNotification4 value) {
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
    public DeviceRequest5 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
