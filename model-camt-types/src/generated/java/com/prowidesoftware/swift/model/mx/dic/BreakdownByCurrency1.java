
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
 * Specifies the cash-in and cash-out flows by currency.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BreakdownByCurrency1", propOrder = {
    "ccy",
    "cshOutFcst",
    "cshInFcst",
    "netCshFcst"
})
public class BreakdownByCurrency1 {

    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "CshOutFcst")
    protected List<CashOutForecast3> cshOutFcst;
    @XmlElement(name = "CshInFcst")
    protected List<CashInForecast3> cshInFcst;
    @XmlElement(name = "NetCshFcst")
    protected List<NetCashForecast2> netCshFcst;

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BreakdownByCurrency1 setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the cshOutFcst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshOutFcst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshOutFcst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashOutForecast3 }
     * 
     * 
     * @return
     *     The value of the cshOutFcst property.
     */
    public List<CashOutForecast3> getCshOutFcst() {
        if (cshOutFcst == null) {
            cshOutFcst = new ArrayList<>();
        }
        return this.cshOutFcst;
    }

    /**
     * Gets the value of the cshInFcst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshInFcst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshInFcst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashInForecast3 }
     * 
     * 
     * @return
     *     The value of the cshInFcst property.
     */
    public List<CashInForecast3> getCshInFcst() {
        if (cshInFcst == null) {
            cshInFcst = new ArrayList<>();
        }
        return this.cshInFcst;
    }

    /**
     * Gets the value of the netCshFcst property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the netCshFcst property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetCshFcst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetCashForecast2 }
     * 
     * 
     * @return
     *     The value of the netCshFcst property.
     */
    public List<NetCashForecast2> getNetCshFcst() {
        if (netCshFcst == null) {
            netCshFcst = new ArrayList<>();
        }
        return this.netCshFcst;
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
     * Adds a new item to the cshOutFcst list.
     * @see #getCshOutFcst()
     * 
     */
    public BreakdownByCurrency1 addCshOutFcst(CashOutForecast3 cshOutFcst) {
        getCshOutFcst().add(cshOutFcst);
        return this;
    }

    /**
     * Adds a new item to the cshInFcst list.
     * @see #getCshInFcst()
     * 
     */
    public BreakdownByCurrency1 addCshInFcst(CashInForecast3 cshInFcst) {
        getCshInFcst().add(cshInFcst);
        return this;
    }

    /**
     * Adds a new item to the netCshFcst list.
     * @see #getNetCshFcst()
     * 
     */
    public BreakdownByCurrency1 addNetCshFcst(NetCashForecast2 netCshFcst) {
        getNetCshFcst().add(netCshFcst);
        return this;
    }

}
