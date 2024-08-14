
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
 * The SecuritiesAccountQuery message sent by an instructing party to the executing party to request the details related to the securities account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesAccountQueryV01", propOrder = {
    "msgHdr",
    "schCrit",
    "rtrCrit",
    "splmtryData"
})
public class SecuritiesAccountQueryV01 {

    @XmlElement(name = "MsgHdr")
    protected MessageHeader2 msgHdr;
    @XmlElement(name = "SchCrit", required = true)
    protected SecuritiesAccountSearchCriteria2 schCrit;
    @XmlElement(name = "RtrCrit")
    protected SecuritiesAccountReturnCriteria1 rtrCrit;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader2 }
     *     
     */
    public MessageHeader2 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader2 }
     *     
     */
    public SecuritiesAccountQueryV01 setMsgHdr(MessageHeader2 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the schCrit property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccountSearchCriteria2 }
     *     
     */
    public SecuritiesAccountSearchCriteria2 getSchCrit() {
        return schCrit;
    }

    /**
     * Sets the value of the schCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccountSearchCriteria2 }
     *     
     */
    public SecuritiesAccountQueryV01 setSchCrit(SecuritiesAccountSearchCriteria2 value) {
        this.schCrit = value;
        return this;
    }

    /**
     * Gets the value of the rtrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccountReturnCriteria1 }
     *     
     */
    public SecuritiesAccountReturnCriteria1 getRtrCrit() {
        return rtrCrit;
    }

    /**
     * Sets the value of the rtrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccountReturnCriteria1 }
     *     
     */
    public SecuritiesAccountQueryV01 setRtrCrit(SecuritiesAccountReturnCriteria1 value) {
        this.rtrCrit = value;
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
    public SecuritiesAccountQueryV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
