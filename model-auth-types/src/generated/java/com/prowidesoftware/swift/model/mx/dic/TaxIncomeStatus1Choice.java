
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
 * Provides the status adivce of the tax income report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxIncomeStatus1Choice", propOrder = {
    "accptd",
    "rjctd"
})
public class TaxIncomeStatus1Choice {

    @XmlElement(name = "Accptd")
    protected IncomeStatementAcceptedStatus11Choice accptd;
    @XmlElement(name = "Rjctd")
    protected IncomeStatementRejectionStatus11Choice rjctd;

    /**
     * Gets the value of the accptd property.
     * 
     * @return
     *     possible object is
     *     {@link IncomeStatementAcceptedStatus11Choice }
     *     
     */
    public IncomeStatementAcceptedStatus11Choice getAccptd() {
        return accptd;
    }

    /**
     * Sets the value of the accptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomeStatementAcceptedStatus11Choice }
     *     
     */
    public TaxIncomeStatus1Choice setAccptd(IncomeStatementAcceptedStatus11Choice value) {
        this.accptd = value;
        return this;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * @return
     *     possible object is
     *     {@link IncomeStatementRejectionStatus11Choice }
     *     
     */
    public IncomeStatementRejectionStatus11Choice getRjctd() {
        return rjctd;
    }

    /**
     * Sets the value of the rjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomeStatementRejectionStatus11Choice }
     *     
     */
    public TaxIncomeStatus1Choice setRjctd(IncomeStatementRejectionStatus11Choice value) {
        this.rjctd = value;
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
