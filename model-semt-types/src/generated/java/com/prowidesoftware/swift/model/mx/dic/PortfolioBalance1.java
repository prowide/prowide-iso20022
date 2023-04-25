
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
 * Balance breakdown information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortfolioBalance1", propOrder = {
    "summryBal",
    "dtldBal"
})
public class PortfolioBalance1 {

    @XmlElement(name = "SummryBal", required = true)
    protected List<BalanceDetails5> summryBal;
    @XmlElement(name = "DtldBal", required = true)
    protected List<BalanceDetails6> dtldBal;

    /**
     * Gets the value of the summryBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the summryBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummryBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceDetails5 }
     * 
     * 
     * @return
     *     The value of the summryBal property.
     */
    public List<BalanceDetails5> getSummryBal() {
        if (summryBal == null) {
            summryBal = new ArrayList<>();
        }
        return this.summryBal;
    }

    /**
     * Gets the value of the dtldBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dtldBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtldBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceDetails6 }
     * 
     * 
     * @return
     *     The value of the dtldBal property.
     */
    public List<BalanceDetails6> getDtldBal() {
        if (dtldBal == null) {
            dtldBal = new ArrayList<>();
        }
        return this.dtldBal;
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
     * Adds a new item to the summryBal list.
     * @see #getSummryBal()
     * 
     */
    public PortfolioBalance1 addSummryBal(BalanceDetails5 summryBal) {
        getSummryBal().add(summryBal);
        return this;
    }

    /**
     * Adds a new item to the dtldBal list.
     * @see #getDtldBal()
     * 
     */
    public PortfolioBalance1 addDtldBal(BalanceDetails6 dtldBal) {
        getDtldBal().add(dtldBal);
        return this;
    }

}
