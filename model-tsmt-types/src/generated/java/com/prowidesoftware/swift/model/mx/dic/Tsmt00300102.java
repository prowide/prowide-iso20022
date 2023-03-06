
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
 * The ActivityReportRequest message is sent by either party involved in a transaction to the matching application.
 * This message is used to request a report on all transactions for which an activity has taken place within a given time span.
 * Usage
 * The ActivityReportRequest message can be sent
 * - at a pre-determined time. The message requests a report on all transactions that the requester is involved in and for which an activity has taken place within the last 24 hours.
 * - on demand. The message requests a report on all transactions that the requester is involved in and for which an activity has taken place within a time span specified by the requester.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tsmt.003.001.02", propOrder = {
    "reqId",
    "submitr",
    "nttiesToBeRptd",
    "rptPrd"
})
public class Tsmt00300102 {

    @XmlElement(name = "ReqId", required = true)
    protected MessageIdentification1 reqId;
    @XmlElement(name = "Submitr", required = true)
    protected BICIdentification1 submitr;
    @XmlElement(name = "NttiesToBeRptd")
    protected List<BICIdentification1> nttiesToBeRptd;
    @XmlElement(name = "RptPrd", required = true)
    protected DateTimePeriodDetails1 rptPrd;

    /**
     * Gets the value of the reqId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getReqId() {
        return reqId;
    }

    /**
     * Sets the value of the reqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public Tsmt00300102 setReqId(MessageIdentification1 value) {
        this.reqId = value;
        return this;
    }

    /**
     * Gets the value of the submitr property.
     * 
     * @return
     *     possible object is
     *     {@link BICIdentification1 }
     *     
     */
    public BICIdentification1 getSubmitr() {
        return submitr;
    }

    /**
     * Sets the value of the submitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BICIdentification1 }
     *     
     */
    public Tsmt00300102 setSubmitr(BICIdentification1 value) {
        this.submitr = value;
        return this;
    }

    /**
     * Gets the value of the nttiesToBeRptd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nttiesToBeRptd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNttiesToBeRptd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BICIdentification1 }
     * 
     * 
     */
    public List<BICIdentification1> getNttiesToBeRptd() {
        if (nttiesToBeRptd == null) {
            nttiesToBeRptd = new ArrayList<BICIdentification1>();
        }
        return this.nttiesToBeRptd;
    }

    /**
     * Gets the value of the rptPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodDetails1 }
     *     
     */
    public DateTimePeriodDetails1 getRptPrd() {
        return rptPrd;
    }

    /**
     * Sets the value of the rptPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodDetails1 }
     *     
     */
    public Tsmt00300102 setRptPrd(DateTimePeriodDetails1 value) {
        this.rptPrd = value;
        return this;
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
     * Adds a new item to the nttiesToBeRptd list.
     * @see #getNttiesToBeRptd()
     * 
     */
    public Tsmt00300102 addNttiesToBeRptd(BICIdentification1 nttiesToBeRptd) {
        getNttiesToBeRptd().add(nttiesToBeRptd);
        return this;
    }

}
