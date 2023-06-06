
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Balance related details for a portfolio.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceDetails5", propOrder = {
    "tp",
    "urlsd",
    "amt",
    "dtldBal"
})
public class BalanceDetails5 {

    @XmlElement(name = "Tp", required = true)
    protected BalanceType6Choice tp;
    @XmlElement(name = "Urlsd")
    @XmlSchemaType(name = "string")
    protected Unrealised1Code urlsd;
    @XmlElement(name = "Amt", required = true)
    protected AmountAndDirection31 amt;
    @XmlElement(name = "DtldBal")
    protected List<BalanceDetails6> dtldBal;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceType6Choice }
     *     
     */
    public BalanceType6Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceType6Choice }
     *     
     */
    public BalanceDetails5 setTp(BalanceType6Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the urlsd property.
     * 
     * @return
     *     possible object is
     *     {@link Unrealised1Code }
     *     
     */
    public Unrealised1Code getUrlsd() {
        return urlsd;
    }

    /**
     * Sets the value of the urlsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Unrealised1Code }
     *     
     */
    public BalanceDetails5 setUrlsd(Unrealised1Code value) {
        this.urlsd = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection31 }
     *     
     */
    public AmountAndDirection31 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection31 }
     *     
     */
    public BalanceDetails5 setAmt(AmountAndDirection31 value) {
        this.amt = value;
        return this;
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
     * Adds a new item to the dtldBal list.
     * @see #getDtldBal()
     * 
     */
    public BalanceDetails5 addDtldBal(BalanceDetails6 dtldBal) {
        getDtldBal().add(dtldBal);
        return this;
    }

}
