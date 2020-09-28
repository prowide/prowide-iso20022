
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
 * The report can be either an update or a cancellation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoneyMarketFundAuthorisationReport1Choice", propOrder = {
    "newUpd",
    "cxl"
})
public class MoneyMarketFundAuthorisationReport1Choice {

    @XmlElement(name = "NewUpd")
    protected FundAuthorisationUpdate1 newUpd;
    @XmlElement(name = "Cxl")
    protected FundReportCancellation1 cxl;

    /**
     * Gets the value of the newUpd property.
     * 
     * @return
     *     possible object is
     *     {@link FundAuthorisationUpdate1 }
     *     
     */
    public FundAuthorisationUpdate1 getNewUpd() {
        return newUpd;
    }

    /**
     * Sets the value of the newUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundAuthorisationUpdate1 }
     *     
     */
    public MoneyMarketFundAuthorisationReport1Choice setNewUpd(FundAuthorisationUpdate1 value) {
        this.newUpd = value;
        return this;
    }

    /**
     * Gets the value of the cxl property.
     * 
     * @return
     *     possible object is
     *     {@link FundReportCancellation1 }
     *     
     */
    public FundReportCancellation1 getCxl() {
        return cxl;
    }

    /**
     * Sets the value of the cxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundReportCancellation1 }
     *     
     */
    public MoneyMarketFundAuthorisationReport1Choice setCxl(FundReportCancellation1 value) {
        this.cxl = value;
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
