
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
 * Scope
 * The ForeignExchangeTradeCaptureReportAcknowledgement message is sent by trading members to the trading system for notifying the trade capture report is received.
 * 
 * Usage
 * The acknowledgement is sent by the trading member to the trading system after they received the trade capture report. 
 * Note that one capture acknowledgement responds to one capture report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignExchangeTradeCaptureReportAcknowledgementV02", propOrder = {
    "ackId",
    "tradId",
    "dealTcktId",
    "sts",
    "ref",
    "splmtryData"
})
public class ForeignExchangeTradeCaptureReportAcknowledgementV02 {

    @XmlElement(name = "AckId")
    protected MessageIdentification1 ackId;
    @XmlElement(name = "TradId", required = true)
    protected String tradId;
    @XmlElement(name = "DealTcktId")
    protected String dealTcktId;
    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected Status5Code sts;
    @XmlElement(name = "Ref")
    protected AdditionalReferences2 ref;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the ackId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getAckId() {
        return ackId;
    }

    /**
     * Sets the value of the ackId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public ForeignExchangeTradeCaptureReportAcknowledgementV02 setAckId(MessageIdentification1 value) {
        this.ackId = value;
        return this;
    }

    /**
     * Gets the value of the tradId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradId() {
        return tradId;
    }

    /**
     * Sets the value of the tradId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ForeignExchangeTradeCaptureReportAcknowledgementV02 setTradId(String value) {
        this.tradId = value;
        return this;
    }

    /**
     * Gets the value of the dealTcktId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealTcktId() {
        return dealTcktId;
    }

    /**
     * Sets the value of the dealTcktId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ForeignExchangeTradeCaptureReportAcknowledgementV02 setDealTcktId(String value) {
        this.dealTcktId = value;
        return this;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link Status5Code }
     *     
     */
    public Status5Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status5Code }
     *     
     */
    public ForeignExchangeTradeCaptureReportAcknowledgementV02 setSts(Status5Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReferences2 }
     *     
     */
    public AdditionalReferences2 getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReferences2 }
     *     
     */
    public ForeignExchangeTradeCaptureReportAcknowledgementV02 setRef(AdditionalReferences2 value) {
        this.ref = value;
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
    public ForeignExchangeTradeCaptureReportAcknowledgementV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
