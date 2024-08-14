
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
 * The TrackerInvestigationStatusNotification message is sent by a tracking facility to a party involved in the business transaction to report on the status of an investigation request they have sent or received for the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackerInvestigationStatusNotificationV02", propOrder = {
    "grpHdr",
    "invstgtnTrckg",
    "splmtryData"
})
public class TrackerInvestigationStatusNotificationV02 {

    @XmlElement(name = "GrpHdr", required = true)
    protected TrackerHeader8 grpHdr;
    @XmlElement(name = "InvstgtnTrckg", required = true)
    protected List<TrackerInvestigationRequest2> invstgtnTrckg;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerHeader8 }
     *     
     */
    public TrackerHeader8 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerHeader8 }
     *     
     */
    public TrackerInvestigationStatusNotificationV02 setGrpHdr(TrackerHeader8 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the invstgtnTrckg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invstgtnTrckg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvstgtnTrckg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackerInvestigationRequest2 }
     * 
     * 
     */
    public List<TrackerInvestigationRequest2> getInvstgtnTrckg() {
        if (invstgtnTrckg == null) {
            invstgtnTrckg = new ArrayList<TrackerInvestigationRequest2>();
        }
        return this.invstgtnTrckg;
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
     * Adds a new item to the invstgtnTrckg list.
     * @see #getInvstgtnTrckg()
     * 
     */
    public TrackerInvestigationStatusNotificationV02 addInvstgtnTrckg(TrackerInvestigationRequest2 invstgtnTrckg) {
        getInvstgtnTrckg().add(invstgtnTrckg);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public TrackerInvestigationStatusNotificationV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
