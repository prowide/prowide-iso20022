
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
 * Describes the constituents of the basket.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasketDescription4", propOrder = {
    "isin",
    "indx"
})
public class BasketDescription4 {

    @XmlElement(name = "ISIN")
    protected List<String> isin;
    @XmlElement(name = "Indx")
    protected List<FinancialInstrument98> indx;

    /**
     * Gets the value of the isin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the isin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getISIN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the isin property.
     */
    public List<String> getISIN() {
        if (isin == null) {
            isin = new ArrayList<>();
        }
        return this.isin;
    }

    /**
     * Gets the value of the indx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the indx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrument98 }
     * 
     * 
     * @return
     *     The value of the indx property.
     */
    public List<FinancialInstrument98> getIndx() {
        if (indx == null) {
            indx = new ArrayList<>();
        }
        return this.indx;
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
     * Adds a new item to the iSIN list.
     * @see #getISIN()
     * 
     */
    public BasketDescription4 addISIN(String iSIN) {
        getISIN().add(iSIN);
        return this;
    }

    /**
     * Adds a new item to the indx list.
     * @see #getIndx()
     * 
     */
    public BasketDescription4 addIndx(FinancialInstrument98 indx) {
        getIndx().add(indx);
        return this;
    }

}
