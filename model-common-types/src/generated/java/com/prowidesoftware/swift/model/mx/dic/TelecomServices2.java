
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Telecom services carries telephony billing data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelecomServices2", propOrder = {
    "summry",
    "lineItm"
})
public class TelecomServices2 {

    @XmlElement(name = "Summry")
    protected TelecomServicesSummary2 summry;
    @XmlElement(name = "LineItm")
    protected List<TelecomServicesLineItem2> lineItm;

    /**
     * Gets the value of the summry property.
     * 
     * @return
     *     possible object is
     *     {@link TelecomServicesSummary2 }
     *     
     */
    public TelecomServicesSummary2 getSummry() {
        return summry;
    }

    /**
     * Sets the value of the summry property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelecomServicesSummary2 }
     *     
     */
    public TelecomServices2 setSummry(TelecomServicesSummary2 value) {
        this.summry = value;
        return this;
    }

    /**
     * Gets the value of the lineItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TelecomServicesLineItem2 }
     * 
     * 
     */
    public List<TelecomServicesLineItem2> getLineItm() {
        if (lineItm == null) {
            lineItm = new ArrayList<TelecomServicesLineItem2>();
        }
        return this.lineItm;
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
     * Adds a new item to the lineItm list.
     * @see #getLineItm()
     * 
     */
    public TelecomServices2 addLineItm(TelecomServicesLineItem2 lineItm) {
        getLineItm().add(lineItm);
        return this;
    }

}
