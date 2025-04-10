
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
 * Scope
 * A trading party, eg, a broker, sends the IndicationOfInterest message to another trading party, eg, an investment manager. This message is used to notify interest in a financial instrument that a trading party, eg, a broker, is buying or selling in either a proprietary or agency capacity.
 * Usage
 * The IndicationOfInterest message can be time bound with a specific expiration value. It is distributed with the understanding that other trading parties may react to the message first and that the merchandise may no longer be available due to (a) prior trade(s).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndicationOfInterest", propOrder = {
    "id",
    "rtgDtls",
    "indctnOfIntrstDtls"
})
public class IndicationOfInterest {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "RtgDtls")
    protected List<Routing1> rtgDtls;
    @XmlElement(name = "IndctnOfIntrstDtls", required = true)
    protected IndicationOfInterest1 indctnOfIntrstDtls;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public DocumentIdentification11 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public IndicationOfInterest setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the rtgDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rtgDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRtgDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Routing1 }
     * 
     * 
     * @return
     *     The value of the rtgDtls property.
     */
    public List<Routing1> getRtgDtls() {
        if (rtgDtls == null) {
            rtgDtls = new ArrayList<>();
        }
        return this.rtgDtls;
    }

    /**
     * Gets the value of the indctnOfIntrstDtls property.
     * 
     * @return
     *     possible object is
     *     {@link IndicationOfInterest1 }
     *     
     */
    public IndicationOfInterest1 getIndctnOfIntrstDtls() {
        return indctnOfIntrstDtls;
    }

    /**
     * Sets the value of the indctnOfIntrstDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicationOfInterest1 }
     *     
     */
    public IndicationOfInterest setIndctnOfIntrstDtls(IndicationOfInterest1 value) {
        this.indctnOfIntrstDtls = value;
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
     * Adds a new item to the rtgDtls list.
     * @see #getRtgDtls()
     * 
     */
    public IndicationOfInterest addRtgDtls(Routing1 rtgDtls) {
        getRtgDtls().add(rtgDtls);
        return this;
    }

}
