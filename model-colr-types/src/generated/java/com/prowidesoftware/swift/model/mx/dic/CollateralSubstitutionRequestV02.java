
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
 * This CollateralSubstitutionRequest message is sent by either the collateral giver or its collateral manager to the collateral taker or its collateral manager. It is used to request a substitution of collateral by specifying the collateral to be returned and proposing the new type(s) of collateral to be delivered. Note: There are cases where the collateral taker can initiate the CollateralSubstitutionRequest message, for example in case of breach in the concentration limit.
 * The ISO 20022 Business Application Header must be used
 * Usage
 * The CollateralSubstitutionRequest message can be sent by either the collateral giver or collateral taker in order to substitute collateral that is already held by the other party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralSubstitutionRequestV02", propOrder = {
    "txId",
    "ptyA",
    "svcgPtyA",
    "ptyB",
    "svcgPtyB",
    "agrmt",
    "collSbstitnRtrDtls",
    "collSbstitnDlvrDtls",
    "splmtryData"
})
public class CollateralSubstitutionRequestV02 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "PtyA", required = true)
    protected PartyIdentification33Choice ptyA;
    @XmlElement(name = "SvcgPtyA")
    protected PartyIdentification33Choice svcgPtyA;
    @XmlElement(name = "PtyB", required = true)
    protected PartyIdentification33Choice ptyB;
    @XmlElement(name = "SvcgPtyB")
    protected PartyIdentification33Choice svcgPtyB;
    @XmlElement(name = "Agrmt")
    protected Agreement2 agrmt;
    @XmlElement(name = "CollSbstitnRtrDtls", required = true)
    protected CollateralSubstitution1 collSbstitnRtrDtls;
    @XmlElement(name = "CollSbstitnDlvrDtls")
    protected CollateralSubstitution1 collSbstitnDlvrDtls;
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
    public CollateralSubstitutionRequestV02 setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the ptyA property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification33Choice }
     *     
     */
    public PartyIdentification33Choice getPtyA() {
        return ptyA;
    }

    /**
     * Sets the value of the ptyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification33Choice }
     *     
     */
    public CollateralSubstitutionRequestV02 setPtyA(PartyIdentification33Choice value) {
        this.ptyA = value;
        return this;
    }

    /**
     * Gets the value of the svcgPtyA property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification33Choice }
     *     
     */
    public PartyIdentification33Choice getSvcgPtyA() {
        return svcgPtyA;
    }

    /**
     * Sets the value of the svcgPtyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification33Choice }
     *     
     */
    public CollateralSubstitutionRequestV02 setSvcgPtyA(PartyIdentification33Choice value) {
        this.svcgPtyA = value;
        return this;
    }

    /**
     * Gets the value of the ptyB property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification33Choice }
     *     
     */
    public PartyIdentification33Choice getPtyB() {
        return ptyB;
    }

    /**
     * Sets the value of the ptyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification33Choice }
     *     
     */
    public CollateralSubstitutionRequestV02 setPtyB(PartyIdentification33Choice value) {
        this.ptyB = value;
        return this;
    }

    /**
     * Gets the value of the svcgPtyB property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification33Choice }
     *     
     */
    public PartyIdentification33Choice getSvcgPtyB() {
        return svcgPtyB;
    }

    /**
     * Sets the value of the svcgPtyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification33Choice }
     *     
     */
    public CollateralSubstitutionRequestV02 setSvcgPtyB(PartyIdentification33Choice value) {
        this.svcgPtyB = value;
        return this;
    }

    /**
     * Gets the value of the agrmt property.
     * 
     * @return
     *     possible object is
     *     {@link Agreement2 }
     *     
     */
    public Agreement2 getAgrmt() {
        return agrmt;
    }

    /**
     * Sets the value of the agrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Agreement2 }
     *     
     */
    public CollateralSubstitutionRequestV02 setAgrmt(Agreement2 value) {
        this.agrmt = value;
        return this;
    }

    /**
     * Gets the value of the collSbstitnRtrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralSubstitution1 }
     *     
     */
    public CollateralSubstitution1 getCollSbstitnRtrDtls() {
        return collSbstitnRtrDtls;
    }

    /**
     * Sets the value of the collSbstitnRtrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralSubstitution1 }
     *     
     */
    public CollateralSubstitutionRequestV02 setCollSbstitnRtrDtls(CollateralSubstitution1 value) {
        this.collSbstitnRtrDtls = value;
        return this;
    }

    /**
     * Gets the value of the collSbstitnDlvrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralSubstitution1 }
     *     
     */
    public CollateralSubstitution1 getCollSbstitnDlvrDtls() {
        return collSbstitnDlvrDtls;
    }

    /**
     * Sets the value of the collSbstitnDlvrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralSubstitution1 }
     *     
     */
    public CollateralSubstitutionRequestV02 setCollSbstitnDlvrDtls(CollateralSubstitution1 value) {
        this.collSbstitnDlvrDtls = value;
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
    public CollateralSubstitutionRequestV02 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
