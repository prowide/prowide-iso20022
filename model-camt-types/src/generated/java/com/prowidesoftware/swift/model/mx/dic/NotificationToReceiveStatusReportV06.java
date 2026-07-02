
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
 * The NotificationToReceiveStatusReport message is sent by an account servicing institution to an account owner or to a party acting on the account owner's behalf. It is used to notify the account owner about the status of one or more expected payments that were advised in a previous NotificationToReceive message.
 * Usage
 * The NotificationToReceiveStatusReport message is sent in response to a NotificationToReceive message and can be used in either a direct or a relay scenario. It is used to advise the account owner of receipt of the funds as expected. It is also used to notify the account owner of non-receipt of funds or of discrepancies in the funds received.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationToReceiveStatusReportV06", propOrder = {
    "grpHdr",
    "orgnlNtfctnAndSts",
    "splmtryData"
})
public class NotificationToReceiveStatusReportV06 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader84 grpHdr;
    @XmlElement(name = "OrgnlNtfctnAndSts", required = true)
    protected OriginalNotification11 orgnlNtfctnAndSts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader84 }
     *     
     */
    public GroupHeader84 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader84 }
     *     
     */
    public NotificationToReceiveStatusReportV06 setGrpHdr(GroupHeader84 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the orgnlNtfctnAndSts property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalNotification11 }
     *     
     */
    public OriginalNotification11 getOrgnlNtfctnAndSts() {
        return orgnlNtfctnAndSts;
    }

    /**
     * Sets the value of the orgnlNtfctnAndSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalNotification11 }
     *     
     */
    public NotificationToReceiveStatusReportV06 setOrgnlNtfctnAndSts(OriginalNotification11 value) {
        this.orgnlNtfctnAndSts = value;
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
    public NotificationToReceiveStatusReportV06 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
