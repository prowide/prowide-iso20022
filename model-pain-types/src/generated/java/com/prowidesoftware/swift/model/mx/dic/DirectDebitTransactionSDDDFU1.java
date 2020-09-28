
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
 * DirectDebitTransactionSDD_DFU1
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitTransactionSDD_DFU1", propOrder = {
    "mndtRltdInf",
    "cdtrSchmeId"
})
public class DirectDebitTransactionSDDDFU1 {

    @XmlElement(name = "MndtRltdInf", required = true)
    protected MandateRelatedInformationSDDDFU1 mndtRltdInf;
    @XmlElement(name = "CdtrSchmeId")
    protected PartyIdentificationSEPA3DFU1 cdtrSchmeId;

    /**
     * Gets the value of the mndtRltdInf property.
     * 
     * @return
     *     possible object is
     *     {@link MandateRelatedInformationSDDDFU1 }
     *     
     */
    public MandateRelatedInformationSDDDFU1 getMndtRltdInf() {
        return mndtRltdInf;
    }

    /**
     * Sets the value of the mndtRltdInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateRelatedInformationSDDDFU1 }
     *     
     */
    public DirectDebitTransactionSDDDFU1 setMndtRltdInf(MandateRelatedInformationSDDDFU1 value) {
        this.mndtRltdInf = value;
        return this;
    }

    /**
     * Gets the value of the cdtrSchmeId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationSEPA3DFU1 }
     *     
     */
    public PartyIdentificationSEPA3DFU1 getCdtrSchmeId() {
        return cdtrSchmeId;
    }

    /**
     * Sets the value of the cdtrSchmeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationSEPA3DFU1 }
     *     
     */
    public DirectDebitTransactionSDDDFU1 setCdtrSchmeId(PartyIdentificationSEPA3DFU1 value) {
        this.cdtrSchmeId = value;
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
