
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
 * Scope
 * The Net Position Report message is sent by the central counterparty (CCP) to a clearing member to confirm the net position of all trade legs reported during the day.
 * 
 * The message definition is intended for use with the ISO 20022 Business Application Header.
 * 
 * Usage
 * The central counterparty (CCP) nets all the positions per clearing account and sends the Net Position report message to the Clearing member.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetPositionV04", propOrder = {
    "rptParams",
    "pgntn",
    "clrMmb",
    "clrSgmt",
    "netPosRpt",
    "splmtryData"
})
public class NetPositionV04 {

    @XmlElement(name = "RptParams", required = true)
    protected ReportParameters7 rptParams;
    @XmlElement(name = "Pgntn", required = true)
    protected Pagination1 pgntn;
    @XmlElement(name = "ClrMmb", required = true)
    protected PartyIdentification253Choice clrMmb;
    @XmlElement(name = "ClrSgmt")
    protected PartyIdentification253Choice clrSgmt;
    @XmlElement(name = "NetPosRpt", required = true)
    protected List<NetPosition4> netPosRpt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rptParams property.
     * 
     * @return
     *     possible object is
     *     {@link ReportParameters7 }
     *     
     */
    public ReportParameters7 getRptParams() {
        return rptParams;
    }

    /**
     * Sets the value of the rptParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportParameters7 }
     *     
     */
    public NetPositionV04 setRptParams(ReportParameters7 value) {
        this.rptParams = value;
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
    public NetPositionV04 setPgntn(Pagination1 value) {
        this.pgntn = value;
        return this;
    }

    /**
     * Gets the value of the clrMmb property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification253Choice }
     *     
     */
    public PartyIdentification253Choice getClrMmb() {
        return clrMmb;
    }

    /**
     * Sets the value of the clrMmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification253Choice }
     *     
     */
    public NetPositionV04 setClrMmb(PartyIdentification253Choice value) {
        this.clrMmb = value;
        return this;
    }

    /**
     * Gets the value of the clrSgmt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification253Choice }
     *     
     */
    public PartyIdentification253Choice getClrSgmt() {
        return clrSgmt;
    }

    /**
     * Sets the value of the clrSgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification253Choice }
     *     
     */
    public NetPositionV04 setClrSgmt(PartyIdentification253Choice value) {
        this.clrSgmt = value;
        return this;
    }

    /**
     * Gets the value of the netPosRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netPosRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetPosRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetPosition4 }
     * 
     * 
     */
    public List<NetPosition4> getNetPosRpt() {
        if (netPosRpt == null) {
            netPosRpt = new ArrayList<NetPosition4>();
        }
        return this.netPosRpt;
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
     * Adds a new item to the netPosRpt list.
     * @see #getNetPosRpt()
     * 
     */
    public NetPositionV04 addNetPosRpt(NetPosition4 netPosRpt) {
        getNetPosRpt().add(netPosRpt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public NetPositionV04 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
