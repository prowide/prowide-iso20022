
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
 * Set of elements used to provide detailed information about the security.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityCharacteristics3", propOrder = {
    "id",
    "pos",
    "valtnPric",
    "collVal"
})
public class SecurityCharacteristics3 {

    @XmlElement(name = "Id")
    protected List<SecurityIdentification19> id;
    @XmlElement(name = "Pos")
    protected List<SecuritiesPosition1> pos;
    @XmlElement(name = "ValtnPric", required = true)
    protected AmountPricePerFinancialInstrumentQuantity9 valtnPric;
    @XmlElement(name = "CollVal", required = true)
    protected ActiveCurrencyAndAmount collVal;

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification19 }
     * 
     * 
     * @return
     *     The value of the id property.
     */
    public List<SecurityIdentification19> getId() {
        if (id == null) {
            id = new ArrayList<>();
        }
        return this.id;
    }

    /**
     * Gets the value of the pos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesPosition1 }
     * 
     * 
     * @return
     *     The value of the pos property.
     */
    public List<SecuritiesPosition1> getPos() {
        if (pos == null) {
            pos = new ArrayList<>();
        }
        return this.pos;
    }

    /**
     * Gets the value of the valtnPric property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPricePerFinancialInstrumentQuantity9 }
     *     
     */
    public AmountPricePerFinancialInstrumentQuantity9 getValtnPric() {
        return valtnPric;
    }

    /**
     * Sets the value of the valtnPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPricePerFinancialInstrumentQuantity9 }
     *     
     */
    public SecurityCharacteristics3 setValtnPric(AmountPricePerFinancialInstrumentQuantity9 value) {
        this.valtnPric = value;
        return this;
    }

    /**
     * Gets the value of the collVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCollVal() {
        return collVal;
    }

    /**
     * Sets the value of the collVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public SecurityCharacteristics3 setCollVal(ActiveCurrencyAndAmount value) {
        this.collVal = value;
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
     * Adds a new item to the id list.
     * @see #getId()
     * 
     */
    public SecurityCharacteristics3 addId(SecurityIdentification19 id) {
        getId().add(id);
        return this;
    }

    /**
     * Adds a new item to the pos list.
     * @see #getPos()
     * 
     */
    public SecurityCharacteristics3 addPos(SecuritiesPosition1 pos) {
        getPos().add(pos);
        return this;
    }

}
