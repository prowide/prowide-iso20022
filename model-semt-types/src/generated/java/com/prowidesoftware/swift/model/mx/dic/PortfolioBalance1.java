
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

    @XmlElement(name = "SummryBal")
    protected List<BalanceDetails5> summryBal;
    @XmlElement(name = "DtldBal")
    protected List<BalanceDetails6> dtldBal;

    /**
     * Gets the value of the summryBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summryBal property.
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
     */
    public List<BalanceDetails5> getSummryBal() {
        if (summryBal == null) {
            summryBal = new ArrayList<BalanceDetails5>();
        }
        return this.summryBal;
    }

    /**
     * Gets the value of the dtldBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dtldBal property.
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
     */
    public List<BalanceDetails6> getDtldBal() {
        if (dtldBal == null) {
            dtldBal = new ArrayList<BalanceDetails6>();
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
