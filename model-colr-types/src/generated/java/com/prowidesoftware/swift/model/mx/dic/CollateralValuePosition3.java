
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * Details of the collateral value position/balance.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralValuePosition3", propOrder = {
    "dataAccsTm",
    "ttlCollValtn",
    "sctiesAcct",
    "scties"
})
public class CollateralValuePosition3 {

    @XmlElement(name = "DataAccsTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime dataAccsTm;
    @XmlElement(name = "TtlCollValtn")
    protected ActiveCurrencyAndAmount ttlCollValtn;
    @XmlElement(name = "SctiesAcct")
    protected SecuritiesAccount19 sctiesAcct;
    @XmlElement(name = "Scties")
    protected List<SecurityCharacteristics3> scties;

    /**
     * Gets the value of the dataAccsTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getDataAccsTm() {
        return dataAccsTm;
    }

    /**
     * Sets the value of the dataAccsTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CollateralValuePosition3 setDataAccsTm(OffsetDateTime value) {
        this.dataAccsTm = value;
        return this;
    }

    /**
     * Gets the value of the ttlCollValtn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlCollValtn() {
        return ttlCollValtn;
    }

    /**
     * Sets the value of the ttlCollValtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public CollateralValuePosition3 setTtlCollValtn(ActiveCurrencyAndAmount value) {
        this.ttlCollValtn = value;
        return this;
    }

    /**
     * Gets the value of the sctiesAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSctiesAcct() {
        return sctiesAcct;
    }

    /**
     * Sets the value of the sctiesAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public CollateralValuePosition3 setSctiesAcct(SecuritiesAccount19 value) {
        this.sctiesAcct = value;
        return this;
    }

    /**
     * Gets the value of the scties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the scties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityCharacteristics3 }
     * 
     * 
     * @return
     *     The value of the scties property.
     */
    public List<SecurityCharacteristics3> getScties() {
        if (scties == null) {
            scties = new ArrayList<>();
        }
        return this.scties;
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
     * Adds a new item to the scties list.
     * @see #getScties()
     * 
     */
    public CollateralValuePosition3 addScties(SecurityCharacteristics3 scties) {
        getScties().add(scties);
        return this;
    }

}
