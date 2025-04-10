
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
 * Information about the beneficial owner.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeneficiaryInformation2", propOrder = {
    "bnfcryId",
    "erisaElgblty",
    "erisaRate",
    "bnftPlanDclrtnInd",
    "noChngToBnfcryDtlsInd"
})
public class BeneficiaryInformation2 {

    @XmlElement(name = "BnfcryId")
    protected IndividualPerson15 bnfcryId;
    @XmlElement(name = "ERISAElgblty")
    @XmlSchemaType(name = "string")
    protected ERISAEligibility1Code erisaElgblty;
    @XmlElement(name = "ERISARate")
    protected BigDecimal erisaRate;
    @XmlElement(name = "BnftPlanDclrtnInd")
    protected Boolean bnftPlanDclrtnInd;
    @XmlElement(name = "NoChngToBnfcryDtlsInd")
    protected Boolean noChngToBnfcryDtlsInd;

    /**
     * Gets the value of the bnfcryId property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPerson15 }
     *     
     */
    public IndividualPerson15 getBnfcryId() {
        return bnfcryId;
    }

    /**
     * Sets the value of the bnfcryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPerson15 }
     *     
     */
    public BeneficiaryInformation2 setBnfcryId(IndividualPerson15 value) {
        this.bnfcryId = value;
        return this;
    }

    /**
     * Gets the value of the erisaElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link ERISAEligibility1Code }
     *     
     */
    public ERISAEligibility1Code getERISAElgblty() {
        return erisaElgblty;
    }

    /**
     * Sets the value of the erisaElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ERISAEligibility1Code }
     *     
     */
    public BeneficiaryInformation2 setERISAElgblty(ERISAEligibility1Code value) {
        this.erisaElgblty = value;
        return this;
    }

    /**
     * Gets the value of the erisaRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getERISARate() {
        return erisaRate;
    }

    /**
     * Sets the value of the erisaRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public BeneficiaryInformation2 setERISARate(BigDecimal value) {
        this.erisaRate = value;
        return this;
    }

    /**
     * Gets the value of the bnftPlanDclrtnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBnftPlanDclrtnInd() {
        return bnftPlanDclrtnInd;
    }

    /**
     * Sets the value of the bnftPlanDclrtnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public BeneficiaryInformation2 setBnftPlanDclrtnInd(Boolean value) {
        this.bnftPlanDclrtnInd = value;
        return this;
    }

    /**
     * Gets the value of the noChngToBnfcryDtlsInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoChngToBnfcryDtlsInd() {
        return noChngToBnfcryDtlsInd;
    }

    /**
     * Sets the value of the noChngToBnfcryDtlsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public BeneficiaryInformation2 setNoChngToBnfcryDtlsInd(Boolean value) {
        this.noChngToBnfcryDtlsInd = value;
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
