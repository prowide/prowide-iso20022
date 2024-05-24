
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
 * Scope:
 * The PartyStatusAdvice message is sent by the executing party to the instructing party to provide details about the processing of a request on party reference data (create or update).
 * 
 * Usage:
 * When processing information is negative - a failure occurred in applying the changes the message accordingly also delivers information about the reason why the creation or update could not be processed.
 * When processing is successfully performed, the message includes the related party identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyStatusAdviceV01", propOrder = {
    "msgHdr",
    "ptySts",
    "splmtryData"
})
public class PartyStatusAdviceV01 {

    @XmlElement(name = "MsgHdr")
    protected MessageHeader12 msgHdr;
    @XmlElement(name = "PtySts", required = true)
    protected PartyStatus2 ptySts;
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
    public PartyStatusAdviceV01 setMsgHdr(MessageHeader12 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the ptySts property.
     * 
     * @return
     *     possible object is
     *     {@link PartyStatus2 }
     *     
     */
    public PartyStatus2 getPtySts() {
        return ptySts;
    }

    /**
     * Sets the value of the ptySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyStatus2 }
     *     
     */
    public PartyStatusAdviceV01 setPtySts(PartyStatus2 value) {
        this.ptySts = value;
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
    public PartyStatusAdviceV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
