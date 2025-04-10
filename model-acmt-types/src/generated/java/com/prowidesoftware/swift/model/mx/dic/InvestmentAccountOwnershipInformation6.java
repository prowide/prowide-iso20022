
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Characteristics of the ownership of an investment account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentAccountOwnershipInformation6", propOrder = {
    "pty",
    "mnyLndrgChck",
    "invstrPrflVldtn",
    "ownrshBnfcryRate",
    "clntId",
    "fsclXmptn",
    "sgntryRghtInd",
    "miFIDClssfctn",
    "infDstrbtn"
})
public class InvestmentAccountOwnershipInformation6 {

    @XmlElement(name = "Pty", required = true)
    protected Party14Choice pty;
    @XmlElement(name = "MnyLndrgChck")
    protected MoneyLaunderingCheck1Choice mnyLndrgChck;
    @XmlElement(name = "InvstrPrflVldtn")
    protected List<PartyProfileInformation2> invstrPrflVldtn;
    @XmlElement(name = "OwnrshBnfcryRate")
    protected BigDecimal ownrshBnfcryRate;
    @XmlElement(name = "ClntId")
    protected String clntId;
    @XmlElement(name = "FsclXmptn")
    protected Boolean fsclXmptn;
    @XmlElement(name = "SgntryRghtInd")
    protected Boolean sgntryRghtInd;
    @XmlElement(name = "MiFIDClssfctn")
    protected MiFIDClassification1 miFIDClssfctn;
    @XmlElement(name = "InfDstrbtn")
    @XmlSchemaType(name = "string")
    protected InformationDistribution1Code infDstrbtn;

    /**
     * Gets the value of the pty property.
     * 
     * @return
     *     possible object is
     *     {@link Party14Choice }
     *     
     */
    public Party14Choice getPty() {
        return pty;
    }

    /**
     * Sets the value of the pty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party14Choice }
     *     
     */
    public InvestmentAccountOwnershipInformation6 setPty(Party14Choice value) {
        this.pty = value;
        return this;
    }

    /**
     * Gets the value of the mnyLndrgChck property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyLaunderingCheck1Choice }
     *     
     */
    public MoneyLaunderingCheck1Choice getMnyLndrgChck() {
        return mnyLndrgChck;
    }

    /**
     * Sets the value of the mnyLndrgChck property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyLaunderingCheck1Choice }
     *     
     */
    public InvestmentAccountOwnershipInformation6 setMnyLndrgChck(MoneyLaunderingCheck1Choice value) {
        this.mnyLndrgChck = value;
        return this;
    }

    /**
     * Gets the value of the invstrPrflVldtn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the invstrPrflVldtn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvstrPrflVldtn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyProfileInformation2 }
     * 
     * 
     * @return
     *     The value of the invstrPrflVldtn property.
     */
    public List<PartyProfileInformation2> getInvstrPrflVldtn() {
        if (invstrPrflVldtn == null) {
            invstrPrflVldtn = new ArrayList<>();
        }
        return this.invstrPrflVldtn;
    }

    /**
     * Gets the value of the ownrshBnfcryRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOwnrshBnfcryRate() {
        return ownrshBnfcryRate;
    }

    /**
     * Sets the value of the ownrshBnfcryRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public InvestmentAccountOwnershipInformation6 setOwnrshBnfcryRate(BigDecimal value) {
        this.ownrshBnfcryRate = value;
        return this;
    }

    /**
     * Gets the value of the clntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntId() {
        return clntId;
    }

    /**
     * Sets the value of the clntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccountOwnershipInformation6 setClntId(String value) {
        this.clntId = value;
        return this;
    }

    /**
     * Gets the value of the fsclXmptn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFsclXmptn() {
        return fsclXmptn;
    }

    /**
     * Sets the value of the fsclXmptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InvestmentAccountOwnershipInformation6 setFsclXmptn(Boolean value) {
        this.fsclXmptn = value;
        return this;
    }

    /**
     * Gets the value of the sgntryRghtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSgntryRghtInd() {
        return sgntryRghtInd;
    }

    /**
     * Sets the value of the sgntryRghtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public InvestmentAccountOwnershipInformation6 setSgntryRghtInd(Boolean value) {
        this.sgntryRghtInd = value;
        return this;
    }

    /**
     * Gets the value of the miFIDClssfctn property.
     * 
     * @return
     *     possible object is
     *     {@link MiFIDClassification1 }
     *     
     */
    public MiFIDClassification1 getMiFIDClssfctn() {
        return miFIDClssfctn;
    }

    /**
     * Sets the value of the miFIDClssfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiFIDClassification1 }
     *     
     */
    public InvestmentAccountOwnershipInformation6 setMiFIDClssfctn(MiFIDClassification1 value) {
        this.miFIDClssfctn = value;
        return this;
    }

    /**
     * Gets the value of the infDstrbtn property.
     * 
     * @return
     *     possible object is
     *     {@link InformationDistribution1Code }
     *     
     */
    public InformationDistribution1Code getInfDstrbtn() {
        return infDstrbtn;
    }

    /**
     * Sets the value of the infDstrbtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationDistribution1Code }
     *     
     */
    public InvestmentAccountOwnershipInformation6 setInfDstrbtn(InformationDistribution1Code value) {
        this.infDstrbtn = value;
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

    /**
     * Adds a new item to the invstrPrflVldtn list.
     * @see #getInvstrPrflVldtn()
     * 
     */
    public InvestmentAccountOwnershipInformation6 addInvstrPrflVldtn(PartyProfileInformation2 invstrPrflVldtn) {
        getInvstrPrflVldtn().add(invstrPrflVldtn);
        return this;
    }

}
