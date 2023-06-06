
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
 * This message is sent by:
 * - the collateral taker or its collateral manager to the collateral giver or its collateral manager,
 * - the collateral giver or its collateral manager to the collateral taker or its collateral manager.
 * 
 * This message is used to provide the status of the CollateralManagementCancellationRequest message previously received.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralManagementCancellationStatusV01", propOrder = {
    "id",
    "ref",
    "oblgtn",
    "cxlStsDtls",
    "splmtryData"
})
public class CollateralManagementCancellationStatusV01 {

    @XmlElement(name = "Id", required = true)
    protected TransactionAndDocumentIdentification3 id;
    @XmlElement(name = "Ref", required = true)
    protected Reference16 ref;
    @XmlElement(name = "Oblgtn", required = true)
    protected Obligation1 oblgtn;
    @XmlElement(name = "CxlStsDtls", required = true)
    protected CollateralCancellationStatus1 cxlStsDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionAndDocumentIdentification3 }
     *     
     */
    public TransactionAndDocumentIdentification3 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionAndDocumentIdentification3 }
     *     
     */
    public CollateralManagementCancellationStatusV01 setId(TransactionAndDocumentIdentification3 value) {
        this.id = value;
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
    public CollateralManagementCancellationStatusV01 setRef(Reference16 value) {
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
    public CollateralManagementCancellationStatusV01 setOblgtn(Obligation1 value) {
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
    public CollateralManagementCancellationStatusV01 setCxlStsDtls(CollateralCancellationStatus1 value) {
        this.cxlStsDtls = value;
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
    public CollateralManagementCancellationStatusV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
