
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
 * This CollateralManagementCancellationStatus message is sent by:
 * - the collateral taker or its collateral manager to the collateral giver or its collateral manager, or
 * - the collateral giver or its collateral manager to the collateral taker or its collateral manager.
 * This message is used to provide the status of accepted or rejected for the CollateralManagementCancellationRequest message previously received.
 * The ISO 20022 Business Application Header must be used
 * Usage
 * The CollateralManagementCancellationStatus message can be sent to provide a status for a previously received CollateralManagementCancellationRequest message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralManagementCancellationStatusV02", propOrder = {
    "txId",
    "ref",
    "oblgtn",
    "cxlStsDtls",
    "splmtryData"
})
public class CollateralManagementCancellationStatusV02 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "Ref", required = true)
    protected Reference16 ref;
    @XmlElement(name = "Oblgtn", required = true)
    protected Obligation1 oblgtn;
    @XmlElement(name = "CxlStsDtls", required = true)
    protected CollateralCancellationStatus1 cxlStsDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CollateralManagementCancellationStatusV02 setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link Reference16 }
     *     
     */
    public Reference16 getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reference16 }
     *     
     */
    public CollateralManagementCancellationStatusV02 setRef(Reference16 value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the oblgtn property.
     * 
     * @return
     *     possible object is
     *     {@link Obligation1 }
     *     
     */
    public Obligation1 getOblgtn() {
        return oblgtn;
    }

    /**
     * Sets the value of the oblgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Obligation1 }
     *     
     */
    public CollateralManagementCancellationStatusV02 setOblgtn(Obligation1 value) {
        this.oblgtn = value;
        return this;
    }

    /**
     * Gets the value of the cxlStsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralCancellationStatus1 }
     *     
     */
    public CollateralCancellationStatus1 getCxlStsDtls() {
        return cxlStsDtls;
    }

    /**
     * Sets the value of the cxlStsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralCancellationStatus1 }
     *     
     */
    public CollateralManagementCancellationStatusV02 setCxlStsDtls(CollateralCancellationStatus1 value) {
        this.cxlStsDtls = value;
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
    public CollateralManagementCancellationStatusV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
