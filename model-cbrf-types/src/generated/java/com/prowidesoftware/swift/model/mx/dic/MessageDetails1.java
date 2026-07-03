
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
 * Summary details about CBRF electronic informational message in the report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageDetails1", propOrder = {
    "rptId",
    "rptPgntn",
    "ttlNbOfNtries",
    "sntNtry",
    "rcvdNtry"
})
public class MessageDetails1 {

    @XmlElement(name = "RptId")
    protected String rptId;
    @XmlElement(name = "RptPgntn")
    protected Pagination rptPgntn;
    @XmlElement(name = "TtlNbOfNtries", required = true)
    protected String ttlNbOfNtries;
    @XmlElement(name = "SntNtry")
    protected List<CBRFReportEntry1> sntNtry;
    @XmlElement(name = "RcvdNtry")
    protected List<CBRFReportEntry1> rcvdNtry;

    /**
     * Gets the value of the rptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptId() {
        return rptId;
    }

    /**
     * Sets the value of the rptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MessageDetails1 setRptId(String value) {
        this.rptId = value;
        return this;
    }

    /**
     * Gets the value of the rptPgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getRptPgntn() {
        return rptPgntn;
    }

    /**
     * Sets the value of the rptPgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public MessageDetails1 setRptPgntn(Pagination value) {
        this.rptPgntn = value;
        return this;
    }

    /**
     * Gets the value of the ttlNbOfNtries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlNbOfNtries() {
        return ttlNbOfNtries;
    }

    /**
     * Sets the value of the ttlNbOfNtries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MessageDetails1 setTtlNbOfNtries(String value) {
        this.ttlNbOfNtries = value;
        return this;
    }

    /**
     * Gets the value of the sntNtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sntNtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSntNtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CBRFReportEntry1 }
     * 
     * 
     */
    public List<CBRFReportEntry1> getSntNtry() {
        if (sntNtry == null) {
            sntNtry = new ArrayList<CBRFReportEntry1>();
        }
        return this.sntNtry;
    }

    /**
     * Gets the value of the rcvdNtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rcvdNtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcvdNtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CBRFReportEntry1 }
     * 
     * 
     */
    public List<CBRFReportEntry1> getRcvdNtry() {
        if (rcvdNtry == null) {
            rcvdNtry = new ArrayList<CBRFReportEntry1>();
        }
        return this.rcvdNtry;
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
     * Adds a new item to the sntNtry list.
     * @see #getSntNtry()
     * 
     */
    public MessageDetails1 addSntNtry(CBRFReportEntry1 sntNtry) {
        getSntNtry().add(sntNtry);
        return this;
    }

    /**
     * Adds a new item to the rcvdNtry list.
     * @see #getRcvdNtry()
     * 
     */
    public MessageDetails1 addRcvdNtry(CBRFReportEntry1 rcvdNtry) {
        getRcvdNtry().add(rcvdNtry);
        return this;
    }

}
