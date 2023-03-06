
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
 * This message is sent by either the collateral giver or its collateral manager to the collateral taker or its collateral manager. It is used to request a substitution of collateral by specifying the collateral to be returned and proposing the new type(s) of collateral to be delivered.
 * Note: There are cases where the collateral taker can initiate the CollateralSubstitutionRequest message, for example in case of breach in the concentration limit.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralSubstitutionRequestV01", propOrder = {
    "id",
    "ptyA",
    "svcgPtyA",
    "ptyB",
    "svcgPtyB",
    "agrmt",
    "collSbstitnRtrDtls",
    "collSbstitnDlvrDtls",
    "splmtryData"
})
public class CollateralSubstitutionRequestV01 {

    @XmlElement(name = "Id", required = true)
    protected TransactionAndDocumentIdentification3 id;
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
    public CollateralSubstitutionRequestV01 setId(TransactionAndDocumentIdentification3 value) {
        this.id = value;
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
    public CollateralSubstitutionRequestV01 setPtyA(PartyIdentification33Choice value) {
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
    public CollateralSubstitutionRequestV01 setSvcgPtyA(PartyIdentification33Choice value) {
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
    public CollateralSubstitutionRequestV01 setPtyB(PartyIdentification33Choice value) {
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
    public CollateralSubstitutionRequestV01 setSvcgPtyB(PartyIdentification33Choice value) {
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
    public CollateralSubstitutionRequestV01 setAgrmt(Agreement2 value) {
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
    public CollateralSubstitutionRequestV01 setCollSbstitnRtrDtls(CollateralSubstitution1 value) {
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
    public CollateralSubstitutionRequestV01 setCollSbstitnDlvrDtls(CollateralSubstitution1 value) {
        this.collSbstitnDlvrDtls = value;
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
    public CollateralSubstitutionRequestV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
