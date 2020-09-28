
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Element containing all information needed for a card initiating direct debit.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardDirectDebit1", propOrder = {
    "dbtrId",
    "cdtrId",
    "mndtRltdInf"
})
public class CardDirectDebit1 {

    @XmlElement(name = "DbtrId")
    protected Debtor3 dbtrId;
    @XmlElement(name = "CdtrId", required = true)
    protected Creditor3 cdtrId;
    @XmlElement(name = "MndtRltdInf", required = true)
    protected MandateRelatedInformation13 mndtRltdInf;

    /**
     * Gets the value of the dbtrId property.
     * 
     * @return
     *     possible object is
     *     {@link Debtor3 }
     *     
     */
    public Debtor3 getDbtrId() {
        return dbtrId;
    }

    /**
     * Sets the value of the dbtrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Debtor3 }
     *     
     */
    public CardDirectDebit1 setDbtrId(Debtor3 value) {
        this.dbtrId = value;
        return this;
    }

    /**
     * Gets the value of the cdtrId property.
     * 
     * @return
     *     possible object is
     *     {@link Creditor3 }
     *     
     */
    public Creditor3 getCdtrId() {
        return cdtrId;
    }

    /**
     * Sets the value of the cdtrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Creditor3 }
     *     
     */
    public CardDirectDebit1 setCdtrId(Creditor3 value) {
        this.cdtrId = value;
        return this;
    }

    /**
     * Gets the value of the mndtRltdInf property.
     * 
     * @return
     *     possible object is
     *     {@link MandateRelatedInformation13 }
     *     
     */
    public MandateRelatedInformation13 getMndtRltdInf() {
        return mndtRltdInf;
    }

    /**
     * Sets the value of the mndtRltdInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateRelatedInformation13 }
     *     
     */
    public CardDirectDebit1 setMndtRltdInf(MandateRelatedInformation13 value) {
        this.mndtRltdInf = value;
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
