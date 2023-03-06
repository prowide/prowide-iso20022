
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
 * The MandateSuspensionRequest message is sent by the initiator of the request to its agent. The initiator can either be the debtor, debtor agent, creditor or creditor agent.
 * A MandateSuspensionRequest message is used to request the suspension of an existing mandate until the suspension is lifted. 
 * Usage
 * The MandateSuspensionRequest message can contain one or more suspension requests.
 * The messages can be exchanged between creditor and creditor agent or debtor and debtor agent and between creditor agent and debtor agent.
 * The MandateSuspensionRequest message can be used in domestic and cross-border scenarios.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateSuspensionRequestV03", propOrder = {
    "grpHdr",
    "undrlygSspnsnDtls",
    "splmtryData"
})
public class MandateSuspensionRequestV03 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader80 grpHdr;
    @XmlElement(name = "UndrlygSspnsnDtls", required = true)
    protected List<MandateSuspension3> undrlygSspnsnDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader80 }
     *     
     */
    public GroupHeader80 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader80 }
     *     
     */
    public MandateSuspensionRequestV03 setGrpHdr(GroupHeader80 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the undrlygSspnsnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the undrlygSspnsnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygSspnsnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MandateSuspension3 }
     * 
     * 
     */
    public List<MandateSuspension3> getUndrlygSspnsnDtls() {
        if (undrlygSspnsnDtls == null) {
            undrlygSspnsnDtls = new ArrayList<MandateSuspension3>();
        }
        return this.undrlygSspnsnDtls;
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
     * Adds a new item to the undrlygSspnsnDtls list.
     * @see #getUndrlygSspnsnDtls()
     * 
     */
    public MandateSuspensionRequestV03 addUndrlygSspnsnDtls(MandateSuspension3 undrlygSspnsnDtls) {
        getUndrlygSspnsnDtls().add(undrlygSspnsnDtls);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public MandateSuspensionRequestV03 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
