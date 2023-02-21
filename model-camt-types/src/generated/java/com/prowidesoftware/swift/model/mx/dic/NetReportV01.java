
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
 * The Net Report message is sent to a participant by a central system to provide details of the of the bi-lateral payment obligations, calculated by the central system per currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetReportV01", propOrder = {
    "netRptData",
    "netSvcPtcptId",
    "netSvcCtrPtyId",
    "netOblgtn",
    "splmtryData"
})
public class NetReportV01 {

    @XmlElement(name = "NetRptData", required = true)
    protected NetReportData1 netRptData;
    @XmlElement(name = "NetSvcPtcptId", required = true)
    protected PartyIdentification73Choice netSvcPtcptId;
    @XmlElement(name = "NetSvcCtrPtyId")
    protected PartyIdentification73Choice netSvcCtrPtyId;
    @XmlElement(name = "NetOblgtn", required = true)
    protected List<NetObligation1> netOblgtn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the netRptData property.
     * 
     * @return
     *     possible object is
     *     {@link NetReportData1 }
     *     
     */
    public NetReportData1 getNetRptData() {
        return netRptData;
    }

    /**
     * Sets the value of the netRptData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetReportData1 }
     *     
     */
    public NetReportV01 setNetRptData(NetReportData1 value) {
        this.netRptData = value;
        return this;
    }

    /**
     * Gets the value of the netSvcPtcptId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public PartyIdentification73Choice getNetSvcPtcptId() {
        return netSvcPtcptId;
    }

    /**
     * Sets the value of the netSvcPtcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public NetReportV01 setNetSvcPtcptId(PartyIdentification73Choice value) {
        this.netSvcPtcptId = value;
        return this;
    }

    /**
     * Gets the value of the netSvcCtrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public PartyIdentification73Choice getNetSvcCtrPtyId() {
        return netSvcCtrPtyId;
    }

    /**
     * Sets the value of the netSvcCtrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public NetReportV01 setNetSvcCtrPtyId(PartyIdentification73Choice value) {
        this.netSvcCtrPtyId = value;
        return this;
    }

    /**
     * Gets the value of the netOblgtn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the netOblgtn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetOblgtn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetObligation1 }
     * 
     * 
     */
    public List<NetObligation1> getNetOblgtn() {
        if (netOblgtn == null) {
            netOblgtn = new ArrayList<NetObligation1>();
        }
        return this.netOblgtn;
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
     * Adds a new item to the netOblgtn list.
     * @see #getNetOblgtn()
     * 
     */
    public NetReportV01 addNetOblgtn(NetObligation1 netOblgtn) {
        getNetOblgtn().add(netOblgtn);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public NetReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
