
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
@XmlType(name = "DeviceResponse2", propOrder = {
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
public class DeviceResponse2 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment73 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected CardPaymentContext27 cntxt;
    @XmlElement(name = "SvcCntt", required = true)
    @XmlSchemaType(name = "string")
    protected RetailerService9Code svcCntt;
    @XmlElement(name = "DispRspn")
    protected DeviceDisplayResponse1 dispRspn;
    @XmlElement(name = "InptRspn")
    protected DeviceInputResponse1 inptRspn;
    @XmlElement(name = "PrtRspn")
    protected DevicePrintResponse1 prtRspn;
    @XmlElement(name = "ScrInptRspn")
    protected DeviceSecureInputResponse1 scrInptRspn;
    @XmlElement(name = "InitlstnCardRdrRspn")
    protected DeviceInitialisationCardReaderResponse1 initlstnCardRdrRspn;
    @XmlElement(name = "CardRdrApplPrtcolDataUnitRspn")
    protected DeviceSendApplicationProtocolDataUnitCardReaderResponse1 cardRdrApplPrtcolDataUnitRspn;
    @XmlElement(name = "TrnsmssnRspn")
    protected DeviceTransmitMessageResponse1 trnsmssnRspn;
    @XmlElement(name = "Rspn", required = true)
    protected ResponseType9 rspn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment73 }
     *     
     */
    public CardPaymentEnvironment73 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment73 }
     *     
     */
    public DeviceResponse2 setEnvt(CardPaymentEnvironment73 value) {
        this.envt = value;
        return this;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentContext27 }
     *     
     */
    public CardPaymentContext27 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentContext27 }
     *     
     */
    public DeviceResponse2 setCntxt(CardPaymentContext27 value) {
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
    public DeviceResponse2 setSvcCntt(RetailerService9Code value) {
        this.svcCntt = value;
        return this;
    }

    /**
     * Gets the value of the dispRspn property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceDisplayResponse1 }
     *     
     */
    public DeviceDisplayResponse1 getDispRspn() {
        return dispRspn;
    }

    /**
     * Sets the value of the dispRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceDisplayResponse1 }
     *     
     */
    public DeviceResponse2 setDispRspn(DeviceDisplayResponse1 value) {
        this.dispRspn = value;
        return this;
    }

    /**
     * Gets the value of the inptRspn property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInputResponse1 }
     *     
     */
    public DeviceInputResponse1 getInptRspn() {
        return inptRspn;
    }

    /**
     * Sets the value of the inptRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInputResponse1 }
     *     
     */
    public DeviceResponse2 setInptRspn(DeviceInputResponse1 value) {
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
    public DeviceResponse2 setPrtRspn(DevicePrintResponse1 value) {
        this.prtRspn = value;
        return this;
    }

    /**
     * Gets the value of the scrInptRspn property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceSecureInputResponse1 }
     *     
     */
    public DeviceSecureInputResponse1 getScrInptRspn() {
        return scrInptRspn;
    }

    /**
     * Sets the value of the scrInptRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceSecureInputResponse1 }
     *     
     */
    public DeviceResponse2 setScrInptRspn(DeviceSecureInputResponse1 value) {
        this.scrInptRspn = value;
        return this;
    }

    /**
     * Gets the value of the initlstnCardRdrRspn property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInitialisationCardReaderResponse1 }
     *     
     */
    public DeviceInitialisationCardReaderResponse1 getInitlstnCardRdrRspn() {
        return initlstnCardRdrRspn;
    }

    /**
     * Sets the value of the initlstnCardRdrRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInitialisationCardReaderResponse1 }
     *     
     */
    public DeviceResponse2 setInitlstnCardRdrRspn(DeviceInitialisationCardReaderResponse1 value) {
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
    public DeviceResponse2 setCardRdrApplPrtcolDataUnitRspn(DeviceSendApplicationProtocolDataUnitCardReaderResponse1 value) {
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
    public DeviceResponse2 setTrnsmssnRspn(DeviceTransmitMessageResponse1 value) {
        this.trnsmssnRspn = value;
        return this;
    }

    /**
     * Gets the value of the rspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType9 }
     *     
     */
    public ResponseType9 getRspn() {
        return rspn;
    }

    /**
     * Sets the value of the rspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType9 }
     *     
     */
    public DeviceResponse2 setRspn(ResponseType9 value) {
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
    public DeviceResponse2 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
