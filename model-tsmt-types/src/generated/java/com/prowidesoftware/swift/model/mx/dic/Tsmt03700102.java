
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
 * Scope
 * The StatusReport message is sent by the matching application to the requester of a status report.
 * This message is used to report on the status of transactions registered in the matching application.
 * Usage
 * The StatusReport message can be sent by the matching application to report on the status and sub-status of all transactions that the requester of the report is involved in. The message can be sent in response to a StatusReportRequest message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tsmt.037.001.02", propOrder = {
    "rptId",
    "rltdMsgRef",
    "rptdItms"
})
public class Tsmt03700102 {

    @XmlElement(name = "RptId", required = true)
    protected MessageIdentification1 rptId;
    @XmlElement(name = "RltdMsgRef", required = true)
    protected MessageIdentification1 rltdMsgRef;
    @XmlElement(name = "RptdItms")
    protected List<StatusReportItems1> rptdItms;

    /**
     * Gets the value of the rptId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getRptId() {
        return rptId;
    }

    /**
     * Sets the value of the rptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public Tsmt03700102 setRptId(MessageIdentification1 value) {
        this.rptId = value;
        return this;
    }

    /**
     * Gets the value of the rltdMsgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getRltdMsgRef() {
        return rltdMsgRef;
    }

    /**
     * Sets the value of the rltdMsgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public Tsmt03700102 setRltdMsgRef(MessageIdentification1 value) {
        this.rltdMsgRef = value;
        return this;
    }

    /**
     * Gets the value of the rptdItms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rptdItms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRptdItms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusReportItems1 }
     * 
     * 
     * @return
     *     The value of the rptdItms property.
     */
    public List<StatusReportItems1> getRptdItms() {
        if (rptdItms == null) {
            rptdItms = new ArrayList<>();
        }
        return this.rptdItms;
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
     * Adds a new item to the rptdItms list.
     * @see #getRptdItms()
     * 
     */
    public Tsmt03700102 addRptdItms(StatusReportItems1 rptdItms) {
        getRptdItms().add(rptdItms);
        return this;
    }

}
