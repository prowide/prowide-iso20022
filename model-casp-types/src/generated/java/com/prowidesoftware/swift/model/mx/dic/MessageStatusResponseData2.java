
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
@XmlType(name = "MessageStatusResponseData2", propOrder = {
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
public class MessageStatusResponseData2 {

    @XmlElement(name = "XchgId", required = true)
    protected String xchgId;
    @XmlElement(name = "InitgPty", required = true)
    protected GenericIdentification171 initgPty;
    @XmlElement(name = "TxRspn", required = true)
    protected ResponseType9 txRspn;
    @XmlElement(name = "RpeatdLltyRspn")
    protected LoyaltyResponse1 rpeatdLltyRspn;
    @XmlElement(name = "RpeatdPmtRspn")
    protected PaymentResponse1 rpeatdPmtRspn;
    @XmlElement(name = "RpeatdRvslRspn")
    protected ReversalResponse1 rpeatdRvslRspn;
    @XmlElement(name = "RpeatdStordValRspn")
    protected StoredValueResponse2 rpeatdStordValRspn;
    @XmlElement(name = "RpeatdCardAcqstnRspn")
    protected CardAcquisitionResponse1 rpeatdCardAcqstnRspn;
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
    public MessageStatusResponseData2 setXchgId(String value) {
        this.xchgId = value;
        return this;
    }

    /**
     * Gets the value of the initgPty property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification171 }
     *     
     */
    public GenericIdentification171 getInitgPty() {
        return initgPty;
    }

    /**
     * Sets the value of the initgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification171 }
     *     
     */
    public MessageStatusResponseData2 setInitgPty(GenericIdentification171 value) {
        this.initgPty = value;
        return this;
    }

    /**
     * Gets the value of the txRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType9 }
     *     
     */
    public ResponseType9 getTxRspn() {
        return txRspn;
    }

    /**
     * Sets the value of the txRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType9 }
     *     
     */
    public MessageStatusResponseData2 setTxRspn(ResponseType9 value) {
        this.txRspn = value;
        return this;
    }

    /**
     * Gets the value of the rpeatdLltyRspn property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyResponse1 }
     *     
     */
    public LoyaltyResponse1 getRpeatdLltyRspn() {
        return rpeatdLltyRspn;
    }

    /**
     * Sets the value of the rpeatdLltyRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyResponse1 }
     *     
     */
    public MessageStatusResponseData2 setRpeatdLltyRspn(LoyaltyResponse1 value) {
        this.rpeatdLltyRspn = value;
        return this;
    }

    /**
     * Gets the value of the rpeatdPmtRspn property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentResponse1 }
     *     
     */
    public PaymentResponse1 getRpeatdPmtRspn() {
        return rpeatdPmtRspn;
    }

    /**
     * Sets the value of the rpeatdPmtRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentResponse1 }
     *     
     */
    public MessageStatusResponseData2 setRpeatdPmtRspn(PaymentResponse1 value) {
        this.rpeatdPmtRspn = value;
        return this;
    }

    /**
     * Gets the value of the rpeatdRvslRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ReversalResponse1 }
     *     
     */
    public ReversalResponse1 getRpeatdRvslRspn() {
        return rpeatdRvslRspn;
    }

    /**
     * Sets the value of the rpeatdRvslRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversalResponse1 }
     *     
     */
    public MessageStatusResponseData2 setRpeatdRvslRspn(ReversalResponse1 value) {
        this.rpeatdRvslRspn = value;
        return this;
    }

    /**
     * Gets the value of the rpeatdStordValRspn property.
     * 
     * @return
     *     possible object is
     *     {@link StoredValueResponse2 }
     *     
     */
    public StoredValueResponse2 getRpeatdStordValRspn() {
        return rpeatdStordValRspn;
    }

    /**
     * Sets the value of the rpeatdStordValRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoredValueResponse2 }
     *     
     */
    public MessageStatusResponseData2 setRpeatdStordValRspn(StoredValueResponse2 value) {
        this.rpeatdStordValRspn = value;
        return this;
    }

    /**
     * Gets the value of the rpeatdCardAcqstnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CardAcquisitionResponse1 }
     *     
     */
    public CardAcquisitionResponse1 getRpeatdCardAcqstnRspn() {
        return rpeatdCardAcqstnRspn;
    }

    /**
     * Sets the value of the rpeatdCardAcqstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAcquisitionResponse1 }
     *     
     */
    public MessageStatusResponseData2 setRpeatdCardAcqstnRspn(CardAcquisitionResponse1 value) {
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
    public MessageStatusResponseData2 setRpeatdSndApplPrtcolDataUnitCardRdrRspn(DeviceSendApplicationProtocolDataUnitCardReaderResponse1 value) {
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
