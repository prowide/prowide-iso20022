
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
 * SCOPE
 * An instructing party sends a SecurityQuery message to an executing/servicing party to request a report of financial instrument details in their system.
 * 
 * The instructing party - executing/servicing party relationship may be:
 * - Central Securities Depositories (CSD) who would like to publish security static data, or 
 * - a Corporate, or
 * - a Bank, or
 * - a Market Infrastructure, or 
 * - a Market Data Provider.
 * 
 * USAGE
 * The request is sent when the instructing party needs to see data of a security data within the executing/servicing party system.
 * 
 * Initiator: instructing party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityQueryV01", propOrder = {
    "msgHdr",
    "reqTp",
    "schCrit",
    "smlSetRtrCrit",
    "splmtryData"
})
public class SecurityQueryV01 {

    @XmlElement(name = "MsgHdr")
    protected MessageHeader1 msgHdr;
    @XmlElement(name = "ReqTp")
    protected GenericIdentification1 reqTp;
    @XmlElement(name = "SchCrit", required = true)
    protected SecuritiesSearchCriteria4 schCrit;
    @XmlElement(name = "SmlSetRtrCrit")
    protected SecuritiesReturnCriteria1 smlSetRtrCrit;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader1 }
     *     
     */
    public MessageHeader1 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader1 }
     *     
     */
    public SecurityQueryV01 setMsgHdr(MessageHeader1 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the reqTp property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification1 }
     *     
     */
    public GenericIdentification1 getReqTp() {
        return reqTp;
    }

    /**
     * Sets the value of the reqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification1 }
     *     
     */
    public SecurityQueryV01 setReqTp(GenericIdentification1 value) {
        this.reqTp = value;
        return this;
    }

    /**
     * Gets the value of the schCrit property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSearchCriteria4 }
     *     
     */
    public SecuritiesSearchCriteria4 getSchCrit() {
        return schCrit;
    }

    /**
     * Sets the value of the schCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSearchCriteria4 }
     *     
     */
    public SecurityQueryV01 setSchCrit(SecuritiesSearchCriteria4 value) {
        this.schCrit = value;
        return this;
    }

    /**
     * Gets the value of the smlSetRtrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesReturnCriteria1 }
     *     
     */
    public SecuritiesReturnCriteria1 getSmlSetRtrCrit() {
        return smlSetRtrCrit;
    }

    /**
     * Sets the value of the smlSetRtrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesReturnCriteria1 }
     *     
     */
    public SecurityQueryV01 setSmlSetRtrCrit(SecuritiesReturnCriteria1 value) {
        this.smlSetRtrCrit = value;
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
    public SecurityQueryV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
