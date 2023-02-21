
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
 * This component define the type of Device service to be used with this message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceResponse5", propOrder = {
    "envt",
    "cntxt",
    "svcCntt",
    "dispRspn",
    "inptRspn",
    "prtRspn",
    "scrInptRspn",
    "initlstnCardRdrRspn",
    "cardRdrApplPrtcolDataUnitRspn",
    "trnsmssnRspn",
    "rspn",
    "splmtryData"
})
public class DeviceResponse5 {

    @XmlElement(name = "Envt")
    protected CardPaymentEnvironment78 envt;
    @XmlElement(name = "Cntxt")
    protected CardPaymentContext29 cntxt;
    @XmlElement(name = "SvcCntt", required = true)
    @XmlSchemaType(name = "string")
    protected RetailerService9Code svcCntt;
    @XmlElement(name = "DispRspn")
    protected DeviceDisplayResponse2 dispRspn;
    @XmlElement(name = "InptRspn")
    protected DeviceInputResponse4 inptRspn;
    @XmlElement(name = "PrtRspn")
    protected DevicePrintResponse1 prtRspn;
    @XmlElement(name = "ScrInptRspn")
    protected DeviceSecureInputResponse4 scrInptRspn;
    @XmlElement(name = "InitlstnCardRdrRspn")
    protected DeviceInitialisationCardReaderResponse2 initlstnCardRdrRspn;
    @XmlElement(name = "CardRdrApplPrtcolDataUnitRspn")
    protected DeviceSendApplicationProtocolDataUnitCardReaderResponse1 cardRdrApplPrtcolDataUnitRspn;
    @XmlElement(name = "TrnsmssnRspn")
    protected DeviceTransmitMessageResponse1 trnsmssnRspn;
    @XmlElement(name = "Rspn", required = true)
    protected ResponseType11 rspn;
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
    public DeviceResponse5 setEnvt(CardPaymentEnvironment78 value) {
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
    public DeviceResponse5 setCntxt(CardPaymentContext29 value) {
        this.cntxt = value;
        return this;
    }

    /**
     * Gets the value of the svcCntt property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerService9Code }
     *     
     */
    public RetailerService9Code getSvcCntt() {
        return svcCntt;
    }

    /**
     * Sets the value of the svcCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerService9Code }
     *     
     */
    public DeviceResponse5 setSvcCntt(RetailerService9Code value) {
        this.svcCntt = value;
        return this;
    }

    /**
     * Gets the value of the dispRspn property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceDisplayResponse2 }
     *     
     */
    public DeviceDisplayResponse2 getDispRspn() {
        return dispRspn;
    }

    /**
     * Sets the value of the dispRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceDisplayResponse2 }
     *     
     */
    public DeviceResponse5 setDispRspn(DeviceDisplayResponse2 value) {
        this.dispRspn = value;
        return this;
    }

    /**
     * Gets the value of the inptRspn property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInputResponse4 }
     *     
     */
    public DeviceInputResponse4 getInptRspn() {
        return inptRspn;
    }

    /**
     * Sets the value of the inptRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInputResponse4 }
     *     
     */
    public DeviceResponse5 setInptRspn(DeviceInputResponse4 value) {
        this.inptRspn = value;
        return this;
    }

    /**
     * Gets the value of the prtRspn property.
     * 
     * @return
     *     possible object is
     *     {@link DevicePrintResponse1 }
     *     
     */
    public DevicePrintResponse1 getPrtRspn() {
        return prtRspn;
    }

    /**
     * Sets the value of the prtRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevicePrintResponse1 }
     *     
     */
    public DeviceResponse5 setPrtRspn(DevicePrintResponse1 value) {
        this.prtRspn = value;
        return this;
    }

    /**
     * Gets the value of the scrInptRspn property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceSecureInputResponse4 }
     *     
     */
    public DeviceSecureInputResponse4 getScrInptRspn() {
        return scrInptRspn;
    }

    /**
     * Sets the value of the scrInptRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceSecureInputResponse4 }
     *     
     */
    public DeviceResponse5 setScrInptRspn(DeviceSecureInputResponse4 value) {
        this.scrInptRspn = value;
        return this;
    }

    /**
     * Gets the value of the initlstnCardRdrRspn property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInitialisationCardReaderResponse2 }
     *     
     */
    public DeviceInitialisationCardReaderResponse2 getInitlstnCardRdrRspn() {
        return initlstnCardRdrRspn;
    }

    /**
     * Sets the value of the initlstnCardRdrRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInitialisationCardReaderResponse2 }
     *     
     */
    public DeviceResponse5 setInitlstnCardRdrRspn(DeviceInitialisationCardReaderResponse2 value) {
        this.initlstnCardRdrRspn = value;
        return this;
    }

    /**
     * Gets the value of the cardRdrApplPrtcolDataUnitRspn property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceSendApplicationProtocolDataUnitCardReaderResponse1 }
     *     
     */
    public DeviceSendApplicationProtocolDataUnitCardReaderResponse1 getCardRdrApplPrtcolDataUnitRspn() {
        return cardRdrApplPrtcolDataUnitRspn;
    }

    /**
     * Sets the value of the cardRdrApplPrtcolDataUnitRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceSendApplicationProtocolDataUnitCardReaderResponse1 }
     *     
     */
    public DeviceResponse5 setCardRdrApplPrtcolDataUnitRspn(DeviceSendApplicationProtocolDataUnitCardReaderResponse1 value) {
        this.cardRdrApplPrtcolDataUnitRspn = value;
        return this;
    }

    /**
     * Gets the value of the trnsmssnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceTransmitMessageResponse1 }
     *     
     */
    public DeviceTransmitMessageResponse1 getTrnsmssnRspn() {
        return trnsmssnRspn;
    }

    /**
     * Sets the value of the trnsmssnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceTransmitMessageResponse1 }
     *     
     */
    public DeviceResponse5 setTrnsmssnRspn(DeviceTransmitMessageResponse1 value) {
        this.trnsmssnRspn = value;
        return this;
    }

    /**
     * Gets the value of the rspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType11 }
     *     
     */
    public ResponseType11 getRspn() {
        return rspn;
    }

    /**
     * Sets the value of the rspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType11 }
     *     
     */
    public DeviceResponse5 setRspn(ResponseType11 value) {
        this.rspn = value;
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
    public DeviceResponse5 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
