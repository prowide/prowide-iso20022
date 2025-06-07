
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
 * Provides the references of the underlying trade leg(s) and/or the reference to the related NetPosition report message.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference24", propOrder = {
    "tradLegNtfctnId",
    "netPosId"
})
public class Reference24 {

    @XmlElement(name = "TradLegNtfctnId")
    protected List<TradeLegNotificationIdentification1Choice> tradLegNtfctnId;
    @XmlElement(name = "NetPosId")
    protected String netPosId;

    /**
     * Gets the value of the tradLegNtfctnId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradLegNtfctnId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradLegNtfctnId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeLegNotificationIdentification1Choice }
     * 
     * 
     */
    public List<TradeLegNotificationIdentification1Choice> getTradLegNtfctnId() {
        if (tradLegNtfctnId == null) {
            tradLegNtfctnId = new ArrayList<TradeLegNotificationIdentification1Choice>();
        }
        return this.tradLegNtfctnId;
    }

    /**
     * Gets the value of the netPosId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetPosId() {
        return netPosId;
    }

    /**
     * Sets the value of the netPosId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Reference24 setNetPosId(String value) {
        this.netPosId = value;
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
     * Adds a new item to the tradLegNtfctnId list.
     * @see #getTradLegNtfctnId()
     * 
     */
    public Reference24 addTradLegNtfctnId(TradeLegNotificationIdentification1Choice tradLegNtfctnId) {
        getTradLegNtfctnId().add(tradLegNtfctnId);
        return this;
    }

}
