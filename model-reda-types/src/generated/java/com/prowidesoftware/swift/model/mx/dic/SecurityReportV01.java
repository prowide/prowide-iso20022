
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
 * An executing/servicing party sends a SecurityReport message to an instructing party to advise the last known image of securities data's.
 * 
 * The report may be sent upon request (for example a query) of the instructing party or push by the executing/servicing party.
 * 
 * The instructing party - executing/servicing party relationship may be:
 * - Central Securities Depositories (CSD) who would like to publish security static data, or 
 * - a Corporate, or
 * - a Bank, or
 * - a Market Infrastructure, or 
 * - a Market Data Provider.
 * 
 * Initiator: executing/servicing party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityReportV01", propOrder = {
    "msgHdr",
    "pgntn",
    "sctyRptOrErr",
    "splmtryData"
})
public class SecurityReportV01 {

    @XmlElement(name = "MsgHdr")
    protected MessageHeader12 msgHdr;
    @XmlElement(name = "Pgntn", required = true)
    protected Pagination1 pgntn;
    @XmlElement(name = "SctyRptOrErr", required = true)
    protected SecurityOrOperationalError4Choice sctyRptOrErr;
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
    public SecurityReportV01 setMsgHdr(MessageHeader12 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public SecurityReportV01 setPgntn(Pagination1 value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the sctyRptOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityOrOperationalError4Choice }
     *     
     */
    public SecurityOrOperationalError4Choice getSctyRptOrErr() {
        return sctyRptOrErr;
    }

    /**
     * Sets the value of the sctyRptOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityOrOperationalError4Choice }
     *     
     */
    public SecurityReportV01 setSctyRptOrErr(SecurityOrOperationalError4Choice value) {
        this.sctyRptOrErr = value;
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
    public SecurityReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
