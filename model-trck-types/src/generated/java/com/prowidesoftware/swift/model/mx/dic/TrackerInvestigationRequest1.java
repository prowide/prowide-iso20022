
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides detailed information on the investigation status as updated in the tracker or investigation facility.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackerInvestigationRequest1", propOrder = {
    "invstgtnTp",
    "stsAndAssgnmt",
    "undrlyg"
})
public class TrackerInvestigationRequest1 {

    @XmlElement(name = "InvstgtnTp", required = true)
    protected InvestigationType2Choice invstgtnTp;
    @XmlElement(name = "StsAndAssgnmt", required = true)
    protected TrackerInvestigationRequestStatus1 stsAndAssgnmt;
    @XmlElement(name = "Undrlyg")
    protected UnderlyingData1Choice undrlyg;

    /**
     * Gets the value of the invstgtnTp property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigationType2Choice }
     *     
     */
    public InvestigationType2Choice getInvstgtnTp() {
        return invstgtnTp;
    }

    /**
     * Sets the value of the invstgtnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigationType2Choice }
     *     
     */
    public TrackerInvestigationRequest1 setInvstgtnTp(InvestigationType2Choice value) {
        this.invstgtnTp = value;
        return this;
    }

    /**
     * Gets the value of the stsAndAssgnmt property.
     * 
     * @return
     *     possible object is
     *     {@link TrackerInvestigationRequestStatus1 }
     *     
     */
    public TrackerInvestigationRequestStatus1 getStsAndAssgnmt() {
        return stsAndAssgnmt;
    }

    /**
     * Sets the value of the stsAndAssgnmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackerInvestigationRequestStatus1 }
     *     
     */
    public TrackerInvestigationRequest1 setStsAndAssgnmt(TrackerInvestigationRequestStatus1 value) {
        this.stsAndAssgnmt = value;
        return this;
    }

    /**
     * Gets the value of the undrlyg property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingData1Choice }
     *     
     */
    public UnderlyingData1Choice getUndrlyg() {
        return undrlyg;
    }

    /**
     * Sets the value of the undrlyg property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingData1Choice }
     *     
     */
    public TrackerInvestigationRequest1 setUndrlyg(UnderlyingData1Choice value) {
        this.undrlyg = value;
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

}
