
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
 * Provides details of many status advice reports where many received reports are reported at once.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageReportHeader4", propOrder = {
    "msgRptIdr",
    "msgSts",
    "rcrdSts",
    "splmtryData"
})
public class MessageReportHeader4 {

    @XmlElement(name = "MsgRptIdr")
    protected String msgRptIdr;
    @XmlElement(name = "MsgSts")
    protected StatusAdviceReport3 msgSts;
    @XmlElement(name = "RcrdSts")
    protected List<StatusReportRecord3> rcrdSts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgRptIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgRptIdr() {
        return msgRptIdr;
    }

    /**
     * Sets the value of the msgRptIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MessageReportHeader4 setMsgRptIdr(String value) {
        this.msgRptIdr = value;
        return this;
    }

    /**
     * Gets the value of the msgSts property.
     * 
     * @return
     *     possible object is
     *     {@link StatusAdviceReport3 }
     *     
     */
    public StatusAdviceReport3 getMsgSts() {
        return msgSts;
    }

    /**
     * Sets the value of the msgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusAdviceReport3 }
     *     
     */
    public MessageReportHeader4 setMsgSts(StatusAdviceReport3 value) {
        this.msgSts = value;
        return this;
    }

    /**
     * Gets the value of the rcrdSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rcrdSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcrdSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusReportRecord3 }
     * 
     * 
     * @return
     *     The value of the rcrdSts property.
     */
    public List<StatusReportRecord3> getRcrdSts() {
        if (rcrdSts == null) {
            rcrdSts = new ArrayList<>();
        }
        return this.rcrdSts;
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
     * Adds a new item to the rcrdSts list.
     * @see #getRcrdSts()
     * 
     */
    public MessageReportHeader4 addRcrdSts(StatusReportRecord3 rcrdSts) {
        getRcrdSts().add(rcrdSts);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public MessageReportHeader4 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
