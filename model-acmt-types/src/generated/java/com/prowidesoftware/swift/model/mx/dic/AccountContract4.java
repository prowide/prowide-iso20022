
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies target dates dates related to account opening and closing.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountContract4", propOrder = {
    "trgtClsgDt",
    "urgcyFlg",
    "rmvlInd"
})
public class AccountContract4 {

    @XmlElement(name = "TrgtClsgDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar trgtClsgDt;
    @XmlElement(name = "UrgcyFlg")
    protected Boolean urgcyFlg;
    @XmlElement(name = "RmvlInd")
    protected Boolean rmvlInd;

    /**
     * Gets the value of the trgtClsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getTrgtClsgDt() {
        return trgtClsgDt;
    }

    /**
     * Sets the value of the trgtClsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AccountContract4 setTrgtClsgDt(Calendar value) {
        this.trgtClsgDt = value;
        return this;
    }

    /**
     * Gets the value of the urgcyFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrgcyFlg() {
        return urgcyFlg;
    }

    /**
     * Sets the value of the urgcyFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AccountContract4 setUrgcyFlg(Boolean value) {
        this.urgcyFlg = value;
        return this;
    }

    /**
     * Gets the value of the rmvlInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRmvlInd() {
        return rmvlInd;
    }

    /**
     * Sets the value of the rmvlInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public AccountContract4 setRmvlInd(Boolean value) {
        this.rmvlInd = value;
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
