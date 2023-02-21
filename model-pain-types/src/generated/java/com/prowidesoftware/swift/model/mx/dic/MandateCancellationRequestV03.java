
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
 * The MandateCancellationRequest message is sent by the initiator of the request to his agent. The initiator can either be the debtor or the creditor.
 * The MandateCancellationRequest message is forwarded by the agent of the initiator to the agent of the counterparty.
 * A MandateCancellationRequest message is used to request the cancellation of an existing mandate. If accepted, this MandateCancellationRequest message together with the MandateAcceptanceReport message confirming the acceptance will be considered a valid cancellation of an existing mandate, agreed upon by all parties.
 * Usage
 * The MandateCancellationRequest message can contain one or more request(s) to cancel a specific mandate.
 * The messages can be exchanged between creditor and creditor agent or debtor and debtor agent and between creditor agent and debtor agent.
 * The message can also be used by an initiating party that has authority to send the message on behalf of the creditor or debtor.
 * The MandateCancellationRequest message can be used in domestic and cross-border scenarios.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateCancellationRequestV03", propOrder = {
    "grpHdr",
    "undrlygCxlDtls",
    "splmtryData"
})
public class MandateCancellationRequestV03 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader47 grpHdr;
    @XmlElement(name = "UndrlygCxlDtls", required = true)
    protected List<MandateCancellation3> undrlygCxlDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader47 }
     *     
     */
    public GroupHeader47 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader47 }
     *     
     */
    public MandateCancellationRequestV03 setGrpHdr(GroupHeader47 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the undrlygCxlDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undrlygCxlDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygCxlDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MandateCancellation3 }
     * 
     * 
     */
    public List<MandateCancellation3> getUndrlygCxlDtls() {
        if (undrlygCxlDtls == null) {
            undrlygCxlDtls = new ArrayList<MandateCancellation3>();
        }
        return this.undrlygCxlDtls;
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
     * Adds a new item to the undrlygCxlDtls list.
     * @see #getUndrlygCxlDtls()
     * 
     */
    public MandateCancellationRequestV03 addUndrlygCxlDtls(MandateCancellation3 undrlygCxlDtls) {
        getUndrlygCxlDtls().add(undrlygCxlDtls);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public MandateCancellationRequestV03 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
