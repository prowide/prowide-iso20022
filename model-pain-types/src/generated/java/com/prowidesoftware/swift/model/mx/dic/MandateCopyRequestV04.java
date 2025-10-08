
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
 * The MandateCopyRequest message is sent by the initiator of the request to his agent. The initiator can either be the debtor or the creditor.
 * The MandateCopyRequest message is forwarded by the agent of the initiator to the agent of the counterparty.
 * A MandateCopyRequest message is used to request a copy of an existing mandate. If accepted, the mandate copy can be sent using the MandateAcceptanceReport message.
 * Usage
 * The MandateCopyRequest message can contain one or more copy requests.
 * The messages can be exchanged between creditor and creditor agent or debtor and debtor agent and between creditor agent and debtor agent.
 * The message can also be used by an initiating party that has authority to send the message on behalf of the creditor or debtor.
 * The MandateCopyRequest message can be used in domestic and cross-border scenarios.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateCopyRequestV04", propOrder = {
    "grpHdr",
    "undrlygCpyReqDtls",
    "splmtryData"
})
public class MandateCopyRequestV04 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader110 grpHdr;
    @XmlElement(name = "UndrlygCpyReqDtls", required = true)
    protected List<MandateCopy4> undrlygCpyReqDtls;
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
    public MandateCopyRequestV04 setGrpHdr(GroupHeader110 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the undrlygCpyReqDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undrlygCpyReqDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygCpyReqDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MandateCopy4 }
     * 
     * 
     */
    public List<MandateCopy4> getUndrlygCpyReqDtls() {
        if (undrlygCpyReqDtls == null) {
            undrlygCpyReqDtls = new ArrayList<MandateCopy4>();
        }
        return this.undrlygCpyReqDtls;
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
     * Adds a new item to the undrlygCpyReqDtls list.
     * @see #getUndrlygCpyReqDtls()
     * 
     */
    public MandateCopyRequestV04 addUndrlygCpyReqDtls(MandateCopy4 undrlygCpyReqDtls) {
        getUndrlygCpyReqDtls().add(undrlygCpyReqDtls);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public MandateCopyRequestV04 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
