
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
 * SCOPE
 * An executing/servicing party sends a SecurityCSDLinkStatusAdvice message to an instructing party to report the status of a SecurityCSDLink Request message previously sent by the instructing party. 
 * 
 * The SecurityCSDLinkStatusAdvice message may be sent as a response to the request of the instructing party or not.
 * 
 * The instructing party - executing/servicing party relationship may be:
 * - Central Securities Depositories (CSD) who would like to publish security CSD Link static data, or 
 * - a Corporate, or
 * - a Bank, or
 * - a Market Infrastructure, or 
 * - a Market Data Provider.
 * 
 * USAGE
 * Initiator: executing/servicing party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityCSDLinkStatusAdviceV01", propOrder = {
    "msgHdr",
    "sctyCSDLkSts",
    "sctyCSDLkId",
    "splmtryData"
})
public class SecurityCSDLinkStatusAdviceV01 {

    @XmlElement(name = "MsgHdr")
    protected MessageHeader12 msgHdr;
    @XmlElement(name = "SctyCSDLkSts", required = true)
    protected CSDLinkStatus1 sctyCSDLkSts;
    @XmlElement(name = "SctyCSDLkId")
    protected SecurityCSDLink9 sctyCSDLkId;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader12 }
     *     
     */
    public MessageHeader12 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader12 }
     *     
     */
    public SecurityCSDLinkStatusAdviceV01 setMsgHdr(MessageHeader12 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the sctyCSDLkSts property.
     * 
     * @return
     *     possible object is
     *     {@link CSDLinkStatus1 }
     *     
     */
    public CSDLinkStatus1 getSctyCSDLkSts() {
        return sctyCSDLkSts;
    }

    /**
     * Sets the value of the sctyCSDLkSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CSDLinkStatus1 }
     *     
     */
    public SecurityCSDLinkStatusAdviceV01 setSctyCSDLkSts(CSDLinkStatus1 value) {
        this.sctyCSDLkSts = value;
        return this;
    }

    /**
     * Gets the value of the sctyCSDLkId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityCSDLink9 }
     *     
     */
    public SecurityCSDLink9 getSctyCSDLkId() {
        return sctyCSDLkId;
    }

    /**
     * Sets the value of the sctyCSDLkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityCSDLink9 }
     *     
     */
    public SecurityCSDLinkStatusAdviceV01 setSctyCSDLkId(SecurityCSDLink9 value) {
        this.sctyCSDLkId = value;
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
    public SecurityCSDLinkStatusAdviceV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
