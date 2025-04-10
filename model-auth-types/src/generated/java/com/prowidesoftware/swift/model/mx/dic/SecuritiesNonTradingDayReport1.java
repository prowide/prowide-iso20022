
package com.prowidesoftware.swift.model.mx.dic;

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
 * Details the non-working days of an entity.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesNonTradingDayReport1", propOrder = {
    "id",
    "nonWorkgDay"
})
public class SecuritiesNonTradingDayReport1 {

    @XmlElement(name = "Id", required = true)
    protected TradingVenueIdentification1Choice id;
    @XmlElement(name = "NonWorkgDay", required = true)
    protected List<SecuritiesNonTradingDay1> nonWorkgDay;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link TradingVenueIdentification1Choice }
     *     
     */
    public TradingVenueIdentification1Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingVenueIdentification1Choice }
     *     
     */
    public SecuritiesNonTradingDayReport1 setId(TradingVenueIdentification1Choice value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the nonWorkgDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonWorkgDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonWorkgDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesNonTradingDay1 }
     * 
     * 
     */
    public List<SecuritiesNonTradingDay1> getNonWorkgDay() {
        if (nonWorkgDay == null) {
            nonWorkgDay = new ArrayList<SecuritiesNonTradingDay1>();
        }
        return this.nonWorkgDay;
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
     * Adds a new item to the nonWorkgDay list.
     * @see #getNonWorkgDay()
     * 
     */
    public SecuritiesNonTradingDayReport1 addNonWorkgDay(SecuritiesNonTradingDay1 nonWorkgDay) {
        getNonWorkgDay().add(nonWorkgDay);
        return this;
    }

}
