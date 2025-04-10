
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "InvestmentAccountOwnershipInformation2", propOrder = {
    "org",
    "indvPrsn",
    "mnyLndrgChck",
    "xtndedMnyLndrgChck",
    "ownrshBnfcryRate",
    "clntId",
    "xtndedPtyRole",
    "fsclXmptn",
    "sgntryRghtInd"
})
public class InvestmentAccountOwnershipInformation2 {

    @XmlElement(name = "Org")
    protected Organisation2 org;
    @XmlElement(name = "IndvPrsn")
    protected IndividualPerson5 indvPrsn;
    @XmlElement(name = "MnyLndrgChck")
    @XmlSchemaType(name = "string")
    protected OldMoneyLaunderingCheck1Code mnyLndrgChck;
    @XmlElement(name = "XtndedMnyLndrgChck")
    protected String xtndedMnyLndrgChck;
    @XmlElement(name = "OwnrshBnfcryRate")
    protected BigDecimal ownrshBnfcryRate;
    @XmlElement(name = "ClntId")
    protected String clntId;
    @XmlElement(name = "XtndedPtyRole")
    protected String xtndedPtyRole;
    @XmlElement(name = "FsclXmptn")
    protected Boolean fsclXmptn;
    @XmlElement(name = "SgntryRghtInd")
    protected Boolean sgntryRghtInd;

    /**
     * Gets the value of the org property.
     * 
     * @return
     *     possible object is
     *     {@link Organisation2 }
     *     
     */
    public Organisation2 getOrg() {
        return org;
    }

    /**
     * Sets the value of the org property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organisation2 }
     *     
     */
    public InvestmentAccountOwnershipInformation2 setOrg(Organisation2 value) {
        this.org = value;
        return this;
    }

    /**
     * Gets the value of the indvPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPerson5 }
     *     
     */
    public IndividualPerson5 getIndvPrsn() {
        return indvPrsn;
    }

    /**
     * Sets the value of the indvPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPerson5 }
     *     
     */
    public InvestmentAccountOwnershipInformation2 setIndvPrsn(IndividualPerson5 value) {
        this.indvPrsn = value;
        return this;
    }

    /**
     * Gets the value of the mnyLndrgChck property.
     * 
     * @return
     *     possible object is
     *     {@link OldMoneyLaunderingCheck1Code }
     *     
     */
    public OldMoneyLaunderingCheck1Code getMnyLndrgChck() {
        return mnyLndrgChck;
    }

    /**
     * Sets the value of the mnyLndrgChck property.
     * 
     * @param value
     *     allowed object is
     *     {@link OldMoneyLaunderingCheck1Code }
     *     
     */
    public InvestmentAccountOwnershipInformation2 setMnyLndrgChck(OldMoneyLaunderingCheck1Code value) {
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
    public InvestmentAccountOwnershipInformation2 setXtndedMnyLndrgChck(String value) {
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
    public InvestmentAccountOwnershipInformation2 setOwnrshBnfcryRate(BigDecimal value) {
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
    public InvestmentAccountOwnershipInformation2 setClntId(String value) {
        this.clntId = value;
        return this;
    }

    /**
     * Gets the value of the xtndedPtyRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedPtyRole() {
        return xtndedPtyRole;
    }

    /**
     * Sets the value of the xtndedPtyRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestmentAccountOwnershipInformation2 setXtndedPtyRole(String value) {
        this.xtndedPtyRole = value;
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
    public InvestmentAccountOwnershipInformation2 setFsclXmptn(Boolean value) {
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
    public InvestmentAccountOwnershipInformation2 setSgntryRghtInd(Boolean value) {
        this.sgntryRghtInd = value;
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
