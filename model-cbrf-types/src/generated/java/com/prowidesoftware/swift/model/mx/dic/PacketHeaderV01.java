
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
 * The PacketHeader message is used by CBR central payment system pool messages based on a business scenario.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PacketHeaderV01", propOrder = {
    "grpHdr",
    "packgTp",
    "cmonSts",
    "rptgSrc",
    "orgnlBizQry",
    "rcncltnPtcptAcctStmts",
    "splmtryData"
})
public class PacketHeaderV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader50 grpHdr;
    @XmlElement(name = "PackgTp", required = true)
    protected String packgTp;
    @XmlElement(name = "CmonSts")
    protected PaymentStatus2 cmonSts;
    @XmlElement(name = "RptgSrc")
    protected ReportingSource1Choice rptgSrc;
    @XmlElement(name = "OrgnlBizQry")
    protected OriginalBusinessQuery1 orgnlBizQry;
    @XmlElement(name = "RcncltnPtcptAcctStmts")
    protected Reconciliation1 rcncltnPtcptAcctStmts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader50 }
     *     
     */
    public GroupHeader50 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader50 }
     *     
     */
    public PacketHeaderV01 setGrpHdr(GroupHeader50 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the packgTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackgTp() {
        return packgTp;
    }

    /**
     * Sets the value of the packgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PacketHeaderV01 setPackgTp(String value) {
        this.packgTp = value;
        return this;
    }

    /**
     * Gets the value of the cmonSts property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatus2 }
     *     
     */
    public PaymentStatus2 getCmonSts() {
        return cmonSts;
    }

    /**
     * Sets the value of the cmonSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatus2 }
     *     
     */
    public PacketHeaderV01 setCmonSts(PaymentStatus2 value) {
        this.cmonSts = value;
        return this;
    }

    /**
     * Gets the value of the rptgSrc property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingSource1Choice }
     *     
     */
    public ReportingSource1Choice getRptgSrc() {
        return rptgSrc;
    }

    /**
     * Sets the value of the rptgSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingSource1Choice }
     *     
     */
    public PacketHeaderV01 setRptgSrc(ReportingSource1Choice value) {
        this.rptgSrc = value;
        return this;
    }

    /**
     * Gets the value of the orgnlBizQry property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalBusinessQuery1 }
     *     
     */
    public OriginalBusinessQuery1 getOrgnlBizQry() {
        return orgnlBizQry;
    }

    /**
     * Sets the value of the orgnlBizQry property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalBusinessQuery1 }
     *     
     */
    public PacketHeaderV01 setOrgnlBizQry(OriginalBusinessQuery1 value) {
        this.orgnlBizQry = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnPtcptAcctStmts property.
     * 
     * @return
     *     possible object is
     *     {@link Reconciliation1 }
     *     
     */
    public Reconciliation1 getRcncltnPtcptAcctStmts() {
        return rcncltnPtcptAcctStmts;
    }

    /**
     * Sets the value of the rcncltnPtcptAcctStmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reconciliation1 }
     *     
     */
    public PacketHeaderV01 setRcncltnPtcptAcctStmts(Reconciliation1 value) {
        this.rcncltnPtcptAcctStmts = value;
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
    public PacketHeaderV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
