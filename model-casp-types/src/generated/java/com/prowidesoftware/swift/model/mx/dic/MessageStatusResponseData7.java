
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Content of the Message status Response.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageStatusResponseData7", propOrder = {
    "xchgId",
    "initgPty",
    "txRspn",
    "rpeatdLltyRspn",
    "rpeatdPmtRspn",
    "rpeatdRvslRspn",
    "rpeatdStordValRspn",
    "rpeatdCardAcqstnRspn",
    "rpeatdSndApplPrtcolDataUnitCardRdrRspn"
})
public class MessageStatusResponseData7 {

    @XmlElement(name = "XchgId", required = true)
    protected String xchgId;
    @XmlElement(name = "InitgPty", required = true)
    protected GenericIdentification177 initgPty;
    @XmlElement(name = "TxRspn", required = true)
    protected ResponseType11 txRspn;
    @XmlElement(name = "RpeatdLltyRspn")
    protected LoyaltyResponse3 rpeatdLltyRspn;
    @XmlElement(name = "RpeatdPmtRspn")
    protected PaymentResponse5 rpeatdPmtRspn;
    @XmlElement(name = "RpeatdRvslRspn")
    protected ReversalResponse7 rpeatdRvslRspn;
    @XmlElement(name = "RpeatdStordValRspn")
    protected StoredValueResponse6 rpeatdStordValRspn;
    @XmlElement(name = "RpeatdCardAcqstnRspn")
    protected CardAcquisitionResponse3 rpeatdCardAcqstnRspn;
    @XmlElement(name = "RpeatdSndApplPrtcolDataUnitCardRdrRspn")
    protected DeviceSendApplicationProtocolDataUnitCardReaderResponse1 rpeatdSndApplPrtcolDataUnitCardRdrRspn;

    /**
     * Gets the value of the xchgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXchgId() {
        return xchgId;
    }

    /**
     * Sets the value of the xchgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MessageStatusResponseData7 setXchgId(String value) {
        this.xchgId = value;
        return this;
    }

    /**
     * Gets the value of the initgPty property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification177 }
     *     
     */
    public GenericIdentification177 getInitgPty() {
        return initgPty;
    }

    /**
     * Sets the value of the initgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification177 }
     *     
     */
    public MessageStatusResponseData7 setInitgPty(GenericIdentification177 value) {
        this.initgPty = value;
        return this;
    }

    /**
     * Gets the value of the txRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType11 }
     *     
     */
    public ResponseType11 getTxRspn() {
        return txRspn;
    }

    /**
     * Sets the value of the txRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType11 }
     *     
     */
    public MessageStatusResponseData7 setTxRspn(ResponseType11 value) {
        this.txRspn = value;
        return this;
    }

    /**
     * Gets the value of the rpeatdLltyRspn property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyResponse3 }
     *     
     */
    public LoyaltyResponse3 getRpeatdLltyRspn() {
        return rpeatdLltyRspn;
    }

    /**
     * Sets the value of the rpeatdLltyRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyResponse3 }
     *     
     */
    public MessageStatusResponseData7 setRpeatdLltyRspn(LoyaltyResponse3 value) {
        this.rpeatdLltyRspn = value;
        return this;
    }

    /**
     * Gets the value of the rpeatdPmtRspn property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentResponse5 }
     *     
     */
    public PaymentResponse5 getRpeatdPmtRspn() {
        return rpeatdPmtRspn;
    }

    /**
     * Sets the value of the rpeatdPmtRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentResponse5 }
     *     
     */
    public MessageStatusResponseData7 setRpeatdPmtRspn(PaymentResponse5 value) {
        this.rpeatdPmtRspn = value;
        return this;
    }

    /**
     * Gets the value of the rpeatdRvslRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ReversalResponse7 }
     *     
     */
    public ReversalResponse7 getRpeatdRvslRspn() {
        return rpeatdRvslRspn;
    }

    /**
     * Sets the value of the rpeatdRvslRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversalResponse7 }
     *     
     */
    public MessageStatusResponseData7 setRpeatdRvslRspn(ReversalResponse7 value) {
        this.rpeatdRvslRspn = value;
        return this;
    }

    /**
     * Gets the value of the rpeatdStordValRspn property.
     * 
     * @return
     *     possible object is
     *     {@link StoredValueResponse6 }
     *     
     */
    public StoredValueResponse6 getRpeatdStordValRspn() {
        return rpeatdStordValRspn;
    }

    /**
     * Sets the value of the rpeatdStordValRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoredValueResponse6 }
     *     
     */
    public MessageStatusResponseData7 setRpeatdStordValRspn(StoredValueResponse6 value) {
        this.rpeatdStordValRspn = value;
        return this;
    }

    /**
     * Gets the value of the rpeatdCardAcqstnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CardAcquisitionResponse3 }
     *     
     */
    public CardAcquisitionResponse3 getRpeatdCardAcqstnRspn() {
        return rpeatdCardAcqstnRspn;
    }

    /**
     * Sets the value of the rpeatdCardAcqstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAcquisitionResponse3 }
     *     
     */
    public MessageStatusResponseData7 setRpeatdCardAcqstnRspn(CardAcquisitionResponse3 value) {
        this.rpeatdCardAcqstnRspn = value;
        return this;
    }

    /**
     * Gets the value of the rpeatdSndApplPrtcolDataUnitCardRdrRspn property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceSendApplicationProtocolDataUnitCardReaderResponse1 }
     *     
     */
    public DeviceSendApplicationProtocolDataUnitCardReaderResponse1 getRpeatdSndApplPrtcolDataUnitCardRdrRspn() {
        return rpeatdSndApplPrtcolDataUnitCardRdrRspn;
    }

    /**
     * Sets the value of the rpeatdSndApplPrtcolDataUnitCardRdrRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceSendApplicationProtocolDataUnitCardReaderResponse1 }
     *     
     */
    public MessageStatusResponseData7 setRpeatdSndApplPrtcolDataUnitCardRdrRspn(DeviceSendApplicationProtocolDataUnitCardReaderResponse1 value) {
        this.rpeatdSndApplPrtcolDataUnitCardRdrRspn = value;
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

}
