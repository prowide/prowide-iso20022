
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Scope
 * The NotificationToReceiveCancellationAdvice message is sent by an account owner or by a party acting on the account owner's behalf to one of the account owner's account servicing institutions. It is used to advise the account servicing institution about the cancellation of one or more notifications in a previous NotificationToReceive message.
 * Usage
 * The NotificationToReceiveCancellationAdvice message is used to advise the account servicing institution that the funds are no longer expected. The message can be used in either a direct or a relay scenario.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationToReceiveCancellationAdviceV09", propOrder = {
    "grpHdr",
    "orgnlNtfctn",
    "cxlRsn",
    "splmtryData"
})
public class NotificationToReceiveCancellationAdviceV09 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader117 grpHdr;
    @XmlElement(name = "OrgnlNtfctn", required = true)
    protected OriginalNotification16 orgnlNtfctn;
    @XmlElement(name = "CxlRsn")
    protected NotificationCancellationReason2 cxlRsn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader117 }
     *     
     */
    public GroupHeader117 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader117 }
     *     
     */
    public NotificationToReceiveCancellationAdviceV09 setGrpHdr(GroupHeader117 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the orgnlNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalNotification16 }
     *     
     */
    public OriginalNotification16 getOrgnlNtfctn() {
        return orgnlNtfctn;
    }

    /**
     * Sets the value of the orgnlNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalNotification16 }
     *     
     */
    public NotificationToReceiveCancellationAdviceV09 setOrgnlNtfctn(OriginalNotification16 value) {
        this.orgnlNtfctn = value;
        return this;
    }

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationCancellationReason2 }
     *     
     */
    public NotificationCancellationReason2 getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationCancellationReason2 }
     *     
     */
    public NotificationToReceiveCancellationAdviceV09 setCxlRsn(NotificationCancellationReason2 value) {
        this.cxlRsn = value;
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
    public NotificationToReceiveCancellationAdviceV09 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
