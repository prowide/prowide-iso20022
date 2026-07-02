
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
 * Quantity breakdown information for a specific securities balance.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSubBalanceTypeAndQuantityBreakdown3__1", propOrder = {
    "tp"
})
public class SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt033Draft {

    @XmlElement(name = "Tp", required = true)
    protected SecuritiesBalanceType6Choice1Draft tp;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesBalanceType6Choice1Draft }
     *     
     */
    public SecuritiesBalanceType6Choice1Draft getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesBalanceType6Choice1Draft }
     *     
     */
    public SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt033Draft setTp(SecuritiesBalanceType6Choice1Draft value) {
        this.tp = value;
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
