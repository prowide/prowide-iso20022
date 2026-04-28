
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
 * SCOPE:
 * The AccountLinkStatusAdvice message is sent by the executing/servicing party to the instructing party to provide details about the processing of a request on account link reference data (create or update).
 * 
 * The instructing party - executing/servicing party relationship may be:
 * - Central Securities Depositories (CSD) who would like to publish account link static data, or
 * - a Corporate, or
 * - a Bank, or
 * - a Market Infrastructure, or
 * - a Market Data Provider.
 * 
 * USAGE:
 * Initiator: executing/servicing party
 * 
 * When processing information is negative - a failure occurred in applying the changes the message accordingly also delivers information about the reason why the creation or update could not be processed.
 * When the processing is successfully performed, the message includes the related account link identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountLinkStatusAdviceV01", propOrder = {
    "msgHdr",
    "acctLkSts",
    "acctLkId",
    "splmtryData"
})
public class AccountLinkStatusAdviceV01 {

    @XmlElement(name = "MsgHdr")
    protected MessageHeader12 msgHdr;
    @XmlElement(name = "AcctLkSts", required = true)
    protected AccountLinkStatus1 acctLkSts;
    @XmlElement(name = "AcctLkId")
    protected AccountLink8 acctLkId;
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
    public AccountLinkStatusAdviceV01 setMsgHdr(MessageHeader12 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the acctLkSts property.
     * 
     * @return
     *     possible object is
     *     {@link AccountLinkStatus1 }
     *     
     */
    public AccountLinkStatus1 getAcctLkSts() {
        return acctLkSts;
    }

    /**
     * Sets the value of the acctLkSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountLinkStatus1 }
     *     
     */
    public AccountLinkStatusAdviceV01 setAcctLkSts(AccountLinkStatus1 value) {
        this.acctLkSts = value;
        return this;
    }

    /**
     * Gets the value of the acctLkId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountLink8 }
     *     
     */
    public AccountLink8 getAcctLkId() {
        return acctLkId;
    }

    /**
     * Sets the value of the acctLkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountLink8 }
     *     
     */
    public AccountLinkStatusAdviceV01 setAcctLkId(AccountLink8 value) {
        this.acctLkId = value;
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
    public AccountLinkStatusAdviceV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
