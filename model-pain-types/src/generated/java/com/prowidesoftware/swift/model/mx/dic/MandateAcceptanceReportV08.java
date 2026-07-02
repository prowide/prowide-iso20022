
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
 * The MandateAcceptanceReport message is sent from the agent of the receiver (debtor or creditor) of the MandateRequest message (initiation, amendment or cancellation) to the agent of the initiator of the MandateRequest message (debtor or creditor).
 * A MandateAcceptanceReport message is used to confirm the acceptance or rejection of a MandateRequest message. Where acceptance is part of the full process flow, a MandateRequest message only becomes valid after a confirmation of acceptance is received through a MandateAcceptanceReport message from the agent of the receiver.
 * Usage
 * The MandateAcceptanceReport message can contain one or more confirmation(s) of acceptance or rejection of a specific Mandate Request.
 * The messages can be exchanged between debtor agent and creditor agent and between debtor agent and debtor and creditor agent and creditor.
 * The MandateAcceptanceReport message can be used in domestic and cross-border scenarios.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateAcceptanceReportV08", propOrder = {
    "grpHdr",
    "undrlygAccptncDtls",
    "splmtryData"
})
public class MandateAcceptanceReportV08 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader110 grpHdr;
    @XmlElement(name = "UndrlygAccptncDtls", required = true)
    protected List<MandateAcceptance8> undrlygAccptncDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader110 }
     *     
     */
    public GroupHeader110 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader110 }
     *     
     */
    public MandateAcceptanceReportV08 setGrpHdr(GroupHeader110 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the undrlygAccptncDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undrlygAccptncDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygAccptncDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MandateAcceptance8 }
     * 
     * 
     */
    public List<MandateAcceptance8> getUndrlygAccptncDtls() {
        if (undrlygAccptncDtls == null) {
            undrlygAccptncDtls = new ArrayList<MandateAcceptance8>();
        }
        return this.undrlygAccptncDtls;
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
     * Adds a new item to the undrlygAccptncDtls list.
     * @see #getUndrlygAccptncDtls()
     * 
     */
    public MandateAcceptanceReportV08 addUndrlygAccptncDtls(MandateAcceptance8 undrlygAccptncDtls) {
        getUndrlygAccptncDtls().add(undrlygAccptncDtls);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public MandateAcceptanceReportV08 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
