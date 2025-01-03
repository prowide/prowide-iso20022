
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information used to identify a cash clearing system.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemIdentification2Choice", propOrder = {
    "mktInfrstrctrId",
    "ctry"
})
public class SystemIdentification2Choice {

    @XmlElement(name = "MktInfrstrctrId")
    protected MarketInfrastructureIdentification1Choice mktInfrstrctrId;
    @XmlElement(name = "Ctry")
    protected String ctry;

    /**
     * Gets the value of the mktInfrstrctrId property.
     * 
     * @return
     *     possible object is
     *     {@link MarketInfrastructureIdentification1Choice }
     *     
     */
    public MarketInfrastructureIdentification1Choice getMktInfrstrctrId() {
        return mktInfrstrctrId;
    }

    /**
     * Sets the value of the mktInfrstrctrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketInfrastructureIdentification1Choice }
     *     
     */
    public SystemIdentification2Choice setMktInfrstrctrId(MarketInfrastructureIdentification1Choice value) {
        this.mktInfrstrctrId = value;
        return this;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SystemIdentification2Choice setCtry(String value) {
        this.ctry = value;
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
