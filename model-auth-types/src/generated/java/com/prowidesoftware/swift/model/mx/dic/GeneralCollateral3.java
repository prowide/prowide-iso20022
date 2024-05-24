
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
 * Repurchase agreement where the agreement allows for the sale and repurchase of any of a selection of assets from a pool of eligible assets.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralCollateral3", propOrder = {
    "finInstrmId",
    "elgblFinInstrmId"
})
public class GeneralCollateral3 {

    @XmlElement(name = "FinInstrmId")
    protected List<FinancialInstrument59> finInstrmId;
    @XmlElement(name = "ElgblFinInstrmId")
    protected List<String> elgblFinInstrmId;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finInstrmId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrument59 }
     * 
     * 
     * @return
     *     The value of the finInstrmId property.
     */
    public List<FinancialInstrument59> getFinInstrmId() {
        if (finInstrmId == null) {
            finInstrmId = new ArrayList<>();
        }
        return this.finInstrmId;
    }

    /**
     * Gets the value of the elgblFinInstrmId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the elgblFinInstrmId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElgblFinInstrmId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the elgblFinInstrmId property.
     */
    public List<String> getElgblFinInstrmId() {
        if (elgblFinInstrmId == null) {
            elgblFinInstrmId = new ArrayList<>();
        }
        return this.elgblFinInstrmId;
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
     * Adds a new item to the finInstrmId list.
     * @see #getFinInstrmId()
     * 
     */
    public GeneralCollateral3 addFinInstrmId(FinancialInstrument59 finInstrmId) {
        getFinInstrmId().add(finInstrmId);
        return this;
    }

    /**
     * Adds a new item to the elgblFinInstrmId list.
     * @see #getElgblFinInstrmId()
     * 
     */
    public GeneralCollateral3 addElgblFinInstrmId(String elgblFinInstrmId) {
        getElgblFinInstrmId().add(elgblFinInstrmId);
        return this;
    }

}
