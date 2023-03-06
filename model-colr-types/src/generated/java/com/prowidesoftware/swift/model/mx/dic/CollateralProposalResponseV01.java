
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
 * This message is sent by the collateral taker or its collateral manager to the collateral giver or its collateral manager to either accept or reject the collateral which has been proposed for the margin call. This message applies to both initial and counter proposals.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralProposalResponseV01", propOrder = {
    "id",
    "oblgtn",
    "prpslRspn",
    "splmtryData"
})
public class CollateralProposalResponseV01 {

    @XmlElement(name = "Id", required = true)
    protected TransactionAndDocumentIdentification3 id;
    @XmlElement(name = "Oblgtn", required = true)
    protected Obligation1 oblgtn;
    @XmlElement(name = "PrpslRspn", required = true)
    protected CollateralProposalResponse1Choice prpslRspn;
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
    public CollateralProposalResponseV01 setId(TransactionAndDocumentIdentification3 value) {
        this.id = value;
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
    public CollateralProposalResponseV01 setOblgtn(Obligation1 value) {
        this.oblgtn = value;
        return this;
    }

    /**
     * Gets the value of the prpslRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralProposalResponse1Choice }
     *     
     */
    public CollateralProposalResponse1Choice getPrpslRspn() {
        return prpslRspn;
    }

    /**
     * Sets the value of the prpslRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralProposalResponse1Choice }
     *     
     */
    public CollateralProposalResponseV01 setPrpslRspn(CollateralProposalResponse1Choice value) {
        this.prpslRspn = value;
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
    public CollateralProposalResponseV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
