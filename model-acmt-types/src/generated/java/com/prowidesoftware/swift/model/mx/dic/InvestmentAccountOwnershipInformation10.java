
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
@XmlType(name = "InvestmentAccountOwnershipInformation10", propOrder = {
    "pty",
    "mnyLndrgChck",
    "invstrPrflVldtn",
    "ownrshBnfcryRate",
    "clntId",
    "fsclXmptn",
    "sgntryRghtInd",
    "miFIDClssfctn",
    "infDstrbtn",
    "fatcaFormTp",
    "fatcaSts"
})
public class InvestmentAccountOwnershipInformation10 {

    @XmlElement(name = "Pty", required = true)
    protected Party23Choice pty;
    @XmlElement(name = "MnyLndrgChck")
    protected MoneyLaunderingCheck1Choice mnyLndrgChck;
    @XmlElement(name = "InvstrPrflVldtn")
    protected List<PartyProfileInformation4> invstrPrflVldtn;
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
    @XmlElement(name = "FATCAFormTp")
    protected List<FATCAForm1Choice> fatcaFormTp;
    @XmlElement(name = "FATCASts")
    protected List<FATCAStatus1> fatcaSts;

    /**
     * Gets the value of the pty property.
     * 
     * @return
     *     possible object is
     *     {@link Party23Choice }
     *     
     */
    public Party23Choice getPty() {
        return pty;
    }

    /**
     * Sets the value of the pty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party23Choice }
     *     
     */
    public InvestmentAccountOwnershipInformation10 setPty(Party23Choice value) {
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
    public InvestmentAccountOwnershipInformation10 setMnyLndrgChck(MoneyLaunderingCheck1Choice value) {
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
     * {@link PartyProfileInformation4 }
     * 
     * 
     * @return
     *     The value of the invstrPrflVldtn property.
     */
    public List<PartyProfileInformation4> getInvstrPrflVldtn() {
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
    public InvestmentAccountOwnershipInformation10 setOwnrshBnfcryRate(BigDecimal value) {
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
    public InvestmentAccountOwnershipInformation10 setClntId(String value) {
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
    public InvestmentAccountOwnershipInformation10 setFsclXmptn(Boolean value) {
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
    public InvestmentAccountOwnershipInformation10 setSgntryRghtInd(Boolean value) {
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
    public InvestmentAccountOwnershipInformation10 setMiFIDClssfctn(MiFIDClassification1 value) {
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
    public InvestmentAccountOwnershipInformation10 setInfDstrbtn(InformationDistribution1Code value) {
        this.infDstrbtn = value;
        return this;
    }

    /**
     * Gets the value of the fatcaFormTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fatcaFormTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFATCAFormTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FATCAForm1Choice }
     * 
     * 
     * @return
     *     The value of the fatcaFormTp property.
     */
    public List<FATCAForm1Choice> getFATCAFormTp() {
        if (fatcaFormTp == null) {
            fatcaFormTp = new ArrayList<>();
        }
        return this.fatcaFormTp;
    }

    /**
     * Gets the value of the fatcaSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fatcaSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFATCASts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FATCAStatus1 }
     * 
     * 
     * @return
     *     The value of the fatcaSts property.
     */
    public List<FATCAStatus1> getFATCASts() {
        if (fatcaSts == null) {
            fatcaSts = new ArrayList<>();
        }
        return this.fatcaSts;
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
    public InvestmentAccountOwnershipInformation10 addInvstrPrflVldtn(PartyProfileInformation4 invstrPrflVldtn) {
        getInvstrPrflVldtn().add(invstrPrflVldtn);
        return this;
    }

    /**
     * Adds a new item to the fATCAFormTp list.
     * @see #getFATCAFormTp()
     * 
     */
    public InvestmentAccountOwnershipInformation10 addFATCAFormTp(FATCAForm1Choice fATCAFormTp) {
        getFATCAFormTp().add(fATCAFormTp);
        return this;
    }

    /**
     * Adds a new item to the fATCASts list.
     * @see #getFATCASts()
     * 
     */
    public InvestmentAccountOwnershipInformation10 addFATCASts(FATCAStatus1 fATCASts) {
        getFATCASts().add(fATCASts);
        return this;
    }

}
