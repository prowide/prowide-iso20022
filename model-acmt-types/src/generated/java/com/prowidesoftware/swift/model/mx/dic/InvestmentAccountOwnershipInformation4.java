
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
@XmlType(name = "InvestmentAccountOwnershipInformation4", propOrder = {
    "org",
    "indvPrsn",
    "mnyLndrgChck",
    "xtndedMnyLndrgChck",
    "ownrshBnfcryRate",
    "clntId",
    "fsclXmptn",
    "sgntryRghtInd",
    "modfdInvstrPrflVldtn"
})
public class InvestmentAccountOwnershipInformation4 {

    @XmlElement(name = "Org")
    protected Organisation3 org;
    @XmlElement(name = "IndvPrsn")
    protected IndividualPerson11 indvPrsn;
    @XmlElement(name = "MnyLndrgChck")
    @XmlSchemaType(name = "string")
    protected MoneyLaunderingCheck1Code mnyLndrgChck;
    @XmlElement(name = "XtndedMnyLndrgChck")
    protected String xtndedMnyLndrgChck;
    @XmlElement(name = "OwnrshBnfcryRate")
    protected BigDecimal ownrshBnfcryRate;
    @XmlElement(name = "ClntId")
    protected String clntId;
    @XmlElement(name = "FsclXmptn")
    protected Boolean fsclXmptn;
    @XmlElement(name = "SgntryRghtInd")
    protected Boolean sgntryRghtInd;
    @XmlElement(name = "ModfdInvstrPrflVldtn")
    protected List<ModificationScope11> modfdInvstrPrflVldtn;

    /**
     * Gets the value of the org property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation3 }
     *     
     */
    public Organisation3 getOrg() {
        return org;
    }

    /**
     * Sets the value of the org property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation3 }
     *     
     */
    public InvestmentAccountOwnershipInformation4 setOrg(Organisation3 value) {
        this.org = value;
        return this;
    }

    /**
     * Gets the value of the indvPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPerson11 }
     *     
     */
    public IndividualPerson11 getIndvPrsn() {
        return indvPrsn;
    }

    /**
     * Sets the value of the indvPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPerson11 }
     *     
     */
    public InvestmentAccountOwnershipInformation4 setIndvPrsn(IndividualPerson11 value) {
        this.indvPrsn = value;
        return this;
    }

    /**
     * Gets the value of the mnyLndrgChck property.
     * 
     * @return
     *     possible object is
     *     {@link MoneyLaunderingCheck1Code }
     *     
     */
    public MoneyLaunderingCheck1Code getMnyLndrgChck() {
        return mnyLndrgChck;
    }

    /**
     * Sets the value of the mnyLndrgChck property.
     * 
     * @param value
     *     allowed object is
     *     {@link MoneyLaunderingCheck1Code }
     *     
     */
    public InvestmentAccountOwnershipInformation4 setMnyLndrgChck(MoneyLaunderingCheck1Code value) {
        this.mnyLndrgChck = value;
        return this;
    }

    /**
     * Gets the value of the xtndedMnyLndrgChck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedMnyLndrgChck() {
        return xtndedMnyLndrgChck;
    }

    /**
     * Sets the value of the xtndedMnyLndrgChck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccountOwnershipInformation4 setXtndedMnyLndrgChck(String value) {
        this.xtndedMnyLndrgChck = value;
        return this;
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
    public InvestmentAccountOwnershipInformation4 setOwnrshBnfcryRate(BigDecimal value) {
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
    public InvestmentAccountOwnershipInformation4 setClntId(String value) {
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
    public InvestmentAccountOwnershipInformation4 setFsclXmptn(Boolean value) {
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
    public InvestmentAccountOwnershipInformation4 setSgntryRghtInd(Boolean value) {
        this.sgntryRghtInd = value;
        return this;
    }

    /**
     * Gets the value of the modfdInvstrPrflVldtn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modfdInvstrPrflVldtn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModfdInvstrPrflVldtn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ModificationScope11 }
     * 
     * 
     */
    public List<ModificationScope11> getModfdInvstrPrflVldtn() {
        if (modfdInvstrPrflVldtn == null) {
            modfdInvstrPrflVldtn = new ArrayList<ModificationScope11>();
        }
        return this.modfdInvstrPrflVldtn;
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
     * Adds a new item to the modfdInvstrPrflVldtn list.
     * @see #getModfdInvstrPrflVldtn()
     * 
     */
    public InvestmentAccountOwnershipInformation4 addModfdInvstrPrflVldtn(ModificationScope11 modfdInvstrPrflVldtn) {
        getModfdInvstrPrflVldtn().add(modfdInvstrPrflVldtn);
        return this;
    }

}
