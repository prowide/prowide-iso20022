
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
 * Total amount of charges.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalCharges2", propOrder = {
    "ttlAmtOfChrgs",
    "chrgDtls"
})
public class TotalCharges2 {

    @XmlElement(name = "TtlAmtOfChrgs")
    protected ActiveCurrencyAnd13DecimalAmount ttlAmtOfChrgs;
    @XmlElement(name = "ChrgDtls", required = true)
    protected List<Charge10> chrgDtls;

    /**
     * Gets the value of the ttlAmtOfChrgs property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getTtlAmtOfChrgs() {
        return ttlAmtOfChrgs;
    }

    /**
     * Sets the value of the ttlAmtOfChrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public TotalCharges2 setTtlAmtOfChrgs(ActiveCurrencyAnd13DecimalAmount value) {
        this.ttlAmtOfChrgs = value;
        return this;
    }

    /**
     * Gets the value of the chrgDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chrgDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrgDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Charge10 }
     * 
     * 
     */
    public List<Charge10> getChrgDtls() {
        if (chrgDtls == null) {
            chrgDtls = new ArrayList<Charge10>();
        }
        return this.chrgDtls;
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
     * Adds a new item to the chrgDtls list.
     * @see #getChrgDtls()
     * 
     */
    public TotalCharges2 addChrgDtls(Charge10 chrgDtls) {
        getChrgDtls().add(chrgDtls);
        return this;
    }

}
