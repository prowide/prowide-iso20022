
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
 * The CollateralManagementCancellationRequest message is sent by:
 * - the collateral taker or its collateral manager to the collateral giver or its collateral manager,
 * - the collateral giver or its collateral manager to the collateral taker or its collateral manager
 * This message is used to request the cancellation of a previously sent MarginCallRequest message, MarginCallResponse message, CollateralProposal message, CollateralProposalResponse message, MarginCallDisputeNotification message or a CollateralSubstitutionRequest message.
 * The message definition is intended for use with the ISO20022 Business Application Header.
 * Usage
 * The CollateralManagementCancellationRequest message is used to request the cancellation of a collateral message. When requesting the cancellation of a message there must be a cancellation reason specified.
 * When the CollateralManagementCancellationRequest message is used to cancel a collateral message the reference of the original message must be specified. The rejection or acceptance of a CollateralManagementCancellationRequest message is made using a CollateralManagementCancellationStatus message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralManagementCancellationRequestV05", propOrder = {
    "ref",
    "oblgtn",
    "cxlRsn",
    "splmtryData"
})
public class CollateralManagementCancellationRequestV05 {

    @XmlElement(name = "Ref", required = true)
    protected Reference3Choice ref;
    @XmlElement(name = "Oblgtn", required = true)
    protected Obligation7 oblgtn;
    @XmlElement(name = "CxlRsn", required = true)
    protected CollateralCancellationReason1 cxlRsn;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link Reference3Choice }
     *     
     */
    public Reference3Choice getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference3Choice }
     *     
     */
    public CollateralManagementCancellationRequestV05 setRef(Reference3Choice value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the oblgtn property.
     * 
     * @return
     *     possible object is
     *     {@link Obligation7 }
     *     
     */
    public Obligation7 getOblgtn() {
        return oblgtn;
    }

    /**
     * Sets the value of the oblgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Obligation7 }
     *     
     */
    public CollateralManagementCancellationRequestV05 setOblgtn(Obligation7 value) {
        this.oblgtn = value;
        return this;
    }

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralCancellationReason1 }
     *     
     */
    public CollateralCancellationReason1 getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralCancellationReason1 }
     *     
     */
    public CollateralManagementCancellationRequestV05 setCxlRsn(CollateralCancellationReason1 value) {
        this.cxlRsn = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
    public CollateralManagementCancellationRequestV05 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
