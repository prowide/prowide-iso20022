
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The TradeGiveUpTakeUpCancellationRequest message is sent by the giver to the clearing and settlement system to cancel the give-up process previously requested or by the clearing and settlement system to the giver and/or the taker as part of the housekeeping after the deadline.
 * 
 * Usage: The cancellation may be sent until the deadline or until the taker authorises or rejects the give up request, whichever event occurs first.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeGiveUpTakeUpCancellationRequestV01", propOrder = {
    "tradRefs",
    "cxlRsn",
    "splmtryData"
})
public class TradeGiveUpTakeUpCancellationRequestV01 {

    @XmlElement(name = "TradRefs", required = true)
    protected TradeReference3 tradRefs;
    @XmlElement(name = "CxlRsn")
    protected CancellationReason28 cxlRsn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the tradRefs property.
     * 
     * @return
     *     possible object is
     *     {@link TradeReference3 }
     *     
     */
    public TradeReference3 getTradRefs() {
        return tradRefs;
    }

    /**
     * Sets the value of the tradRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeReference3 }
     *     
     */
    public TradeGiveUpTakeUpCancellationRequestV01 setTradRefs(TradeReference3 value) {
        this.tradRefs = value;
        return this;
    }

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationReason28 }
     *     
     */
    public CancellationReason28 getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationReason28 }
     *     
     */
    public TradeGiveUpTakeUpCancellationRequestV01 setCxlRsn(CancellationReason28 value) {
        this.cxlRsn = value;
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
    public TradeGiveUpTakeUpCancellationRequestV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
