
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
@XmlType(name = "CardDirectDebit2", propOrder = {
    "dbtrId",
    "cdtrId",
    "mndtRltdInf"
})
public class CardDirectDebit2 {

    @XmlElement(name = "DbtrId")
    protected Debtor4 dbtrId;
    @XmlElement(name = "CdtrId", required = true)
    protected Creditor4 cdtrId;
    @XmlElement(name = "MndtRltdInf", required = true)
    protected MandateRelatedInformation13 mndtRltdInf;

    /**
     * Gets the value of the dbtrId property.
     * 
     * @return
     *     possible object is
     *     {@link Debtor4 }
     *     
     */
    public Debtor4 getDbtrId() {
        return dbtrId;
    }

    /**
     * Sets the value of the dbtrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Debtor4 }
     *     
     */
    public CardDirectDebit2 setDbtrId(Debtor4 value) {
        this.dbtrId = value;
        return this;
    }

    /**
     * Gets the value of the cdtrId property.
     * 
     * @return
     *     possible object is
     *     {@link Creditor4 }
     *     
     */
    public Creditor4 getCdtrId() {
        return cdtrId;
    }

    /**
     * Sets the value of the cdtrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Creditor4 }
     *     
     */
    public CardDirectDebit2 setCdtrId(Creditor4 value) {
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
    public CardDirectDebit2 setMndtRltdInf(MandateRelatedInformation13 value) {
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
