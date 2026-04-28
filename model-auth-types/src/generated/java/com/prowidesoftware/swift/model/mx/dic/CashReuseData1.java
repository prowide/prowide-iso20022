
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides details on the type and amount of the cash reinvestment in a given currency and on the cash reinvestment rate.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashReuseData1", propOrder = {
    "rinvstdCsh",
    "cshRinvstmtRate"
})
public class CashReuseData1 {

    @XmlElement(name = "RinvstdCsh", required = true)
    protected List<ReinvestedCashTypeAndAmount1> rinvstdCsh;
    @XmlElement(name = "CshRinvstmtRate", required = true)
    protected BigDecimal cshRinvstmtRate;

    /**
     * Gets the value of the rinvstdCsh property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rinvstdCsh property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRinvstdCsh().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReinvestedCashTypeAndAmount1 }
     * 
     * 
     */
    public List<ReinvestedCashTypeAndAmount1> getRinvstdCsh() {
        if (rinvstdCsh == null) {
            rinvstdCsh = new ArrayList<ReinvestedCashTypeAndAmount1>();
        }
        return this.rinvstdCsh;
    }

    /**
     * Gets the value of the cshRinvstmtRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCshRinvstmtRate() {
        return cshRinvstmtRate;
    }

    /**
     * Sets the value of the cshRinvstmtRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public CashReuseData1 setCshRinvstmtRate(BigDecimal value) {
        this.cshRinvstmtRate = value;
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

    /**
     * Adds a new item to the rinvstdCsh list.
     * @see #getRinvstdCsh()
     * 
     */
    public CashReuseData1 addRinvstdCsh(ReinvestedCashTypeAndAmount1 rinvstdCsh) {
        getRinvstdCsh().add(rinvstdCsh);
        return this;
    }

}
