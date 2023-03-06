
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
 * The ForeignExchangeTradeConfirmationRequestCancellationRequest message is sent from a market participant to a Central matching utility (CMU) to amend the ForeignExchangeTradeConfirmationRequest previously sent.
 * 
 * Usage
 * The request is sent by the market participants to the CMU after the confirmation is requested.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignExchangeTradeConfirmationRequestCancellationRequestV01", propOrder = {
    "hdr",
    "cxlReqId",
    "tradgSdId",
    "ctrPtyRoleId",
    "tradId",
    "undrlygPdctTp",
    "splmtryData"
})
public class ForeignExchangeTradeConfirmationRequestCancellationRequestV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header23 hdr;
    @XmlElement(name = "CxlReqId")
    protected MessageIdentification1 cxlReqId;
    @XmlElement(name = "TradgSdId", required = true)
    protected TradePartyIdentification7 tradgSdId;
    @XmlElement(name = "CtrPtyRoleId", required = true)
    protected TradePartyIdentification7 ctrPtyRoleId;
    @XmlElement(name = "TradId", required = true)
    protected String tradId;
    @XmlElement(name = "UndrlygPdctTp", required = true)
    @XmlSchemaType(name = "string")
    protected UnderlyingProductIdentifier1Code undrlygPdctTp;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header23 }
     *     
     */
    public Header23 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header23 }
     *     
     */
    public ForeignExchangeTradeConfirmationRequestCancellationRequestV01 setHdr(Header23 value) {
        this.hdr = value;
        return this;
    }

    /**
     * Gets the value of the cxlReqId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getCxlReqId() {
        return cxlReqId;
    }

    /**
     * Sets the value of the cxlReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public ForeignExchangeTradeConfirmationRequestCancellationRequestV01 setCxlReqId(MessageIdentification1 value) {
        this.cxlReqId = value;
        return this;
    }

    /**
     * Gets the value of the tradgSdId property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentification7 }
     *     
     */
    public TradePartyIdentification7 getTradgSdId() {
        return tradgSdId;
    }

    /**
     * Sets the value of the tradgSdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentification7 }
     *     
     */
    public ForeignExchangeTradeConfirmationRequestCancellationRequestV01 setTradgSdId(TradePartyIdentification7 value) {
        this.tradgSdId = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentification7 }
     *     
     */
    public TradePartyIdentification7 getCtrPtyRoleId() {
        return ctrPtyRoleId;
    }

    /**
     * Sets the value of the ctrPtyRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentification7 }
     *     
     */
    public ForeignExchangeTradeConfirmationRequestCancellationRequestV01 setCtrPtyRoleId(TradePartyIdentification7 value) {
        this.ctrPtyRoleId = value;
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
    public ForeignExchangeTradeConfirmationRequestCancellationRequestV01 setTradId(String value) {
        this.tradId = value;
        return this;
    }

    /**
     * Gets the value of the undrlygPdctTp property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingProductIdentifier1Code }
     *     
     */
    public UnderlyingProductIdentifier1Code getUndrlygPdctTp() {
        return undrlygPdctTp;
    }

    /**
     * Sets the value of the undrlygPdctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingProductIdentifier1Code }
     *     
     */
    public ForeignExchangeTradeConfirmationRequestCancellationRequestV01 setUndrlygPdctTp(UnderlyingProductIdentifier1Code value) {
        this.undrlygPdctTp = value;
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
    public ForeignExchangeTradeConfirmationRequestCancellationRequestV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
